// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.analytics.cj;
import com.facebook.common.executors.ForUiThreadWakeup;
import com.facebook.inject.d;
import com.facebook.push.mqtt.abtest.a;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.push.mqtt:
//            ap, ax, ay

class bi extends d
{

    final ax a;

    private bi(ax ax)
    {
        a = ax;
        super();
    }

    bi(ax ax, ay ay)
    {
        this(ax);
    }

    public ap a()
    {
        return new ap((ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThreadWakeup), (a)a(com/facebook/push/mqtt/abtest/a), (cj)a(com/facebook/analytics/cj), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
