// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractOutputStream extends OutputStream
{

    protected boolean closed;

    public AbstractOutputStream()
    {
    }

    protected final void checkNotClosed()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("stream closed");
        } else
        {
            return;
        }
    }

    public boolean isClosed()
    {
        return closed;
    }

    public final void write(int i)
        throws IOException
    {
        write(new byte[] {
            (byte)i
        });
    }
}
