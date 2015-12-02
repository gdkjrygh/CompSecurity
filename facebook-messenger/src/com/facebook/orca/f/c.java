// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.f:
//            b

class c extends ac
{

    final String a;
    final b b;

    c(b b1, String s)
    {
        b = b1;
        a = s;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.orca.f.b.a(b, operationresult, a);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.orca.f.b.a(b, serviceexception, a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
