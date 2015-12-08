// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import android.hardware.Camera;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerFactory;
import com.skype.android.platform.capture.CaptureException;

// Referenced classes of package com.skype.android.impl.capture:
//            CameraImpl

public class CameraManagerImpl
    implements CameraManager
{
    public static class Factory
        implements CameraManagerFactory
    {

        public CameraManager createCameraManager()
        {
            return new CameraManagerImpl();
        }

        public Factory()
        {
        }
    }


    public CameraManagerImpl()
    {
    }

    public final int a()
    {
        return Camera.getNumberOfCameras();
    }

    public final com.skype.android.platform.capture.Camera a(int i)
        throws CaptureException
    {
        return new CameraImpl(i);
    }

    public final CameraInfo b(int i)
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i, camerainfo);
        com.skype.android.platform.capture.CameraInfo.Facing facing;
        if (camerainfo.facing == 0)
        {
            facing = com.skype.android.platform.capture.CameraInfo.Facing.a;
        } else
        {
            facing = com.skype.android.platform.capture.CameraInfo.Facing.b;
        }
        return new CameraInfo(facing, camerainfo.orientation);
    }

    public void close()
    {
    }
}
