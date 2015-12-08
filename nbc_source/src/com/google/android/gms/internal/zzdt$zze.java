// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzhy, zzdt, zzbb, zzhl

public static class zzxi extends zzhy
{

    private final Object zzqt = new Object();
    private client.zzb.zzaB zzwQ;
    private boolean zzxh;
    private int zzxi;

    static zzxi zza(zzxi zzxi1)
    {
        return zzxi1.zzwQ;
    }

    public zzwQ zzdV()
    {
        zzwQ zzwq = new <init>(this);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        zza(new zzhx.zzc(zzwq) {

            final zzdt.zzd zzxj;
            final zzdt.zze zzxk;

            public void zza(zzbb zzbb1)
            {
                zzb.zzaB("Getting a new session for JS Engine.");
                zzxj.zzg(zzbb1.zzce());
            }

            public void zzc(Object obj1)
            {
                zza((zzbb)obj1);
            }

            
            {
                zzxk = zzdt.zze.this;
                zzxj = zzd;
                super();
            }
        }, new zzhx.zza(zzwq) {

            final zzdt.zzd zzxj;
            final zzdt.zze zzxk;

            public void run()
            {
                zzb.zzaB("Rejecting reference for JS Engine.");
                zzxj.reject();
            }

            
            {
                zzxk = zzdt.zze.this;
                zzxj = zzd;
                super();
            }
        });
        Exception exception;
        boolean flag;
        if (zzxi >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzxi = zzxi + 1;
        obj;
        JVM INSTR monitorexit ;
        return zzwq;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzdW()
    {
        boolean flag = true;
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (zzxi < 1)
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzb.zzaB("Releasing 1 reference for JS Engine");
        zzxi = zzxi - 1;
        zzdY();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzdX()
    {
        boolean flag = true;
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (zzxi < 0)
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzb.zzaB("Releasing root reference. JS Engine will be destroyed once other references are released.");
        zzxh = true;
        zzdY();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzdY()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzxi >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        if (!zzxh || zzxi != 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        zzb.zzaB("No reference is left (including root). Cleaning up engine.");
        zza(new zzhx.zzc() {

            final zzdt.zze zzxk;

            public void zza(zzbb zzbb1)
            {
                zzhl.runOnUiThread(new Runnable(this, zzbb1) {

                    final zzbb zzra;
                    final _cls3 zzxl;

                    public void run()
                    {
                        zzdt.zze.zza(zzxl.zzxk).zzc(zzra);
                        zzra.destroy();
                    }

            
            {
                zzxl = _pcls3;
                zzra = zzbb1;
                super();
            }
                });
            }

            public void zzc(Object obj1)
            {
                zza((zzbb)obj1);
            }

            
            {
                zzxk = zzdt.zze.this;
                super();
            }
        }, new <init>());
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzb.zzaB("There are still references to the engine. Not destroying.");
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public _cls3.zzxk(_cls3.zzxk zzxk)
    {
        zzwQ = zzxk;
        zzxh = false;
        zzxi = 0;
    }
}
