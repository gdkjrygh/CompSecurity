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
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hn;
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

        private Looper DC;
        private final Set DE;
        private int DF;
        private View DG;
        private String DH;
        private final Map DI;
        private FragmentActivity DJ;
        private OnConnectionFailedListener DK;
        private final Set DL;
        private final Set DM;
        private final Context mContext;
        private String yN;

        private d eE()
        {
            FragmentManager fragmentmanager;
label0:
            {
                fragmentmanager = DJ.getSupportFragmentManager();
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
            DI.put(api, null);
            api = api.ev();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                DE.add(((Scope)api.get(i)).eK());
            }

            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            hn.b(hasoptions, "Null options are not permitted for this Api");
            DI.put(api, hasoptions);
            api = api.ev();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                DE.add(((Scope)api.get(i)).eK());
            }

            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            DL.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            DM.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            DE.add(scope.eK());
            return this;
        }

        public GoogleApiClient build()
        {
            d d1;
            c c1;
            boolean flag;
            if (!DI.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.b(flag, "must call addApi() to add at least one API");
            d1 = null;
            if (DJ != null)
            {
                d1 = eE();
            }
            c1 = new c(mContext, DC, eD(), DI, d1, DL, DM);
            if (d1 != null)
            {
                d1.a(c1, DK);
            }
            return c1;
        }

        public gz eD()
        {
            return new gz(yN, DE, DF, DG, DH);
        }

        public Builder enableAutoManage(FragmentActivity fragmentactivity, OnConnectionFailedListener onconnectionfailedlistener)
        {
            DJ = (FragmentActivity)hn.b(fragmentactivity, "Null activity is not permitted.");
            DK = onconnectionfailedlistener;
            return this;
        }

        public Builder setAccountName(String s)
        {
            yN = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            DF = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            hn.b(handler, "Handler must not be null");
            DC = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            DG = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public Builder(Context context)
        {
            DE = new HashSet();
            DI = new HashMap();
            DL = new HashSet();
            DM = new HashSet();
            mContext = context;
            DC = context.getMainLooper();
            DH = context.getPackageName();
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            hn.b(connectioncallbacks, "Must provide a connected listener");
            DL.add(connectioncallbacks);
            hn.b(onconnectionfailedlistener, "Must provide a connection failed listener");
            DM.add(onconnectionfailedlistener);
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
