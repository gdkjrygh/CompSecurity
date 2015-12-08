// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;

// Referenced classes of package com.google.android.gms.internal:
//            zzfy, zzic, zzba, zzfz, 
//            zzhw, zzhx, zzgq, zzid

public class zzga extends zzfy
{

    zzga(Context context, zzhe.zza zza, zzic zzic1, zzgc.zza zza1)
    {
        super(context, zza, zzic1, zza1);
    }

    protected void zzg(long l)
    {
        Object obj = zzmu.zzad();
        int i;
        int j;
        if (((zzba) (obj)).zzpb)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((zzba) (obj)).widthPixels;
            i = ((zzba) (obj)).heightPixels;
        }
        obj = new zzfz(this, zzmu, j, i);
        zzhw.zzzG.post(new Runnable(((zzfz) (obj))) {

            final zzfz zzvJ;
            final zzga zzvK;

            public void run()
            {
label0:
                {
                    synchronized (zzvK.zznh)
                    {
                        if (zzvK.zzvO.errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzvK.zzmu.zzeG().zza(zzvK);
                zzvJ.zza(zzvK.zzvO);
                obj1;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzvK = zzga.this;
                zzvJ = zzfz1;
                super();
            }
        });
        zzf(l);
        if (((zzfz) (obj)).zzdE())
        {
            zzhx.zzY("Ad-Network indicated no fill with passback URL.");
            throw new zzgb.zza("AdNetwork sent passback url", 3);
        }
        if (!((zzfz) (obj)).zzdF())
        {
            throw new zzgb.zza("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }
}
