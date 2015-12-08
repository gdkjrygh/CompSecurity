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
//            zzx, zzfa, zzgd, zzw, 
//            zzcf

public class zzv
    implements zzx
{

    private final Object zzoe = new Object();
    private final WeakHashMap zzof = new WeakHashMap();
    private final ArrayList zzog = new ArrayList();
    private final Context zzoh;
    private final VersionInfoParcel zzoi;
    private final zzcf zzoj;

    public zzv(Context context, VersionInfoParcel versioninfoparcel, zzcf zzcf)
    {
        zzoh = context.getApplicationContext();
        zzoi = versioninfoparcel;
        zzoj = zzcf;
    }

    public zzw zza(AdSizeParcel adsizeparcel, zzfa zzfa1)
    {
        return zza(adsizeparcel, zzfa1, ((View) (zzfa1.zzwz.getWebView())));
    }

    public zzw zza(AdSizeParcel adsizeparcel, zzfa zzfa1, View view)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (!zzc(zzfa1))
                {
                    break label0;
                }
                adsizeparcel = (zzw)zzof.get(zzfa1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new zzw(adsizeparcel, zzfa1, zzoi, view, zzoj);
        adsizeparcel.zza(this);
        zzof.put(zzfa1, adsizeparcel);
        zzog.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public void zza(zzw zzw1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (!zzw1.zzbl())
        {
            zzog.remove(zzw1);
            Iterator iterator = zzof.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == zzw1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        zzw1;
        obj;
        JVM INSTR monitorexit ;
        throw zzw1;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean zzc(zzfa zzfa1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzfa1 = (zzw)zzof.get(zzfa1);
        if (zzfa1 == null) goto _L2; else goto _L1
_L1:
        if (!zzfa1.zzbl()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        zzfa1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfa1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void zzd(zzfa zzfa1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzfa1 = (zzw)zzof.get(zzfa1);
        if (zzfa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzfa1.zzbj();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfa1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfa1;
    }

    public void zze(zzfa zzfa1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzfa1 = (zzw)zzof.get(zzfa1);
        if (zzfa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzfa1.stop();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfa1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfa1;
    }

    public void zzf(zzfa zzfa1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzfa1 = (zzw)zzof.get(zzfa1);
        if (zzfa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzfa1.pause();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfa1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfa1;
    }

    public void zzg(zzfa zzfa1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzfa1 = (zzw)zzof.get(zzfa1);
        if (zzfa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzfa1.resume();
        obj;
        JVM INSTR monitorexit ;
        return;
        zzfa1;
        obj;
        JVM INSTR monitorexit ;
        throw zzfa1;
    }
}
