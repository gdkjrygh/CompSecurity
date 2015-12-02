// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.f:
//            x

class y extends ac
{

    final String a;
    final x b;

    y(x x1, String s)
    {
        b = x1;
        a = s;
        super();
    }

    public void a(OperationResult operationresult)
    {
        x.a(b, operationresult, a);
    }

    protected void a(ServiceException serviceexception)
    {
        x.a(b, serviceexception, a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
