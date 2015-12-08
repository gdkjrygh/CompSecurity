// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class BootstrapClientImpl extends GmsClient
{

    public BootstrapClientImpl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ClientSettings clientsettings)
    {
        super(context, looper, 69, clientsettings, connectioncallbacks, onconnectionfailedlistener);
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return INearbyBootstrapService.Stub.asInterface(ibinder);
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }
}
