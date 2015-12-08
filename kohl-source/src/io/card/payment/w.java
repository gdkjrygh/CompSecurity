// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class w
    implements k
{

    private static Map a = new HashMap();

    public w()
    {
        a.put(ao.a, "Cette application n\u2019est pas autoris\351e \340 scanner la carte.");
        a.put(ao.b, "Annuler");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "OK");
        a.put(ao.i, "Crypto.");
        a.put(ao.j, "Code postal");
        a.put(ao.k, "Date d\u2019expiration");
        a.put(ao.l, "Num\351ro");
        a.put(ao.m, "Carte");
        a.put(ao.n, "MM/AA");
        a.put(ao.o, "OK");
        a.put(ao.p, "Maintenez la carte \340 cet endroit.\nElle va \352tre automatiquement scann\351e.");
        a.put(ao.q, "Clavier\u2026");
        a.put(ao.r, "N\272 de carte");
        a.put(ao.s, "Carte");
        a.put(ao.t, "D\351sol\351");
        a.put(ao.u, "Cet appareil ne peut pas utiliser l\u2019appareil photo pour lire les num\351ros de carte.");
        a.put(ao.v, "L\u2019appareil photo n\u2019est pas disponible.");
        a.put(ao.w, "Une erreur s\u2019est produite en ouvrant l\u2019appareil photo.");
    }

    public final String a()
    {
        return "fr";
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
