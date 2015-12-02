// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.google.common.d.a.u;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            c, e, j, k

class o extends d
{

    final j a;

    private o(j j)
    {
        a = j;
        super();
    }

    o(j j, k k)
    {
        this(j);
    }

    public c a()
    {
        return new c((aq)a(com/facebook/http/protocol/aq), (e)a(com/facebook/bugreporter/activity/tasklist/e), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
