// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.DataOutput;

public final class m
{

    static final boolean e;
    final byte a[];
    final int b;
    int c;
    m d;

    m(int i)
    {
        this(new byte[i], 0);
    }

    m(int i, m m1)
    {
        this(new byte[i], 0, m1);
    }

    m(m m1, m m2)
    {
        a = m1.a;
        int i = m1.c;
        b = i;
        c = i;
        m2.d = this;
    }

    private m(byte abyte0[], int i)
    {
        a = abyte0;
        b = 0;
        c = i;
    }

    m(byte abyte0[], int i, m m1)
    {
        this(abyte0, i);
        m1.d = this;
    }

    m(byte abyte0[], m m1)
    {
        this(abyte0, 0);
        m1.d = this;
    }

    public static int a(DataOutput dataoutput, m m1)
    {
        int i = 0;
        m m2;
        int j;
        do
        {
            int k = m1.c - m1.b;
            j = i;
            if (k > 0)
            {
                dataoutput.write(m1.a, m1.b, k);
                j = i + k;
            }
            m2 = m1.d;
            i = j;
            m1 = m2;
        } while (m2 != null);
        return j;
    }

    public static m a()
    {
        return new m(512);
    }

    public final m b()
    {
        d = null;
        c = b;
        return this;
    }

    static 
    {
        boolean flag;
        if (!com/b/a/m.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
