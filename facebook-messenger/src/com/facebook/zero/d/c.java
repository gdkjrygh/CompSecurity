// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.d;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.zero.server.FetchZeroTokenResult;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.zero.d:
//            a

class c
    implements h
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        a.a((FetchZeroTokenResult)operationresult.g().getParcelable("result"));
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.zero.d.a.a(a, throwable);
    }
}
