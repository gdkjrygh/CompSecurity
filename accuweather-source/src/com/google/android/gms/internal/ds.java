// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hc, hj, dx

public class ds extends hc
{

    final int pT;

    public ds(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        pT = i;
    }

    protected void a(hj hj1, hc.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        hj1.g(e, pT, getContext().getPackageName(), bundle);
    }

    protected String bp()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public dx br()
    {
        return (dx)super.fo();
    }

    protected dx w(IBinder ibinder)
    {
        return dx.a.y(ibinder);
    }

    protected IInterface x(IBinder ibinder)
    {
        return w(ibinder);
    }
}
