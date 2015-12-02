// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.push.mqtt.v;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            az, ai, aj

class au extends d
{

    final ai a;

    private au(ai ai)
    {
        a = ai;
        super();
    }

    au(ai ai, aj aj)
    {
        this(ai);
    }

    public az a()
    {
        return new az((ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (k)a(com/facebook/fbservice/ops/k), (v)a(com/facebook/push/mqtt/v), b(com/facebook/auth/credentials/UserTokenCredentials));
    }

    public Object b()
    {
        return a();
    }
}
