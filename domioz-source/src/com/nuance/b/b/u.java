// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    private static final u f[];

    private u(String s, int i)
    {
        super(s, i);
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/nuance/b/b/u, s);
    }

    public static u[] values()
    {
        return (u[])f.clone();
    }

    static 
    {
        a = new u("SEVERE", 0);
        b = new u("INFO", 1);
        c = new u("FINE", 2);
        d = new u("FINEST", 3);
        e = new u("ALL", 4);
        f = (new u[] {
            a, b, c, d, e
        });
    }
}
