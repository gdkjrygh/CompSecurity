// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import java.util.Arrays;

abstract class Bytes
{

    private static final char sHexDigits[] = "0123456789abcdef".toCharArray();
    final byte mBytes[];

    protected Bytes(byte abyte0[])
    {
        mBytes = abyte0;
    }

    static String toHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append(sHexDigits[byte0 >> 4 & 0xf]).append(sHexDigits[byte0 & 0xf]);
        }

        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass()))
        {
            return false;
        } else
        {
            obj = (Bytes)obj;
            return Arrays.equals(mBytes, ((Bytes) (obj)).mBytes);
        }
    }

    final String getHex()
    {
        return toHexString(mBytes);
    }

    public int hashCode()
    {
        return Arrays.hashCode(mBytes);
    }

    public String toString()
    {
        return toHexString(mBytes);
    }

}
