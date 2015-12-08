// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real;

import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerFactory;

// Referenced classes of package com.microsoft.dl.video.capture.impl.real:
//            RealCameraManagerImpl

public static class 
    implements CameraManagerFactory
{

    public final CameraManager createCameraManager()
    {
        return new RealCameraManagerImpl();
    }

    public ()
    {
    }
}
