// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import android.support.v4.a.e;
import com.facebook.base.broadcast.CrossFbAppBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.common.executors.ForUiThreadWakeup;
import com.facebook.common.hardware.f;
import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.k:
//            j, e, f

class i extends d
{

    final com.facebook.k.e a;

    private i(com.facebook.k.e e1)
    {
        a = e1;
        super();
    }

    i(com.facebook.k.e e1, com.facebook.k.f f1)
    {
        this(e1);
    }

    public com.facebook.k.j a()
    {
        return new com.facebook.k.j((e)a(android/support/v4/a/e), (f)a(com/facebook/common/hardware/f), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThreadWakeup), (k)a(com/facebook/common/hardware/k), (j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/CrossFbAppBroadcast), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
