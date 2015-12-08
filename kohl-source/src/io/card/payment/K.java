// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class K
    implements k
{

    private static Map a = new HashMap();

    public K()
    {
        a.put(ao.a, "Bu uygulama, kart tarama i\347in yetkilendirilmedi.");
        a.put(ao.b, "\u0130ptal");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Bitti");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Posta Kodu");
        a.put(ao.k, "Son kullanma tarihi");
        a.put(ao.l, "Numara");
        a.put(ao.m, "Kart");
        a.put(ao.n, "AA/YY");
        a.put(ao.o, "Tamam");
        a.put(ao.p, "Kart\u0131n\u0131z\u0131 buraya tutun.\nOtomatik olarak taranacakt\u0131r.");
        a.put(ao.q, "Klavye\u2026");
        a.put(ao.r, "Kart Numaras\u0131");
        a.put(ao.s, "Kart Ayr\u0131nt\u0131lar\u0131");
        a.put(ao.t, "Pardon!");
        a.put(ao.u, "Bu cihaz\u0131n kameras\u0131 kart rakamlar\u0131n\u0131 okuyamaz.");
        a.put(ao.v, "Cihaz kameras\u0131 kullan\u0131lam\u0131yor.");
        a.put(ao.w, "Cihaz kameray\u0131 a\347arken beklenmedik bir hata verdi.");
    }

    public final String a()
    {
        return "tr";
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
