// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.common.v.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.push.annotations.IsDeviceForegroundEnabled;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.push.mqtt:
//            ai, v, ax, ay

class bg extends d
{

    final ax a;

    private bg(ax ax)
    {
        a = ax;
        super();
    }

    bg(ax ax, ay ay)
    {
        this(ax);
    }

    public ai a()
    {
        return new ai((Context)e().a(android/content/Context), (a)a(com/facebook/common/v/a), (com.facebook.common.v.d)a(com/facebook/common/v/d), (v)a(com/facebook/push/mqtt/v), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/Boolean, com/facebook/push/annotations/IsDeviceForegroundEnabled), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/analytics/module/DefaultSingleThreadExecutor));
    }

    public Object b()
    {
        return a();
    }
}
