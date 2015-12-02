// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.e.a;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.inject.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.analytics:
//            av, f, g

class ae extends d
{

    final f a;

    private ae(f f)
    {
        a = f;
        super();
    }

    ae(f f, g g)
    {
        this(f);
    }

    public a a()
    {
        return new a((av)a(com/facebook/analytics/av), (Executor)a(java/util/concurrent/ExecutorService, com/facebook/analytics/module/DefaultSingleThreadExecutor), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
