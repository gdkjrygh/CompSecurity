// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import java.util.Map;

// Referenced classes of package com.facebook.orca.f:
//            p

class q extends ac
{

    final String a;
    final p b;

    q(p p1, String s)
    {
        b = p1;
        a = s;
        super();
    }

    public void a(OperationResult operationresult)
    {
        p.a(b).remove(a);
    }

    protected void a(ServiceException serviceexception)
    {
        p.a(b).remove(a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
