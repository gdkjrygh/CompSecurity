// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            jl, lu, jt, lz

public class lv extends jl
    implements lu
{

    private final String DZ;

    public lv(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        DZ = s;
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        jt1.a(e, 0x648278, getContext().getPackageName(), DZ, hv(), new Bundle());
    }

    protected lz ar(IBinder ibinder)
    {
        return lz.a.av(ibinder);
    }

    protected String bK()
    {
        return "com.google.android.gms.fitness.GoogleFitnessService.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.fitness.internal.IGoogleFitnessService";
    }

    public lz jM()
        throws DeadObjectException
    {
        return (lz)hw();
    }

    protected IInterface l(IBinder ibinder)
    {
        return ar(ibinder);
    }
}
