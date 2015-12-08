// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zznp
{

    private final byte zzaNv[] = new byte[256];
    private int zzaNw;
    private int zzaNx;

    public zznp(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            zzaNv[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + zzaNv[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = zzaNv[j];
            zzaNv[j] = zzaNv[k];
            zzaNv[k] = byte0;
        }

        zzaNw = 0;
        zzaNx = 0;
    }

    public void zzu(byte abyte0[])
    {
        int k = zzaNw;
        int j = zzaNx;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + zzaNv[k] & 0xff;
            byte byte0 = zzaNv[k];
            zzaNv[k] = zzaNv[j];
            zzaNv[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ zzaNv[zzaNv[k] + zzaNv[j] & 0xff]);
        }

        zzaNw = k;
        zzaNx = j;
    }
}
