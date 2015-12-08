// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


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
    private final int h;

    private g(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/microsoft/a/g, s);
    }

    public static g[] values()
    {
        return (g[])i.clone();
    }

    public final int a()
    {
        return h;
    }

    static 
    {
        a = new g("MARSHALED_PROTOCOL", 0, 0);
        b = new g("MAFIA_PROTOCOL", 1, 17997);
        c = new g("COMPACT_PROTOCOL", 2, 16963);
        d = new g("JSON_PROTOCOL", 3, 21322);
        e = new g("PRETTY_JSON_PROTOCOL", 4, 20554);
        f = new g("SIMPLE_PROTOCOL", 5, 20563);
        g = new g("__INVALID_ENUM_VALUE", 6, 21323);
        i = (new g[] {
            a, b, c, d, e, f, g
        });
    }
}
