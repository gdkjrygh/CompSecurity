// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class s
    implements k
{

    private static Map a = new HashMap();

    public s()
    {
        a.put(ao.a, "This application is not authorised for card scanning.");
        a.put(ao.b, "Cancel");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Done");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Postcode");
        a.put(ao.k, "Expires");
        a.put(ao.l, "Number");
        a.put(ao.m, "Card");
        a.put(ao.n, "MM/YY");
        a.put(ao.o, "OK");
        a.put(ao.p, "Hold card here.\nIt will scan automatically.");
        a.put(ao.q, "Keyboard\u2026");
        a.put(ao.r, "Card Number");
        a.put(ao.s, "Card Details");
        a.put(ao.t, "Whoops!");
        a.put(ao.u, "This device cannot use the camera to read card numbers.");
        a.put(ao.v, "Device camera is unavailable.");
        a.put(ao.w, "The device had an unexpected error opening the camera.");
    }

    public final String a()
    {
        return "en_GB";
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
