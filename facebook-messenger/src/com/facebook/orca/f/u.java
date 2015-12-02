// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.f:
//            r

class u extends ac
{

    final String a;
    final r b;

    u(r r1, String s)
    {
        b = r1;
        a = s;
        super();
    }

    public void a(OperationResult operationresult)
    {
        r.a(b, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        b.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
