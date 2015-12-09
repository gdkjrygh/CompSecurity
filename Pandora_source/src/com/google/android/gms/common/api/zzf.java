// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, zzg, Api

public class zzf
    implements zzh
{

    private final zzg zzPQ;

    public zzf(zzg zzg1)
    {
        zzPQ = zzg1;
    }

    public void begin()
    {
        zzPQ.b();
    }

    public void connect()
    {
        zzPQ.c();
    }

    public String getName()
    {
        return "DISCONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public zza.zza zza(zza.zza zza1)
    {
        zzPQ.b.add(zza1);
        return zza1;
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public void zzas(int i)
    {
        if (i == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            for (Iterator iterator = zzPQ.b.iterator(); iterator.hasNext(); ((zzg.d)iterator.next()).cancel()) { }
            zzPQ.b.clear();
            zzPQ.a();
            zzPQ.f.clear();
        }
    }

    public zza.zza zzb(zza.zza zza1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
