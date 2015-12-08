// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hc, hj, fv

public class fy extends hc
{

    public fy(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    protected fv C(IBinder ibinder)
    {
        return fv.a.A(ibinder);
    }

    protected void a(hj hj1, hc.e e)
        throws RemoteException
    {
        hj1.b(e, 0x4d7808, getContext().getPackageName());
    }

    protected String bp()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected String bq()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public fv dM()
    {
        return (fv)fo();
    }

    protected IInterface x(IBinder ibinder)
    {
        return C(ibinder);
    }
}
