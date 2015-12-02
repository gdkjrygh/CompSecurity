// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Util;

public final class CryptoInfo
{

    public byte a[];
    public byte b[];
    public int c;
    public int d[];
    public int e[];
    public int f;
    private final android.media.MediaCodec.CryptoInfo g;

    public CryptoInfo()
    {
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        if (Util.a >= 16)
        {
            cryptoinfo = b();
        } else
        {
            cryptoinfo = null;
        }
        g = cryptoinfo;
    }

    private static android.media.MediaCodec.CryptoInfo b()
    {
        return new android.media.MediaCodec.CryptoInfo();
    }

    private void c()
    {
        g.set(f, d, e, b, a, c);
    }

    public final android.media.MediaCodec.CryptoInfo a()
    {
        return g;
    }

    public final void a(int i, int ai[], int ai1[], byte abyte0[], byte abyte1[], int j)
    {
        f = i;
        d = ai;
        e = ai1;
        b = abyte0;
        a = abyte1;
        c = j;
        if (Util.a >= 16)
        {
            c();
        }
    }
}
