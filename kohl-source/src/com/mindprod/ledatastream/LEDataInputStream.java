// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mindprod.ledatastream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class LEDataInputStream
    implements DataInput
{

    protected final DataInputStream dis;
    protected final InputStream is;
    protected final byte work[] = new byte[8];

    public LEDataInputStream(InputStream inputstream)
    {
        is = inputstream;
        dis = new DataInputStream(inputstream);
    }

    public final boolean readBoolean()
        throws IOException
    {
        return dis.readBoolean();
    }

    public final byte readByte()
        throws IOException
    {
        return dis.readByte();
    }

    public final char readChar()
        throws IOException
    {
        dis.readFully(work, 0, 2);
        return (char)((work[1] & 0xff) << 8 | work[0] & 0xff);
    }

    public final double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte abyte0[])
        throws IOException
    {
        dis.readFully(abyte0, 0, abyte0.length);
    }

    public final void readFully(byte abyte0[], int i, int j)
        throws IOException
    {
        dis.readFully(abyte0, i, j);
    }

    public final int readInt()
        throws IOException
    {
        dis.readFully(work, 0, 4);
        return work[3] << 24 | (work[2] & 0xff) << 16 | (work[1] & 0xff) << 8 | work[0] & 0xff;
    }

    public final String readLine()
        throws IOException
    {
        return dis.readLine();
    }

    public final long readLong()
        throws IOException
    {
        dis.readFully(work, 0, 8);
        return (long)work[7] << 56 | (long)(work[6] & 0xff) << 48 | (long)(work[5] & 0xff) << 40 | (long)(work[4] & 0xff) << 32 | (long)(work[3] & 0xff) << 24 | (long)(work[2] & 0xff) << 16 | (long)(work[1] & 0xff) << 8 | (long)(work[0] & 0xff);
    }

    public final short readShort()
        throws IOException
    {
        dis.readFully(work, 0, 2);
        return (short)((work[1] & 0xff) << 8 | work[0] & 0xff);
    }

    public final String readUTF()
        throws IOException
    {
        return dis.readUTF();
    }

    public final int readUnsignedByte()
        throws IOException
    {
        return dis.readUnsignedByte();
    }

    public final int readUnsignedShort()
        throws IOException
    {
        dis.readFully(work, 0, 2);
        return (work[1] & 0xff) << 8 | work[0] & 0xff;
    }

    public final int skipBytes(int i)
        throws IOException
    {
        return dis.skipBytes(i);
    }
}
