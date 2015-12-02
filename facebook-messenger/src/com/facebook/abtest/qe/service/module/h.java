// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.annotations.ShouldAppFetchOnForeground;
import com.facebook.abtest.qe.service.a.a;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class h extends d
{

    final com.facebook.abtest.qe.service.module.a a;

    private h(com.facebook.abtest.qe.service.module.a a1)
    {
        a = a1;
        super();
    }

    h(com.facebook.abtest.qe.service.module.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a(b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)e().a(com/facebook/fbservice/ops/k), (com.facebook.abtest.qe.g.a)a(com/facebook/abtest/qe/g/a), (com.facebook.common.time.a)a(com/facebook/common/time/a), b(java/lang/Boolean, com/facebook/abtest/qe/annotations/ShouldAppFetchOnForeground));
    }

    public Object b()
    {
        return a();
    }
}
