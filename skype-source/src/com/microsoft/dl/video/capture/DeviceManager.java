// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerSingleton;
import com.microsoft.dl.video.capture.api.CaptureException;
import java.util.ArrayList;
import java.util.List;

public final class DeviceManager
{
    private static class CameraInfo
    {

        private final int a;
        private final com.microsoft.dl.video.capture.api.CameraCapabilities.Facing b;
        private final String c;

        public com.microsoft.dl.video.capture.api.CameraCapabilities.Facing getFacing()
        {
            return b;
        }

        public String getName()
        {
            return c;
        }

        public int getOrientation()
        {
            return a;
        }

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [orientation=").append(a).append(", facing=").append(b).append(", name=").append(c).append("]").toString();
        }

        public CameraInfo(int i, com.microsoft.dl.video.capture.api.CameraCapabilities.Facing facing, String s)
        {
            a = i;
            b = facing;
            c = s;
        }
    }


    private static DeviceManager a;
    private List b;

    private DeviceManager()
        throws CaptureException
    {
        b = new ArrayList();
        CameraManager cameramanager = CameraManagerSingleton.getInstance();
        int i = 0;
        for (int j = cameramanager.getNumberOfCameras(); i < j; i++)
        {
            CameraCapabilities cameracapabilities = cameramanager.getCameraCapabilities(i);
            b.add(new CameraInfo(cameracapabilities.getOrientation(), cameracapabilities.getFacing(), (new StringBuilder("/")).append(cameracapabilities.getFacing().name()).append("/").append(i).toString()));
        }

    }

    public static DeviceManager getInstance()
    {
        Object obj1 = null;
        com/microsoft/dl/video/capture/DeviceManager;
        JVM INSTR monitorenter ;
        Object obj = a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        a = new DeviceManager();
        obj = a;
_L2:
        com/microsoft/dl/video/capture/DeviceManager;
        JVM INSTR monitorexit ;
        return ((DeviceManager) (obj));
        Object obj2;
        obj2;
        obj = obj1;
        if (!Log.isLoggable("Capture", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("Capture", "Could not instantiate DeviceManager", ((Throwable) (obj2)));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
        obj2;
        exception = obj1;
        if (!Log.isLoggable("Capture", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("Capture", "Exception caught", ((Throwable) (obj2)));
        exception = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int getCameraFacing(int i)
    {
        try
        {
            i = ((CameraInfo)b.get(i)).getFacing().ordinal();
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return -1;
        }
        return i;
    }

    public final String getCameraName(int i)
    {
        String s;
        try
        {
            s = ((CameraInfo)b.get(i)).getName();
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return null;
        }
        return s;
    }

    public final int getCameraOrientation(int i)
    {
        try
        {
            i = ((CameraInfo)b.get(i)).getOrientation();
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return -1;
        }
        return i;
    }

    public final int getNumCameras()
    {
        int i;
        try
        {
            i = b.size();
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            return 0;
        }
        return i;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameras=").append(b).append("]").toString();
    }
}
