// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class v
    implements k
{

    private static Map a = new HashMap();

    public v()
    {
        a.put(ao.a, "Esta aplicaci\363n no est\341 autorizada para escanear tarjetas.");
        a.put(ao.b, "Cancelar");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Listo");
        a.put(ao.i, "CVV");
        a.put(ao.j, "C\363digo postal");
        a.put(ao.k, "Caduca");
        a.put(ao.l, "N\372mero");
        a.put(ao.m, "Tarjeta");
        a.put(ao.n, "MM/AA");
        a.put(ao.o, "Aceptar");
        a.put(ao.p, "Sostenga la tarjeta aqu\355.\nSe escanear\341 autom\341ticamente.");
        a.put(ao.q, "Teclado\u2026");
        a.put(ao.r, "N\372mero de tarjeta");
        a.put(ao.s, "Detalles de la tarjeta");
        a.put(ao.t, "\241Huy!");
        a.put(ao.u, "Este dispositivo no puede usar la c\341mara para leer n\372meros de tarjeta.");
        a.put(ao.v, "La c\341mara del dispositivo no est\341 disponible.");
        a.put(ao.w, "El dispositivo tuvo un error inesperado al abrir la c\341mara.");
    }

    public final String a()
    {
        return "es_MX";
    }

    public final String a(Enum enum)
    {
        enum = (ao)enum;
        return (String)a.get(enum);
    }

    static 
    {
        new HashMap();
    }
}
