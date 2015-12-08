// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import android.util.Log;

class VibrationProvider
{

    private static final String TAG = "VibrationProvider";
    private final AudioManager mAudioManager;
    private final boolean mHasVibratePermission;
    private final Vibrator mVibrator;

    private VibrationProvider(Context context)
    {
        mAudioManager = (AudioManager)context.getSystemService("audio");
        mVibrator = (Vibrator)context.getSystemService("vibrator");
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasVibratePermission = flag;
        if (!mHasVibratePermission)
        {
            Log.w("VibrationProvider", "Failed to use vibrate API, requires VIBRATE permission.");
        }
    }

    private void cancelVibration()
    {
        if (mHasVibratePermission)
        {
            mVibrator.cancel();
        }
    }

    private static VibrationProvider create(Context context)
    {
        return new VibrationProvider(context);
    }

    private void vibrate(long l)
    {
        if (mAudioManager.getRingerMode() != 0 && mHasVibratePermission)
        {
            mVibrator.vibrate(l);
        }
    }
}
