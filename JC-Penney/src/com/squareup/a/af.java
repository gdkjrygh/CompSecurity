// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


public final class af extends Enum
{

    public static final af a;
    public static final af b;
    private static final af d[];
    final int c;

    private af(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    static boolean a(int i)
    {
        return (a.c & i) == 0;
    }

    static boolean b(int i)
    {
        return (b.c & i) == 0;
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/squareup/a/af, s);
    }

    public static af[] values()
    {
        return (af[])d.clone();
    }

    static 
    {
        a = new af("NO_CACHE", 0, 1);
        b = new af("NO_STORE", 1, 2);
        d = (new af[] {
            a, b
        });
    }
}
