// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

public final class WebRtcAudioUtils
{

    private static final String BLACKLISTED_AEC_MODELS[] = {
        "Nexus 5", "D6503"
    };
    private static final String BLACKLISTED_OPEN_SL_ES_MODELS[] = {
        "Nexus 6"
    };
    private static final int SAMPLE_RATE_HZ = 44100;

    public WebRtcAudioUtils()
    {
    }

    public static boolean deviceIsBlacklistedForHwAecUsage()
    {
        return Arrays.asList(BLACKLISTED_AEC_MODELS).contains(Build.MODEL);
    }

    public static boolean deviceIsBlacklistedForOpenSLESUsage()
    {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    public static String getThreadInfo()
    {
        return (new StringBuilder("@[name=")).append(Thread.currentThread().getName()).append(", id=").append(Thread.currentThread().getId()).append("]").toString();
    }

    public static boolean hasPermission(Context context, String s)
    {
        return context.checkPermission(s, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean isAcousticEchoCancelerApproved()
    {
        if (deviceIsBlacklistedForHwAecUsage())
        {
            return false;
        } else
        {
            return isAcousticEchoCancelerSupported();
        }
    }

    public static boolean isAcousticEchoCancelerSupported()
    {
        if (!runningOnJellyBeanOrHigher())
        {
            return false;
        } else
        {
            return AcousticEchoCanceler.isAvailable();
        }
    }

    public static void logDeviceInfo(String s)
    {
        (new StringBuilder("Android SDK: ")).append(android.os.Build.VERSION.SDK_INT).append(", Release: ").append(android.os.Build.VERSION.RELEASE).append(", Brand: ").append(Build.BRAND).append(", Device: ").append(Build.DEVICE).append(", Id: ").append(Build.ID).append(", Hardware: ").append(Build.HARDWARE).append(", Manufacturer: ").append(Build.MANUFACTURER).append(", Model: ").append(Build.MODEL).append(", Product: ").append(Build.PRODUCT);
    }

    public static boolean runningOnEmulator()
    {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnGingerBreadOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 9;
    }

    public static boolean runningOnJellyBeanMR1OrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public static boolean runningOnJellyBeanOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean runningOnLollipopOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

}
