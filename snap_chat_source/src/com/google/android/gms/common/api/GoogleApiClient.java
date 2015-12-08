// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, zzd, Api, Scope

public interface GoogleApiClient
{
    public static final class Builder
    {

        private final Context mContext;
        private Account zzFN;
        private Looper zzMc;
        private final Set zzMe = new HashSet();
        private int zzMf;
        private View zzMg;
        private String zzMh;
        private String zzMi;
        private final Map zzMj = new HashMap();
        private final Map zzMk = new HashMap();
        private FragmentActivity zzMl;
        private int zzMm;
        private OnConnectionFailedListener zzMn;
        private Api.zzb zzMo;
        private final Set zzMp = new HashSet();
        private final Set zzMq = new HashSet();
        private com.google.android.gms.internal.zzus.zza zzMr;

        private GoogleApiClient zzhZ()
        {
            zzh zzh1 = zzh.zza(zzMl);
            GoogleApiClient googleapiclient = zzh1.zzar(zzMm);
            Object obj = googleapiclient;
            if (googleapiclient == null)
            {
                obj = new zzd(mContext.getApplicationContext(), zzMc, zzhY(), zzMo, zzMj, zzMk, zzMp, zzMq, zzMm);
            }
            zzh1.zza(zzMm, ((GoogleApiClient) (obj)), zzMn);
            return ((GoogleApiClient) (obj));
        }

        public final Builder addApi(Api api)
        {
            zzMj.put(api, null);
            api = api.zzhU();
            int j = api.size();
            for (int i = 0; i < j; i++)
            {
                zzMe.add(((Scope)api.get(i)).zzio());
            }

            return this;
        }

        public final GoogleApiClient build()
        {
            boolean flag;
            if (!zzMj.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zzb(flag, "must call addApi() to add at least one API");
            if (zzMm >= 0)
            {
                return zzhZ();
            } else
            {
                return new zzd(mContext, zzMc, zzhY(), zzMo, zzMj, zzMk, zzMp, zzMq, -1);
            }
        }

        public final zzf zzhY()
        {
            return new zzf(zzFN, zzMe, zzMf, zzMg, zzMh, zzMi, zzMr.zzsy());
        }

        public Builder(Context context)
        {
            zzMm = -1;
            zzMr = new com.google.android.gms.internal.zzus.zza();
            mContext = context;
            zzMc = context.getMainLooper();
            zzMh = context.getPackageName();
            zzMi = context.getClass().getName();
            zzMo = zzup.zzGS;
        }
    }

    public static interface ConnectionCallbacks
    {

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

        private Set zzMe;
        private boolean zzMs;

        public boolean zzic()
        {
            return zzMs;
        }

        public Set zzid()
        {
            return zzMe;
        }
    }

    public static interface zza
    {

        public abstract void zzia();

        public abstract void zzib();
    }


    public abstract ConnectionResult blockingConnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract Looper getLooper();

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectioncallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onconnectionfailedlistener);

    public abstract Api.zza zza(Api.zzc zzc);

    public abstract zza.zza zza(zza.zza zza1);
}
