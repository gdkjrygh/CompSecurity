// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LimitInputStream extends FilterInputStream
{

    private long left;
    private long mark;

    public LimitInputStream(InputStream inputstream, long l)
    {
        super(inputstream);
        mark = -1L;
        left = l;
    }

    public final int available()
        throws IOException
    {
        return (int)Math.min(in.available(), left);
    }

    public final void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        in.mark(i);
        mark = left;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read()
        throws IOException
    {
        if (left == 0L)
        {
            return -1;
        }
        int i = in.read();
        if (i != -1)
        {
            left = left - 1L;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (left == 0L)
        {
            return -1;
        }
        j = (int)Math.min(j, left);
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            left = left - (long)i;
        }
        return i;
    }

    public final void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (!in.markSupported())
        {
            throw new IOException("Mark not supported");
        }
        break MISSING_BLOCK_LABEL_27;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (mark == -1L)
        {
            throw new IOException("Mark not set");
        }
        in.reset();
        left = mark;
        this;
        JVM INSTR monitorexit ;
    }

    public final long skip(long l)
        throws IOException
    {
        l = Math.min(l, left);
        l = in.skip(l);
        left = left - l;
        return l;
    }
}
