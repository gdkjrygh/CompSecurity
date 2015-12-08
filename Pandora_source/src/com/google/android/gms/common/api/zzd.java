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

    private final zzg zzPQ;

    public zzd(zzg zzg1)
    {
        zzPQ = zzg1;
    }

    private void zza(zzg.d d)
        throws DeadObjectException
    {
        zzPQ.a(d);
        Api.zza zza1 = zzPQ.zza(d.zzkF());
        if (!zza1.isConnected() && zzPQ.f.containsKey(d.zzkF()))
        {
            d.zzk(new Status(17));
            return;
        } else
        {
            d.zzb(zza1);
            return;
        }
    }

    public void begin()
    {
        while (!zzPQ.b.isEmpty()) 
        {
            try
            {
                zza((zzg.d)zzPQ.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public void connect()
    {
    }

    public String getName()
    {
        return "CONNECTED";
    }

    public void onConnected(Bundle bundle)
    {
    }

    public zza.zza zza(zza.zza zza1)
    {
        return zzb(zza1);
    }

    public void zza(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public void zzas(int i)
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
            zzPQ.a();
            zzPQ.f.clear();
        } else
        {
            Iterator iterator = zzPQ.k.iterator();
            while (iterator.hasNext()) 
            {
                ((zzg.d)iterator.next()).forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"));
            }
        }
        zzPQ.a(null);
        if (!flag)
        {
            zzPQ.a.zzaP(i);
        }
        zzPQ.a.zzmf();
    }

    public zza.zza zzb(zza.zza zza1)
    {
        try
        {
            zza(zza1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            zzas(1);
            return zza1;
        }
        return zza1;
    }
}
