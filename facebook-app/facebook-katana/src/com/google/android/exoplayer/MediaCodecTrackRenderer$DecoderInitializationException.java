// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer:
//            MediaFormat

public class diagnosticInfo extends Exception
{

    public final String decoderName;
    public final String diagnosticInfo;

    private static String a(int i)
    {
        String s;
        if (i < 0)
        {
            s = "neg_";
        } else
        {
            s = "";
        }
        return (new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_")).append(s).append(Math.abs(i)).toString();
    }

    private static String a(Throwable throwable)
    {
        if (throwable instanceof android.media.ationException)
        {
            return ((android.media.ationException)throwable).ationException();
        } else
        {
            return null;
        }
    }

    public Y(MediaFormat mediaformat, Throwable throwable, int i)
    {
        super((new StringBuilder("Decoder init failed: [")).append(i).append("], ").append(mediaformat).toString(), throwable);
        decoderName = null;
        diagnosticInfo = a(i);
    }

    public a(MediaFormat mediaformat, Throwable throwable, String s)
    {
        super((new StringBuilder("Decoder init failed: ")).append(s).append(", ").append(mediaformat).toString(), throwable);
        decoderName = s;
        if (Util.a >= 21)
        {
            mediaformat = a(throwable);
        } else
        {
            mediaformat = null;
        }
        diagnosticInfo = mediaformat;
    }
}
