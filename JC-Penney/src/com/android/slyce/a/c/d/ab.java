// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import java.util.Arrays;

final class ab
{

    private int a;
    private int b;
    private int c;
    private final int d[] = new int[10];

    ab()
    {
    }

    public ab a(int i, int j, int k)
    {
        if (i >= d.length)
        {
            return this;
        }
        int l = 1 << i;
        a = a | l;
        if ((j & 1) != 0)
        {
            b = b | l;
        } else
        {
            b = b & ~l;
        }
        if ((j & 2) != 0)
        {
            c = l | c;
        } else
        {
            c = ~l & c;
        }
        d[i] = k;
        return this;
    }

    public void a()
    {
        c = 0;
        b = 0;
        a = 0;
        Arrays.fill(d, 0);
    }

    public void a(ab ab1)
    {
        int i = 0;
        while (i < 10) 
        {
            if (ab1.a(i))
            {
                a(i, ab1.c(i), ab1.b(i));
            }
            i++;
        }
    }

    boolean a(int i)
    {
        return (1 << i & a) != 0;
    }

    int b()
    {
        return Integer.bitCount(a);
    }

    int b(int i)
    {
        return d[i];
    }

    int c()
    {
        if ((2 & a) != 0)
        {
            return d[1];
        } else
        {
            return -1;
        }
    }

    int c(int i)
    {
        byte byte0 = 0;
        if (f(i))
        {
            byte0 = 2;
        }
        int j = byte0;
        if (e(i))
        {
            j = byte0 | 1;
        }
        return j;
    }

    public int d(int i)
    {
        if ((0x80 & a) != 0)
        {
            i = d[7];
        }
        return i;
    }

    boolean e(int i)
    {
        return (1 << i & b) != 0;
    }

    boolean f(int i)
    {
        return (1 << i & c) != 0;
    }
}
