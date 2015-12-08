// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aym
{

    public byte a[];
    public byte b[];
    public int c;
    public int d[];
    public int e[];
    public int f;
    public final android.media.MediaCodec.CryptoInfo g;

    public aym()
    {
        android.media.MediaCodec.CryptoInfo cryptoinfo;
        if (bej.a >= 16)
        {
            cryptoinfo = new android.media.MediaCodec.CryptoInfo();
        } else
        {
            cryptoinfo = null;
        }
        g = cryptoinfo;
    }
}
