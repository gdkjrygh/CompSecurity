// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;


final class BlockPair
{

    private final byte dataBytes[];
    private final byte errorCorrectionBytes[];

    BlockPair(byte abyte0[], byte abyte1[])
    {
        dataBytes = abyte0;
        errorCorrectionBytes = abyte1;
    }

    public byte[] getDataBytes()
    {
        return dataBytes;
    }

    public byte[] getErrorCorrectionBytes()
    {
        return errorCorrectionBytes;
    }
}
