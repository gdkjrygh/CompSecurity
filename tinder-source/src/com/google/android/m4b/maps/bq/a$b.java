// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;


// Referenced classes of package com.google.android.m4b.maps.bq:
//            a

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    final int f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/google/android/m4b/maps/bq/a$b, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0, -1);
        b = new <init>("NORMAL", 1, 1);
        c = new <init>("PREFETCH_OFFLINE_MAP", 2, 4);
        d = new <init>("PREFETCH_ROUTE", 3, 6);
        e = new <init>("PREFETCH_AREA", 4, 12);
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        f = j;
    }
}
