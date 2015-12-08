// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;

// Referenced classes of package com.google.android.gms.internal:
//            hv

public class hy extends e
{

    public hy(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    protected hv H(IBinder ibinder)
    {
        return hv.a.F(ibinder);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.b(e1, 0x5e2978, getContext().getPackageName());
    }

    public hv fn()
    {
        return (hv)gS();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected IInterface j(IBinder ibinder)
    {
        return H(ibinder);
    }
}
