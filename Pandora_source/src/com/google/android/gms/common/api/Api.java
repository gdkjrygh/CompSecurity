// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{
    public static interface ApiOptions
    {
    }

    public static interface ApiOptions.HasOptions
        extends ApiOptions
    {
    }

    public static final class ApiOptions.NoOptions
        implements ApiOptions.NotRequiredOptions
    {

        private ApiOptions.NoOptions()
        {
        }
    }

    public static interface ApiOptions.NotRequiredOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.Optional
        extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
    {
    }

    public static interface zza
    {

        public abstract void connect();

        public abstract void disconnect();

        public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

        public abstract boolean isConnected();

        public abstract void zza(GoogleApiClient.zza zza1);

        public abstract void zza(zzo zzo);

        public abstract void zza(zzo zzo, Set set);

        public abstract boolean zzjM();
    }

    public static interface zzb
    {

        public abstract int getPriority();

        public abstract zza zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);
    }

    public static final class zzc
    {

        public zzc()
        {
        }
    }

    public static interface zzd
    {

        public abstract IInterface zzD(IBinder ibinder);

        public abstract String zzeq();

        public abstract String zzer();
    }

    public static interface zze
    {

        public abstract zzd zzi(Object obj);

        public abstract int zzkH();
    }

    public static final class zzf
    {
    }


    private final String mName;
    private final zzb zzPl;
    private final zze zzPm = null;
    private final zzc zzPn;
    private final zzf zzPo = null;
    private final ArrayList zzPp;

    public transient Api(String s, zzb zzb1, zzc zzc1, Scope ascope[])
    {
        zzv.zzb(zzb1, "Cannot construct an Api with a null ClientBuilder");
        zzv.zzb(zzc1, "Cannot construct an Api with a null ClientKey");
        mName = s;
        zzPl = zzb1;
        zzPn = zzc1;
        zzPp = new ArrayList(Arrays.asList(ascope));
    }

    public String getName()
    {
        return mName;
    }

    public zzb zzkC()
    {
        boolean flag;
        if (zzPl != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return zzPl;
    }

    public zze zzkD()
    {
        boolean flag;
        if (zzPm != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return zzPm;
    }

    public List zzkE()
    {
        return zzPp;
    }

    public zzc zzkF()
    {
        boolean flag;
        if (zzPn != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return zzPn;
    }

    public boolean zzkG()
    {
        return zzPo != null;
    }
}
