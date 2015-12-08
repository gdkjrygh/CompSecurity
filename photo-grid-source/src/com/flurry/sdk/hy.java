// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class hy extends Enum
{

    public static final hy a;
    public static final hy b;
    public static final hy c;
    public static final hy d;
    public static final hy e;
    public static final hy f;
    public static final hy g;
    public static final hy h;
    private static final hy i[];

    private hy(String s, int j)
    {
        super(s, j);
    }

    public static hy valueOf(String s)
    {
        return (hy)Enum.valueOf(com/flurry/sdk/hy, s);
    }

    public static hy[] values()
    {
        return (hy[])i.clone();
    }

    static 
    {
        a = new hy("ALL", 0);
        b = new hy("DEBUG", 1);
        c = new hy("ERROR", 2);
        d = new hy("FATAL", 3);
        e = new hy("INFO", 4);
        f = new hy("OFF", 5);
        g = new hy("TRACE", 6);
        h = new hy("WARN", 7);
        i = (new hy[] {
            a, b, c, d, e, f, g, h
        });
    }
}
