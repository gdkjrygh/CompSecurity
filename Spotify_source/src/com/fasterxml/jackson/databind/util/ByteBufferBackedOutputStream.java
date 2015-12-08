// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.io.OutputStream;
import java.nio.ByteBuffer;

public class ByteBufferBackedOutputStream extends OutputStream
{

    protected final ByteBuffer _b;

    public ByteBufferBackedOutputStream(ByteBuffer bytebuffer)
    {
        _b = bytebuffer;
    }

    public void write(int i)
    {
        _b.put((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        _b.put(abyte0, i, j);
    }
}
