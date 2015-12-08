// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope, PendingResult, d, g, 
//            c, Api

public interface GoogleApiClient
{
    public static final class Builder
    {

        private String DZ;
        private Looper JF;
        private final Set JH;
        private int JI;
        private View JJ;
        private String JK;
        private final Map JL;
        private FragmentActivity JM;
        private int JN;
        private OnConnectionFailedListener JO;
        private final Set JP;
        private final Set JQ;
        private final Context mContext;

        private GoogleApiClient gI()
        {
            g g1 = g.a(JM);
            GoogleApiClient googleapiclient = g1.an(JN);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new c(mContext.getApplicationContext(), JF, gH(), JL, JP, JQ, JN);
            }
            g1.a(JN, ((GoogleApiClient) (obj)), JO);
            return ((GoogleApiClient) (obj));
        }

        public Builder addApi(Api api)
        {
            JL.put(api, null);
            api = api.gy();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                JH.add(((Scope)api.get(i)).gO());
            }

            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            jx.b(hasoptions, "Null options are not permitted for this Api");
            JL.put(api, hasoptions);
            api = api.gy();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                JH.add(((Scope)api.get(i)).gO());
            }

            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            JP.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            JQ.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            JH.add(scope.gO());
            return this;
        }

        public GoogleApiClient build()
        {
            boolean flag;
            if (!JL.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "must call addApi() to add at least one API");
            if (JN >= 0)
            {
                return gI();
            } else
            {
                return new c(mContext, JF, gH(), JL, JP, JQ, -1);
            }
        }

        public Builder enableAutoManage(FragmentActivity fragmentactivity, int i, OnConnectionFailedListener onconnectionfailedlistener)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "clientId must be non-negative");
            JN = i;
            JM = (FragmentActivity)jx.b(fragmentactivity, "Null activity is not permitted.");
            JO = onconnectionfailedlistener;
            return this;
        }

        public jg gH()
        {
            return new jg(DZ, JH, JI, JJ, JK);
        }

        public Builder setAccountName(String s)
        {
            DZ = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            JI = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            jx.b(handler, "Handler must not be null");
            JF = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            JJ = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public Builder(Context context)
        {
            JH = new HashSet();
            JL = new HashMap();
            JN = -1;
            JP = new HashSet();
            JQ = new HashSet();
            mContext = context;
            JF = context.getMainLooper();
            JK = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            jx.b(connectioncallbacks, "Must provide a connected listener");
            JP.add(connectioncallbacks);
            jx.b(onconnectionfailedlistener, "Must provide a connection failed listener");
            JQ.add(onconnectionfailedlistener);
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
