// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jt, cm

public class cl extends jl
{

    final int qg;

    public cl(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, context.getMainLooper(), connectioncallbacks, onconnectionfailedlistener, new String[0]);
        qg = i;
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        jt1.g(e, qg, getContext().getPackageName(), bundle);
    }

    protected String bK()
    {
        return "com.google.android.gms.ads.gservice.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.ads.internal.gservice.IGservicesValueService";
    }

    public cm bM()
        throws DeadObjectException
    {
        return (cm)super.hw();
    }

    protected cm k(IBinder ibinder)
    {
        return cm.a.m(ibinder);
    }

    protected IInterface l(IBinder ibinder)
    {
        return k(ibinder);
    }
}
