// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzag, zzhe, zzic, zzaf, 
//            zzhy, zzdf, zzba

public class zzae
    implements zzag
{

    private final Object zznh = new Object();
    private final WeakHashMap zzni = new WeakHashMap();
    private final ArrayList zznj = new ArrayList();
    private final Context zznk;
    private final zzhy zznl;
    private final zzdf zznm;

    public zzae(Context context, zzhy zzhy, zzdf zzdf)
    {
        zznk = context.getApplicationContext();
        zznl = zzhy;
        zznm = zzdf;
    }

    public zzaf zza(zzba zzba, zzhe zzhe1)
    {
        return zza(zzba, zzhe1, ((View) (zzhe1.zzuq.getWebView())));
    }

    public zzaf zza(zzba zzba, zzhe zzhe1, View view)
    {
label0:
        {
            synchronized (zznh)
            {
                if (!zzc(zzhe1))
                {
                    break label0;
                }
                zzba = (zzaf)zzni.get(zzhe1);
            }
            return zzba;
        }
        zzba = new zzaf(zzba, zzhe1, zznl, view, zznm);
        zzba.zza(this);
        zzni.put(zzhe1, zzba);
        zznj.add(zzba);
        obj;
        JVM INSTR monitorexit ;
        return zzba;
        zzba;
        obj;
        JVM INSTR monitorexit ;
        throw zzba;
    }

    public void zza(zzaf zzaf1)
    {
        synchronized (zznh)
        {
            if (!zzaf1.zzbf())
            {
                zznj.remove(zzaf1);
            }
        }
        return;
        zzaf1;
        obj;
        JVM INSTR monitorexit ;
        throw zzaf1;
    }

    public boolean zzc(zzhe zzhe1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzhe1 = (zzaf)zzni.get(zzhe1);
        if (zzhe1 == null) goto _L2; else goto _L1
_L1:
        if (!zzhe1.zzbf()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        zzhe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhe1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzd(zzhe zzhe1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzhe1 = (zzaf)zzni.get(zzhe1);
        if (zzhe1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhe1.zzbd();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhe1;
    }

    public void zze(zzhe zzhe1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzhe1 = (zzaf)zzni.get(zzhe1);
        if (zzhe1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhe1.stop();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhe1;
    }

    public void zzf(zzhe zzhe1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzhe1 = (zzaf)zzni.get(zzhe1);
        if (zzhe1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhe1.pause();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhe1;
    }

    public void zzg(zzhe zzhe1)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        zzhe1 = (zzaf)zzni.get(zzhe1);
        if (zzhe1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzhe1.resume();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzhe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzhe1;
    }
}
