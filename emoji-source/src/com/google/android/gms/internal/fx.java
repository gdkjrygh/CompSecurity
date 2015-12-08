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
//            hb, hi, fu

public class fx extends hb
{

    public fx(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
    }

    protected fu C(IBinder ibinder)
    {
        return fu.a.A(ibinder);
    }

    protected void a(hi hi1, hb.e e)
        throws RemoteException
    {
        hi1.b(e, 0x4da6e8, getContext().getPackageName());
    }

    protected String bu()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected String bv()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public fu dR()
    {
        return (fu)ft();
    }

    protected IInterface x(IBinder ibinder)
    {
        return C(ibinder);
    }
}
