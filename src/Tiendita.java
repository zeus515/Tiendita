
import java.util.ArrayList;
import java.util.Scanner;

public class Tiendita {

    // Lista de productos (codigo, descripcion y precio)
    static ArrayList<Producto> productos = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println();
            System.out.println("===== TIENDITA =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            try {
                opcion = Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            switch (opcion) {
                case 1 -> agregarProducto();
                case 2 -> verProductos();
                case 3 -> buscarProducto();
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    /**
     * Pide los datos de un producto y lo agrega a la lista
     */
    static void agregarProducto() {
        System.out.print("Codigo: ");
        String codigo = teclado.nextLine().trim();
        System.out.print("Descripcion: ");
        String descripcion = teclado.nextLine().trim();
        System.out.print("Precio: ");
        double precio;
        try {
            precio = Double.parseDouble(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Precio no valido, no se agrego el producto.");
            return;
        }
        productos.add(new Producto(codigo, descripcion, precio));
        System.out.println("Producto agregado.");
    }

    /**
     * Muestra la lista de productos en forma de tabla
     */
    static void verProductos() {
        System.out.println("En construccion.");
    }

    /**
     * Pide el codigo de un producto, lo busca en la lista y muestra sus datos
     */
    static void buscarProducto() {
        System.out.println("En construccion.");
    }

}
