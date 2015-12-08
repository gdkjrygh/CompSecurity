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
//            jl, jt, ok

public class om extends jl
{

    public om(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        jt1.a(e, 0x648278, getContext().getPackageName(), bundle);
    }

    public ok bH(IBinder ibinder)
    {
        return ok.a.bG(ibinder);
    }

    protected String bK()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    public IInterface l(IBinder ibinder)
    {
        return bH(ibinder);
    }
}
