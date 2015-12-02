// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.analytics.c.e;
import com.facebook.analytics.c.g;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.analytics.service.a;
import com.facebook.analytics.service.t;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bc extends d
{

    final ay a;

    private bc(ay ay)
    {
        a = ay;
        super();
    }

    bc(ay ay, az az)
    {
        this(ay);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context), (e)a(com/facebook/analytics/c/e), (g)a(com/facebook/analytics/c/g), (t)a(com/facebook/analytics/service/t), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.base.a.d)a(com/facebook/base/a/d), (com.facebook.common.time.a)a(com/facebook/common/time/a), (Executor)a(java/util/concurrent/Executor, com/facebook/analytics/module/DefaultSingleThreadExecutor), (AlarmManager)a(android/app/AlarmManager), Long.valueOf(30000L));
    }

    public Object b()
    {
        return a();
    }
}
