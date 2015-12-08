// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;

import java.io.IOException;
import java.io.InputStream;

public class ContentLengthInputStream extends InputStream
{

    private final long length;
    private long pos;
    private final InputStream stream;

    public ContentLengthInputStream(InputStream inputstream, long l)
    {
        stream = inputstream;
        length = l;
    }

    public int available()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = length;
        l1 = pos;
        int i = (int)(l - l1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void close()
        throws IOException
    {
        stream.close();
    }

    public void mark(int i)
    {
        pos = i;
        stream.mark(i);
    }

    public int read()
        throws IOException
    {
        pos = pos + 1L;
        return stream.read();
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        pos = pos + (long)j;
        return stream.read(abyte0, i, j);
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        pos = 0L;
        stream.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
        throws IOException
    {
        pos = pos + l;
        return stream.skip(l);
    }
}
