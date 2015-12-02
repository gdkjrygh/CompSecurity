// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.common.executors.ForUiThreadWakeup;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.push.mqtt:
//            d, ax, ay

class ba extends d
{

    final ax a;

    private ba(ax ax)
    {
        a = ax;
        super();
    }

    ba(ax ax, ay ay)
    {
        this(ax);
    }

    public com.facebook.push.mqtt.d a()
    {
        return new com.facebook.push.mqtt.d((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/a), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThreadWakeup), (com.facebook.push.mqtt.abtest.a)a(com/facebook/push/mqtt/abtest/a));
    }

    public Object b()
    {
        return a();
    }
}
