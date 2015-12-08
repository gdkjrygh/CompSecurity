// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.res.Resources;
import com.google.android.apps.unveil.env.f;
import com.google.android.apps.unveil.sensors.proxies.camera.CameraProxy;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            o, r

final class p extends f
{

    String b;
    final String c;
    final Map d;
    final Resources e;
    final o f;

    p(o o1, String s, Map map, Resources resources)
    {
        f = o1;
        c = s;
        d = map;
        e = resources;
        super();
        b = "";
    }

    private CameraProxy d()
    {
        obj;
        JVM INSTR monitorenter ;
        CameraProxy cameraproxy;
        synchronized (o.a())
        {
            cameraproxy = o.a(f, c, d, e);
        }
        return cameraproxy;
        RuntimeException runtimeexception;
        runtimeexception;
        b = runtimeexception.getLocalizedMessage();
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object a()
    {
        return d();
    }

    protected final void a(Object obj)
    {
        obj = (CameraProxy)obj;
        if (obj != null)
        {
            o.a(f).a(((CameraProxy) (obj)));
            return;
        } else
        {
            o.a(f).a(b);
            return;
        }
    }
}
