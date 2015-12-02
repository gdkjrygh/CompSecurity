// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.push.f;
import javax.inject.a;

// Referenced classes of package com.facebook.push.c2dm:
//            C2DMRegistrar, FacebookPushServerRegistrar

public class s
    implements f
{

    private static final Class a = com/facebook/push/c2dm/s;
    private final C2DMRegistrar b;
    private final FacebookPushServerRegistrar c;
    private final a d;

    public s(C2DMRegistrar c2dmregistrar, FacebookPushServerRegistrar facebookpushserverregistrar, a a1)
    {
        b = c2dmregistrar;
        c = facebookpushserverregistrar;
        d = a1;
    }

    public void a()
    {
        com.facebook.debug.log.b.b(a, "registering for push notifications");
        b.a(true);
    }

    public void b()
    {
        com.facebook.debug.log.b.b(a, "checking push notifications registration");
        if (!n.a((CharSequence)d.b()))
        {
            b.a(false);
        }
    }

    public void c()
    {
        com.facebook.debug.log.b.b(a, "unregistering from push notifications");
        c.a();
    }

}
