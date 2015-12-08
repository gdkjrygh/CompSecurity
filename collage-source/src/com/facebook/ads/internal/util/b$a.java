// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;


// Referenced classes of package com.facebook.ads.internal.util:
//            b

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    int f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/ads/internal/util/b$a, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    static 
    {
        a = new <init>("OPEN_STORE", 0, 0);
        b = new <init>("OPEN_LINK", 1, 1);
        c = new <init>("XOUT", 2, 2);
        d = new <init>("OPEN_URL", 3, 3);
        e = new <init>("SHOW_INTERSTITIAL", 4, 4);
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
