// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzwp
{

    private final byte zzaHo[] = new byte[256];
    private int zzaHp;
    private int zzaHq;

    public zzwp(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            zzaHo[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + zzaHo[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = zzaHo[j];
            zzaHo[j] = zzaHo[k];
            zzaHo[k] = byte0;
        }

        zzaHp = 0;
        zzaHq = 0;
    }

    public void zzs(byte abyte0[])
    {
        int k = zzaHp;
        int j = zzaHq;
        for (int i = 0; i < abyte0.length; i++)
        {
            k = k + 1 & 0xff;
            j = j + zzaHo[k] & 0xff;
            byte byte0 = zzaHo[k];
            zzaHo[k] = zzaHo[j];
            zzaHo[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ zzaHo[zzaHo[k] + zzaHo[j] & 0xff]);
        }

        zzaHp = k;
        zzaHq = j;
    }
}
