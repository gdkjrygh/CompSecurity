// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.a.a;
import com.facebook.common.e.h;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.v.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.analytics:
//            f, g

class j extends d
{

    final com.facebook.analytics.f a;

    private j(com.facebook.analytics.f f1)
    {
        a = f1;
        super();
    }

    j(com.facebook.analytics.f f1, g g)
    {
        this(f1);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context), (com.facebook.common.time.a)a(com/facebook/common/time/a), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/DefaultExecutorService), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (h)a(com/facebook/common/e/h), (f)a(com/facebook/common/v/f));
    }

    public Object b()
    {
        return a();
    }
}
