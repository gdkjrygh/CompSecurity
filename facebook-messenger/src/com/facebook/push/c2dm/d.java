// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.analytics.f;
import com.facebook.fbservice.b.a;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.n;
import com.facebook.fbservice.service.p;
import com.facebook.http.b.w;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;
import com.facebook.push.annotations.IsGcmEnabled;
import com.facebook.push.annotations.RegistrationQueue;

// Referenced classes of package com.facebook.push.c2dm:
//            s, i, y, k, 
//            FacebookPushServerRegistrar, j, C2DMRegistrar, g, 
//            m, f, r, h, 
//            ad, l

public class d extends c
{

    public d()
    {
    }

    protected void a()
    {
        e(com/facebook/http/b/w);
        f(com/facebook/fbservice/b/a);
        e(com/facebook/analytics/f);
        e(com/facebook/push/a);
        a(java/lang/Boolean).a(com/facebook/push/annotations/IsGcmEnabled).a(Boolean.TRUE);
        a(com/facebook/push/c2dm/s).a(new i(this, null)).a();
        a(com/facebook/push/c2dm/y).a(new k(this, null)).a();
        a(com/facebook/push/c2dm/FacebookPushServerRegistrar).a(new j(this, null)).a();
        a(com/facebook/push/c2dm/C2DMRegistrar).a(new com.facebook.push.c2dm.g(this, null)).a();
        a(com/facebook/push/c2dm/m).a(new com.facebook.push.c2dm.f(this, null)).a();
        a(com/facebook/push/c2dm/r).a(new h(this, null));
        a(com/facebook/fbservice/service/e).a(com/facebook/push/annotations/RegistrationQueue).b(com/facebook/push/c2dm/r).d();
        a(com/facebook/fbservice/service/n, com/facebook/push/annotations/RegistrationQueue);
        a(com/facebook/push/c2dm/ad).a(new l(this, null));
        c(com/facebook/push/fbpushdata/a);
        c(com/facebook/push/f).a(com/facebook/push/c2dm/s);
        c(com/facebook/device_id/a).a(com/facebook/push/c2dm/ad);
    }

    public void a(t t1)
    {
        t1 = (p)t1.a(com/facebook/fbservice/service/p);
        t1.a(com.facebook.push.c2dm.r.a, com/facebook/push/annotations/RegistrationQueue);
        t1.a(r.b, com/facebook/push/annotations/RegistrationQueue);
    }
}
