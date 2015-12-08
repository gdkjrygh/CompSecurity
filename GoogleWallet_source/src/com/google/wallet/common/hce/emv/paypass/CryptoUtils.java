// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.common.hce.emv.paypass;


public final class CryptoUtils
{

    public static byte[] adjustParity(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            byte byte0 = (byte)(abyte0[i] & 0xfe);
            byte byte1 = (byte)(byte0 >>> 4 ^ byte0);
            byte1 = (byte)(byte1 >>> 2 ^ byte1);
            abyte0[i] = (byte)(~(byte)(byte1 >>> 1 ^ byte1) & 1 | byte0);
        }

        return abyte0;
    }
}
