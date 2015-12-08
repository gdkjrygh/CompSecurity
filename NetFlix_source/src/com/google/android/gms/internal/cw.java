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
//            ff, fm, db

public class cw extends ff
{

    final int pe;

    public cw(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        pe = i;
    }

    protected void a(fm fm1, ff.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        fm1.g(e, pe, getContext().getPackageName(), bundle);
    }

    protected String bg()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public db bi()
    {
        return (db)super.eM();
    }

    protected db q(IBinder ibinder)
    {
        return db.a.s(ibinder);
    }

    protected IInterface r(IBinder ibinder)
    {
        return q(ibinder);
    }
}
