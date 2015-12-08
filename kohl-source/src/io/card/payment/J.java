// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class J
    implements k
{

    private static Map a = new HashMap();

    public J()
    {
        a.put(ao.a, "Appen \344r inte godk\344nd f\366r skanning av kort.");
        a.put(ao.b, "Avbryt");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Klart");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Postnummer");
        a.put(ao.k, "G\345r ut");
        a.put(ao.l, "Nummer");
        a.put(ao.m, "Kort");
        a.put(ao.n, "MM/\305\305");
        a.put(ao.o, "OK");
        a.put(ao.p, "H\345ll kortet h\344r.\nDet skannas automatiskt.");
        a.put(ao.q, "Tangentbord \u2026");
        a.put(ao.r, "Kortnummer");
        a.put(ao.s, "Kortinformation");
        a.put(ao.t, "Hoppsan!");
        a.put(ao.u, "Den h\344r enheten kan inte anv\344nda kameran till att l\344sa kortnummer.");
        a.put(ao.v, "Enhetens kamera \344r inte tillg\344nglig.");
        a.put(ao.w, "Ett ov\344ntat fel uppstod n\344r enheten skulle \366ppna kameran.");
    }

    public final String a()
    {
        return "sv";
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
