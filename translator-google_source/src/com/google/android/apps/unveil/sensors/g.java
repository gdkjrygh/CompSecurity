// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import com.google.android.apps.unveil.env.s;
import com.google.android.apps.unveil.k;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            CameraManager

final class g
    implements s
{

    final k a;
    final CameraManager b;

    g(CameraManager cameramanager, k k1)
    {
        b = cameramanager;
        a = k1;
        super();
    }

    public final Object a()
    {
        return Boolean.valueOf(a.f());
    }
}
