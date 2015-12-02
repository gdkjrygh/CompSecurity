// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import android.util.SparseIntArray;
import com.facebook.analytics.HoneyAnalyticsEvent;
import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.analytics.logger.IAnalyticsPeriodicEventReporter;
import com.facebook.analytics.tagging.AnalyticsTag;
import com.facebook.debug.log.BLog;
import com.facebook.inject.InjectorLike;
import com.facebook.inject.ScopeSet;
import com.facebook.inject.SingletonScope;
import java.util.Locale;

public class DeviceVideoCapabilitiesPeriodicReporter
    implements IAnalyticsPeriodicEventReporter
{

    private static final Class a = com/facebook/video/analytics/DeviceVideoCapabilitiesPeriodicReporter;
    private static volatile DeviceVideoCapabilitiesPeriodicReporter b;

    public DeviceVideoCapabilitiesPeriodicReporter()
    {
    }

    public static DeviceVideoCapabilitiesPeriodicReporter a(InjectorLike injectorlike)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/facebook/video/analytics/DeviceVideoCapabilitiesPeriodicReporter;
        JVM INSTR monitorenter ;
        if (b != null || injectorlike == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        byte byte0;
        ScopeSet scopeset;
        scopeset = ScopeSet.a();
        byte0 = scopeset.b();
        com.facebook.inject.InjectorThreadStack injectorthreadstack = ((SingletonScope)injectorlike.getInstance(com/facebook/inject/SingletonScope)).enterScope();
        injectorlike.getApplicationInjector();
        b = g();
        SingletonScope.a(injectorthreadstack);
        scopeset.c(byte0);
        com/facebook/video/analytics/DeviceVideoCapabilitiesPeriodicReporter;
        JVM INSTR monitorexit ;
_L2:
        return b;
        injectorlike;
        SingletonScope.a(injectorthreadstack);
        throw injectorlike;
        injectorlike;
        scopeset.c(byte0);
        throw injectorlike;
        injectorlike;
        com/facebook/video/analytics/DeviceVideoCapabilitiesPeriodicReporter;
        JVM INSTR monitorexit ;
        throw injectorlike;
    }

    private static void a(HoneyClientEvent honeyclientevent)
    {
        CamcorderProfile camcorderprofile = null;
        CamcorderProfile camcorderprofile1 = CamcorderProfile.get(1);
        camcorderprofile = camcorderprofile1;
_L2:
        if (camcorderprofile != null)
        {
            honeyclientevent.a("cam_duration", camcorderprofile.duration);
            honeyclientevent.a("cam_quality", camcorderprofile.quality);
            honeyclientevent.a("cam_fileFormat", camcorderprofile.fileFormat);
            honeyclientevent.a("cam_vCodec", camcorderprofile.videoCodec);
            honeyclientevent.a("cam_vBitRate", camcorderprofile.videoBitRate);
            honeyclientevent.a("cam_vFrameRate", camcorderprofile.videoFrameRate);
            honeyclientevent.a("cam_vFrameWidth", camcorderprofile.videoFrameHeight);
            honeyclientevent.a("cam_vFrameHeight", camcorderprofile.videoFrameHeight);
            honeyclientevent.a("cam_aCodec", camcorderprofile.audioCodec);
            honeyclientevent.a("cam_aBitRate", camcorderprofile.audioBitRate);
            honeyclientevent.a("cam_aSampleRate", camcorderprofile.audioSampleRate);
            honeyclientevent.a("cam_aChannels", camcorderprofile.audioChannels);
        }
        return;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void b(HoneyClientEvent honeyclientevent)
    {
        Pair pair;
        SparseIntArray sparseintarray;
        sparseintarray = new SparseIntArray();
        sparseintarray.put(1, 0);
        sparseintarray.put(4, 0);
        sparseintarray.put(2, 0);
        sparseintarray.put(8, 0);
        pair = null;
        Pair pair1 = e();
        Object obj = pair1;
        if (pair1 == null) goto _L2; else goto _L1
_L1:
        pair = pair1;
        android.media.MediaCodecInfo.CodecCapabilities codeccapabilities = (android.media.MediaCodecInfo.CodecCapabilities)pair1.second;
        int i = 0;
_L3:
        pair = pair1;
        obj = pair1;
        if (i >= codeccapabilities.profileLevels.length)
        {
            break; /* Loop/switch isn't completed */
        }
        pair = pair1;
        obj = codeccapabilities.profileLevels[i];
        pair = pair1;
        int j = sparseintarray.get(((android.media.MediaCodecInfo.CodecProfileLevel) (obj)).profile, -1);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        pair = pair1;
        if (((android.media.MediaCodecInfo.CodecProfileLevel) (obj)).level <= j)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        pair = pair1;
        sparseintarray.put(((android.media.MediaCodecInfo.CodecProfileLevel) (obj)).profile, ((android.media.MediaCodecInfo.CodecProfileLevel) (obj)).level);
        i++;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        BLog.b(a, "Error trying to get decoder capabilities", exception);
        obj = pair;
_L2:
        if (obj == null)
        {
            return;
        } else
        {
            ((MediaCodecInfo)((Pair) (obj)).first).getName();
            sparseintarray.get(1);
            sparseintarray.get(4);
            sparseintarray.get(2);
            sparseintarray.get(8);
            honeyclientevent.b("h264_decoder", ((MediaCodecInfo)((Pair) (obj)).first).getName());
            honeyclientevent.a("h264_base_level", sparseintarray.get(1));
            honeyclientevent.a("h264_ext_level", sparseintarray.get(4));
            honeyclientevent.a("h264_main_level", sparseintarray.get(2));
            honeyclientevent.a("h264_high_level", sparseintarray.get(8));
            return;
        }
    }

    private static void c(HoneyClientEvent honeyclientevent)
    {
        honeyclientevent.b("vp9_decoder", f());
    }

    private HoneyClientEvent d()
    {
        HoneyClientEvent honeyclientevent = new HoneyClientEvent(a());
        honeyclientevent.b("brand", Build.BRAND);
        honeyclientevent.b("manufacturer", Build.MANUFACTURER);
        honeyclientevent.a(AnalyticsTag.MODULE_VIDEO);
        a(honeyclientevent);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b(honeyclientevent);
            c(honeyclientevent);
        }
        return honeyclientevent;
    }

    private static Pair e()
    {
        int k = MediaCodecList.getCodecCount();
label0:
        for (int i = 0; i < k; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (mediacodecinfo.isEncoder())
            {
                continue;
            }
            String as[] = mediacodecinfo.getSupportedTypes();
            int j = 0;
            do
            {
                if (j >= as.length)
                {
                    continue label0;
                }
                if (as[j].equalsIgnoreCase("video/avc"))
                {
                    return Pair.create(mediacodecinfo, mediacodecinfo.getCapabilitiesForType("video/avc"));
                }
                j++;
            } while (true);
        }

        return null;
    }

    private static String f()
    {
        int j = MediaCodecList.getCodecCount();
        for (int i = 0; i < j; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (!mediacodecinfo.isEncoder() && mediacodecinfo.getName().toLowerCase(Locale.US).contains("vp9"))
            {
                return mediacodecinfo.getName();
            }
        }

        return null;
    }

    private static DeviceVideoCapabilitiesPeriodicReporter g()
    {
        return new DeviceVideoCapabilitiesPeriodicReporter();
    }

    public final HoneyAnalyticsEvent a(long l, String s)
    {
        return d();
    }

    public final String a()
    {
        return "device_video_capabilities";
    }

    public final long b()
    {
        return 0x240c8400L;
    }

    public final boolean c()
    {
        return false;
    }

}
