// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;

// Referenced classes of package com.google.android.gms.auth.api:
//            IGoogleAuthService

public final class GoogleAuthApiClientImpl extends e
{

    public static final String ACTION_START_SERVICE = "com.google.android.gms.auth.service.START";
    public static final String SERVICE_DESCRIPTOR = "com.google.android.gms.auth.api.IGoogleAuthService";
    private final String Dd;
    private String Ds[];

    public GoogleAuthApiClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Dd = s;
        Ds = as;
    }

    public GoogleAuthApiClientImpl(Context context, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        this(context, context.getMainLooper(), clientsettings, connectioncallbacks, onconnectionfailedlistener, s, as);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.b(e1, 0x5e2978, getContext().getPackageName(), Dd, gR());
    }

    protected IGoogleAuthService createServiceInterface(IBinder ibinder)
    {
        return IGoogleAuthService.Stub.asInterface(ibinder);
    }

    public String getAccountName()
    {
        return Dd;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.IGoogleAuthService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.auth.service.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return createServiceInterface(ibinder);
    }
}
