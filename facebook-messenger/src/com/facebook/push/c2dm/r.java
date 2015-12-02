// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.aq;
import javax.inject.a;

// Referenced classes of package com.facebook.push.c2dm:
//            RegisterPushTokenParams, RegisterPushTokenResult, UnregisterPushTokenParams, aa, 
//            ae

public class r
    implements e
{

    public static final OperationType a = new OperationType("register_push");
    public static final OperationType b = new OperationType("unregister_push");
    private final aa c;
    private final ae d;
    private final a e;

    public r(aa aa, ae ae, a a1)
    {
        c = aa;
        d = ae;
        e = a1;
    }

    private OperationResult b(ad ad1)
    {
        ad1 = (RegisterPushTokenParams)ad1.b().getParcelable("registerPushTokenParams");
        return OperationResult.a((RegisterPushTokenResult)((aq)e.b()).a(c, ad1));
    }

    private OperationResult c(ad ad1)
    {
        ad1 = (UnregisterPushTokenParams)ad1.b().getParcelable("unregisterPushTokenParams");
        ((aq)e.b()).a(d, ad1);
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (a.equals(operationtype))
        {
            return b(ad1);
        }
        if (b.equals(operationtype))
        {
            return c(ad1);
        } else
        {
            throw new Exception("Unknown type");
        }
    }

}
