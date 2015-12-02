// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import com.facebook.common.executors.i;
import com.google.common.base.Preconditions;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.fbservice.service:
//            h, OperationResult, u, m

class l
    implements h
{

    final m a;
    final com.facebook.fbservice.service.h b;

    l(com.facebook.fbservice.service.h h1, m m)
    {
        b = h1;
        a = m;
        super();
    }

    public void a(OperationResult operationresult)
    {
        Preconditions.checkState(h.a(b).b());
        h.b(b, a, operationresult);
        h.a(b, null);
        h.a(b, 0L);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        Preconditions.checkState(h.a(b).b());
        h.b(b, a, OperationResult.a(u.a(throwable), u.b(throwable)));
        h.a(b, null);
        h.a(b, 0L);
    }
}
