// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.e.a.h;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.e:
//            h, i

class q extends d
{

    final com.facebook.e.h a;

    private q(com.facebook.e.h h1)
    {
        a = h1;
        super();
    }

    q(com.facebook.e.h h1, i i)
    {
        this(h1);
    }

    public h a()
    {
        return new h((com.facebook.common.hardware.q)a(com/facebook/common/hardware/q), (j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/LocalBroadcast), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
