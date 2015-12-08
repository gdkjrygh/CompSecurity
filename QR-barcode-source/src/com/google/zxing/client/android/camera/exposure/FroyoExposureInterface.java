// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera.exposure;

import android.util.Log;

// Referenced classes of package com.google.zxing.client.android.camera.exposure:
//            ExposureInterface

public final class FroyoExposureInterface
    implements ExposureInterface
{

    private static final float MAX_EXPOSURE_COMPENSATION = 1.5F;
    private static final float MIN_EXPOSURE_COMPENSATION = 0F;
    private static final String TAG = com/google/zxing/client/android/camera/exposure/FroyoExposureInterface.getSimpleName();

    public FroyoExposureInterface()
    {
    }

    public void setExposure(android.hardware.Camera.Parameters parameters, boolean flag)
    {
        int i = parameters.getMinExposureCompensation();
        int j = parameters.getMaxExposureCompensation();
        if (i != 0 || j != 0)
        {
            float f = parameters.getExposureCompensationStep();
            if (flag)
            {
                i = Math.max((int)(0.0F / f), i);
            } else
            {
                i = Math.min((int)(1.5F / f), j);
            }
            Log.i(TAG, (new StringBuilder("Setting exposure compensation to ")).append(i).append(" / ").append((float)i * f).toString());
            parameters.setExposureCompensation(i);
            return;
        } else
        {
            Log.i(TAG, "Camera does not support exposure compensation");
            return;
        }
    }

}
