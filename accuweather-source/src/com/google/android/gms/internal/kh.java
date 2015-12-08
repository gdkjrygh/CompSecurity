// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hc, hj, kf

public class kh extends hc
{

    public kh(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    protected void a(hj hj1, hc.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        hj1.a(e, 0x4d7808, getContext().getPackageName(), bundle);
    }

    public kf bj(IBinder ibinder)
    {
        return kf.a.bi(ibinder);
    }

    protected String bp()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    public IInterface x(IBinder ibinder)
    {
        return bj(ibinder);
    }
}
