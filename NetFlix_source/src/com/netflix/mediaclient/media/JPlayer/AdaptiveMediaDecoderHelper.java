// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import java.util.Arrays;
import java.util.List;

public class AdaptiveMediaDecoderHelper
{

    static final int HD1080P_HEIGHT = 1080;
    static final int HD1080P_WIDTH = 1920;
    static final int HD720P_HEIGHT = 720;
    static final int HD720P_WIDTH = 1280;
    private static final int HD720_MAX_BITRATE = 3000;
    static final int SD_HEIGHT = 480;
    private static final int SD_MAX_BITRATE = 1750;
    static final int SD_WIDTH = 720;
    protected static final String TAG = "AdaptiveMediaDecoderHelper";

    private AdaptiveMediaDecoderHelper()
    {
    }

    public static String getAdaptivePlaybackDecoderName(String s)
    {
        int i;
        int j;
        j = MediaCodecList.getCodecCount();
        i = 0;
_L3:
        MediaCodecInfo mediacodecinfo;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (mediacodecinfo.isEncoder() || Arrays.asList(mediacodecinfo.getSupportedTypes()).indexOf(s) < 0 || !mediacodecinfo.getCapabilitiesForType(s).isFeatureSupported("adaptive-playback")) goto _L5; else goto _L4
_L4:
        if (Log.isLoggable("AdaptiveMediaDecoderHelper", 3))
        {
            Log.d("AdaptiveMediaDecoderHelper", (new StringBuilder()).append(mediacodecinfo.getName()).append(" supports AdaptivePlayback").toString());
        }
        return mediacodecinfo.getName();
_L2:
        if (Log.isLoggable("AdaptiveMediaDecoderHelper", 3))
        {
            Log.d("AdaptiveMediaDecoderHelper", "AdaptivePlayback is not supported");
        }
        return null;
    }

    static Pair getRequiredMaximumResolution(int i, boolean flag)
    {
        if (!flag)
        {
            return Pair.create(Integer.valueOf(720), Integer.valueOf(480));
        }
        if (i <= 3000 && i > 1750)
        {
            return Pair.create(Integer.valueOf(1280), Integer.valueOf(720));
        }
        if (i <= 1750 && i > 0)
        {
            return Pair.create(Integer.valueOf(720), Integer.valueOf(480));
        } else
        {
            return Pair.create(Integer.valueOf(1920), Integer.valueOf(1080));
        }
    }

    public static boolean isAvcDecoderSupportsAdaptivePlayback()
    {
        return getAdaptivePlaybackDecoderName("video/avc") != null;
    }
}
