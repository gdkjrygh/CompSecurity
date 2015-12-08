// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.jh;

public class ActivityRecognitionClient
    implements GooglePlayServicesClient
{

    private final jh UR;

    public ActivityRecognitionClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UR = new jh(context, connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
    }

    public void connect()
    {
        UR.connect();
    }

    public void disconnect()
    {
        UR.disconnect();
    }

    public boolean isConnected()
    {
        return UR.isConnected();
    }

    public boolean isConnecting()
    {
        return UR.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return UR.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return UR.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        UR.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UR.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
    {
        try
        {
            UR.removeActivityUpdates(pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
    {
        try
        {
            UR.requestActivityUpdates(l, pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        UR.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        UR.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
