// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterInputStream;
import java.io.InputStream;

public final class anu extends FilterInputStream
{

    private static final byte a[];
    private static final int b;
    private static final int c;
    private final byte d;
    private int e;

    public anu(InputStream inputstream, int i)
    {
        super(inputstream);
        if (i < -1 || i > 8)
        {
            throw new IllegalArgumentException((new StringBuilder(43)).append("Cannot add invalid orientation: ").append(i).toString());
        } else
        {
            d = (byte)i;
            return;
        }
    }

    public final void mark(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported()
    {
        return false;
    }

    public final int read()
    {
        int i;
        if (e < 2 || e > c)
        {
            i = super.read();
        } else
        if (e == c)
        {
            i = d;
        } else
        {
            i = a[e - 2] & 0xff;
        }
        if (i != -1)
        {
            e = e + 1;
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (e > c)
        {
            i = super.read(abyte0, i, j);
        } else
        if (e == c)
        {
            abyte0[i] = d;
            i = 1;
        } else
        if (e < 2)
        {
            i = super.read(abyte0, i, 2 - e);
        } else
        {
            j = Math.min(c - e, j);
            System.arraycopy(a, e - 2, abyte0, i, j);
            i = j;
        }
        if (i > 0)
        {
            e = e + i;
        }
        return i;
    }

    public final void reset()
    {
        throw new UnsupportedOperationException();
    }

    public final long skip(long l)
    {
        l = super.skip(l);
        if (l > 0L)
        {
            e = (int)((long)e + l);
        }
        return l;
    }

    static 
    {
        byte abyte0[] = new byte[29];
        byte[] _tmp = abyte0;
        abyte0[0] = -1;
        abyte0[1] = -31;
        abyte0[2] = 0;
        abyte0[3] = 28;
        abyte0[4] = 69;
        abyte0[5] = 120;
        abyte0[6] = 105;
        abyte0[7] = 102;
        abyte0[8] = 0;
        abyte0[9] = 0;
        abyte0[10] = 77;
        abyte0[11] = 77;
        abyte0[12] = 0;
        abyte0[13] = 0;
        abyte0[14] = 0;
        abyte0[15] = 0;
        abyte0[16] = 0;
        abyte0[17] = 8;
        abyte0[18] = 0;
        abyte0[19] = 1;
        abyte0[20] = 1;
        abyte0[21] = 18;
        abyte0[22] = 0;
        abyte0[23] = 2;
        abyte0[24] = 0;
        abyte0[25] = 0;
        abyte0[26] = 0;
        abyte0[27] = 1;
        abyte0[28] = 0;
        a = abyte0;
        int i = abyte0.length;
        b = i;
        c = i + 2;
    }
}
