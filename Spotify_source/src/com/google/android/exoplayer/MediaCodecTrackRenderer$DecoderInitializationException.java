// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import azi;
import bej;

public class diagnosticInfo extends Exception
{

    public final String decoderName;
    public final String diagnosticInfo;

    public Y(azi azi, Throwable throwable, int i)
    {
        super((new StringBuilder("Decoder init failed: [")).append(i).append("], ").append(azi).toString(), throwable);
        decoderName = null;
        if (i < 0)
        {
            azi = "neg_";
        } else
        {
            azi = "";
        }
        diagnosticInfo = (new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_")).append(azi).append(Math.abs(i)).toString();
    }

    public diagnosticInfo(azi azi, Throwable throwable, String s)
    {
        Object obj = null;
        super((new StringBuilder("Decoder init failed: ")).append(s).append(", ").append(azi).toString(), throwable);
        decoderName = s;
        azi = obj;
        if (bej.a >= 21)
        {
            azi = obj;
            if (throwable instanceof android.media.ationException.decoderName)
            {
                azi = ((android.media.ationException.decoderName)throwable).decoderName();
            }
        }
        diagnosticInfo = azi;
    }
}
