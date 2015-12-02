// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.c.d;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.analytics.periodicreporters.ServicePeriodicReporters;
import com.facebook.analytics.periodicreporters.j;
import com.facebook.analytics.periodicreporters.k;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.analytics.service.AnalyticsQueue;
import com.facebook.analytics.service.i;
import com.facebook.analytics.service.m;
import com.facebook.analytics.service.r;
import com.facebook.analytics.service.t;
import com.facebook.analytics.service.u;
import com.facebook.analytics.service.v;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.d.a.a;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.analytics:
//            f, bf, ba, bb, 
//            be, bg, bk, bd, 
//            bc, bq, bh, bn, 
//            bj, bo, bi, bl, 
//            bm

public class ay extends c
{

    public ay()
    {
    }

    protected void a()
    {
        e(com/facebook/analytics/f);
        f(com/facebook/d/a/a);
        a(com/facebook/fbservice/service/e).a(com/facebook/analytics/service/AnalyticsQueue).a(new bf(this, null)).d();
        a(com/facebook/analytics/c/a).a(new ba(this, null)).a();
        a(com/facebook/analytics/c/d).a(new bb(this, null)).a();
        a(com/facebook/analytics/c/e).a(new be(this, null));
        a(com/facebook/analytics/c/g).a(new bg(this, null)).a();
        a(java/util/concurrent/Executor).a(com/facebook/analytics/module/DefaultSingleThreadExecutor).a(new bk(this, null));
        a(com/facebook/analytics/service/i).a(new bd(this, null)).a();
        a(com/facebook/analytics/service/a).a(new bc(this, null)).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/analytics/service/a);
        a(com/facebook/analytics/bq).a(new bh(this, null)).a();
        a(com/facebook/analytics/service/u).a(new bn(this, null)).a();
        a(com/facebook/analytics/service/t).b(com/facebook/analytics/service/r);
        a(com/facebook/analytics/service/r).a(new bj(this, null)).a();
        a(com/facebook/analytics/service/v).a(new bo(this, null)).a();
        a(com/facebook/analytics/periodicreporters/d).a(new bi(this, null)).a();
        a(com/facebook/analytics/periodicreporters/e).a(new bl(this, null)).a();
        c(com/facebook/analytics/periodicreporters/j);
        a(com/facebook/analytics/periodicreporters/k).a(new bm(this, null)).a();
        a(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ServicePeriodicReporters).a(com/facebook/analytics/periodicreporters/d).a(com/facebook/analytics/periodicreporters/e).a(com/facebook/analytics/periodicreporters/k);
        c(com/facebook/analytics/service/k).a(com/facebook/analytics/service/a);
    }

    public void a(com.facebook.inject.t t1)
    {
        ((p)t1.a(com/facebook/fbservice/service/p)).a(m.a, com/facebook/analytics/service/AnalyticsQueue);
    }
}
