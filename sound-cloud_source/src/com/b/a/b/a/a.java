// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.a;

import java.io.IOException;
import java.io.InputStream;

public final class a extends InputStream
{

    private final InputStream a;
    private final int b;

    public a(InputStream inputstream, int i)
    {
        a = inputstream;
        b = i;
    }

    public final int available()
    {
        return b;
    }

    public final void close()
        throws IOException
    {
        a.close();
    }

    public final void mark(int i)
    {
        a.mark(i);
    }

    public final boolean markSupported()
    {
        return a.markSupported();
    }

    public final int read()
        throws IOException
    {
        return a.read();
    }

    public final int read(byte abyte0[])
        throws IOException
    {
        return a.read(abyte0);
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return a.read(abyte0, i, j);
    }

    public final void reset()
        throws IOException
    {
        a.reset();
    }

    public final long skip(long l)
        throws IOException
    {
        return a.skip(l);
    }
}
