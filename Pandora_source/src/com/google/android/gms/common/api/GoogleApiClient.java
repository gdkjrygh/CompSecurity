// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzmb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Api, Scope, zzi, 
//            zzl, zzg, zzm

public interface GoogleApiClient
{
    public static final class Builder
    {

        private final Context mContext;
        private Account zzJc;
        private int zzPA;
        private View zzPB;
        private String zzPC;
        private String zzPD;
        private final Map zzPE;
        private final Map zzPF;
        private FragmentActivity zzPG;
        private int zzPH;
        private int zzPI;
        private OnConnectionFailedListener zzPJ;
        private Api.zzb zzPK;
        private final Set zzPL;
        private final Set zzPM;
        private com.google.android.gms.internal.zzme.zza zzPN;
        private Looper zzPx;
        private final Set zzPz;

        private transient void zza(Api api, int i, Scope ascope[])
        {
            boolean flag1 = true;
            boolean flag = false;
            HashSet hashset;
            int j;
            if (i != 1)
            {
                if (i == 2)
                {
                    flag1 = false;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid resolution mode: '").append(i).append("', use a constant from GoogleApiClient.ResolutionMode").toString());
                }
            }
            hashset = new HashSet(api.zzkE());
            j = ascope.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                hashset.add(ascope[i]);
            }

            zzPE.put(api, new com.google.android.gms.common.internal.zze.zza(hashset, flag1));
        }

        private GoogleApiClient zzkL()
        {
            zzl zzl1 = com.google.android.gms.common.api.zzl.zza(zzPG);
            zzg zzg1 = new zzg(mContext.getApplicationContext(), zzPx, zzkK(), zzPK, zzPF, zzPL, zzPM, zzPH, -1);
            zzl1.zza(zzPH, zzg1, zzPJ);
            return zzg1;
        }

        private GoogleApiClient zzkM()
        {
            zzm zzm1 = zzm.zzb(zzPG);
            GoogleApiClient googleapiclient = zzm1.zzay(zzPI);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new zzg(mContext.getApplicationContext(), zzPx, zzkK(), zzPK, zzPF, zzPL, zzPM, -1, zzPI);
            }
            zzm1.zza(zzPI, ((GoogleApiClient) (obj)), zzPJ);
            return ((GoogleApiClient) (obj));
        }

        public Builder addApi(Api api)
        {
            zzPF.put(api, null);
            zzPz.addAll(api.zzkE());
            return this;
        }

        public Builder addApi(Api api, Api.ApiOptions.HasOptions hasoptions)
        {
            zzv.zzb(hasoptions, "Null options are not permitted for this Api");
            zzPF.put(api, hasoptions);
            zzPz.addAll(api.zzkE());
            return this;
        }

        public transient Builder addApiIfAvailable(Api api, Api.ApiOptions.HasOptions hasoptions, Scope ascope[])
        {
            zzv.zzb(hasoptions, "Null options are not permitted for this Api");
            zzPF.put(api, hasoptions);
            zza(api, 1, ascope);
            return this;
        }

        public transient Builder addApiIfAvailable(Api api, Scope ascope[])
        {
            zzPF.put(api, null);
            zza(api, 1, ascope);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectioncallbacks)
        {
            zzPL.add(connectioncallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzPM.add(onconnectionfailedlistener);
            return this;
        }

        public Builder addScope(Scope scope)
        {
            zzPz.add(scope);
            return this;
        }

        public GoogleApiClient build()
        {
            boolean flag;
            if (!zzPF.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "must call addApi() to add at least one API");
            if (zzPH >= 0)
            {
                return zzkL();
            }
            if (zzPI >= 0)
            {
                return zzkM();
            } else
            {
                return new zzg(mContext, zzPx, zzkK(), zzPK, zzPF, zzPL, zzPM, -1, -1);
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
            zzv.zzb(flag, "clientId must be non-negative");
            zzPH = i;
            zzPG = (FragmentActivity)zzv.zzb(fragmentactivity, "Null activity is not permitted.");
            zzPJ = onconnectionfailedlistener;
            return this;
        }

        public Builder requestServerAuthCode(String s, ServerAuthCodeCallbacks serverauthcodecallbacks)
        {
            zzPN.zza(s, serverauthcodecallbacks);
            return this;
        }

        public Builder setAccountName(String s)
        {
            if (s == null)
            {
                s = null;
            } else
            {
                s = new Account(s, "com.google");
            }
            zzJc = s;
            return this;
        }

        public Builder setGravityForPopups(int i)
        {
            zzPA = i;
            return this;
        }

        public Builder setHandler(Handler handler)
        {
            zzv.zzb(handler, "Handler must not be null");
            zzPx = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View view)
        {
            zzPB = view;
            return this;
        }

        public Builder useDefaultAccount()
        {
            return setAccountName("<<default account>>");
        }

        public zze zzkK()
        {
            return new zze(zzJc, zzPz, zzPE, zzPA, zzPB, zzPC, zzPD, zzPN.zzwi());
        }

        public Builder(Context context)
        {
            zzPz = new HashSet();
            zzPE = new HashMap();
            zzPF = new HashMap();
            zzPH = -1;
            zzPI = -1;
            zzPL = new HashSet();
            zzPM = new HashSet();
            zzPN = new com.google.android.gms.internal.zzme.zza();
            mContext = context;
            zzPx = context.getMainLooper();
            zzPC = context.getPackageName();
            zzPD = context.getClass().getName();
            zzPK = zzmb.zzKi;
        }

        public Builder(Context context, ConnectionCallbacks connectioncallbacks, OnConnectionFailedListener onconnectionfailedlistener)
        {
            this(context);
            zzv.zzb(connectioncallbacks, "Must provide a connected listener");
            zzPL.add(connectioncallbacks);
            zzv.zzb(onconnectionfailedlistener, "Must provide a connection failed listener");
            zzPM.add(onconnectionfailedlistener);
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
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }

    public static interface ServerAuthCodeCallbacks
    {

        public abstract CheckResult onCheckServerAuthorization(String s, Set set);

        public abstract boolean onUploadServerAuthCode(String s, String s1);
    }

    public static class ServerAuthCodeCallbacks.CheckResult
    {

        private boolean zzPO;
        private Set zzPP;

        public static ServerAuthCodeCallbacks.CheckResult newAuthNotRequiredResult()
        {
            return new ServerAuthCodeCallbacks.CheckResult(false, null);
        }

        public static ServerAuthCodeCallbacks.CheckResult newAuthRequiredResult(Set set)
        {
            boolean flag;
            if (set != null && !set.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zzb(flag, "A non-empty scope set is required if further auth is needed.");
            return new ServerAuthCodeCallbacks.CheckResult(true, set);
        }

        public boolean zzkN()
        {
            return zzPO;
        }

        public Set zzkO()
        {
            return zzPP;
        }

        private ServerAuthCodeCallbacks.CheckResult(boolean flag, Set set)
        {
            zzPO = flag;
            zzPP = set;
        }
    }

    public static interface zza
    {

        public abstract void zza(ConnectionResult connectionresult);

        public abstract void zzb(ConnectionResult connectionresult);
    }


    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract ConnectionResult getConnectionResult(Api api);

    public abstract Context getContext();

    public abstract Looper getLooper();

    public abstract int getSessionId();

    public abstract boolean hasConnectedApi(Api api);

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

    public abstract Api.zza zza(Api.zzc zzc);

    public abstract zza.zza zza(zza.zza zza1);

    public abstract boolean zza(Api api);

    public abstract boolean zza(Scope scope);

    public abstract zza.zza zzb(zza.zza zza1);

    public abstract zzi zzl(Object obj);
}
