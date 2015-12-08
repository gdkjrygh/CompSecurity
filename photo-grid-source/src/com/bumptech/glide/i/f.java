// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.i;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class f extends FilterInputStream
{

    private int a;

    public f(InputStream inputstream)
    {
        super(inputstream);
        a = 0x80000000;
    }

    private long a(long l)
    {
        long l1;
        if (a == 0)
        {
            l1 = -1L;
        } else
        {
            l1 = l;
            if (a != 0x80000000)
            {
                l1 = l;
                if (l > (long)a)
                {
                    return (long)a;
                }
            }
        }
        return l1;
    }

    private void b(long l)
    {
        if (a != 0x80000000 && l != -1L)
        {
            a = (int)((long)a - l);
        }
    }

    public final int available()
    {
        if (a == 0x80000000)
        {
            return super.available();
        } else
        {
            return Math.min(a, super.available());
        }
    }

    public final void mark(int i)
    {
        super.mark(i);
        a = i;
    }

    public final int read()
    {
        if (a(1L) == -1L)
        {
            return -1;
        } else
        {
            int i = super.read();
            b(1L);
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        j = (int)a(j);
        if (j == -1)
        {
            return -1;
        } else
        {
            i = super.read(abyte0, i, j);
            b(i);
            return i;
        }
    }

    public final void reset()
    {
        super.reset();
        a = 0x80000000;
    }

    public final long skip(long l)
    {
        l = a(l);
        if (l == -1L)
        {
            return -1L;
        } else
        {
            l = super.skip(l);
            b(l);
            return l;
        }
    }
}
