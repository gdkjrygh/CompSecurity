// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.analytics.a;
import com.facebook.analytics.cj;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.mqtt:
//            v, u, d, ap, 
//            ax, ay

class bf extends d
{

    final ax a;

    private bf(ax ax)
    {
        a = ax;
        super();
    }

    bf(ax ax, ay ay)
    {
        this(ax);
    }

    public v a()
    {
        return new v((a)a(com/facebook/analytics/a), (u)a(com/facebook/push/mqtt/u), (com.facebook.push.mqtt.d)a(com/facebook/push/mqtt/d), (ap)a(com/facebook/push/mqtt/ap), (com.facebook.push.mqtt.abtest.a)a(com/facebook/push/mqtt/abtest/a), (cj)a(com/facebook/analytics/cj), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
