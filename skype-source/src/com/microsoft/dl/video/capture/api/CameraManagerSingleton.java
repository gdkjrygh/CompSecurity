// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;


// Referenced classes of package com.microsoft.dl.video.capture.api:
//            CameraManagerFactory, CameraManager

public final class CameraManagerSingleton
{

    private static CameraManager a;
    private static CameraManagerFactory b;

    private CameraManagerSingleton()
    {
    }

    public static CameraManager getInstance()
    {
        com/microsoft/dl/video/capture/api/CameraManagerSingleton;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (b == null)
        {
            throw new IllegalStateException("CameraManagerFactory is not set");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        com/microsoft/dl/video/capture/api/CameraManagerSingleton;
        JVM INSTR monitorexit ;
        throw exception;
        a = b.createCameraManager();
        CameraManager cameramanager = a;
        com/microsoft/dl/video/capture/api/CameraManagerSingleton;
        JVM INSTR monitorexit ;
        return cameramanager;
    }

    public static void setFactory(CameraManagerFactory cameramanagerfactory)
    {
        com/microsoft/dl/video/capture/api/CameraManagerSingleton;
        JVM INSTR monitorenter ;
        a = null;
        b = cameramanagerfactory;
        com/microsoft/dl/video/capture/api/CameraManagerSingleton;
        JVM INSTR monitorexit ;
        return;
        cameramanagerfactory;
        throw cameramanagerfactory;
    }
}
