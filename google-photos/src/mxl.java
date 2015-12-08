// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class mxl extends FilterInputStream
{

    int a;
    final ByteBuffer b;
    private final byte c[] = new byte[8];

    protected mxl(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
        b = ByteBuffer.wrap(c);
    }

    public final short a()
    {
        a(c, 0, 2);
        b.rewind();
        return b.getShort();
    }

    public final void a(ByteOrder byteorder)
    {
        b.order(byteorder);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (read(abyte0, 0, j) != j)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final int b()
    {
        a(c, 0, 4);
        b.rewind();
        return b.getInt();
    }

    public final long c()
    {
        return (long)b() & 0xffffffffL;
    }

    public final int read()
    {
        int j = in.read();
        int k = a;
        int i;
        if (j >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = i + k;
        return j;
    }

    public final int read(byte abyte0[])
    {
        int i = in.read(abyte0);
        a = a + Math.max(i, 0);
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        a = a + Math.max(i, 0);
        return i;
    }

    public final long skip(long l)
    {
        l = in.skip(l);
        a = (int)((long)a + l);
        return l;
    }
}
