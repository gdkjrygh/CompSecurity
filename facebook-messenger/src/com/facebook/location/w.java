// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.LocationManager;
import com.facebook.common.executors.ForLightweightTaskHandlerThread;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.location:
//            h, r, s, t

class w extends d
{

    final s a;

    private w(s s)
    {
        a = s;
        super();
    }

    w(s s, t t)
    {
        this(s);
    }

    public h a()
    {
        return new h((LocationManager)e().a(android/location/LocationManager), (r)a(com/facebook/location/r), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForLightweightTaskHandlerThread), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
