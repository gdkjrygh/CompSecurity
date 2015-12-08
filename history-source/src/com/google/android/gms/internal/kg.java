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
//            jl, jt, ki

public class kg extends jl
{

    public transient kg(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
    }

    protected ki T(IBinder ibinder)
    {
        return ki.a.V(ibinder);
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        jt1.j(e, 0x648278, getContext().getPackageName());
    }

    public String bK()
    {
        return "com.google.android.gms.common.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    protected IInterface l(IBinder ibinder)
    {
        return T(ibinder);
    }
}
