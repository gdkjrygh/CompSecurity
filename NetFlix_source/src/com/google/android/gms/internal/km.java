// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class km
{

    private final byte adH[] = new byte[256];
    private int adI;
    private int adJ;

    public km(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            adH[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + adH[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = adH[j];
            adH[j] = adH[k];
            adH[k] = byte0;
        }

        adI = 0;
        adJ = 0;
    }

    public void m(byte abyte0[])
    {
        int k = adI;
        int j = adJ;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + adH[k] & 0xff;
            byte byte0 = adH[k];
            adH[k] = adH[j];
            adH[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ adH[adH[k] + adH[j] & 0xff]);
        }

        adI = k;
        adJ = j;
    }
}
