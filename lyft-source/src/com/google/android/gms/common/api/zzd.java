// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzj;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzh, zzg, Status, Api

public class zzd
    implements zzh
{

    private final zzg a;

    public zzd(zzg zzg1)
    {
        a = zzg1;
    }

    private void a(zzg.zze zze)
    {
        a.a(zze);
        Api.Client client = a.a(zze.f());
        if (!client.b() && a.f.containsKey(zze.f()))
        {
            zze.c(new Status(17));
            return;
        } else
        {
            zze.a(client);
            return;
        }
    }

    public zza.zza a(zza.zza zza)
    {
        return b(zza);
    }

    public void a()
    {
        while (!a.b.isEmpty()) 
        {
            try
            {
                a((zzg.zze)a.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public void a(int i)
    {
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a.f();
            a.f.clear();
        } else
        {
            Iterator iterator = a.k.iterator();
            while (iterator.hasNext()) 
            {
                ((zzg.zze)iterator.next()).a(new Status(8, "The connection to Google Play services was lost"));
            }
        }
        a.a(null);
        if (!flag)
        {
            a.a.a(i);
        }
        a.a.a();
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public zza.zza b(zza.zza zza)
    {
        try
        {
            a(zza);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a(1);
            return zza;
        }
        return zza;
    }

    public void b()
    {
    }

    public void b(int i)
    {
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            a(i);
            a.b();
            return;

        case 1: // '\001'
            a.k();
            a(i);
            return;
        }
    }

    public String c()
    {
        return "CONNECTED";
    }
}
