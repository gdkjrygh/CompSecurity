// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.ez;

public class ActivityRecognitionClient
    implements GooglePlayServicesClient
{

    private final ez ou;

    public ActivityRecognitionClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ou = new ez(context, connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
    }

    public void connect()
    {
        ou.connect();
    }

    public void disconnect()
    {
        ou.disconnect();
    }

    public boolean isConnected()
    {
        return ou.isConnected();
    }

    public boolean isConnecting()
    {
        return ou.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return ou.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return ou.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ou.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ou.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
    {
        ou.removeActivityUpdates(pendingintent);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
    {
        ou.requestActivityUpdates(l, pendingintent);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        ou.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        ou.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
