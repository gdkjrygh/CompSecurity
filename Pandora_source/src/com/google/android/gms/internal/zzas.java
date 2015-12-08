// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzar

public class zzas
{

    private boolean zznz;
    private final Object zzoe = new Object();
    private SharedPreferences zzrf;

    public zzas()
    {
        zznz = false;
        zzrf = null;
    }

    public Object zzb(zzap zzap1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zznz)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        zzap1 = ((zzap) (zzap1.zzcd()));
        return zzap1;
        obj;
        JVM INSTR monitorexit ;
        return zzap1.zza(zzrf);
        zzap1;
        obj;
        JVM INSTR monitorexit ;
        throw zzap1;
    }

    public void zzo(Context context)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (!zznz)
                {
                    break label0;
                }
            }
            return;
        }
        context = GooglePlayServicesUtil.getRemoteContext(context);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        zzrf = zzh.zzaW().zzn(context);
        zznz = true;
        obj;
        JVM INSTR monitorexit ;
    }
}
