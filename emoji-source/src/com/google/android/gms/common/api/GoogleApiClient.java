// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            d, Api, Scope, c

public interface GoogleApiClient
{
    public static final class Builder
    {

        private Looper DF;
        private final Set DH;
        private int DI;
        private View DJ;
        private String DK;
        private final Map DL;
        private FragmentActivity DM;
        private OnConnectionFailedListener DN;
        private final Set DO;
        private final Set DP;
        private final Context mContext;
        private String yQ;

        private d eJ()
        {
            FragmentManager fragmentmanager;
label0:
            {
                fragmentmanager = DM.getSupportFragmentManager();
                if (fragmentmanager.getFragments() == null)
                {
                    break label0;
                }
                Iterator iterator = fragmentmanager.getFragments().iterator();
                Fragment fragment;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    fragment = (Fragment)iterator.next();
                } while (!(fragment instanceof d) || !fragment.isAdded() || ((d)fragment).isInitialized());
                return (d)fragment;
            }
            d d1 = new d();
            fragmentmanager.beginTransaction().add(d1, null).commit();
            return d1;
        }

        public Builder addApi(Api api)
        {
            DL.put(api, null);
            api = api.eA();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                DH.add(((Scope)api.get(i)).eP());
            }

            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            hm.b(hasoptions, "Null options are not permitted for this Api");
            DL.put(api, hasoptions);
            api = api.eA();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                DH.add(((Scope)api.get(i)).eP());
            }

            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            DO.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            DP.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            DH.add(scope.eP());
            return this;
        }

        public GoogleApiClient build()
        {
            d d1;
            c c1;
            boolean flag;
            if (!DL.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hm.b(flag, "must call addApi() to add at least one API");
            d1 = null;
            if (DM != null)
            {
                d1 = eJ();
            }
            c1 = new c(mContext, DF, eI(), DL, d1, DO, DP);
            if (d1 != null)
            {
                d1.a(c1, DN);
            }
            return c1;
        }

        public gy eI()
        {
            return new gy(yQ, DH, DI, DJ, DK);
        }

        public Builder enableAutoManage(FragmentActivity fragmentactivity, OnConnectionFailedListener onconnectionfailedlistener)
        {
            DM = (FragmentActivity)hm.b(fragmentactivity, "Null activity is not permitted.");
            DN = onconnectionfailedlistener;
            return this;
        }

        public Builder setAccountName(String s)
        {
            yQ = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            DI = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            hm.b(handler, "Handler must not be null");
            DF = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            DJ = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public Builder(Context context)
        {
            DH = new HashSet();
            DL = new HashMap();
            DO = new HashSet();
            DP = new HashSet();
            mContext = context;
            DF = context.getMainLooper();
            DK = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            hm.b(connectioncallbacks, "Must provide a connected listener");
            DO.add(connectioncallbacks);
            hm.b(onconnectionfailedlistener, "Must provide a connection failed listener");
            DP.add(onconnectionfailedlistener);
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

    public abstract ConnectionResult blockingConnect();

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

    public abstract void stopAutoManage();

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);
}
