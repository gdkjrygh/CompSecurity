// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


public final class ag extends Enum
{

    public static final ag a;
    public static final ag b;
    public static final ag c;
    private static final ag e[];
    final int d;

    private ag(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static boolean a(int i)
    {
        return (a.d & i) == 0;
    }

    public static boolean b(int i)
    {
        return (b.d & i) == 0;
    }

    public static boolean c(int i)
    {
        return (c.d & i) != 0;
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/squareup/a/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])e.clone();
    }

    static 
    {
        a = new ag("NO_CACHE", 0, 1);
        b = new ag("NO_STORE", 1, 2);
        c = new ag("OFFLINE", 2, 4);
        e = (new ag[] {
            a, b, c
        });
    }
}
