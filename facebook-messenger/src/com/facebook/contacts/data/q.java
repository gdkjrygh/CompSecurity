// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.data:
//            p

class q extends ac
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        p.a(a, null);
        p.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        p.a(a, null);
        p.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
