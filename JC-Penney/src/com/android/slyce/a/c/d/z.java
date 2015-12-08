// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


final class z
{

    private final z a[];
    private final int b;
    private final int c;

    z()
    {
        a = new z[256];
        b = 0;
        c = 0;
    }

    z(int i, int j)
    {
        a = null;
        b = i;
        j &= 7;
        i = j;
        if (j == 0)
        {
            i = 8;
        }
        c = i;
    }

    static z[] a(z z1)
    {
        return z1.a;
    }

    static int b(z z1)
    {
        return z1.b;
    }

    static int c(z z1)
    {
        return z1.c;
    }
}
