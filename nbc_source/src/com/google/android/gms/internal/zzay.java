// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzha, zzid, zzaz, 
//            zzdt

public class zzay
    implements zzba
{

    private final VersionInfoParcel zzoM;
    private final Object zzqt = new Object();
    private final WeakHashMap zzqu = new WeakHashMap();
    private final ArrayList zzqv = new ArrayList();
    private final Context zzqw;
    private final zzdt zzqx;

    public zzay(Context context, VersionInfoParcel versioninfoparcel, zzdt zzdt)
    {
        zzqw = context.getApplicationContext();
        zzoM = versioninfoparcel;
        zzqx = zzdt;
    }

    public zzaz zza(AdSizeParcel adsizeparcel, zzha zzha1)
    {
        return zza(adsizeparcel, zzha1, ((View) (zzha1.zzzE.getWebView())));
    }

    public zzaz zza(AdSizeParcel adsizeparcel, zzha zzha1, View view)
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!zzf(zzha1))
                {
                    break label0;
                }
                adsizeparcel = (zzaz)zzqu.get(zzha1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new zzaz(adsizeparcel, zzha1, zzoM, view, zzqx);
        adsizeparcel.zza(this);
        zzqu.put(zzha1, adsizeparcel);
        zzqv.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzaz zzaz1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaz1.zzbZ())
        {
            zzqv.remove(zzaz1);
            Iterator iterator = zzqu.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == zzaz1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        zzaz1;
        obj;
        JVM INSTR monitorexit ;
        throw zzaz1;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean zzf(zzha zzha1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzha1 = (zzaz)zzqu.get(zzha1);
        if (zzha1 == null) goto _L2; else goto _L1
_L1:
        if (!zzha1.zzbZ()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        zzha1;
        obj;
        JVM INSTR monitorexit ;
        throw zzha1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzg(zzha zzha1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzha1 = (zzaz)zzqu.get(zzha1);
        if (zzha1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzha1.zzbX();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzha1;
        obj;
        JVM INSTR monitorexit ;
        throw zzha1;
    }

    public void zzh(zzha zzha1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzha1 = (zzaz)zzqu.get(zzha1);
        if (zzha1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzha1.stop();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzha1;
        obj;
        JVM INSTR monitorexit ;
        throw zzha1;
    }

    public void zzi(zzha zzha1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzha1 = (zzaz)zzqu.get(zzha1);
        if (zzha1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzha1.pause();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzha1;
        obj;
        JVM INSTR monitorexit ;
        throw zzha1;
    }

    public void zzj(zzha zzha1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zzha1 = (zzaz)zzqu.get(zzha1);
        if (zzha1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzha1.resume();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzha1;
        obj;
        JVM INSTR monitorexit ;
        throw zzha1;
    }
}
