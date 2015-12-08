// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.util;


public final class a
{

    public static int a(byte abyte0[], int i)
    {
        int k = 0;
        for (int j = i; j < i + 4; j++)
        {
            k = k << 8 | abyte0[j] & 0xff;
        }

        return k;
    }

    public static final byte[] a(int i)
    {
        return (new byte[] {
            (byte)(i >>> 24), (byte)(i >>> 16), (byte)(i >>> 8), (byte)i
        });
    }
}
