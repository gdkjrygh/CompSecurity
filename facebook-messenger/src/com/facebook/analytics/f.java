// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.cache.h;
import com.facebook.analytics.e.i;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.analytics.module.IsOldTimeSpentLoggingEnabled;
import com.facebook.analytics.module.IsPeriodicDeviceStatusEnabled;
import com.facebook.analytics.module.IsTimeSpentBitArrayLoggingEnabled;
import com.facebook.analytics.module.IsVerboseReliabilityAnalyticsLoggingPermitted;
import com.facebook.analytics.module.a;
import com.facebook.analytics.module.b;
import com.facebook.analytics.module.d;
import com.facebook.analytics.module.e;
import com.facebook.analytics.periodicreporters.ClientPeriodicReporters;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.analytics.periodicreporters.m;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.http.b.au;
import com.facebook.http.b.t;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.analytics:
//            a, h, bt, o, 
//            cg, ab, av, bp, 
//            q, ak, x, bx, 
//            n, i, aa, ae, 
//            m, cn, ag, cj, 
//            ac, an, p, au, 
//            k, j, ad, r, 
//            aj, z, s, br, 
//            w, v, u, ai, 
//            ah, l, t, ck, 
//            af

public class f extends c
{

    public f()
    {
    }

    protected void a()
    {
        c(com/facebook/f/f).a(com/facebook/analytics/module/a);
        a(java/lang/Boolean).a(com/facebook/analytics/module/IsPeriodicDeviceStatusEnabled).c(com/facebook/analytics/module/d);
        a(java/lang/Boolean).a(com/facebook/analytics/module/IsVerboseReliabilityAnalyticsLoggingPermitted).c(com/facebook/analytics/module/f);
        a(java/lang/Boolean).a(com/facebook/analytics/module/IsTimeSpentBitArrayLoggingEnabled).c(com/facebook/analytics/module/e);
        a(java/lang/Boolean).a(com/facebook/analytics/module/IsOldTimeSpentLoggingEnabled).c(com/facebook/analytics/module/c);
        a(com/facebook/analytics/a).a(new com.facebook.analytics.h(this, null)).a();
        a(com/facebook/analytics/bt).a(new o(this, null)).a();
        a(com/facebook/analytics/cg).a(new ab(this, null)).a();
        a(com/facebook/analytics/av).b(com/facebook/analytics/bt);
        a(com/facebook/analytics/bp).a(new q(this, null)).a();
        a(com/facebook/analytics/ak).a(new x(this, null)).a();
        a(com/facebook/analytics/bx).a(new n(this, null)).a();
        c(com/facebook/base/activity/f).a(com/facebook/analytics/bx);
        a(com/facebook/analytics/i/a).a(new com.facebook.analytics.i(this, null)).a();
        a(com/facebook/common/a/d).a(new aa(this, null)).a();
        a(com/facebook/analytics/e/a).a(new ae(this, null)).a();
        a(com/facebook/analytics/e/i).b(com/facebook/analytics/e/a);
        a(com/facebook/analytics/module/b).a(new com.facebook.analytics.m(this, null)).a();
        a(com/facebook/analytics/cn).a(new ag(this, null)).a();
        a(com/facebook/analytics/cj).a(new ac(this, null)).a();
        a(com/facebook/analytics/an).a(new p(this, null)).a();
        a(com/facebook/analytics/au).a(new k(null)).a();
        a(com/facebook/analytics/a/a).a(new j(this, null)).a();
        c(com/facebook/http/b/t).a(com/facebook/analytics/an);
        c(com/facebook/http/b/au).a(com/facebook/analytics/au);
        a(com/facebook/analytics/i/d).a(new ad(this, null)).a();
        a(com/facebook/analytics/cache/d).a(new r(this, null)).a();
        a(com/facebook/analytics/j/a).a(new com.facebook.analytics.aj(this, null)).a();
        a(java/util/concurrent/ExecutorService).a(com/facebook/analytics/module/DefaultSingleThreadExecutor).a(new z(this, null)).a();
        a(com/facebook/analytics/cache/h).a(new s(this)).a();
        a(com/facebook/analytics/br).a(new w(this, null)).a();
        a(com/facebook/analytics/b/c).a(new v(this, null)).a();
        a(com/facebook/analytics/b/b).a(new u(this, null)).a();
        a(com/facebook/analytics/g/g).a(new ai(this, null)).a();
        a(com/facebook/analytics/g/f).a(new ah(this, null)).a();
        a(com/facebook/analytics/g/a).a(new com.facebook.analytics.l(this, null)).a();
        a(com/facebook/analytics/b/a).a(new com.facebook.analytics.t(this, null)).a();
        a(com/facebook/analytics/ck).a(null);
        c(com/facebook/analytics/d/a);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/analytics/module/b);
        c(com/facebook/device_id/a).a(com/facebook/analytics/module/b);
        a(com/facebook/analytics/periodicreporters/m).a(new af(this, null)).a();
        a(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ClientPeriodicReporters).a(com/facebook/analytics/periodicreporters/m);
    }
}
