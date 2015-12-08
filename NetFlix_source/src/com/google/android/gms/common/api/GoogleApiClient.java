// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, Scope, b

public interface GoogleApiClient
{
    public static final class Builder
    {

        private Looper AS;
        private final Set AT;
        private int AU;
        private View AV;
        private String AW;
        private final Map AX;
        private final Set AY;
        private final Set AZ;
        private final Context mContext;
        private String wG;

        public Builder addApi(Api api)
        {
            AX.put(api, null);
            api = api.dZ();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                AT.add(((Scope)api.get(i)).en());
            }

            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            fq.b(hasoptions, "Null options are not permitted for this Api");
            AX.put(api, hasoptions);
            api = api.dZ();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                AT.add(((Scope)api.get(i)).en());
            }

            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            AY.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            AZ.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            AT.add(scope.en());
            return this;
        }

        public GoogleApiClient build()
        {
            return new b(mContext, AS, eh(), AX, AY, AZ);
        }

        public fc eh()
        {
            return new fc(wG, AT, AU, AV, AW);
        }

        public Builder setAccountName(String s)
        {
            wG = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            AU = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            fq.b(handler, "Handler must not be null");
            AS = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            AV = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public Builder(Context context)
        {
            AT = new HashSet();
            AX = new HashMap();
            AY = new HashSet();
            AZ = new HashSet();
            mContext = context;
            AS = context.getMainLooper();
            AW = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            fq.b(connectioncallbacks, "Must provide a connected listener");
            AY.add(connectioncallbacks);
            fq.b(onconnectionfailedlistener, "Must provide a connection failed listener");
            AZ.add(onconnectionfailedlistener);
        }
    }

    public static interface ConnectionCallbacks
    {

        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        public abstract void onConnected(Bundle bundle);

        public abstract void onConnectionSuspended(int i);
    }

    public static interface OnConnectionFailedListener
        extends com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }


    public abstract Api.a a(Api.c c);

    public abstract a.b a(a.b b1);

    public abstract a.b b(a.b b1);

    public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

    public abstract void connect();

    public abstract void disconnect();

    public abstract Looper getLooper();

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectioncallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);
}
