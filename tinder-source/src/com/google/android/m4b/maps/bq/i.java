// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import java.io.InputStream;

public final class i
{

    public static final byte a[];
    private static final byte e[] = {
        90, -18, 3, -99, 14, -41, 106, -78, 116, 63, 
        54, 80, 40, -121, -32, -17
    };
    private static final byte f[] = new byte[16];
    public final byte b[] = new byte[256];
    public int c;
    public int d;

    public i()
    {
    }

    public static void a(int j, int k, int l, int i1, int j1, long l1, byte abyte0[])
    {
        b(abyte0);
        int k1 = i1;
        if (i1 < 8)
        {
            k1 = 0;
        }
        abyte0[16] = (byte)(j >> 24);
        abyte0[17] = (byte)(j >> 16);
        abyte0[18] = (byte)(j >> 8);
        abyte0[19] = (byte)j;
        abyte0[20] = (byte)(k >> 24);
        abyte0[21] = (byte)(k >> 16);
        abyte0[22] = (byte)(k >> 8);
        abyte0[23] = (byte)k;
        abyte0[24] = (byte)(l >> 24);
        abyte0[25] = (byte)(l >> 16);
        abyte0[26] = (byte)(l >> 8);
        abyte0[27] = (byte)l;
        j = k1 & 0xffff;
        abyte0[28] = (byte)(j >> 8);
        abyte0[29] = (byte)j;
        j = j1 & 0xffff;
        abyte0[30] = (byte)(j >> 8);
        abyte0[31] = (byte)j;
        abyte0[32] = (byte)(int)(l1 >> 56);
        abyte0[33] = (byte)(int)(l1 >> 48);
        abyte0[34] = (byte)(int)(l1 >> 40);
        abyte0[35] = (byte)(int)(l1 >> 32);
        abyte0[36] = (byte)(int)(l1 >> 24);
        abyte0[37] = (byte)(int)(l1 >> 16);
        abyte0[38] = (byte)(int)(l1 >> 8);
        abyte0[39] = (byte)(int)l1;
    }

    public static void a(int j, int k, int l, int i1, byte abyte0[])
    {
        b(abyte0);
        abyte0[16] = (byte)(j >> 24);
        abyte0[17] = (byte)(j >> 16);
        abyte0[18] = (byte)(j >> 8);
        abyte0[19] = (byte)j;
        abyte0[20] = (byte)(k >> 24);
        abyte0[21] = (byte)(k >> 16);
        abyte0[22] = (byte)(k >> 8);
        abyte0[23] = (byte)k;
        abyte0[24] = (byte)(l >> 24);
        abyte0[25] = (byte)(l >> 16);
        abyte0[26] = (byte)(l >> 8);
        abyte0[27] = (byte)l;
        abyte0[28] = (byte)(i1 >> 24);
        abyte0[29] = (byte)(i1 >> 16);
        abyte0[30] = (byte)(i1 >> 8);
        abyte0[31] = (byte)i1;
    }

    public static void a(InputStream inputstream)
    {
        inputstream.read(f);
        inputstream.close();
    }

    private static void b(byte abyte0[])
    {
        for (int j = 0; j < 16; j++)
        {
            abyte0[j] = (byte)(e[j] * 47 ^ f[j]);
        }

    }

    public final void a()
    {
        int l = c;
        int k = d;
        for (int j = 0; j < 256; j++)
        {
            l = l + 1 & 0xff;
            k = k + b[l] & 0xff;
            byte byte0 = b[l];
            b[l] = b[k];
            b[k] = byte0;
        }

        c = l;
        d = k;
    }

    public final void a(byte abyte0[])
    {
        System.arraycopy(a, 0, b, 0, 256);
        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + b[j] + abyte0[j % 40] & 0xff;
            byte byte0 = b[j];
            b[j] = b[k];
            b[k] = byte0;
        }

        c = 0;
        d = 0;
        a();
    }

    public final void a(byte abyte0[], int j, int k)
    {
        int j1 = c;
        int i1 = d;
        for (int l = 0; l < k;)
        {
            j1 = j1 + 1 & 0xff;
            i1 = i1 + b[j1] & 0xff;
            byte byte0 = b[j1];
            byte byte1 = b[i1];
            b[j1] = byte1;
            b[i1] = byte0;
            byte byte2 = abyte0[j];
            abyte0[j] = (byte)(b[byte0 + byte1 & 0xff] ^ byte2);
            l++;
            j++;
        }

        c = j1;
        d = i1;
    }

    static 
    {
        a = new byte[256];
        for (int j = 0; j < 256; j++)
        {
            a[j] = (byte)j;
        }

    }
}
