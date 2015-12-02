// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.http.protocol.ApiErrorResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.push.c2dm:
//            FacebookPushServerRegistrar, v

class t
    implements h
{

    final v a;
    final FacebookPushServerRegistrar b;

    t(FacebookPushServerRegistrar facebookpushserverregistrar, v v)
    {
        b = facebookpushserverregistrar;
        a = v;
        super();
    }

    public void a(OperationResult operationresult)
    {
        b.a(operationresult, a);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        FacebookPushServerRegistrar.a(b);
        StringBuilder stringbuilder = new StringBuilder("failed");
        if (throwable instanceof ServiceException)
        {
            throwable = (ServiceException)throwable;
            stringbuilder.append('_').append(throwable.a().toString());
            throwable = (ApiErrorResult)throwable.b().i();
            if (throwable != null)
            {
                stringbuilder.append('_').append(throwable.a());
            }
        } else
        {
            stringbuilder.append("_").append(throwable.getClass().getSimpleName()).append("_").append(throwable.getMessage());
        }
        b.a(stringbuilder.toString());
    }
}
