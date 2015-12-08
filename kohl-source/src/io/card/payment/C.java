// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.card.payment:
//            k, ao

public final class C
    implements k
{

    private static Map a = new HashMap();

    public C()
    {
        a.put(ao.a, "Aplikasi ini tidak dibenarkan untuk pengimbasan kad.");
        a.put(ao.b, "Batal");
        a.put(ao.c, "American Express");
        a.put(ao.d, "Discover");
        a.put(ao.e, "JCB");
        a.put(ao.f, "MasterCard");
        a.put(ao.g, "Visa");
        a.put(ao.h, "Selesai");
        a.put(ao.i, "CVV");
        a.put(ao.j, "Poskod");
        a.put(ao.k, "Luput");
        a.put(ao.l, "Nombor");
        a.put(ao.m, "Kad");
        a.put(ao.n, "BB/TT");
        a.put(ao.o, "OK");
        a.put(ao.p, "Pegang kad di sini.\nIa akan mengimbas secara automatik.");
        a.put(ao.q, "Papan Kekunci\u2026");
        a.put(ao.r, "Nombor Kad");
        a.put(ao.s, "Butiran Kad");
        a.put(ao.t, "Oop!");
        a.put(ao.u, "Peranti ini tidak dapat menggunakan kamera untuk membaca nombor kad.");
        a.put(ao.v, "Kamera peranti tidak tersedia.");
        a.put(ao.w, "Peranti mengalami ralat tidak dijangka semasa membuka kamera.");
    }

    public final String a()
    {
        return "ms";
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
