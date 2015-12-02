// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.common.executors.s;
import com.facebook.inject.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.analytics:
//            f, g

class z extends d
{

    final f a;

    private z(f f)
    {
        a = f;
        super();
    }

    z(f f, g g)
    {
        this(f);
    }

    public ExecutorService a()
    {
        return new ThreadPoolExecutor(0, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s("AnalyticsThread-"));
    }

    public Object b()
    {
        return a();
    }
}
