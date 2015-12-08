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
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;

// Referenced classes of package com.google.android.gms.internal:
//            kk, kp

public class kl extends e
    implements kk
{

    private final String Dd;

    public kl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Dd = s;
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.a(e1, 0x5e2978, getContext().getPackageName(), Dd, gR(), new Bundle());
    }

    protected kp ao(IBinder ibinder)
    {
        return kp.a.as(ibinder);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.fitness.internal.IGoogleFitnessService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.fitness.GoogleFitnessService.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return ao(ibinder);
    }

    public kp jb()
    {
        return (kp)gS();
    }
}
