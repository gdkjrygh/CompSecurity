// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.common.executors.ForUiThreadWakeup;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.push.annotations.HighestMqttPersistence;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.facebook.push.mqtt:
//            ca, v, ar, m, 
//            MqttTopicList, i, ax, ay

class bn extends d
{

    final ax a;

    private bn(ax ax)
    {
        a = ax;
        super();
    }

    bn(ax ax, ay ay)
    {
        this(ax);
    }

    public ca a()
    {
        return new ca((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/a), (ScheduledExecutorService)a(java/util/concurrent/ScheduledExecutorService, com/facebook/common/executors/ForUiThreadWakeup), (v)a(com/facebook/push/mqtt/v), (com.facebook.common.v.a)a(com/facebook/common/v/a), (com.facebook.common.v.d)a(com/facebook/common/v/d), b(com/facebook/push/mqtt/ar, com/facebook/push/annotations/HighestMqttPersistence), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), c(com/facebook/push/mqtt/m, com/facebook/push/mqtt/MqttTopicList), c(com/facebook/push/mqtt/i));
    }

    public Object b()
    {
        return a();
    }
}
