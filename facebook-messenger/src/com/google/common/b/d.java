// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d extends FilterInputStream
{

    private long a;
    private long b;

    public d(InputStream inputstream)
    {
        super(inputstream);
        b = -1L;
    }

    public long a()
    {
        return a;
    }

    public void mark(int i)
    {
        in.mark(i);
        b = a;
    }

    public int read()
    {
        int i = in.read();
        if (i != -1)
        {
            a = a + 1L;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            a = a + (long)i;
        }
        return i;
    }

    public void reset()
    {
        if (!in.markSupported())
        {
            throw new IOException("Mark not supported");
        }
        if (b == -1L)
        {
            throw new IOException("Mark not set");
        } else
        {
            in.reset();
            a = b;
            return;
        }
    }

    public long skip(long l)
    {
        l = in.skip(l);
        a = a + l;
        return l;
    }
}
