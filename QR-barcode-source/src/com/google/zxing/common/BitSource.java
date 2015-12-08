// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


public final class BitSource
{

    private int bitOffset;
    private int byteOffset;
    private final byte bytes[];

    public BitSource(byte abyte0[])
    {
        bytes = abyte0;
    }

    public int available()
    {
        return (bytes.length - byteOffset) * 8 - bitOffset;
    }

    public int getBitOffset()
    {
        return bitOffset;
    }

    public int getByteOffset()
    {
        return byteOffset;
    }

    public int readBits(int i)
    {
        if (i < 1 || i > 32 || i > available())
        {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int j;
        int k;
        if (bitOffset > 0)
        {
            k = 8 - bitOffset;
            int l;
            if (i < k)
            {
                j = i;
            } else
            {
                j = k;
            }
            k -= j;
            l = bytes[byteOffset];
            bitOffset = j + bitOffset;
            if (bitOffset == 8)
            {
                bitOffset = 0;
                byteOffset = byteOffset + 1;
            }
            l = ((255 >> 8 - j) << k & l) >> k;
            k = i - j;
            i = l;
        } else
        {
            boolean flag = false;
            k = i;
            i = ((flag) ? 1 : 0);
        }
        j = i;
        if (k > 0)
        {
            for (; k >= 8; k -= 8)
            {
                i = i << 8 | bytes[byteOffset] & 0xff;
                byteOffset = byteOffset + 1;
            }

            j = i;
            if (k > 0)
            {
                j = 8 - k;
                j = i << k | ((255 >> j) << j & bytes[byteOffset]) >> j;
                bitOffset = k + bitOffset;
            }
        }
        return j;
    }
}
