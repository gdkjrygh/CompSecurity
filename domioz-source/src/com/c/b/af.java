// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


public final class af extends Enum
{

    public static final af a;
    public static final af b;
    public static final af c;
    private static final af e[];
    final int d;

    private af(String s, int i, int j)
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

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/c/b/af, s);
    }

    public static af[] values()
    {
        return (af[])e.clone();
    }

    static 
    {
        a = new af("NO_CACHE", 0, 1);
        b = new af("NO_STORE", 1, 2);
        c = new af("OFFLINE", 2, 4);
        e = (new af[] {
            a, b, c
        });
    }
}
