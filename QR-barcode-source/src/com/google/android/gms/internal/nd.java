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
//            nb

public class nd extends e
{

    public nd(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, (String[])null);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        l1.a(e1, 0x5e2978, getContext().getPackageName(), bundle);
    }

    public nb bB(IBinder ibinder)
    {
        return nb.a.bA(ibinder);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    public IInterface j(IBinder ibinder)
    {
        return bB(ibinder);
    }
}
