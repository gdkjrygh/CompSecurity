// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.fbservice.ops.c;
import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadlist:
//            m

class o extends h
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        m.a(a).d();
        m.a(a, operationresult);
    }

    public void a(ServiceException serviceexception)
    {
        m.a(a).d();
        m.a(a, serviceexception);
    }
}
