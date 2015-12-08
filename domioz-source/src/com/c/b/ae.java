// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


public final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    private static final ae d[];
    final int c;

    private ae(String s, int i, int j)
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

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/c/b/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])d.clone();
    }

    static 
    {
        a = new ae("NO_CACHE", 0, 1);
        b = new ae("NO_STORE", 1, 2);
        d = (new ae[] {
            a, b
        });
    }
}
