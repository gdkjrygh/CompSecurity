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
//            kb, kj, pj, pc

public class ow extends kb
{

    protected final pj FU = new pj() {

        final ow avl;

        private pc pr()
            throws DeadObjectException
        {
            return (pc)avl.iP();
        }

        public final void dR()
        {
            ow.a(avl);
        }

        public final IInterface iP()
            throws DeadObjectException
        {
            return pr();
        }

            
            {
                avl = ow.this;
                super();
            }
    };
    private final String avk;

    public ow(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        avk = s;
    }

    static void a(ow ow1)
    {
        ow1.dR();
    }

    private static pc cn(IBinder ibinder)
    {
        return pc.a.cp(ibinder);
    }

    protected final void a(kj kj1, kb.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", avk);
        kj1.e(e, 0x648278, getContext().getPackageName(), bundle);
    }

    protected final String bK()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected final String bL()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected final IInterface p(IBinder ibinder)
    {
        return cn(ibinder);
    }
}
