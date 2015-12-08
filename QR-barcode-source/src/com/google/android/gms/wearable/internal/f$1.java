// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, aw

class nit> extends d
{

    final PutDataRequest avm;
    final f avn;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((aw)a1);
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.a(this, avm);
    }

    public com.google.android.gms.wearable.Api.DataItemResult aF(Status status)
    {
        return new <init>(status, null);
    }

    public Result c(Status status)
    {
        return aF(status);
    }

    t(f f1, PutDataRequest putdatarequest)
    {
        avn = f1;
        avm = putdatarequest;
        super();
    }
}
