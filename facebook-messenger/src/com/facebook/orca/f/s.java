// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messages.model.threads.Message;

// Referenced classes of package com.facebook.orca.f:
//            r

class s extends ac
{

    final Message a;
    final r b;

    s(r r1, Message message)
    {
        b = r1;
        a = message;
        super();
    }

    public void a(OperationResult operationresult)
    {
        r.a(b, operationresult, a);
    }

    protected void a(ServiceException serviceexception)
    {
        r.a(b, serviceexception, a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
