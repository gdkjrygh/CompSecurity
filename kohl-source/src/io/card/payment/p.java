// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class p
    implements k
{

    private static Map a = new HashMap();

    public p()
    {
        a.put(ao.a, "Diese Anwendung ist nicht f\374r das Einlesen von Kreditkarten zugelassen.");
        a.put(ao.b, "Abbrechen");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Fertig");
        a.put(ao.i, "Kartenpr\374fnr.");
        a.put(ao.j, "PLZ");
        a.put(ao.k, "G\374ltig bis");
        a.put(ao.l, "Nummer");
        a.put(ao.m, "Kreditkarte");
        a.put(ao.n, "MM/JJ");
        a.put(ao.o, "OK");
        a.put(ao.p, "Kreditkarte hierhin halten.\nSie wird automatisch gelesen.");
        a.put(ao.q, "Tastatur\u2026");
        a.put(ao.r, "Kartennummer");
        a.put(ao.s, "Kreditkartendetails");
        a.put(ao.t, "Leider ist ein Fehler aufgetreten.");
        a.put(ao.u, "Dieses Ger\344t kann mit der Kamera keine Kreditkartennummern lesen.");
        a.put(ao.v, "Die Kamera ist nicht verf\374gbar.");
        a.put(ao.w, "Beim \326ffnen der Kamera ist ein unerwarteter Fehler aufgetreten.");
    }

    public final String a()
    {
        return "de";
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
