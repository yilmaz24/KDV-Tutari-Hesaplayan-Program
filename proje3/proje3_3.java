package proje3;

import java.util.Scanner;

public class proje3_3 {
    public static void main(String[] args) {
    
    int kdvliFiyat;
    int kdvsizFiyat;	 
    
    Scanner input= new Scanner(System.in);
    
    System.out.print("Fiyat giriniz:");
    kdvsizFiyat = input.nextInt();
    kdvliFiyat= kdvsizFiyat+(kdvsizFiyat*18/100);
    	
    
    System.out.println("KDV'siz fiyat =" + kdvsizFiyat);
    System.out.println("KDV'liFiyat=" + kdvliFiyat);
    System.out.println("KDV tutarı=" + kdvsizFiyat*18/100);
    
    }
}