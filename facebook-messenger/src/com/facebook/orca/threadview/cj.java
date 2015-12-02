// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadview:
//            ci

class cj extends ac
{

    final ci a;

    cj(ci ci1)
    {
        a = ci1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ci.a(a, null);
        ci.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        ci.a(a, null);
        ci.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
