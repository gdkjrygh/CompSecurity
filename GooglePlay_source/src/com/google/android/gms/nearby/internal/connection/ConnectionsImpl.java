// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.Connections;

// Referenced classes of package com.google.android.gms.nearby.internal.connection:
//            ConnectionsClientImpl, INearbyConnectionService

public final class ConnectionsImpl
    implements Connections
{

    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

        public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new ConnectionsClientImpl(context, looper, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        }

    };
    public static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();

    public ConnectionsImpl()
    {
    }

    public final void stopCrossAppDiscoveryRestricted(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "GoogleApiClient parameter is required.");
        Preconditions.checkState(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        Preconditions.checkState(googleapiclient.hasApi(Nearby.CONNECTIONS_API), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        if (googleapiclient.hasConnectedApi(Nearby.CONNECTIONS_API))
        {
            googleapiclient = (ConnectionsClientImpl)googleapiclient.getClient(CLIENT_KEY);
        } else
        {
            googleapiclient = null;
        }
        try
        {
            ((INearbyConnectionService)googleapiclient.getService()).stopCrossAppDiscoveryRestricted(((ConnectionsClientImpl) (googleapiclient)).mClientId);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop cross app discovery", googleapiclient);
        }
    }

}
