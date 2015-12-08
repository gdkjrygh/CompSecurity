// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class o
    implements k
{

    private static Map a = new HashMap();

    public o()
    {
        a.put(ao.a, "Denne app er ikke godkendt til scanning af kort.");
        a.put(ao.b, "Annuller");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Udf\370rt");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Postnummer");
        a.put(ao.k, "Udl\370ber");
        a.put(ao.l, "Nummer");
        a.put(ao.m, "Kort");
        a.put(ao.n, "MM/\305\305");
        a.put(ao.o, "OK");
        a.put(ao.p, "Hold kortet her.\nDet scannes automatisk.");
        a.put(ao.q, "Tastatur\u2026");
        a.put(ao.r, "Kortnummer");
        a.put(ao.s, "Kortoplysninger");
        a.put(ao.t, "Whoops!");
        a.put(ao.u, "Denne enhed kan ikke anvende kameraet til at l\346se kortnumre.");
        a.put(ao.v, "Enhed kamera ikke er tilg\346ngelig.");
        a.put(ao.w, "Enheden havde en uventet fejl under \345bning af kamera.");
    }

    public final String a()
    {
        return "da";
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
