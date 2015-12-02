// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.inject.d;
import com.facebook.push.annotations.IsDeviceForegroundEnabled;

// Referenced classes of package com.facebook.push.mqtt:
//            f, ax, ay

class bb extends d
{

    final ax a;

    private bb(ax ax)
    {
        a = ax;
        super();
    }

    bb(ax ax, ay ay)
    {
        this(ax);
    }

    public f a()
    {
        return new f(b(java/lang/Boolean, com/facebook/push/annotations/IsDeviceForegroundEnabled));
    }

    public Object b()
    {
        return a();
    }
}
