// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;

// Referenced classes of package com.facebook.analytics.service:
//            m, u

public class q
    implements e
{

    private final u a;

    public q(u u1)
    {
        a = u1;
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (m.a.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

    protected OperationResult b(ad ad1)
    {
        a.a();
        return OperationResult.b();
    }
}
