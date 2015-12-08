// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            CameraManager

final class j
    implements ThreadFactory
{

    final CameraManager a;

    j(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName("CameraManager Executor");
        return runnable;
    }
}
