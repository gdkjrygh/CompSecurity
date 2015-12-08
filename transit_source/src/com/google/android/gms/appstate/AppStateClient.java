// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.internal.cw;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.appstate:
//            OnStateDeletedListener, OnStateListLoadedListener, OnStateLoadedListener, OnSignOutCompleteListener

public final class AppStateClient
    implements GooglePlayServicesClient
{
    public static final class Builder
    {

        private static final String ip[] = {
            "https://www.googleapis.com/auth/appstate"
        };
        private com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks iq;
        private com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener ir;
        private String is[];
        private String it;
        private Context mContext;

        public AppStateClient create()
        {
            return new AppStateClient(mContext, iq, ir, it, is);
        }

        public Builder setAccountName(String s)
        {
            it = (String)dm.e(s);
            return this;
        }

        public transient Builder setScopes(String as[])
        {
            is = as;
            return this;
        }


        public Builder(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            mContext = context;
            iq = connectioncallbacks;
            ir = onconnectionfailedlistener;
            is = ip;
            it = "<<default account>>";
        }
    }


    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_DEVELOPER_ERROR = 7;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_STATE_KEY_LIMIT_EXCEEDED = 2003;
    public static final int STATUS_STATE_KEY_NOT_FOUND = 2002;
    public static final int STATUS_WRITE_OUT_OF_DATE_VERSION = 2000;
    public static final int STATUS_WRITE_SIZE_EXCEEDED = 2001;
    private final cw io;

    private AppStateClient(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String as[])
    {
        io = new cw(context, connectioncallbacks, onconnectionfailedlistener, s, as);
    }


    public void connect()
    {
        io.connect();
    }

    public void deleteState(OnStateDeletedListener onstatedeletedlistener, int i)
    {
        io.deleteState(onstatedeletedlistener, i);
    }

    public void disconnect()
    {
        io.disconnect();
    }

    public int getMaxNumKeys()
    {
        return io.getMaxNumKeys();
    }

    public int getMaxStateSize()
    {
        return io.getMaxStateSize();
    }

    public boolean isConnected()
    {
        return io.isConnected();
    }

    public boolean isConnecting()
    {
        return io.isConnecting();
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        return io.isConnectionCallbacksRegistered(connectioncallbacks);
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return io.isConnectionFailedListenerRegistered(onconnectionfailedlistener);
    }

    public void listStates(OnStateListLoadedListener onstatelistloadedlistener)
    {
        io.listStates(onstatelistloadedlistener);
    }

    public void loadState(OnStateLoadedListener onstateloadedlistener, int i)
    {
        io.loadState(onstateloadedlistener, i);
    }

    public void reconnect()
    {
        io.disconnect();
        io.connect();
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        io.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        io.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public void resolveState(OnStateLoadedListener onstateloadedlistener, int i, String s, byte abyte0[])
    {
        io.resolveState(onstateloadedlistener, i, s, abyte0);
    }

    public void signOut()
    {
        io.signOut(null);
    }

    public void signOut(OnSignOutCompleteListener onsignoutcompletelistener)
    {
        dm.a(onsignoutcompletelistener, "Must provide a valid listener");
        io.signOut(onsignoutcompletelistener);
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks)
    {
        io.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        io.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public void updateState(int i, byte abyte0[])
    {
        io.a(null, i, abyte0);
    }

    public void updateStateImmediate(OnStateLoadedListener onstateloadedlistener, int i, byte abyte0[])
    {
        dm.a(onstateloadedlistener, "Must provide a valid listener");
        io.a(onstateloadedlistener, i, abyte0);
    }
}
