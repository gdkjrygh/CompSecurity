// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real;

import android.hardware.Camera;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerFactory;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.impl.real.impl.CameraCapabilitiesUtils;
import java.util.List;

// Referenced classes of package com.microsoft.dl.video.capture.impl.real:
//            RealCameraImpl

public class RealCameraManagerImpl
    implements CameraManager
{
    public static class Factory
        implements CameraManagerFactory
    {

        public final CameraManager createCameraManager()
        {
            return new RealCameraManagerImpl();
        }

        public Factory()
        {
        }
    }


    private List a;

    public RealCameraManagerImpl()
    {
    }

    public void close()
    {
    }

    public final CameraCapabilities getCameraCapabilities(int i)
        throws CaptureException
    {
        if (a == null)
        {
            a = CameraCapabilitiesUtils.obtain();
        }
        if (i < 0 || i >= getNumberOfCameras())
        {
            throw new IllegalArgumentException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return ((CameraCapabilities)a.get(i)).clone();
        }
    }

    public final int getNumberOfCameras()
    {
        return Camera.getNumberOfCameras();
    }

    public final com.microsoft.dl.video.capture.api.Camera openCamera(int i)
        throws CaptureException
    {
        return new RealCameraImpl(i);
    }
}
