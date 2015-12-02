// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.login:
//            af

class ag extends h
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        af.a(a, operationresult);
    }

    public void a(ServiceException serviceexception)
    {
        af.a(a, serviceexception);
    }
}
