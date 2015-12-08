// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jt, hu

public class hx extends jl
{

    public hx(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    protected hu G(IBinder ibinder)
    {
        return hu.a.E(ibinder);
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        jt1.b(e, 0x648278, getContext().getPackageName());
    }

    protected String bK()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected String bL()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public hu fH()
        throws DeadObjectException
    {
        return (hu)hw();
    }

    protected IInterface l(IBinder ibinder)
    {
        return G(ibinder);
    }
}
