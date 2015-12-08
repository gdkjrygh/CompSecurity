// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsRuntimeException

public class ByteQueue
{

    private byte a[];
    private int b;
    private int c;

    public ByteQueue()
    {
        a = new byte[1024];
        b = 0;
        c = 0;
    }

    public static final int nextTwoPow(int i)
    {
        i = i >> 1 | i;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        return (i | i >> 16) + 1;
    }

    public void addData(byte abyte0[], int i, int j)
    {
        if (b + c + j > a.length)
        {
            byte abyte1[] = new byte[nextTwoPow(abyte0.length)];
            System.arraycopy(a, b, abyte1, 0, c);
            b = 0;
            a = abyte1;
        }
        System.arraycopy(abyte0, i, a, b + c, j);
        c = c + j;
    }

    public void read(byte abyte0[], int i, int j, int k)
    {
        if (c - k < j)
        {
            throw new TlsRuntimeException("Not enough data to read");
        }
        if (abyte0.length - i < j)
        {
            throw new TlsRuntimeException((new StringBuilder("Buffer size of ")).append(abyte0.length).append(" is too small for a read of ").append(j).append(" bytes").toString());
        } else
        {
            System.arraycopy(a, b + k, abyte0, i, j);
            return;
        }
    }

    public void removeData(int i)
    {
        if (i > c)
        {
            throw new TlsRuntimeException((new StringBuilder("Cannot remove ")).append(i).append(" bytes, only got ").append(c).toString());
        }
        c = c - i;
        b = b + i;
        if (b > a.length / 2)
        {
            System.arraycopy(a, b, a, 0, c);
            b = 0;
        }
    }

    public int size()
    {
        return c;
    }
}
