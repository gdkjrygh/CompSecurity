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

    private final zzg a;

    public zzf(zzg zzg1)
    {
        a = zzg1;
    }

    public zza.zza a(zza.zza zza)
    {
        a.b.add(zza);
        return zza;
    }

    public void a()
    {
        a.g();
    }

    public void a(int i)
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
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((zzg.zze)iterator.next()).c()) { }
            a.b.clear();
            a.f();
            a.f.clear();
        }
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public zza.zza b(zza.zza zza)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void b()
    {
        a.h();
    }

    public void b(int i)
    {
    }

    public String c()
    {
        return "DISCONNECTED";
    }
}
