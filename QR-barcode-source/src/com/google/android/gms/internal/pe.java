// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class pe
{

    private final byte aww[] = new byte[256];
    private int awx;
    private int awy;

    public pe(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            aww[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + aww[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = aww[j];
            aww[j] = aww[k];
            aww[k] = byte0;
        }

        awx = 0;
        awy = 0;
    }

    public void o(byte abyte0[])
    {
        int k = awx;
        int j = awy;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + aww[k] & 0xff;
            byte byte0 = aww[k];
            aww[k] = aww[j];
            aww[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ aww[aww[k] + aww[j] & 0xff]);
        }

        awx = k;
        awy = j;
    }
}
