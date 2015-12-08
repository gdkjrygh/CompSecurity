// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            CameraManager

final class d
    implements android.hardware.Camera.ShutterCallback
{

    final CameraManager a;

    d(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }

    public final void onShutter()
    {
        CameraManager cameramanager = a;
        cameramanager;
        JVM INSTR monitorenter ;
        CameraManager.a(a, 4);
        for (Iterator iterator = CameraManager.a(a).iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        cameramanager;
        JVM INSTR monitorexit ;
        throw exception;
        CameraManager.a(a).clear();
        cameramanager;
        JVM INSTR monitorexit ;
    }
}
