// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.hardware.Camera;
import android.text.TextUtils;
import com.google.android.apps.unveil.sensors.proxies.camera.ParametersProxy;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            CameraManager, k

final class e
    implements android.hardware.Camera.AutoFocusCallback
{

    final CameraManager a;

    e(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        CameraManager cameramanager = a;
        cameramanager;
        JVM INSTR monitorenter ;
        CameraManager.a(a, 2);
        CameraManager.b(a);
        for (Iterator iterator = CameraManager.c(a).iterator(); iterator.hasNext(); ((k)iterator.next()).a(flag)) { }
        break MISSING_BLOCK_LABEL_71;
        camera;
        cameramanager;
        JVM INSTR monitorexit ;
        throw camera;
        CameraManager.c(a).clear();
        CameraManager.a(a, 0);
        cameramanager;
        JVM INSTR monitorexit ;
        if (!CameraManager.d(a)) goto _L2; else goto _L1
_L1:
        CameraManager.e(a);
        CameraManager.f(a);
_L4:
        if (TextUtils.equals(CameraManager.k(a).get("focus-mode"), "continuous-picture"))
        {
            camera.cancelAutoFocus();
        }
        return;
_L2:
        if (CameraManager.g(a))
        {
            CameraManager.h(a);
            a.a(null);
        } else
        if (CameraManager.i(a) != null)
        {
            a.setFlashMode(CameraManager.i(a));
            CameraManager.j(a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
