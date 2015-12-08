// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g i[];
    private final boolean h;

    private g(String s, int j, boolean flag)
    {
        super(s, j);
        h = flag;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/g, s);
    }

    public static g[] values()
    {
        return (g[])i.clone();
    }

    final boolean a()
    {
        return h;
    }

    static 
    {
        a = new g("NONE", 0, false);
        b = new g("FACEBOOK_APPLICATION_WEB", 1, true);
        c = new g("FACEBOOK_APPLICATION_NATIVE", 2, true);
        d = new g("FACEBOOK_APPLICATION_SERVICE", 3, true);
        e = new g("WEB_VIEW", 4, false);
        f = new g("TEST_USER", 5, true);
        g = new g("CLIENT_TOKEN", 6, true);
        i = (new g[] {
            a, b, c, d, e, f, g
        });
    }
}
