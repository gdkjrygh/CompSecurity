// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class gk
{

    private final byte uu[] = new byte[256];
    private int uv;
    private int uw;

    public gk(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            uu[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + uu[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = uu[j];
            uu[j] = uu[k];
            uu[k] = byte0;
        }

        uv = 0;
        uw = 0;
    }

    public void f(byte abyte0[])
    {
        int k = uv;
        int j = uw;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + uu[k] & 0xff;
            byte byte0 = uu[k];
            uu[k] = uu[j];
            uu[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ uu[uu[k] + uu[j] & 0xff]);
        }

        uv = k;
        uw = j;
    }
}
