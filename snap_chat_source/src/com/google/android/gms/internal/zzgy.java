// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzic, zzcv, zzia, 
//            zzha, zzhx, zzhk

public final class zzgy
{

    zzic zzmu;
    private final Object zznh = new Object();
    public final zzcv zzxA = new zzcv() {

        final zzgy zzxB;

        public void zza(zzic zzic1, Map map)
        {
label0:
            {
                synchronized (zzgy.zza(zzxB))
                {
                    if (!zzgy.zzb(zzxB).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            zzha zzha1;
            zzha1 = new zzha(-2, map);
            if (zzgy.zzc(zzxB).equals(zzha1.getRequestId()))
            {
                break MISSING_BLOCK_LABEL_100;
            }
            zzhx.zzac((new StringBuilder()).append(zzha1.getRequestId()).append(" ==== ").append(zzgy.zzc(zzxB)).toString());
            obj;
            JVM INSTR monitorexit ;
            return;
            zzic1;
            obj;
            JVM INSTR monitorexit ;
            throw zzic1;
            String s2 = zzha1.getUrl();
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            zzhx.zzac("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                zzic1 = s2.replaceAll("%40mediation_adapters%40", zzhk.zza(zzic1.getContext(), (String)map.get("check_adapters"), zzgy.zzd(zzxB)));
                zzha1.setUrl(zzic1);
                zzhx.zzab((new StringBuilder("Ad request URL modified to ")).append(zzic1).toString());
            }
            zzgy.zzb(zzxB).zzb(zzha1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                zzxB = zzgy.this;
                super();
            }
    };
    private String zzxv;
    private String zzxw;
    private zzhq zzxx;
    zzia zzxy;
    public final zzcv zzxz = new zzcv() {

        final zzgy zzxB;

        public void zza(zzic zzic1, Map map)
        {
label0:
            {
                synchronized (zzgy.zza(zzxB))
                {
                    if (!zzgy.zzb(zzxB).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (zzgy.zzc(zzxB).equals(map.get("request_id")))
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzic1;
            JVM INSTR monitorexit ;
            return;
            map;
            zzic1;
            JVM INSTR monitorexit ;
            throw map;
            map = new zzha(1, map);
            zzhx.zzac((new StringBuilder("Invalid ")).append(map.getType()).append(" request error: ").append(map.zzdU()).toString());
            zzgy.zzb(zzxB).zzb(map);
            zzic1;
            JVM INSTR monitorexit ;
        }

            
            {
                zzxB = zzgy.this;
                super();
            }
    };

    public zzgy(String s, String s1)
    {
        zzxx = new zzhq();
        zzxw = s1;
        zzxv = s;
    }

    static Object zza(zzgy zzgy1)
    {
        return zzgy1.zznh;
    }

    static zzhq zzb(zzgy zzgy1)
    {
        return zzgy1.zzxx;
    }

    static String zzc(zzgy zzgy1)
    {
        return zzgy1.zzxv;
    }

    static String zzd(zzgy zzgy1)
    {
        return zzgy1.zzxw;
    }

    public final void zza(zzic zzic1)
    {
        zzmu = zzic1;
    }

    public final zzia zzdR()
    {
        return zzxy;
    }

    public final Future zzdS()
    {
        return zzxx;
    }

    public final void zzdT()
    {
        if (zzmu != null)
        {
            zzmu.destroy();
            zzmu = null;
        }
    }

    public final void zze(zzia zzia)
    {
        zzxy = zzia;
    }
}
