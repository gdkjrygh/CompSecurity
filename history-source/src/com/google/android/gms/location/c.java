// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.nk;

public class c
    implements GooglePlayServicesClient
{
    public static interface a
    {

        public abstract void a(int i, String as[]);
    }

    public static interface b
    {

        public abstract void a(int i, PendingIntent pendingintent);

        public abstract void b(int i, String as[]);
    }


    private final nk agq;

    public void connect()
    {
        agq.connect();
    }

    public void disconnect()
    {
        agq.disconnect();
    }

    public boolean isConnected()
    {
        return agq.isConnected();
    }

    public boolean isConnecting()
    {
        return agq.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return agq.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return agq.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        agq.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        agq.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        agq.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        agq.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
