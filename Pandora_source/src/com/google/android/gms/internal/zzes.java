// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzgd, zzfx, zzbs, 
//            e, zzfg

public final class zzes
{

    private String zzAu;
    private String zzAv;
    private zzfs zzAw;
    zzfx zzAx;
    public final zzbs zzAy = new zzbs() {

        final zzes a;

        public void zza(zzgd zzgd1, Map map)
        {
label0:
            {
                synchronized (zzes.zza(a))
                {
                    if (!com.google.android.gms.internal.zzes.zzb(a).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            if (zzes.zzc(a).equals(map.get("request_id")))
            {
                break MISSING_BLOCK_LABEL_55;
            }
            zzgd1;
            JVM INSTR monitorexit ;
            return;
            map;
            zzgd1;
            JVM INSTR monitorexit ;
            throw map;
            map = new e(1, map);
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Invalid ").append(map.e()).append(" request error: ").append(map.b()).toString());
            com.google.android.gms.internal.zzes.zzb(a).zzc(map);
            zzgd1;
            JVM INSTR monitorexit ;
        }

            
            {
                a = zzes.this;
                super();
            }
    };
    public final zzbs zzAz = new zzbs() {

        final zzes a;

        public void zza(zzgd zzgd1, Map map)
        {
label0:
            {
                synchronized (zzes.zza(a))
                {
                    if (!com.google.android.gms.internal.zzes.zzb(a).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            e e1;
            e1 = new e(-2, map);
            if (zzes.zzc(a).equals(e1.g()))
            {
                break MISSING_BLOCK_LABEL_100;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append(e1.g()).append(" ==== ").append(zzes.zzc(a)).toString());
            obj;
            JVM INSTR monitorexit ;
            return;
            zzgd1;
            obj;
            JVM INSTR monitorexit ;
            throw zzgd1;
            String s2 = e1.d();
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzan("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                zzgd1 = s2.replaceAll("%40mediation_adapters%40", zzfg.zza(zzgd1.getContext(), (String)map.get("check_adapters"), zzes.zzd(a)));
                e1.a(zzgd1);
                com.google.android.gms.ads.internal.util.client.zzb.zzam((new StringBuilder()).append("Ad request URL modified to ").append(zzgd1).toString());
            }
            com.google.android.gms.internal.zzes.zzb(a).zzc(e1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                a = zzes.this;
                super();
            }
    };
    zzgd zznp;
    private final Object zzoe = new Object();

    public zzes(String s, String s1)
    {
        zzAw = new zzfs();
        zzAv = s1;
        zzAu = s;
    }

    static Object zza(zzes zzes1)
    {
        return zzes1.zzoe;
    }

    static zzfs zzb(zzes zzes1)
    {
        return zzes1.zzAw;
    }

    static String zzc(zzes zzes1)
    {
        return zzes1.zzAu;
    }

    static String zzd(zzes zzes1)
    {
        return zzes1.zzAv;
    }

    public void zzd(zzgd zzgd1)
    {
        zznp = zzgd1;
    }

    public void zze(zzfx zzfx)
    {
        zzAx = zzfx;
    }

    public zzfx zzex()
    {
        return zzAx;
    }

    public Future zzey()
    {
        return zzAw;
    }

    public void zzez()
    {
        if (zznp != null)
        {
            zznp.destroy();
            zznp = null;
        }
    }
}
