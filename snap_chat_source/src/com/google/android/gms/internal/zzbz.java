// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzdc

public class zzbz
    implements zzdc.zzb
{

    private boolean zzmE;
    private final Object zznh = new Object();
    private final zzhq zzqh = new zzhq();
    private final List zzqi = new ArrayList();
    private boolean zzqj;

    public zzbz()
    {
        zzqj = false;
        zzmE = false;
    }

    public void zza(Runnable runnable)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzqj)
                {
                    break label0;
                }
                zzqi.add(runnable);
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        runnable.run();
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public Future zzcc()
    {
        return zzqh;
    }

    public void zze(Bundle bundle)
    {
label0:
        {
            synchronized (zznh)
            {
                if (!zzqj)
                {
                    break label0;
                }
            }
            return;
        }
        zzqj = true;
        zzqh.zzb(bundle);
        obj;
        JVM INSTR monitorexit ;
        for (bundle = zzqi.iterator(); bundle.hasNext(); ((Runnable)bundle.next()).run()) { }
        break MISSING_BLOCK_LABEL_73;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        zzqi.clear();
        return;
    }

    public void zzl(Context context)
    {
label0:
        {
            synchronized (zznh)
            {
                if (!zzmE)
                {
                    break label0;
                }
            }
            return;
        }
        zzdc.zza(context, this);
        zzmE = true;
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }
}
