// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

public final class QRCodeDecoderMetaData
{

    private final boolean mirrored;

    QRCodeDecoderMetaData(boolean flag)
    {
        mirrored = flag;
    }

    public void applyMirroredCorrection(ResultPoint aresultpoint[])
    {
        if (!mirrored || aresultpoint == null || aresultpoint.length < 3)
        {
            return;
        } else
        {
            ResultPoint resultpoint = aresultpoint[0];
            aresultpoint[0] = aresultpoint[2];
            aresultpoint[2] = resultpoint;
            return;
        }
    }

    public boolean isMirrored()
    {
        return mirrored;
    }
}
