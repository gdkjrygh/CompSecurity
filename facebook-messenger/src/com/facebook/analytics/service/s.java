// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.analytics.service:
//            r

class s
    implements h
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        r.a(a, null);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        r.a(a, null);
    }
}
