// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.Serializable;

public final class ZipShort
    implements Serializable, Cloneable
{

    private final int a;

    public ZipShort(int i)
    {
        a = i;
    }

    public ZipShort(byte abyte0[])
    {
        this(abyte0, 0);
    }

    public ZipShort(byte abyte0[], int i)
    {
        a = getValue(abyte0, i);
    }

    public static byte[] getBytes(int i)
    {
        return (new byte[] {
            (byte)(i & 0xff), (byte)((0xff00 & i) >> 8)
        });
    }

    public static int getValue(byte abyte0[])
    {
        return getValue(abyte0, 0);
    }

    public static int getValue(byte abyte0[], int i)
    {
        return (abyte0[i + 1] << 8 & 0xff00) + (abyte0[i] & 0xff);
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
        while (obj == null || !(obj instanceof ZipShort) || a != ((ZipShort)obj).getValue()) 
        {
            return false;
        }
        return true;
    }

    public byte[] getBytes()
    {
        return (new byte[] {
            (byte)(a & 0xff), (byte)((a & 0xff00) >> 8)
        });
    }

    public int getValue()
    {
        return a;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder("ZipShort value: ")).append(a).toString();
    }
}
