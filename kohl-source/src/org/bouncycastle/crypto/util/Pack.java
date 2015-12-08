// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;


public abstract class Pack
{

    public Pack()
    {
    }

    public static int bigEndianToInt(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        j++;
        return byte0 << 24 | (i & 0xff) << 16 | (abyte0[j] & 0xff) << 8 | abyte0[j + 1] & 0xff;
    }

    public static void bigEndianToInt(byte abyte0[], int i, int ai[])
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            ai[i] = bigEndianToInt(abyte0, j);
            j += 4;
        }

    }

    public static long bigEndianToLong(byte abyte0[], int i)
    {
        int j = bigEndianToInt(abyte0, i);
        i = bigEndianToInt(abyte0, i + 4);
        long l = j;
        return (long)i & 0xffffffffL | (l & 0xffffffffL) << 32;
    }

    public static void intToBigEndian(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >>> 24);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        j++;
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    public static void intToBigEndian(int ai[], byte abyte0[], int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            intToBigEndian(ai[i], abyte0, j);
            j += 4;
        }

    }

    public static void intToLittleEndian(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        j++;
        abyte0[j] = (byte)(i >>> 8);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 24);
    }

    public static void intToLittleEndian(int ai[], byte abyte0[], int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            intToLittleEndian(ai[i], abyte0, j);
            j += 4;
        }

    }

    public static int littleEndianToInt(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        j++;
        return byte0 & 0xff | (i & 0xff) << 8 | (abyte0[j] & 0xff) << 16 | abyte0[j + 1] << 24;
    }

    public static void littleEndianToInt(byte abyte0[], int i, int ai[])
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            ai[i] = littleEndianToInt(abyte0, j);
            j += 4;
        }

    }

    public static long littleEndianToLong(byte abyte0[], int i)
    {
        int j = littleEndianToInt(abyte0, i);
        long l = littleEndianToInt(abyte0, i + 4);
        return (long)j & 0xffffffffL | (l & 0xffffffffL) << 32;
    }

    public static void longToBigEndian(long l, byte abyte0[], int i)
    {
        intToBigEndian((int)(l >>> 32), abyte0, i);
        intToBigEndian((int)(0xffffffffL & l), abyte0, i + 4);
    }

    public static void longToLittleEndian(long l, byte abyte0[], int i)
    {
        intToLittleEndian((int)(0xffffffffL & l), abyte0, i);
        intToLittleEndian((int)(l >>> 32), abyte0, i + 4);
    }
}
