// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.debug.log.b;
import com.facebook.device_id.a;
import com.facebook.device_id.i;

// Referenced classes of package com.facebook.push.c2dm:
//            C2DMRegistrar, FacebookPushServerRegistrar

public class ad
    implements a
{

    private static final Class a = com/facebook/push/c2dm/ad;
    private final C2DMRegistrar b;
    private final FacebookPushServerRegistrar c;

    public ad(C2DMRegistrar c2dmregistrar, FacebookPushServerRegistrar facebookpushserverregistrar)
    {
        b = c2dmregistrar;
        c = facebookpushserverregistrar;
    }

    public void a(i j, i k)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("re-registering push token due to device id changing from ").append(j.a()).append(" to ").append(k.a()).toString());
        c.a(b.a);
    }

}
