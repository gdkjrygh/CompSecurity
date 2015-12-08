// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class qn
{

    private final byte ayJ[] = new byte[256];
    private int ayK;
    private int ayL;

    public qn(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            ayJ[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + ayJ[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = ayJ[j];
            ayJ[j] = ayJ[k];
            ayJ[k] = byte0;
        }

        ayK = 0;
        ayL = 0;
    }

    public void o(byte abyte0[])
    {
        int k = ayK;
        int j = ayL;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + ayJ[k] & 0xff;
            byte byte0 = ayJ[k];
            ayJ[k] = ayJ[j];
            ayJ[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ ayJ[ayJ[k] + ayJ[j] & 0xff]);
        }

        ayK = k;
        ayL = j;
    }
}
