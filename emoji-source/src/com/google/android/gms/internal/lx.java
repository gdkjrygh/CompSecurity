// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class lx
{

    private final byte amK[] = new byte[256];
    private int amL;
    private int amM;

    public lx(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            amK[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + amK[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = amK[j];
            amK[j] = amK[k];
            amK[k] = byte0;
        }

        amL = 0;
        amM = 0;
    }

    public void o(byte abyte0[])
    {
        int k = amL;
        int j = amM;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + amK[k] & 0xff;
            byte byte0 = amK[k];
            amK[k] = amK[j];
            amK[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ amK[amK[k] + amK[j] & 0xff]);
        }

        amL = k;
        amM = j;
    }
}
