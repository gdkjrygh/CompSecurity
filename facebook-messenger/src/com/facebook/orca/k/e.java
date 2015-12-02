// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.k;

import android.os.Bundle;
import com.facebook.fbservice.service.FutureOperationResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.location.GetDeviceLocationParams;
import com.facebook.location.h;
import com.facebook.orca.server.aq;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.k:
//            f

public class e
    implements com.facebook.fbservice.service.e
{

    private final h a;

    public e(h h1)
    {
        a = h1;
    }

    private OperationResult b(ad ad1)
    {
        GetDeviceLocationParams getdevicelocationparams = (GetDeviceLocationParams)ad1.b().getParcelable("getDeviceLocationParams");
        return new FutureOperationResult(i.a(a.a(getdevicelocationparams, ad1.c()), new f(this)));
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        ad1.b();
        if (aq.A.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }
}
