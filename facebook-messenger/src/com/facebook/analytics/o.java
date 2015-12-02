// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.app.AlarmManager;
import android.content.Context;
import android.os.PowerManager;
import android.view.WindowManager;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.analytics.module.IsOldTimeSpentLoggingEnabled;
import com.facebook.analytics.module.IsPeriodicDeviceStatusEnabled;
import com.facebook.analytics.module.IsTimeSpentBitArrayLoggingEnabled;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.common.executors.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.analytics:
//            bt, ak, f, g

class o extends d
{

    final f a;

    private o(f f)
    {
        a = f;
        super();
    }

    o(f f, g g)
    {
        this(f);
    }

    public bt a()
    {
        return new bt((Context)e().a(android/content/Context), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (ak)a(com/facebook/analytics/ak), (a)a(com/facebook/common/executors/a), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/analytics/module/DefaultSingleThreadExecutor), (com.facebook.common.process.d)a(com/facebook/common/process/d), (com.facebook.analytics.a.a)a(com/facebook/analytics/a/a), (PowerManager)e().a(android/os/PowerManager), (AlarmManager)e().a(android/app/AlarmManager), (WindowManager)e().a(android/view/WindowManager), (com.facebook.common.time.a)a(com/facebook/common/time/a), b(java/lang/Boolean, com/facebook/analytics/module/IsPeriodicDeviceStatusEnabled), b(java/lang/Boolean, com/facebook/analytics/module/IsTimeSpentBitArrayLoggingEnabled), b(java/lang/Boolean, com/facebook/analytics/module/IsOldTimeSpentLoggingEnabled), (com.facebook.analytics.i.a)a(com/facebook/analytics/i/a), (com.facebook.analytics.g.a)a(com/facebook/analytics/g/a));
    }

    public Object b()
    {
        return a();
    }
}
