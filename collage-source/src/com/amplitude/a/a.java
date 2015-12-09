// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.a;

import java.security.DigestException;
import java.security.MessageDigest;

public final class a extends MessageDigest
    implements Cloneable
{

    private long a;
    private int b;
    private byte c[];
    private int d;
    private int e;
    private int f;
    private int g;

    public a()
    {
        super("MD5");
        c = new byte[64];
        a();
    }

    private final void a(byte abyte0[], int i)
    {
        int j = e;
        int i1 = f;
        int k1 = g;
        int l1 = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | abyte0[i + 3] << 24;
        int k = ((((i1 ^ k1) & j ^ k1) + l1) - 0x28955b88) + d;
        int j1 = (k >>> 25 | k << 7) + j;
        int l = abyte0[i + 4];
        int i2 = abyte0[i + 5];
        k = i + 10;
        l = l & 0xff | (i2 & 0xff) << 8 | (abyte0[k - 4] & 0xff) << 16 | abyte0[k - 3] << 24;
        i = k1 + ((((j ^ i1) & j1 ^ i1) + l) - 0x173848aa);
        int j2 = (i >>> 20 | i << 12) + j1;
        i = abyte0[k - 2] & 0xff | (abyte0[k - 1] & 0xff) << 8 | (abyte0[k] & 0xff) << 16 | abyte0[k + 1] << 24;
        i1 += ((j1 ^ j) & j2 ^ j) + i + 0x242070db;
        i2 = (i1 >>> 15 | i1 << 17) + j2;
        k1 = abyte0[k + 2] & 0xff | (abyte0[k + 3] & 0xff) << 8 | (abyte0[k + 4] & 0xff) << 16 | abyte0[k + 5] << 24;
        i1 = ((((j2 ^ j1) & i2 ^ j1) + k1) - 0x3e423112) + j;
        i1 = (i1 >>> 10 | i1 << 22) + i2;
        int i3 = k + 10;
        k = abyte0[i3 - 4] & 0xff | (abyte0[i3 - 3] & 0xff) << 8 | (abyte0[i3 - 2] & 0xff) << 16 | abyte0[i3 - 1] << 24;
        j1 += (((i2 ^ j2) & i1 ^ j2) + k) - 0xa83f051;
        int l2 = (j1 >>> 25 | j1 << 7) + i1;
        int k2 = abyte0[i3] & 0xff | (abyte0[i3 + 1] & 0xff) << 8 | (abyte0[i3 + 2] & 0xff) << 16 | abyte0[i3 + 3] << 24;
        j1 = j2 + (((i1 ^ i2) & l2 ^ i2) + k2 + 0x4787c62a);
        j2 = (j1 >>> 20 | j1 << 12) + l2;
        j1 = abyte0[i3 + 4];
        int j3 = abyte0[i3 + 5];
        i3 += 10;
        j1 = j1 & 0xff | (j3 & 0xff) << 8 | (abyte0[i3 - 4] & 0xff) << 16 | abyte0[i3 - 3] << 24;
        i2 += (((l2 ^ i1) & j2 ^ i1) + j1) - 0x57cfb9ed;
        int l3 = (i2 >>> 15 | i2 << 17) + j2;
        j3 = abyte0[i3 - 2] & 0xff | (abyte0[i3 - 1] & 0xff) << 8 | (abyte0[i3] & 0xff) << 16 | abyte0[i3 + 1] << 24;
        i1 += (((j2 ^ l2) & l3 ^ l2) + j3) - 0x2b96aff;
        int k3 = (i1 >>> 10 | i1 << 22) + l3;
        i2 = abyte0[i3 + 2] & 0xff | (abyte0[i3 + 3] & 0xff) << 8 | (abyte0[i3 + 4] & 0xff) << 16 | abyte0[i3 + 5] << 24;
        i1 = l2 + (((l3 ^ j2) & k3 ^ j2) + i2 + 0x698098d8);
        l2 = (i1 >>> 25 | i1 << 7) + k3;
        int j4 = i3 + 10;
        i1 = abyte0[j4 - 4] & 0xff | (abyte0[j4 - 3] & 0xff) << 8 | (abyte0[j4 - 2] & 0xff) << 16 | abyte0[j4 - 1] << 24;
        j2 += (((k3 ^ l3) & l2 ^ l3) + i1) - 0x74bb0851;
        int i4 = (j2 >>> 20 | j2 << 12) + l2;
        i3 = abyte0[j4] & 0xff | (abyte0[j4 + 1] & 0xff) << 8 | (abyte0[j4 + 2] & 0xff) << 16 | abyte0[j4 + 3] << 24;
        j2 = l3 + ((((l2 ^ k3) & i4 ^ k3) + i3) - 42063);
        l3 = (j2 >>> 15 | j2 << 17) + i4;
        j2 = abyte0[j4 + 4];
        int k4 = abyte0[j4 + 5];
        int i5 = j4 + 10;
        j2 = j2 & 0xff | (k4 & 0xff) << 8 | (abyte0[i5 - 4] & 0xff) << 16 | abyte0[i5 - 3] << 24;
        k3 += (((i4 ^ l2) & l3 ^ l2) + j2) - 0x76a32842;
        j4 = (k3 >>> 10 | k3 << 22) + l3;
        k3 = abyte0[i5 - 2] & 0xff | (abyte0[i5 - 1] & 0xff) << 8 | (abyte0[i5] & 0xff) << 16 | abyte0[i5 + 1] << 24;
        l2 += ((l3 ^ i4) & j4 ^ i4) + k3 + 0x6b901122;
        k4 = (l2 >>> 25 | l2 << 7) + j4;
        l2 = abyte0[i5 + 2] & 0xff | (abyte0[i5 + 3] & 0xff) << 8 | (abyte0[i5 + 4] & 0xff) << 16 | abyte0[i5 + 5] << 24;
        i4 += (((j4 ^ l3) & k4 ^ l3) + l2) - 0x2678e6d;
        int l4 = (i4 >>> 20 | i4 << 12) + k4;
        int j5 = i5 + 10;
        i4 = abyte0[j5 - 4] & 0xff | (abyte0[j5 - 3] & 0xff) << 8 | (abyte0[j5 - 2] & 0xff) << 16 | abyte0[j5 - 1] << 24;
        l3 += (((k4 ^ j4) & l4 ^ j4) + i4) - 0x5986bc72;
        i5 = (l3 >>> 15 | l3 << 17) + l4;
        l3 = abyte0[j5];
        byte byte0 = abyte0[j5 + 1];
        byte byte1 = abyte0[j5 + 2];
        l3 = abyte0[j5 + 3] << 24 | (l3 & 0xff | (byte0 & 0xff) << 8 | (byte1 & 0xff) << 16);
        j4 += ((l4 ^ k4) & i5 ^ k4) + l3 + 0x49b40821;
        j4 = (j4 >>> 10 | j4 << 22) + i5;
        k4 += (((i5 ^ j4) & l4 ^ i5) + l) - 0x9e1da9e;
        k4 = (k4 >>> 27 | k4 << 5) + j4;
        l4 += (((j4 ^ k4) & i5 ^ j4) + j1) - 0x3fbf4cc0;
        l4 = (l4 >>> 23 | l4 << 9) + k4;
        i5 += ((k4 ^ l4) & j4 ^ k4) + j2 + 0x265e5a51;
        i5 = (i5 >>> 18 | i5 << 14) + l4;
        j4 += (((l4 ^ i5) & k4 ^ l4) + l1) - 0x16493856;
        j4 = (j4 >>> 12 | j4 << 20) + i5;
        k4 += (((i5 ^ j4) & l4 ^ i5) + k2) - 0x29d0efa3;
        k4 = (k4 >>> 27 | k4 << 5) + j4;
        l4 += ((j4 ^ k4) & i5 ^ j4) + i3 + 0x2441453;
        l4 = (l4 >>> 23 | l4 << 9) + k4;
        i5 += (((k4 ^ l4) & j4 ^ k4) + l3) - 0x275e197f;
        i5 = (i5 >>> 18 | i5 << 14) + l4;
        j4 += (((l4 ^ i5) & k4 ^ l4) + k) - 0x182c0438;
        j4 = (j4 >>> 12 | j4 << 20) + i5;
        k4 += ((i5 ^ j4) & l4 ^ i5) + i1 + 0x21e1cde6;
        k4 = (k4 >>> 27 | k4 << 5) + j4;
        l4 += (((j4 ^ k4) & i5 ^ j4) + i4) - 0x3cc8f82a;
        l4 = (l4 >>> 23 | l4 << 9) + k4;
        i5 += (((k4 ^ l4) & j4 ^ k4) + k1) - 0xb2af279;
        i5 = (i5 >>> 18 | i5 << 14) + l4;
        j4 += ((l4 ^ i5) & k4 ^ l4) + i2 + 0x455a14ed;
        j4 = (j4 >>> 12 | j4 << 20) + i5;
        k4 += (((i5 ^ j4) & l4 ^ i5) + l2) - 0x561c16fb;
        k4 = (k4 >>> 27 | k4 << 5) + j4;
        l4 += (((j4 ^ k4) & i5 ^ j4) + i) - 0x3105c08;
        l4 = (l4 >>> 23 | l4 << 9) + k4;
        i5 += ((k4 ^ l4) & j4 ^ k4) + j3 + 0x676f02d9;
        i5 = (i5 >>> 18 | i5 << 14) + l4;
        j4 += (((l4 ^ i5) & k4 ^ l4) + k3) - 0x72d5b376;
        j4 = (j4 >>> 12 | j4 << 20) + i5;
        k4 += ((i5 ^ j4 ^ l4) + k2) - 0x5c6be;
        k4 = (k4 >>> 28 | k4 << 4) + j4;
        l4 += ((j4 ^ k4 ^ i5) + i2) - 0x788e097f;
        l4 = (l4 >>> 21 | l4 << 11) + k4;
        i5 += (k4 ^ l4 ^ j4) + j2 + 0x6d9d6122;
        i5 = (i5 >>> 16 | i5 << 16) + l4;
        j4 += ((l4 ^ i5 ^ k4) + i4) - 0x21ac7f4;
        j4 = (j4 >>> 9 | j4 << 23) + i5;
        k4 += ((i5 ^ j4 ^ l4) + l) - 0x5b4115bc;
        k4 = (k4 >>> 28 | k4 << 4) + j4;
        l4 += (j4 ^ k4 ^ i5) + k + 0x4bdecfa9;
        l4 = (l4 >>> 21 | l4 << 11) + k4;
        i5 += ((k4 ^ l4 ^ j4) + j3) - 0x944b4a0;
        i5 = (i5 >>> 16 | i5 << 16) + l4;
        j4 += ((l4 ^ i5 ^ k4) + i3) - 0x41404390;
        j4 = (j4 >>> 9 | j4 << 23) + i5;
        k4 += (i5 ^ j4 ^ l4) + l2 + 0x289b7ec6;
        k4 = (k4 >>> 28 | k4 << 4) + j4;
        l4 += ((j4 ^ k4 ^ i5) + l1) - 0x155ed806;
        l4 = (l4 >>> 21 | l4 << 11) + k4;
        i5 += ((k4 ^ l4 ^ j4) + k1) - 0x2b10cf7b;
        i5 = (i5 >>> 16 | i5 << 16) + l4;
        j4 += (l4 ^ i5 ^ k4) + j1 + 0x4881d05;
        j4 = (j4 >>> 9 | j4 << 23) + i5;
        k4 += ((i5 ^ j4 ^ l4) + i1) - 0x262b2fc7;
        k4 = (k4 >>> 28 | k4 << 4) + j4;
        l4 += ((j4 ^ k4 ^ i5) + k3) - 0x1924661b;
        l4 = (l4 >>> 21 | l4 << 11) + k4;
        i5 += (k4 ^ l4 ^ j4) + l3 + 0x1fa27cf8;
        i5 = (i5 >>> 16 | i5 << 16) + l4;
        j4 += ((l4 ^ i5 ^ k4) + i) - 0x3b53a99b;
        j4 = (j4 >>> 9 | j4 << 23) + i5;
        l1 = k4 + ((l1 + ((~l4 | j4) ^ i5)) - 0xbd6ddbc);
        l1 = (l1 >>> 26 | l1 << 6) + j4;
        j3 = l4 + (((~i5 | l1) ^ j4) + j3 + 0x432aff97);
        j3 = (j3 >>> 22 | j3 << 10) + l1;
        i4 = i5 + ((((~j4 | j3) ^ l1) + i4) - 0x546bdc59);
        i4 = (i4 >>> 17 | i4 << 15) + j3;
        k2 = ((((~l1 | i4) ^ j3) + k2) - 0x36c5fc7) + j4;
        k2 = (k2 >>> 11 | k2 << 21) + i4;
        l1 += ((~j3 | k2) ^ i4) + k3 + 0x655b59c3;
        l1 = (l1 >>> 26 | l1 << 6) + k2;
        k1 = j3 + ((((~i4 | l1) ^ k2) + k1) - 0x70f3336e);
        k1 = (k1 >>> 22 | k1 << 10) + l1;
        i3 = i4 + ((((~k2 | k1) ^ l1) + i3) - 0x100b83);
        i3 = (i3 >>> 17 | i3 << 15) + k1;
        l = k2 + ((((~l1 | i3) ^ k1) + l) - 0x7a7ba22f);
        l = (l >>> 11 | l << 21) + i3;
        l1 += ((~k1 | l) ^ i3) + i2 + 0x6fa87e4f;
        l1 = (l1 >>> 26 | l1 << 6) + l;
        k1 += (((~i3 | l1) ^ l) + l3) - 0x1d31920;
        k1 = (k1 >>> 22 | k1 << 10) + l1;
        j1 = i3 + ((((~l | k1) ^ l1) + j1) - 0x5cfebcec);
        j1 = (j1 >>> 17 | j1 << 15) + k1;
        l += ((~l1 | j1) ^ k1) + l2 + 0x4e0811a1;
        l = (l >>> 11 | l << 21) + j1;
        k = l1 + ((((~k1 | l) ^ j1) + k) - 0x8ac817e);
        k = (k >>> 26 | k << 6) + l;
        k1 += (((~j1 | k) ^ l) + j2) - 0x42c50dcb;
        k1 = (k1 >>> 22 | k1 << 10) + k;
        i = j1 + (((~l | k1) ^ k) + i + 0x2ad7d2bb);
        i = (i >>> 17 | i << 15) + k1;
        l += (((~k | i) ^ k1) + i1) - 0x14792c6f;
        e = j + i + (l >>> 11 | l << 21);
        f = f + i;
        g = g + k1;
        d = d + k;
    }

    protected void a()
    {
        d = 0x67452301;
        e = 0xefcdab89;
        f = 0x98badcfe;
        g = 0x10325476;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        a a1 = (a)super.clone();
        a1.c = (byte[])(byte[])c.clone();
        return a1;
    }

    public int engineDigest(byte abyte0[], int i, int j)
        throws DigestException
    {
        if (j < 16) goto _L2; else goto _L1
_L1:
        if (abyte0.length - i < 16) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        abyte1 = c;
        j = b;
        abyte1[j] = -128;
        j;
        JVM INSTR tableswitch 56 63: default 80
    //                   56 200
    //                   57 206
    //                   58 212
    //                   59 218
    //                   60 224
    //                   61 230
    //                   62 236
    //                   63 242;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L5:
        switch (j & 7)
        {
        case 7: // '\007'
            j -= 3;
            break;

        case 6: // '\006'
            j -= 2;
            abyte1[j + 3] = 0;
            break;

        case 5: // '\005'
            j--;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;

        case 4: // '\004'
            abyte1[j + 1] = 0;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;

        case 3: // '\003'
            j++;
            abyte1[j] = 0;
            abyte1[j + 1] = 0;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;

        case 2: // '\002'
            j += 2;
            abyte1[j - 1] = 0;
            abyte1[j] = 0;
            abyte1[j + 1] = 0;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;

        case 1: // '\001'
            j += 3;
            abyte1[j - 2] = 0;
            abyte1[j - 1] = 0;
            abyte1[j] = 0;
            abyte1[j + 1] = 0;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;

        case 0: // '\0'
            j += 4;
            abyte1[j - 3] = 0;
            abyte1[j - 2] = 0;
            abyte1[j - 1] = 0;
            abyte1[j] = 0;
            abyte1[j + 1] = 0;
            abyte1[j + 2] = 0;
            abyte1[j + 3] = 0;
            break;
        }
        do
        {
            j += 8;
            if (j <= 52)
            {
                abyte1[j - 4] = 0;
                abyte1[j - 3] = 0;
                abyte1[j - 2] = 0;
                abyte1[j - 1] = 0;
                abyte1[j] = 0;
                abyte1[j + 1] = 0;
                abyte1[j + 2] = 0;
                abyte1[j + 3] = 0;
            } else
            {
                j = (int)a << 3;
                abyte1[56] = (byte)j;
                abyte1[57] = (byte)(j >>> 8);
                abyte1[58] = (byte)(j >>> 16);
                abyte1[59] = (byte)(j >>> 24);
                j = (int)(a >>> 29);
                abyte1[60] = (byte)j;
                abyte1[61] = (byte)(j >>> 8);
                abyte1[62] = (byte)(j >>> 16);
                abyte1[63] = (byte)(j >>> 24);
                a(abyte1, 0);
                j = d;
                abyte0[i] = (byte)j;
                abyte0[i + 1] = (byte)(j >>> 8);
                abyte0[i + 2] = (byte)(j >>> 16);
                abyte0[i + 3] = (byte)(j >>> 24);
                j = e;
                abyte0[i + 4] = (byte)j;
                abyte0[i + 5] = (byte)(j >>> 8);
                i += 10;
                abyte0[i - 4] = (byte)(j >>> 16);
                abyte0[i - 3] = (byte)(j >>> 24);
                j = f;
                abyte0[i - 2] = (byte)j;
                abyte0[i - 1] = (byte)(j >>> 8);
                abyte0[i] = (byte)(j >>> 16);
                abyte0[i + 1] = (byte)(j >>> 24);
                j = g;
                abyte0[i + 2] = (byte)j;
                abyte0[i + 3] = (byte)(j >>> 8);
                abyte0[i + 4] = (byte)(j >>> 16);
                abyte0[i + 5] = (byte)(j >>> 24);
                engineReset();
                return 16;
            }
        } while (true);
_L6:
        abyte1[57] = 0;
_L7:
        abyte1[58] = 0;
_L8:
        abyte1[59] = 0;
_L9:
        abyte1[60] = 0;
_L10:
        abyte1[61] = 0;
_L11:
        abyte1[62] = 0;
_L12:
        abyte1[63] = 0;
_L13:
        a(abyte1, 0);
        j = -1;
          goto _L5
_L4:
        throw new DigestException("insufficient space in output buffer to store the digest");
_L2:
        throw new DigestException("partial digests not returned");
    }

    public byte[] engineDigest()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[16];
            engineDigest(abyte0, 0, 16);
        }
        catch (DigestException digestexception)
        {
            return null;
        }
        return abyte0;
    }

    public int engineGetDigestLength()
    {
        return 16;
    }

    public void engineReset()
    {
        b = 0;
        a = 0L;
        int i = 60;
        byte abyte0[] = c;
        int j;
        do
        {
            abyte0[i - 4] = 0;
            abyte0[i - 3] = 0;
            abyte0[i - 2] = 0;
            abyte0[i - 1] = 0;
            abyte0[i] = 0;
            abyte0[i + 1] = 0;
            abyte0[i + 2] = 0;
            abyte0[i + 3] = 0;
            j = i - 8;
            i = j;
        } while (j >= 0);
        a();
    }

    public void engineUpdate(byte byte0)
    {
        a = a + 1L;
        if (b < 63)
        {
            byte abyte0[] = c;
            int i = b;
            b = i + 1;
            abyte0[i] = byte0;
            return;
        } else
        {
            c[63] = byte0;
            a(c, b);
            b = 0;
            return;
        }
    }

    public void engineUpdate(byte abyte0[], int i, int j)
    {
        if (i >= 0 && j >= 0 && i + j <= abyte0.length)
        {
            a = a + (long)j;
            int l;
            int k1;
            if (b > 0 && b + j >= 64)
            {
                byte abyte1[] = c;
                int k = b;
                int j1 = 64 - b;
                System.arraycopy(abyte0, i, abyte1, k, j1);
                abyte1 = c;
                b = 0;
                a(abyte1, 0);
                k = j - j1;
                j = i + j1;
                i = k;
            } else
            {
                int i1 = i;
                i = j;
                j = i1;
            }
            do
            {
                l = i;
                k1 = j;
                if (i < 512)
                {
                    break;
                }
                a(abyte0, j);
                a(abyte0, j + 64);
                a(abyte0, j + 128);
                a(abyte0, j + 192);
                a(abyte0, j + 256);
                a(abyte0, j + 320);
                a(abyte0, j + 384);
                a(abyte0, j + 448);
                i -= 512;
                j += 512;
            } while (true);
            for (; l >= 64; l -= 64)
            {
                a(abyte0, k1);
                k1 += 64;
            }

            if (l > 0)
            {
                System.arraycopy(abyte0, k1, c, b, l);
                b = l + b;
            }
            return;
        } else
        {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }
}
