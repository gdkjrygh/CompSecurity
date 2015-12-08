// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.callbacks;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;

public interface BaseCastConsumer
    extends OnFailedListener
{

    public abstract void onCastAvailabilityChanged(boolean flag);

    public abstract void onCastDeviceDetected(android.support.v7.media.MediaRouter.RouteInfo routeinfo);

    public abstract void onConnected();

    public abstract void onConnectionFailed(ConnectionResult connectionresult);

    public abstract void onConnectionSuspended(int i);

    public abstract void onConnectivityRecovered();

    public abstract void onDeviceSelected(CastDevice castdevice);

    public abstract void onDisconnected();

    public abstract void onReconnectionStatusChanged(int i);

    public abstract void onUiVisibilityChanged(boolean flag);
}
