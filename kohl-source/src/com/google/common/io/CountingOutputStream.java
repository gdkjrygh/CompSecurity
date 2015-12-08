// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CountingOutputStream extends FilterOutputStream
{

    private long count;

    public CountingOutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public long getCount()
    {
        return count;
    }

    public void write(int i)
        throws IOException
    {
        out.write(i);
        count = count + 1L;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        out.write(abyte0, i, j);
        count = count + (long)j;
    }
}
