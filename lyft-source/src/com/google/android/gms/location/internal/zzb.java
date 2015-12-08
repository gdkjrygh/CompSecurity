// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg

public class zzb extends zzi
{

    protected final zzn d = new zzn() {

        final zzb a;

        public void a()
        {
            zzb.a(a);
        }

        public zzg b()
        {
            return (zzg)a.m();
        }

        public IInterface c()
        {
            return b();
        }

            
            {
                a = zzb.this;
                super();
            }
    };
    private final String e;

    public zzb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze)
    {
        super(context, looper, 23, connectioncallbacks, onconnectionfailedlistener, zze);
        e = s;
    }

    static void a(zzb zzb1)
    {
        zzb1.l();
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected zzg b(IBinder ibinder)
    {
        return zzg.zza.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String e()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle k()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", e);
        return bundle;
    }
}
