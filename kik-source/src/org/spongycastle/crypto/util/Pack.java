// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.util;


public abstract class Pack
{

    public Pack()
    {
    }

    public static int a(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        j++;
        return byte0 << 24 | (i & 0xff) << 16 | (abyte0[j] & 0xff) << 8 | abyte0[j + 1] & 0xff;
    }

    public static void a(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)(i >>> 24);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        j++;
        abyte0[j] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)i;
    }

    public static void a(long l, byte abyte0[])
    {
        b((int)(0xffffffffL & l), abyte0, 0);
        b((int)(l >>> 32), abyte0, 4);
    }

    public static void a(long l, byte abyte0[], int i)
    {
        a((int)(l >>> 32), abyte0, i);
        a((int)(0xffffffffL & l), abyte0, i + 4);
    }

    public static void a(int ai[], byte abyte0[], int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            a(ai[i], abyte0, j);
            j += 4;
        }

    }

    public static long b(byte abyte0[], int i)
    {
        int j = a(abyte0, i);
        i = a(abyte0, i + 4);
        long l = j;
        return (long)i & 0xffffffffL | (l & 0xffffffffL) << 32;
    }

    private static void b(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        j++;
        abyte0[j] = (byte)(i >>> 8);
        j++;
        abyte0[j] = (byte)(i >>> 16);
        abyte0[j + 1] = (byte)(i >>> 24);
    }

    public static void b(int ai[], byte abyte0[], int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            b(ai[i], abyte0, j);
            j += 4;
        }

    }

    public static int c(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        j++;
        return byte0 & 0xff | (i & 0xff) << 8 | (abyte0[j] & 0xff) << 16 | abyte0[j + 1] << 24;
    }
}
