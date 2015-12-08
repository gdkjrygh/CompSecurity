// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class xq
{

    private final byte a[] = new byte[256];
    private int b;
    private int c;

    public xq(byte abyte0[])
    {
        for (int i = 0; i < 256; i++)
        {
            a[i] = (byte)i;
        }

        int k = 0;
        for (int j = 0; j < 256; j++)
        {
            k = k + a[j] + abyte0[j % abyte0.length] & 0xff;
            byte byte0 = a[j];
            a[j] = a[k];
            a[k] = byte0;
        }

        b = 0;
        c = 0;
    }

    public final void a(byte abyte0[])
    {
        int k = b;
        int j = c;
        for (int i = 0; i < 256; i++)
        {
            k = k + 1 & 0xff;
            j = j + a[k] & 0xff;
            byte byte0 = a[k];
            a[k] = a[j];
            a[j] = byte0;
            abyte0[i] = (byte)(abyte0[i] ^ a[a[k] + a[j] & 0xff]);
        }

        b = k;
        c = j;
    }
}
