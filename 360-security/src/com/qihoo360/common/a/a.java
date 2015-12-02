// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a extends FilterInputStream
{

    private int a;
    private int b;
    private boolean c;
    private byte d[];
    private byte e[];

    public a(InputStream inputstream)
    {
        super(inputstream);
        a = 0;
        b = 0;
        c = false;
        d = new byte[5];
        e = new byte[4];
    }

    public int available()
    {
        return 0;
    }

    public void close()
        throws IOException
    {
        d = null;
        c = true;
        e = null;
        super.close();
    }

    public void mark(int i)
    {
    }

    public boolean markSupported()
    {
        return false;
    }

    public final int read()
        throws IOException
    {
        if (a < b) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (c)
        {
            return -1;
        }
        a = 0;
        do
        {
            int i = (byte)in.read();
            if (i == -1)
            {
                c = true;
                return -1;
            }
            byte0 = (byte)i;
        } while (byte0 == 10 || byte0 == 13 || byte0 == 32);
        if (byte0 == 126 || byte0 == 120)
        {
            c = true;
            e = null;
            d = null;
            b = 0;
            return -1;
        }
        if (byte0 != 122) goto _L4; else goto _L3
_L3:
        byte abyte0[] = e;
        byte abyte2[] = e;
        byte abyte3[] = e;
        e[3] = 0;
        abyte3[2] = 0;
        abyte2[1] = 0;
        abyte0[0] = 0;
        b = 4;
_L2:
        byte abyte1[] = e;
        int j = a;
        a = j + 1;
        return abyte1[j] & 0xff;
_L4:
        int k;
        d[0] = byte0;
        k = 1;
_L9:
        if (k < 5) goto _L6; else goto _L5
_L5:
        b = k - 1;
        if (b == 0)
        {
            c = true;
            d = null;
            e = null;
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L6:
        do
        {
            int l = (byte)in.read();
            if (l == -1)
            {
                c = true;
                return -1;
            }
            byte0 = (byte)l;
        } while (byte0 == 10 || byte0 == 13 || byte0 == 32);
        d[k] = byte0;
        if (byte0 == 126 || byte0 == 120) goto _L5; else goto _L7
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
        if (k >= 5) goto _L11; else goto _L10
_L10:
        k++;
_L14:
        if (k < 5) goto _L13; else goto _L12
_L12:
        c = true;
_L11:
        long l1;
        l1 = 0L;
        k = 0;
_L15:
        if (k < 5)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        k = 3;
        while (k >= 0) 
        {
            e[k] = (byte)(int)(255L & l1);
            l1 >>>= 8;
            k--;
        }
          goto _L2
_L13:
        d[k] = 35;
        k++;
          goto _L14
        int i1 = (byte)(d[k] - 35);
        if (i1 < 0 || i1 > 93)
        {
            b = 0;
            c = true;
            d = null;
            e = null;
            throw new IOException("Invalid data in Ascii85 stream");
        }
        l1 = l1 * 85L + (long)i1;
        k++;
          goto _L15
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (!c || a < b) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        int k = 0;
        do
        {
            l = j;
            if (k >= j)
            {
                continue;
            }
            if (a < b)
            {
                byte abyte1[] = e;
                int i1 = a;
                a = i1 + 1;
                abyte0[k + i] = abyte1[i1];
            } else
            {
                int j1 = read();
                if (j1 == -1)
                {
                    return k;
                }
                abyte0[k + i] = (byte)j1;
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void reset()
        throws IOException
    {
        throw new IOException("Reset is not supported");
    }

    public long skip(long l)
    {
        return 0L;
    }
}
