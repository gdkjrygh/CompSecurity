// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, aw

class nit> extends d
{

    final f avn;
    final com.google.android.gms.wearable.Api.DataListener avq;
    final IntentFilter avr[];

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((aw)a1);
    }

    protected void a(aw aw1)
        throws RemoteException
    {
        aw1.a(this, avq, avr);
    }

    public Result c(Status status)
    {
        return d(status);
    }

    public Status d(Status status)
    {
        return new Status(13);
    }

    ner(f f1, com.google.android.gms.wearable.Api.DataListener datalistener, IntentFilter aintentfilter[])
    {
        avn = f1;
        avq = datalistener;
        avr = aintentfilter;
        super();
    }
}
