// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;
import android.util.Log;

public final class OpenCameraInterface
{

    private static final String TAG = com/google/zxing/client/android/camera/open/OpenCameraInterface.getName();

    private OpenCameraInterface()
    {
    }

    public static Camera open()
    {
        int j = Camera.getNumberOfCameras();
        if (j == 0)
        {
            Log.w(TAG, "No cameras!");
            return null;
        }
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
                    Camera.getCameraInfo(i, camerainfo);
                    if (camerainfo.facing != 0)
                    {
                        break label0;
                    }
                }
                if (i < j)
                {
                    Log.i(TAG, (new StringBuilder()).append("Opening camera #").append(i).toString());
                    return Camera.open(i);
                } else
                {
                    Log.i(TAG, "No camera facing back; returning camera #0");
                    return Camera.open(0);
                }
            }
            i++;
        } while (true);
    }

}
