// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            zzfy, zzhw, zzic, zzgq, 
//            zzid, zzhx, zzab, zzho

public class zzgd extends zzfy
{

    zzgd(Context context, zzhe.zza zza, zzic zzic, zzgc.zza zza1)
    {
        super(context, zza, zzic, zza1);
    }

    protected void zzdG()
    {
    }

    protected void zzg(long l)
    {
        zzhw.zzzG.post(new Runnable() {

            final zzgd zzvS;

            public void run()
            {
label0:
                {
                    synchronized (zzvS.zznh)
                    {
                        if (zzvS.zzvO.errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzvS.zzmu.zzeG().zza(zzvS);
                zzvS.zzdG();
                zzhx.zzab("Loading HTML in WebView.");
                zzvS.zzmu.loadDataWithBaseURL(zzab.zzaM().zzS(zzvS.zzvO.zzus), zzvS.zzvO.zzwG, "text/html", "UTF-8", null);
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzvS = zzgd.this;
                super();
            }
        });
        zzf(l);
    }
}
