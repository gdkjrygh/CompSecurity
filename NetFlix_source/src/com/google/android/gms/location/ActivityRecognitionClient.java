// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.hc;

public class ActivityRecognitionClient
    implements GooglePlayServicesClient
{

    private final hc NO;

    public ActivityRecognitionClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        NO = new hc(context, connectioncallbacks, onconnectionfailedlistener, "activity_recognition");
    }

    public void connect()
    {
        NO.connect();
    }

    public void disconnect()
    {
        NO.disconnect();
    }

    public boolean isConnected()
    {
        return NO.isConnected();
    }

    public boolean isConnecting()
    {
        return NO.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return NO.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return NO.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        NO.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        NO.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
    {
        NO.removeActivityUpdates(pendingintent);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
    {
        NO.requestActivityUpdates(l, pendingintent);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        NO.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        NO.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
