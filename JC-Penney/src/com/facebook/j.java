// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    private static final j i[];
    private final boolean h;

    private j(String s, int k, boolean flag)
    {
        super(s, k);
        h = flag;
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/j, s);
    }

    public static j[] values()
    {
        return (j[])i.clone();
    }

    boolean a()
    {
        return h;
    }

    static 
    {
        a = new j("NONE", 0, false);
        b = new j("FACEBOOK_APPLICATION_WEB", 1, true);
        c = new j("FACEBOOK_APPLICATION_NATIVE", 2, true);
        d = new j("FACEBOOK_APPLICATION_SERVICE", 3, true);
        e = new j("WEB_VIEW", 4, false);
        f = new j("TEST_USER", 5, true);
        g = new j("CLIENT_TOKEN", 6, true);
        i = (new j[] {
            a, b, c, d, e, f, g
        });
    }
}
