// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadview:
//            ci

class ck extends ac
{

    final ci a;

    ck(ci ci1)
    {
        a = ci1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ci.b(a, null);
        ci.b(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        ci.b(a, null);
        ci.b(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
