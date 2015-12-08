// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    private static final o e[];
    private static final o g[];
    private final int f;

    private o(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static o a(int i)
    {
        if (i < 0 || i >= e.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return e[i];
        }
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/google/b/g/a/o, s);
    }

    public static o[] values()
    {
        return (o[])g.clone();
    }

    public int a()
    {
        return f;
    }

    static 
    {
        a = new o("L", 0, 1);
        b = new o("M", 1, 0);
        c = new o("Q", 2, 3);
        d = new o("H", 3, 2);
        g = (new o[] {
            a, b, c, d
        });
        e = (new o[] {
            b, a, d, c
        });
    }
}
