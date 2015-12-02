// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.auth.login:
//            FirstPartySsoFragment

class aa extends h
{

    final FirstPartySsoFragment a;

    aa(FirstPartySsoFragment firstpartyssofragment)
    {
        a = firstpartyssofragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        FirstPartySsoFragment.a(a);
    }

    public void a(ServiceException serviceexception)
    {
        FirstPartySsoFragment.a(a, serviceexception);
    }
}
