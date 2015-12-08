// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.panorama;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.ff;

public class PanoramaClient
    implements GooglePlayServicesClient
{
    public static interface OnPanoramaInfoLoadedListener
    {

        public abstract void onPanoramaInfoLoaded(ConnectionResult connectionresult, Intent intent);
    }

    public static interface a
    {

        public abstract void a(ConnectionResult connectionresult, int i, Intent intent);
    }


    private final ff qU;

    public PanoramaClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        qU = new ff(context, connectioncallbacks, onconnectionfailedlistener);
    }

    public void connect()
    {
        qU.connect();
    }

    public void disconnect()
    {
        qU.disconnect();
    }

    public boolean isConnected()
    {
        return qU.isConnected();
    }

    public boolean isConnecting()
    {
        return qU.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return qU.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return qU.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void loadPanoramaInfo(OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener, Uri uri)
    {
        qU.a(onpanoramainfoloadedlistener, uri, false);
    }

    public void loadPanoramaInfoAndGrantAccess(OnPanoramaInfoLoadedListener onpanoramainfoloadedlistener, Uri uri)
    {
        qU.a(onpanoramainfoloadedlistener, uri, true);
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        qU.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        qU.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        qU.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        qU.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }
}
