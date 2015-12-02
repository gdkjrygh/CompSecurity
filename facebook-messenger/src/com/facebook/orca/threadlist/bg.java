// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.threadlist:
//            bf

class bg extends ac
{

    final bf a;

    bg(bf bf1)
    {
        a = bf1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        bf.a(a, null);
        bf.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        bf.a(a, null);
        bf.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
