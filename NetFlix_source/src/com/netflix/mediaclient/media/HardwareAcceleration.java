// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.content.Context;
import android.os.Build;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class HardwareAcceleration
{

    private static final String PREFERENCE_HARDWARE_ACCELERATION = "nflx_hardwarer_acc";
    private static final String TAG = "nf-hwac";
    private static Boolean hardwareAccelerationForced = null;

    private HardwareAcceleration()
    {
    }

    public static boolean candHardwareAccelerationBeForced(Context context)
    {
        return AndroidUtils.getAndroidVersion() >= 14;
    }

    private static boolean isHardwareAccelerationApprovedApi()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    private static boolean isHardwareAccelerationApprovedDevice()
    {
        return Build.MANUFACTURER.equals("Amazon") && (Build.MODEL.equals("KFTT") || Build.MODEL.equals("KFOT"));
    }

    public static boolean shouldHardwareAccelerationBeForced(Context context)
    {
        boolean flag = false;
        com/netflix/mediaclient/media/HardwareAcceleration;
        JVM INSTR monitorenter ;
        if (AndroidUtils.getAndroidVersion() < 16) goto _L2; else goto _L1
_L1:
        Log.d("nf-hwac", "Jelly Beans device, force hardware acceleration");
        flag = true;
_L3:
        com/netflix/mediaclient/media/HardwareAcceleration;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (candHardwareAccelerationBeForced(context))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Log.d("nf-hwac", "Device is runing preICS Android. Do not apply hardware acceleration or check for it!");
          goto _L3
        context;
        throw context;
        if (isHardwareAccelerationApprovedDevice())
        {
            Log.d("nf-hwac", "Pre-approved device...");
            hardwareAccelerationForced = Boolean.TRUE;
        }
        if (hardwareAccelerationForced != Boolean.TRUE && isHardwareAccelerationApprovedApi())
        {
            Log.d("nf-hwac", "Pre-approved api device ...");
            hardwareAccelerationForced = Boolean.TRUE;
        }
        if (hardwareAccelerationForced != null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        Log.d("nf-hwac", "Find if we already had set flag that hardware acceleration should be enforced from preferences...");
        hardwareAccelerationForced = Boolean.valueOf(PreferenceUtils.getBooleanPref(context, "nflx_hardwarer_acc", false));
_L4:
        if (hardwareAccelerationForced == null)
        {
            Log.e("nf-hwac", "hardwareAccelerationForced == null. This should NOT happen!");
            hardwareAccelerationForced = Boolean.FALSE;
        }
        flag = hardwareAccelerationForced.booleanValue();
          goto _L3
        Log.d("nf-hwac", "Find if we have update for flag that hardware acceleration should be enforced from preferences...");
        hardwareAccelerationForced = Boolean.valueOf(PreferenceUtils.getBooleanPref(context, "nflx_hardwarer_acc", hardwareAccelerationForced.booleanValue()));
          goto _L4
    }

    public static void update(Context context, Boolean boolean1)
    {
        com/netflix/mediaclient/media/HardwareAcceleration;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("nf-hwac", 3))
        {
            Log.d("nf-hwac", (new StringBuilder()).append("Force hardware acceleration ").append(boolean1).toString());
        }
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        Log.d("nf-hwac", "Hardware acceleration is NOT enforced, ignore");
_L3:
        com/netflix/mediaclient/media/HardwareAcceleration;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (candHardwareAccelerationBeForced(context))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Log.d("nf-hwac", "Device is runing preICS Android. Ignore!");
          goto _L3
        context;
        throw context;
        if (hardwareAccelerationForced != null && hardwareAccelerationForced.equals(boolean1)) goto _L5; else goto _L4
_L4:
        hardwareAccelerationForced = boolean1;
        PreferenceUtils.putBooleanPref(context, "nflx_hardwarer_acc", boolean1.booleanValue());
        Log.d("nf-hwac", "Forcing hardware acceleration on next start");
          goto _L3
_L5:
        if (!Log.isLoggable("nf-hwac", 3)) goto _L3; else goto _L6
_L6:
        Log.d("nf-hwac", (new StringBuilder()).append("No need to do anything. The same as existed ").append(boolean1).toString());
          goto _L3
    }

}
