// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.bitrate.AudioBitrateRange;
import com.netflix.mediaclient.util.PreferenceUtils;

public class BitrateRangeFactory
{

    private static final String PREFERENCE_BITRATE_CAP = "nflx_bitrate_cap";
    private static final String TAG = "nf-bitrate";
    private static int mBitrateCap = -1;

    private BitrateRangeFactory()
    {
    }

    public static void clearRecords(Context context)
    {
        PreferenceUtils.removePref(context, "nflx_bitrate_cap");
    }

    public static AudioBitrateRange getAudioBitrateRange()
    {
        return new AudioBitrateRange(0, 64);
    }

    public static int getBitrateCap(Context context)
    {
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorenter ;
        int i;
        if (mBitrateCap != -1)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        i = PreferenceUtils.getIntPref(context, "nflx_bitrate_cap", -1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        mBitrateCap = i;
        i = mBitrateCap;
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorexit ;
        return i;
        context;
        throw context;
    }

    public static void setBitrateCap(Context context, int i)
    {
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorenter ;
        PreferenceUtils.putIntPref(context, "nflx_bitrate_cap", i);
        Log.d("nf-bitrate", (new StringBuilder()).append("Updating device configuration bitrate cap ").append(i).toString());
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void updateDeviceBitrateCap(Context context, String s)
    {
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        mBitrateCap = Integer.parseInt(s);
        PreferenceUtils.putIntPref(context, "nflx_bitrate_cap", mBitrateCap);
        if (Log.isLoggable("nf-bitrate", 4) && mBitrateCap > 0)
        {
            Log.i("nf-bitrate", (new StringBuilder()).append("Updating device configuration bitrate cap ").append(mBitrateCap).toString());
        }
_L4:
        com/netflix/mediaclient/service/configuration/BitrateRangeFactory;
        JVM INSTR monitorexit ;
        return;
_L2:
        clearRecords(context);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

}
