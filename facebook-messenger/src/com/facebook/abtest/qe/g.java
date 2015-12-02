// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.abtest.qe.annotations.IsFullExperimentSyncEnabled;
import com.facebook.abtest.qe.annotations.ShouldAppFetchOnForeground;
import com.facebook.abtest.qe.b.e;
import com.facebook.abtest.qe.c.d;
import com.facebook.abtest.qe.g.b;
import com.facebook.abtest.qe.service.module.a;
import com.facebook.analytics.f;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.http.b.w;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.prefs.shared.ad;
import com.facebook.prefs.shared.t;

// Referenced classes of package com.facebook.abtest.qe:
//            l, b, i, j, 
//            c, f, a, k

public class g extends c
{

    public g()
    {
    }

    protected void a()
    {
        e(com/facebook/http/b/w);
        e(com/facebook/prefs/shared/t);
        e(com/facebook/analytics/f);
        a(((com.facebook.inject.ag) (new a())));
        a(((com.facebook.inject.ag) (new l())));
        f(com/facebook/d/a/a);
        a(com/facebook/abtest/qe/g/a).a(new b());
        a(com/facebook/abtest/qe/b).a(new i(this, null));
        a(com/facebook/abtest/qe/c/a).a(new com.facebook.abtest.qe.c.b()).a();
        a(com/facebook/abtest/qe/c/c).a(new d()).a();
        a(com/facebook/abtest/qe/e/a).a(new com.facebook.abtest.qe.e.c());
        a(com/facebook/abtest/qe/b/a).a(new com.facebook.abtest.qe.b.g()).a();
        a(com/facebook/abtest/qe/b/e).a(new j(this, null));
        a(com/facebook/abtest/qe/c/e).a(new com.facebook.abtest.qe.c.g());
        a(com/facebook/abtest/qe/c).a(new com.facebook.abtest.qe.f()).a();
        a(com/facebook/abtest/qe/protocol/sync/full/d).a(new com.facebook.abtest.qe.protocol.sync.full.e()).a();
        a(java/lang/Boolean).a(com/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled).c(com/facebook/abtest/qe/a);
        a(com/facebook/abtest/qe/d/e).a(new com.facebook.abtest.qe.d.f()).a();
        c(com/facebook/abtest/qe/f/b);
        c(com/facebook/prefs/shared/ad).a(com/facebook/abtest/qe/data/a);
        a(com/facebook/abtest/qe/service/d).a(new com.facebook.abtest.qe.service.f()).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/abtest/qe/b/e).a(com/facebook/abtest/qe/service/d);
        c(com/facebook/auth/f/b).a(com/facebook/abtest/qe/c/c).a(com/facebook/abtest/qe/b/a);
        a(java/lang/Boolean).a(com/facebook/abtest/qe/annotations/ShouldAppFetchOnForeground).a(new k(this, null));
    }
}
