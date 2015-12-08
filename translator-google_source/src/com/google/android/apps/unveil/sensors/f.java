// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import com.google.android.apps.unveil.env.s;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            CameraManager, o

final class f
    implements Runnable
{

    final CameraManager a;

    f(CameraManager cameramanager)
    {
        a = cameramanager;
        super();
    }

    public final void run()
    {
        CameraManager.n(a).a((String)CameraManager.l(a).a(), (Map)CameraManager.m(a).a(), a.getResources());
    }
}
