// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    private static final g d[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/a/a/b/a/g, s);
    }

    public static g[] values()
    {
        return (g[])d.clone();
    }

    static 
    {
        a = new g("NETWORK", 0);
        b = new g("DISC_CACHE", 1);
        c = new g("MEMORY_CACHE", 2);
        d = (new g[] {
            a, b, c
        });
    }
}
