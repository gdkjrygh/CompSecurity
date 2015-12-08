// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

// Referenced classes of package com.google.android.gms.nearby.internal.connection:
//            INearbyConnectionService

public final class ConnectionsClientImpl extends GmsClient
{

    final long mClientId = (long)hashCode();

    public ConnectionsClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 54, clientsettings, connectioncallbacks, onconnectionfailedlistener);
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return INearbyConnectionService.Stub.asInterface(ibinder);
    }

    public final void disconnect()
    {
        if (isConnected())
        {
            try
            {
                ((INearbyConnectionService)getService()).clientDisconnecting(mClientId);
            }
            catch (RemoteException remoteexception)
            {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteexception);
            }
        }
        super.disconnect();
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.nearby.connection.service.START";
    }
}
