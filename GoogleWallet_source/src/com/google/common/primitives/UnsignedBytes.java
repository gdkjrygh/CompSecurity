// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;


public final class UnsignedBytes
{

    public static byte checkedCast(long l)
    {
        if (l >> 8 != 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Out of range: ")).append(l).toString());
        } else
        {
            return (byte)(int)l;
        }
    }

    public static int toInt(byte byte0)
    {
        return byte0 & 0xff;
    }
}
