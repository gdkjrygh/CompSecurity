// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package brut.util;

import java.io.DataInput;
import java.io.IOException;

public abstract class DataInputDelegate
    implements DataInput
{

    protected final DataInput mDelegate;

    public DataInputDelegate(DataInput datainput)
    {
        mDelegate = datainput;
    }

    public boolean readBoolean()
        throws IOException
    {
        return mDelegate.readBoolean();
    }

    public byte readByte()
        throws IOException
    {
        return mDelegate.readByte();
    }

    public char readChar()
        throws IOException
    {
        return mDelegate.readChar();
    }

    public double readDouble()
        throws IOException
    {
        return mDelegate.readDouble();
    }

    public float readFloat()
        throws IOException
    {
        return mDelegate.readFloat();
    }

    public void readFully(byte abyte0[])
        throws IOException
    {
        mDelegate.readFully(abyte0);
    }

    public void readFully(byte abyte0[], int i, int j)
        throws IOException
    {
        mDelegate.readFully(abyte0, i, j);
    }

    public int readInt()
        throws IOException
    {
        return mDelegate.readInt();
    }

    public String readLine()
        throws IOException
    {
        return mDelegate.readLine();
    }

    public long readLong()
        throws IOException
    {
        return mDelegate.readLong();
    }

    public short readShort()
        throws IOException
    {
        return mDelegate.readShort();
    }

    public String readUTF()
        throws IOException
    {
        return mDelegate.readUTF();
    }

    public int readUnsignedByte()
        throws IOException
    {
        return mDelegate.readUnsignedByte();
    }

    public int readUnsignedShort()
        throws IOException
    {
        return mDelegate.readUnsignedShort();
    }

    public int skipBytes(int i)
        throws IOException
    {
        return mDelegate.skipBytes(i);
    }
}
