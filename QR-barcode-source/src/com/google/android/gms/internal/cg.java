// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;

// Referenced classes of package com.google.android.gms.internal:
//            ch

public class cg extends e
{

    final int pP;

    public cg(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int k)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        pP = k;
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        l1.g(e1, pP, getContext().getPackageName(), bundle);
    }

    public ch bC()
    {
        return (ch)super.gS();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.ads.internal.gservice.IGservicesValueService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.ads.gservice.START";
    }

    protected ch i(IBinder ibinder)
    {
        return ch.a.k(ibinder);
    }

    protected IInterface j(IBinder ibinder)
    {
        return i(ibinder);
    }
}
