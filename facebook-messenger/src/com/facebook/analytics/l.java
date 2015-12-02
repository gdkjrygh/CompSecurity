// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.g.a;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.common.time.MonotonicSinceBoot;
import com.facebook.inject.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.analytics:
//            f, g

class l extends d
{

    final f a;

    private l(f f)
    {
        a = f;
        super();
    }

    l(f f, g g)
    {
        this(f);
    }

    public a a()
    {
        return new a((com.facebook.common.time.a)a(com/facebook/common/time/a, com/facebook/common/time/MonotonicSinceBoot), (Executor)a(java/util/concurrent/ExecutorService, com/facebook/analytics/module/DefaultSingleThreadExecutor));
    }

    public Object b()
    {
        return a();
    }
}
