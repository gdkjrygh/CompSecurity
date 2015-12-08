// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;
import android.util.Log;

// Referenced classes of package com.google.zxing.client.android.camera.open:
//            OpenCameraInterface

public final class GingerbreadOpenCameraInterface
    implements OpenCameraInterface
{

    private static final String TAG = "GingerbreadOpenCamera";

    public GingerbreadOpenCameraInterface()
    {
    }

    public Camera open()
    {
        int i;
        int j;
        j = Camera.getNumberOfCameras();
        if (j == 0)
        {
            Log.w("GingerbreadOpenCamera", "No cameras!");
            return null;
        }
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.CameraInfo camerainfo;
        if (i < j)
        {
            Log.i("GingerbreadOpenCamera", (new StringBuilder("Opening camera #")).append(i).toString());
            return Camera.open(i);
        } else
        {
            Log.i("GingerbreadOpenCamera", "No camera facing back; returning camera #0");
            return Camera.open(0);
        }
_L2:
        camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i, camerainfo);
        if (camerainfo.facing == 0) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
