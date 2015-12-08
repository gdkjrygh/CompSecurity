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
//            hb, hi, dw

public class dr extends hb
{

    final int pV;

    public dr(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        pV = i;
    }

    protected void a(hi hi1, hb.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        hi1.g(e, pV, getContext().getPackageName(), bundle);
    }

    protected String bu()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public dw bw()
    {
        return (dw)super.ft();
    }

    protected dw w(IBinder ibinder)
    {
        return dw.a.y(ibinder);
    }

    protected IInterface x(IBinder ibinder)
    {
        return w(ibinder);
    }
}
