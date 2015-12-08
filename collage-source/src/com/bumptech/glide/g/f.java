// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class f extends FilterInputStream
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

    public int available()
        throws IOException
    {
        if (a == 0x80000000)
        {
            return super.available();
        } else
        {
            return Math.min(a, super.available());
        }
    }

    public void mark(int i)
    {
        super.mark(i);
        a = i;
    }

    public int read()
        throws IOException
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

    public int read(byte abyte0[], int i, int j)
        throws IOException
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

    public void reset()
        throws IOException
    {
        super.reset();
        a = 0x80000000;
    }

    public long skip(long l)
        throws IOException
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
