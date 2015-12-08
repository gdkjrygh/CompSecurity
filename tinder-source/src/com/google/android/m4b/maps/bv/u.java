// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

final class u extends FilterInputStream
    implements DataInput
{

    private DataInputStream a;

    public u(InputStream inputstream)
    {
        super(inputstream);
        a = new DataInputStream(inputstream);
    }

    public final boolean readBoolean()
    {
        return read() != 0;
    }

    public final byte readByte()
    {
        return (byte)read();
    }

    public final char readChar()
    {
        throw new UnsupportedOperationException();
    }

    public final double readDouble()
    {
        throw new UnsupportedOperationException();
    }

    public final float readFloat()
    {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte abyte0[])
    {
        a.readFully(abyte0);
    }

    public final void readFully(byte abyte0[], int i, int j)
    {
        a.readFully(abyte0, i, j);
    }

    public final int readInt()
    {
        return readUnsignedByte() | readUnsignedByte() << 8 | readUnsignedByte() << 16 | readUnsignedByte() << 24;
    }

    public final String readLine()
    {
        throw new UnsupportedOperationException();
    }

    public final long readLong()
    {
        throw new UnsupportedOperationException();
    }

    public final short readShort()
    {
        throw new UnsupportedOperationException();
    }

    public final String readUTF()
    {
        throw new UnsupportedOperationException();
    }

    public final int readUnsignedByte()
    {
        return read() & 0xff;
    }

    public final int readUnsignedShort()
    {
        return readUnsignedByte() | readUnsignedByte() << 8;
    }

    public final int skipBytes(int i)
    {
        throw new UnsupportedOperationException();
    }
}
