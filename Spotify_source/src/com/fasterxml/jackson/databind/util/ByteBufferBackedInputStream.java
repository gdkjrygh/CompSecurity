// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedInputStream extends InputStream
{

    protected final ByteBuffer _b;

    public ByteBufferBackedInputStream(ByteBuffer bytebuffer)
    {
        _b = bytebuffer;
    }

    public int available()
    {
        return _b.remaining();
    }

    public int read()
    {
        if (_b.hasRemaining())
        {
            return _b.get() & 0xff;
        } else
        {
            return -1;
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (!_b.hasRemaining())
        {
            return -1;
        } else
        {
            j = Math.min(j, _b.remaining());
            _b.get(abyte0, i, j);
            return j;
        }
    }
}
