// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CountingInputStream extends FilterInputStream
{

    private long count;
    private long mark;

    public CountingInputStream(InputStream inputstream)
    {
        super(inputstream);
        mark = -1L;
    }

    public long getCount()
    {
        return count;
    }

    public void mark(int i)
    {
        in.mark(i);
        mark = count;
    }

    public int read()
        throws IOException
    {
        int i = in.read();
        if (i != -1)
        {
            count = count + 1L;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            count = count + (long)i;
        }
        return i;
    }

    public void reset()
        throws IOException
    {
        if (!in.markSupported())
        {
            throw new IOException("Mark not supported");
        }
        if (mark == -1L)
        {
            throw new IOException("Mark not set");
        } else
        {
            in.reset();
            count = mark;
            return;
        }
    }

    public long skip(long l)
        throws IOException
    {
        l = in.skip(l);
        count = count + l;
        return l;
    }
}
