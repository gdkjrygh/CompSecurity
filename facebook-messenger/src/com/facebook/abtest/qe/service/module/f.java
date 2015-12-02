// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.service.module;

import com.facebook.abtest.qe.annotations.IsFullExperimentSyncEnabled;
import com.facebook.abtest.qe.b;
import com.facebook.abtest.qe.g.a;
import com.facebook.abtest.qe.service.g;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.http.protocol.am;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.abtest.qe.service.module:
//            a, b

class f extends d
{

    final com.facebook.abtest.qe.service.module.a a;

    private f(com.facebook.abtest.qe.service.module.a a1)
    {
        a = a1;
        super();
    }

    f(com.facebook.abtest.qe.service.module.a a1, com.facebook.abtest.qe.service.module.b b1)
    {
        this(a1);
    }

    public g a()
    {
        return new g((am)a(com/facebook/http/protocol/am), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (a)a(com/facebook/abtest/qe/g/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.abtest.qe.protocol.sync.user.a)a(com/facebook/abtest/qe/protocol/sync/user/a), (com.facebook.abtest.qe.protocol.sync.full.a)a(com/facebook/abtest/qe/protocol/sync/full/a), b(java/lang/Boolean, com/facebook/abtest/qe/annotations/IsFullExperimentSyncEnabled), (com.facebook.abtest.qe.b.a)a(com/facebook/abtest/qe/b/a), (b)a(com/facebook/abtest/qe/b));
    }

    public Object b()
    {
        return a();
    }
}
