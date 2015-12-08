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
//            hb, hi, ke

public class kg extends hb
{

    public kg(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    protected void a(hi hi1, hb.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        hi1.a(e, 0x4da6e8, getContext().getPackageName(), bundle);
    }

    public ke bj(IBinder ibinder)
    {
        return ke.a.bi(ibinder);
    }

    protected String bu()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    public IInterface x(IBinder ibinder)
    {
        return bj(ibinder);
    }
}
