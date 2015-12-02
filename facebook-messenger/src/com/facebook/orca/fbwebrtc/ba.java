// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            az, ag

class ba extends ac
{

    final long a;
    final az b;

    ba(az az1, long l)
    {
        b = az1;
        a = l;
        super();
    }

    public void a(OperationResult operationresult)
    {
        az.a(b).a(a, null, 0, "GRAPH");
    }

    protected void a(ServiceException serviceexception)
    {
        int i = az.a(b, serviceexception);
        com.facebook.debug.log.b.d(az.a(), "Failed to send message to peer. errorCode=%d", new Object[] {
            Integer.valueOf(i)
        });
        az.a(b).a(a, serviceexception.getMessage(), i, "GRAPH");
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
