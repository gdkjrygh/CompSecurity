// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.intents:
//            CanonicalThreadHandler

class a extends h
{

    final CanonicalThreadHandler a;

    a(CanonicalThreadHandler canonicalthreadhandler)
    {
        a = canonicalthreadhandler;
        super();
    }

    public void a(OperationResult operationresult)
    {
        CanonicalThreadHandler.a(a, operationresult);
    }

    public void a(ServiceException serviceexception)
    {
        CanonicalThreadHandler.a(a, serviceexception);
    }
}
