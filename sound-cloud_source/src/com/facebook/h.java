// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    private static final h i[];
    final boolean h;

    private h(String s, int j, boolean flag)
    {
        super(s, j);
        h = flag;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/h, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    static 
    {
        a = new h("NONE", 0, false);
        b = new h("FACEBOOK_APPLICATION_WEB", 1, true);
        c = new h("FACEBOOK_APPLICATION_NATIVE", 2, true);
        d = new h("FACEBOOK_APPLICATION_SERVICE", 3, true);
        e = new h("WEB_VIEW", 4, false);
        f = new h("TEST_USER", 5, true);
        g = new h("CLIENT_TOKEN", 6, true);
        i = (new h[] {
            a, b, c, d, e, f, g
        });
    }
}
