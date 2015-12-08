// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzpq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface GoogleApiClient
{
    public static final class Builder
    {

        private final Context mContext;
        private Account zzMY;
        private String zzOd;
        private String zzOe;
        private int zzWB;
        private int zzWC;
        private Api.zza zzWE;
        private final Set zzWF = new HashSet();
        private final Set zzWG = new HashSet();
        private com.google.android.gms.internal.zzpt.zza zzWH;
        private Looper zzWt;
        private final Set zzWv = new HashSet();
        private int zzWw;
        private View zzWx;
        private final Map zzWy = new HashMap();
        private final Map zzWz = new HashMap();

        public zze zzmx()
        {
            return new zze(zzMY, zzWv, zzWy, zzWw, zzWx, zzOe, zzOd, zzWH.zzyc());
        }

        public Builder(Context context)
        {
            zzWB = -1;
            zzWC = -1;
            zzWH = new com.google.android.gms.internal.zzpt.zza();
            mContext = context;
            zzWt = context.getMainLooper();
            zzOe = context.getPackageName();
            zzOd = context.getClass().getName();
            zzWE = zzpq.zzNY;
        }
    }

    public static interface ConnectionCallbacks
    {

        public abstract void onConnected(Bundle bundle);

        public abstract void onConnectionSuspended(int i);
    }

    public static interface ConnectionProgressReportCallbacks
    {

        public abstract void onReportAccountValidation(ConnectionResult connectionresult);

        public abstract void onReportServiceBinding(ConnectionResult connectionresult);
    }

    public static interface OnConnectionFailedListener
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }

    public static interface ServerAuthCodeCallbacks
    {
    }

}
