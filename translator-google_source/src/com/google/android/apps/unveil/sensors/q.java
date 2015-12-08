// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import com.google.android.apps.unveil.sensors.proxies.camera.CameraProxy;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            o

final class q
    implements Runnable
{

    final CameraProxy a;
    final o b;

    q(o o1, CameraProxy cameraproxy)
    {
        b = o1;
        a = cameraproxy;
        super();
    }

    public final void run()
    {
        synchronized (o.a())
        {
            o.a(o.a(b), a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
