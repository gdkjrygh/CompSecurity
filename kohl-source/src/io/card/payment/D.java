// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class D
    implements k
{

    private static Map a = new HashMap();

    public D()
    {
        a.put(ao.a, "Denne applikasjonen er ikke godkjent for kortskanning.");
        a.put(ao.b, "Avbryt");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Fullf\370rt");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Postnummer");
        a.put(ao.k, "Utl\370per");
        a.put(ao.l, "Nummer");
        a.put(ao.m, "Kort");
        a.put(ao.n, "MM/\305\305");
        a.put(ao.o, "OK");
        a.put(ao.p, "Hold kortet her.\nDet skannes automatisk.");
        a.put(ao.q, "Tastatur \u2026");
        a.put(ao.r, "Kortnummer");
        a.put(ao.s, "Kortdetaljer");
        a.put(ao.t, "Ups!");
        a.put(ao.u, "Denne enheten kan ikke bruke kameraet til \345 lese kortnumre.");
        a.put(ao.v, "Kameraet er utilgjengelig.");
        a.put(ao.w, "Det oppstod en uventet feil ved kameraoppstart.");
    }

    public final String a()
    {
        return "nb";
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
