// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            a

class f extends ac
{

    final a a;

    f(a a1)
    {
        a = a1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.orca.threadview.upsell.a.a(a, null);
        com.facebook.orca.threadview.upsell.a.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.orca.threadview.upsell.a.a(a, null);
        com.facebook.orca.threadview.upsell.a.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
