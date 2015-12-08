// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsRuntimeException

public class ByteQueue
{

    private static final int INITBUFSIZE = 1024;
    private int available;
    private byte databuf[];
    private int skipped;

    public ByteQueue()
    {
        databuf = new byte[1024];
        skipped = 0;
        available = 0;
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
        if (skipped + available + j > databuf.length)
        {
            byte abyte1[] = new byte[nextTwoPow(abyte0.length)];
            System.arraycopy(databuf, skipped, abyte1, 0, available);
            skipped = 0;
            databuf = abyte1;
        }
        System.arraycopy(abyte0, i, databuf, skipped + available, j);
        available = available + j;
    }

    public void read(byte abyte0[], int i, int j, int k)
    {
        if (available - k < j)
        {
            throw new TlsRuntimeException("Not enough data to read");
        }
        if (abyte0.length - i < j)
        {
            throw new TlsRuntimeException((new StringBuilder()).append("Buffer size of ").append(abyte0.length).append(" is too small for a read of ").append(j).append(" bytes").toString());
        } else
        {
            System.arraycopy(databuf, skipped + k, abyte0, i, j);
            return;
        }
    }

    public void removeData(int i)
    {
        if (i > available)
        {
            throw new TlsRuntimeException((new StringBuilder()).append("Cannot remove ").append(i).append(" bytes, only got ").append(available).toString());
        }
        available = available - i;
        skipped = skipped + i;
        if (skipped > databuf.length / 2)
        {
            System.arraycopy(databuf, skipped, databuf, 0, available);
            skipped = 0;
        }
    }

    public int size()
    {
        return available;
    }
}
