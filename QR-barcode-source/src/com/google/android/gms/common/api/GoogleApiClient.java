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
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope, c, d, b, 
//            Api

public interface GoogleApiClient
{
    public static final class Builder
    {

        private String Dd;
        private Looper IH;
        private final Set IJ;
        private int IK;
        private View IL;
        private String IM;
        private final Map IN;
        private FragmentActivity IO;
        private int IP;
        private OnConnectionFailedListener IQ;
        private int IR;
        private final Set IS;
        private final Set IT;
        private final Context mContext;

        private GoogleApiClient gl()
        {
            d d1 = d.a(IO);
            GoogleApiClient googleapiclient = d1.ak(IP);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new b(mContext.getApplicationContext(), IH, gk(), IN, IS, IT, IP, IR);
            }
            d1.a(IP, ((GoogleApiClient) (obj)), IQ);
            return ((GoogleApiClient) (obj));
        }

        public Builder addApi(Api api)
        {
            IN.put(api, null);
            api = api.gd();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                IJ.add(((Scope)api.get(i)).gs());
            }

            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            o.b(hasoptions, "Null options are not permitted for this Api");
            IN.put(api, hasoptions);
            api = api.gd();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                IJ.add(((Scope)api.get(i)).gs());
            }

            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            IS.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            IT.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            IJ.add(scope.gs());
            return this;
        }

        public GoogleApiClient build()
        {
            boolean flag;
            if (!IN.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "must call addApi() to add at least one API");
            if (IP >= 0)
            {
                return gl();
            } else
            {
                return new b(mContext, IH, gk(), IN, IS, IT, -1, IR);
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
            o.b(flag, "clientId must be non-negative");
            IP = i;
            IO = (FragmentActivity)o.b(fragmentactivity, "Null activity is not permitted.");
            IQ = onconnectionfailedlistener;
            return this;
        }

        public ClientSettings gk()
        {
            return new ClientSettings(Dd, IJ, IK, IL, IM);
        }

        public Builder setAccountName(String s)
        {
            Dd = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            IK = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            o.b(handler, "Handler must not be null");
            IH = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            IL = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public Builder(Context context)
        {
            IJ = new HashSet();
            IN = new HashMap();
            IP = -1;
            IR = 2;
            IS = new HashSet();
            IT = new HashSet();
            mContext = context;
            IH = context.getMainLooper();
            IM = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            o.b(connectioncallbacks, "Must provide a connected listener");
            IS.add(connectioncallbacks);
            o.b(onconnectionfailedlistener, "Must provide a connection failed listener");
            IT.add(onconnectionfailedlistener);
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


    public abstract Api.a a(Api.c c1);

    public abstract BaseImplementation.a a(BaseImplementation.a a1);

    public abstract boolean a(Scope scope);

    public abstract BaseImplementation.a b(BaseImplementation.a a1);

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

    public abstract c c(Object obj);

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

    public abstract void stopAutoManage(FragmentActivity fragmentactivity);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);
}
