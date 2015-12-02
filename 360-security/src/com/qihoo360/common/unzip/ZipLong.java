// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.Serializable;

public final class ZipLong
    implements Serializable, Cloneable
{

    public static final ZipLong AED_SIG = new ZipLong(0x8064b50L);
    public static final ZipLong CFH_SIG = new ZipLong(0x2014b50L);
    public static final ZipLong DD_SIG = new ZipLong(0x8074b50L);
    public static final ZipLong LFH_SIG = new ZipLong(0x4034b50L);
    public static final ZipLong SINGLE_SEGMENT_SPLIT_MARKER = new ZipLong(0x30304b50L);
    static final ZipLong a = new ZipLong(0xffffffffL);
    private final long b;

    public ZipLong(long l)
    {
        b = l;
    }

    public ZipLong(byte abyte0[])
    {
        this(abyte0, 0);
    }

    public ZipLong(byte abyte0[], int i)
    {
        b = getValue(abyte0, i);
    }

    public static byte[] getBytes(long l)
    {
        return (new byte[] {
            (byte)(int)(255L & l), (byte)(int)((65280L & l) >> 8), (byte)(int)((0xff0000L & l) >> 16), (byte)(int)((0xff000000L & l) >> 24)
        });
    }

    public static long getValue(byte abyte0[])
    {
        return getValue(abyte0, 0);
    }

    public static long getValue(byte abyte0[], int i)
    {
        return ((long)(abyte0[i + 3] << 24) & 0xff000000L) + (long)(abyte0[i + 2] << 16 & 0xff0000) + (long)(abyte0[i + 1] << 8 & 0xff00) + (long)(abyte0[i] & 0xff);
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return obj;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof ZipLong) || b != ((ZipLong)obj).getValue()) 
        {
            return false;
        }
        return true;
    }

    public byte[] getBytes()
    {
        return getBytes(b);
    }

    public long getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return (int)b;
    }

    public String toString()
    {
        return (new StringBuilder("ZipLong value: ")).append(b).toString();
    }

}
