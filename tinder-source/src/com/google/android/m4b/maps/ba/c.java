// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ba;


public final class c
{

    private static int c = 1;
    private static int d = 22;
    private static final c e[];
    final int a;
    private final int b;

    private c(int i, int j)
    {
        b = i;
        a = j;
    }

    public static c a(int i)
    {
        c c1 = null;
        if (22 >= c)
        {
            if (22 > d)
            {
                i = d;
            }
            c1 = e[i - 1];
        }
        return c1;
    }

    public final String toString()
    {
        return super.toString();
    }

    static 
    {
        int i = 1;
        e = new c[22];
        int j = 256;
        for (; i <= 22; i++)
        {
            e[i - 1] = new c(i, j);
            j *= 2;
        }

    }
}
