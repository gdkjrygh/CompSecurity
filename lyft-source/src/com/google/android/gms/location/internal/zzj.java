// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.zzb;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzb, zzi, zzg

public class zzj extends com.google.android.gms.location.internal.zzb
{

    private final zzi e;
    private final zzb f;

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze1)
    {
        this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zze1, CopresenceApiOptions.a);
    }

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze1, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zze1);
        e = new zzi(context, d);
        f = zzb.a(context, zze1.a(), zze1.g(), d, copresenceapioptions);
    }

    public void a()
    {
        zzi zzi1 = e;
        zzi1;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        e.b();
        e.c();
_L1:
        super.a();
        zzi1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        zzi1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(LocationListener locationlistener)
    {
        e.a(locationlistener);
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        synchronized (e)
        {
            e.a(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        zzi1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void a(LocationSettingsRequest locationsettingsrequest, com.google.android.gms.common.api.zza.zzb zzb1, String s)
    {
        boolean flag1 = true;
        l();
        boolean flag;
        if (locationsettingsrequest != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "locationSettingsRequest can't be null nor empty.");
        if (zzb1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "listener can't be null.");
        zzb1 = new zzd(zzb1);
        ((zzg)m()).a(locationsettingsrequest, zzb1, s);
    }

    public boolean o()
    {
        return true;
    }

    public Location p()
    {
        return e.a();
    }

    private class zzd extends zzh.zza
    {

        private com.google.android.gms.common.api.zza.zzb a;

        public void a(LocationSettingsResult locationsettingsresult)
        {
            a.a(locationsettingsresult);
            a = null;
        }

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            boolean flag;
            if (zzb1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.b(flag, "listener can't be null.");
            a = zzb1;
        }
    }

}
