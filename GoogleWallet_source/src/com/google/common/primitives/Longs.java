// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;


public final class Longs
{

    public static byte[] toByteArray(long l)
    {
        byte abyte0[] = new byte[8];
        for (int i = 7; i >= 0; i--)
        {
            abyte0[i] = (byte)(int)(255L & l);
            l >>= 8;
        }

        return abyte0;
    }
}
