// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class GoogleHelpClientImpl extends GmsClient
{

    public GoogleHelpClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 63, clientsettings, connectioncallbacks, onconnectionfailedlistener);
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IGoogleHelpService.Stub.asInterface(ibinder);
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
