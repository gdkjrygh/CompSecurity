// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;

import android.hardware.Camera;

public class DeviceProfile
{

    static final int VH_FRONT_CAMERA_FACING = 1;
    static final int VH_REAR_CAMERA_FACING = 0;
    static int frontCameraIndex;
    static int frontCameraMounting;
    static int rearCameraIndex;
    static int rearCameraMounting;

    public DeviceProfile()
    {
    }

    public static boolean changePreviewDimensions(int i, int j)
    {
        boolean flag = true;
        com/skype/android/video/DeviceProfile;
        JVM INSTR monitorenter ;
        if (i != 1) goto _L2; else goto _L1
_L1:
        i = frontCameraMounting;
        if ((i + j) % 180 == 0)
        {
            flag = false;
        }
_L4:
        com/skype/android/video/DeviceProfile;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        i = rearCameraMounting;
        if ((i - j) % 180 == 0)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static int getCameraIndex(int i)
    {
        if (i == 1)
        {
            return frontCameraIndex;
        }
        if (i == 0)
        {
            return rearCameraIndex;
        } else
        {
            return -1;
        }
    }

    public static native void initWhitelist(String s);

    public static native boolean isHwDecoderEnabled();

    public static native boolean isHwEncoderEnabled();

    public static void updateCameraFacingAndMounting()
    {
        updateCameraInfo(0, rearCameraIndex, rearCameraMounting);
        updateCameraInfo(1, frontCameraIndex, frontCameraMounting);
    }

    public static native void updateCameraInfo(int i, int j, int k);

    static 
    {
        frontCameraIndex = -1;
        rearCameraIndex = -1;
        int j = Camera.getNumberOfCameras();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i, camerainfo);
        if (camerainfo.facing == 1)
        {
            frontCameraIndex = i;
            frontCameraMounting = camerainfo.orientation;
        }
        if (camerainfo.facing == 0)
        {
            rearCameraIndex = i;
            rearCameraMounting = camerainfo.orientation;
        }
        i++;
        if (true) goto _L2; else goto _L1
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
_L1:
    }
}
