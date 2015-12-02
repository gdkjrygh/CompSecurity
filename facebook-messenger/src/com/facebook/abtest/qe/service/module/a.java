// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.service.b;
import com.facebook.backgroundtasks.f;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            i, g, QuickExperimentQueue, c, 
//            e, d, f, h

public class a extends c
{

    public a()
    {
    }

    protected void a()
    {
        f(com/facebook/backgroundtasks/f);
        a(com/facebook/abtest/qe/protocol/sync/user/a).a(new i(this, null));
        a(com/facebook/abtest/qe/protocol/sync/full/a).a(new com.facebook.abtest.qe.service.module.g(this, null));
        a(com/facebook/fbservice/service/e).a(com/facebook/abtest/qe/service/module/QuickExperimentQueue).a(new com.facebook.abtest.qe.service.module.c(this, null)).d();
        a(com/facebook/abtest/qe/service/c).a(new com.facebook.abtest.qe.service.module.e(this, null));
        a(com/facebook/abtest/qe/service/b).a(new d(this, null));
        a(com/facebook/abtest/qe/service/g).a(new com.facebook.abtest.qe.service.module.f(this, null));
        a(com/facebook/abtest/qe/service/a/a).a(new h(this, null)).a();
        c(com/facebook/backgroundtasks/c).a(com/facebook/abtest/qe/service/a/a);
    }

    public void a(t t1)
    {
        super.a(t1);
        ((p)t1.a(com/facebook/fbservice/service/p)).a(com.facebook.abtest.qe.service.a.a, com/facebook/abtest/qe/service/module/QuickExperimentQueue);
    }
}
