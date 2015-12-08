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
//            de, dj, by

public class bt extends de
{

    private final int gz;

    public bt(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        gz = i;
    }

    protected void a(dj dj1, de.d d)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        dj1.g(d, gz, getContext().getPackageName(), bundle);
    }

    protected String ag()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public by ai()
    {
        return (by)super.bd();
    }

    protected by o(IBinder ibinder)
    {
        return by.a.q(ibinder);
    }

    protected IInterface p(IBinder ibinder)
    {
        return o(ibinder);
    }
}
