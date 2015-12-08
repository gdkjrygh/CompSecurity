// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope, PendingResult, d

public interface GoogleApiClient
{

    public abstract Api.a a(Api.c c);

    public abstract BaseImplementation.a a(BaseImplementation.a a1);

    public abstract boolean a(Scope scope);

    public abstract BaseImplementation.a b(BaseImplementation.a a1);

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract d d(Object obj);

    public abstract void disconnect();

    public abstract Looper getLooper();

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectioncallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void stopAutoManage(FragmentActivity fragmentactivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);
}
