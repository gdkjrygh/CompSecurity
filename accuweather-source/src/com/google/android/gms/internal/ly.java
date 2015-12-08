// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class ly
{

    private final byte amH[] = new byte[256];
    private int amI;
    private int amJ;

    public ly(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            amH[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + amH[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = amH[j];
            amH[j] = amH[k];
            amH[k] = byte0;
        }

        amI = 0;
        amJ = 0;
    }

    public void o(byte abyte0[])
    {
        int k = amI;
        int j = amJ;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + amH[k] & 0xff;
            byte byte0 = amH[k];
            amH[k] = amH[j];
            amH[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ amH[amH[k] + amH[j] & 0xff]);
        }

        amI = k;
        amJ = j;
    }
}
