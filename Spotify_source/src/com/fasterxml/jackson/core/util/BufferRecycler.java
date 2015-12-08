// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;


public class BufferRecycler
{

    private static final int BYTE_BUFFER_LENGTHS[] = {
        8000, 8000, 2000, 2000
    };
    private static final int CHAR_BUFFER_LENGTHS[] = {
        4000, 4000, 200, 200
    };
    protected final byte _byteBuffers[][];
    protected final char _charBuffers[][];

    public BufferRecycler()
    {
        this(4, 4);
    }

    protected BufferRecycler(int i, int j)
    {
        _byteBuffers = new byte[i][];
        _charBuffers = new char[j][];
    }

    public final byte[] allocByteBuffer(int i)
    {
        return allocByteBuffer(i, 0);
    }

    public byte[] allocByteBuffer(int i, int j)
    {
        int l = byteBufferLength(i);
        int k = j;
        if (j < l)
        {
            k = l;
        }
        byte abyte0[] = _byteBuffers[i];
        if (abyte0 == null || abyte0.length < k)
        {
            return balloc(k);
        } else
        {
            _byteBuffers[i] = null;
            return abyte0;
        }
    }

    public final char[] allocCharBuffer(int i)
    {
        return allocCharBuffer(i, 0);
    }

    public char[] allocCharBuffer(int i, int j)
    {
        int l = charBufferLength(i);
        int k = j;
        if (j < l)
        {
            k = l;
        }
        char ac[] = _charBuffers[i];
        if (ac == null || ac.length < k)
        {
            return calloc(k);
        } else
        {
            _charBuffers[i] = null;
            return ac;
        }
    }

    protected byte[] balloc(int i)
    {
        return new byte[i];
    }

    protected int byteBufferLength(int i)
    {
        return BYTE_BUFFER_LENGTHS[i];
    }

    protected char[] calloc(int i)
    {
        return new char[i];
    }

    protected int charBufferLength(int i)
    {
        return CHAR_BUFFER_LENGTHS[i];
    }

    public final void releaseByteBuffer(int i, byte abyte0[])
    {
        _byteBuffers[i] = abyte0;
    }

    public void releaseCharBuffer(int i, char ac[])
    {
        _charBuffers[i] = ac;
    }

}
