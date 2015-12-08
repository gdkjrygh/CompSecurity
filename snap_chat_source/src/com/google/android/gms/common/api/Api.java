// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        public abstract void zza(zzq zzq);

        public abstract void zzb(zzq zzq);

        public abstract boolean zzhc();
    }

    public static interface zzb
    {

        public abstract int getPriority();

        public abstract zza zza(Context context, Looper looper, zzf zzf, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);
    }

    public static final class zzc
    {

        public zzc()
        {
        }
    }


    private final zzb zzLS;
    private final zzc zzLT;
    private final ArrayList zzLU;

    public transient Api(zzb zzb1, zzc zzc1, Scope ascope[])
    {
        zzLS = zzb1;
        zzLT = zzc1;
        zzLU = new ArrayList(Arrays.asList(ascope));
    }

    public final zzb zzhT()
    {
        return zzLS;
    }

    public final List zzhU()
    {
        return zzLU;
    }

    public final zzc zzhV()
    {
        return zzLT;
    }
}
