// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.inject.d;
import com.facebook.push.annotations.HighestMqttPersistence;

// Referenced classes of package com.facebook.push.mqtt:
//            at, ar, ax, ay

class bj extends d
{

    final ax a;

    private bj(ax ax)
    {
        a = ax;
        super();
    }

    bj(ax ax, ay ay)
    {
        this(ax);
    }

    public at a()
    {
        return new at(b(com/facebook/push/mqtt/ar, com/facebook/push/annotations/HighestMqttPersistence));
    }

    public Object b()
    {
        return a();
    }
}
