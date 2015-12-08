// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class ie extends Enum
{

    public static final ie a;
    public static final ie b;
    public static final ie c;
    public static final ie d;
    public static final ie e;
    public static final ie f;
    public static final ie g;
    private static final ie i[];
    private final int h;

    private ie(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static ie valueOf(String s)
    {
        return (ie)Enum.valueOf(com/flurry/sdk/ie, s);
    }

    public static ie[] values()
    {
        return (ie[])i.clone();
    }

    public final int a()
    {
        return h;
    }

    static 
    {
        a = new ie("HW_MACHINE", 0, 0);
        b = new ie("MODEL", 1, 1);
        c = new ie("BRAND", 2, 2);
        d = new ie("ID", 3, 3);
        e = new ie("DEVICE", 4, 4);
        f = new ie("PRODUCT", 5, 5);
        g = new ie("VERSION_RELEASE", 6, 6);
        i = (new ie[] {
            a, b, c, d, e, f, g
        });
    }
}
