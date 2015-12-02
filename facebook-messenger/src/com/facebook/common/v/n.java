// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import android.app.KeyguardManager;
import com.facebook.base.broadcast.a;
import com.facebook.common.executors.ForUiThread;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.common.v:
//            a, k, l

class n extends d
{

    final k a;

    private n(k k)
    {
        a = k;
        super();
    }

    n(k k, l l)
    {
        this(k);
    }

    public com.facebook.common.v.a a()
    {
        return new com.facebook.common.v.a((a)a(com/facebook/base/broadcast/a), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (com.facebook.common.time.a)a(com/facebook/common/time/a), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThread), (KeyguardManager)e().a(android/app/KeyguardManager));
    }

    public Object b()
    {
        return a();
    }
}
