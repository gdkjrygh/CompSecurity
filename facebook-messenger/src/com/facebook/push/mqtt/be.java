// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.common.v.a;
import com.facebook.device_id.l;
import com.facebook.http.annotations.UserAgentString;
import com.facebook.inject.d;
import com.facebook.mqtt.p;
import com.facebook.mqtt.t;
import com.facebook.push.annotations.IsMobileOnlineAvailabilityEnabled;

// Referenced classes of package com.facebook.push.mqtt:
//            u, ax, ay

class be extends d
{

    final ax a;

    private be(ax ax)
    {
        a = ax;
        super();
    }

    be(ax ax, ay ay)
    {
        this(ax);
    }

    public u a()
    {
        return new u((p)a(com/facebook/mqtt/p), b(com/facebook/mqtt/t), b(com/facebook/auth/credentials/UserTokenCredentials), (l)a(com/facebook/device_id/l), (a)a(com/facebook/common/v/a), b(java/lang/Boolean, com/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled), b(java/lang/String, com/facebook/http/annotations/UserAgentString), (com.facebook.push.mqtt.abtest.a)a(com/facebook/push/mqtt/abtest/a));
    }

    public Object b()
    {
        return a();
    }
}
