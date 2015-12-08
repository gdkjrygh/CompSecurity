// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdf, zzbg, DataLayer

class i
{

    private static Map a(com.google.android.gms.internal.zzd.zza zza)
    {
        zza = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl(zza)));
        if (!(zza instanceof Map))
        {
            zzbg.zzan((new StringBuilder()).append("value: ").append(zza).append(" is not a map value, ignored.").toString());
            return null;
        } else
        {
            return (Map)zza;
        }
    }

    private static void a(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        zzd = zzd.zzgq;
        int k = zzd.length;
        for (int j = 0; j < k; j++)
        {
            datalayer.zzdF(zzdf.zzg(zzd[j]));
        }

    }

    public static void a(DataLayer datalayer, com.google.android.gms.internal.zzc.zzi zzi)
    {
        if (zzi.zzhf == null)
        {
            zzbg.zzan("supplemental missing experimentSupplemental");
            return;
        } else
        {
            a(datalayer, zzi.zzhf);
            b(datalayer, zzi.zzhf);
            c(datalayer, zzi.zzhf);
            return;
        }
    }

    private static void b(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        zzd = zzd.zzgp;
        int k = zzd.length;
        for (int j = 0; j < k; j++)
        {
            Map map = a(zzd[j]);
            if (map != null)
            {
                datalayer.push(map);
            }
        }

    }

    private static void c(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        com.google.android.gms.internal.zzc.zzc azzc[];
        int j;
        int k;
        azzc = zzd.zzgr;
        k = azzc.length;
        j = 0;
_L2:
        com.google.android.gms.internal.zzc.zzc zzc;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        zzc = azzc[j];
        if (zzc.zzgk != null)
        {
            break; /* Loop/switch isn't completed */
        }
        zzbg.zzan("GaExperimentRandom: No key");
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = datalayer.get(zzc.zzgk);
            long l;
            long l1;
            if (!(obj instanceof Number))
            {
                zzd = null;
            } else
            {
                zzd = Long.valueOf(((Number)obj).longValue());
            }
            l = zzc.zzgl;
            l1 = zzc.zzgm;
            if (!zzc.zzgn || zzd == null || zzd.longValue() < l || zzd.longValue() > l1)
            {
                if (l > l1)
                {
                    break label0;
                }
                obj = Long.valueOf(Math.round(Math.random() * (double)(l1 - l) + (double)l));
            }
            datalayer.zzdF(zzc.zzgk);
            zzd = datalayer.zzi(zzc.zzgk, obj);
            if (zzc.zzgo > 0L)
            {
                if (!zzd.containsKey("gtm"))
                {
                    zzd.put("gtm", DataLayer.mapOf(new Object[] {
                        "lifetime", Long.valueOf(zzc.zzgo)
                    }));
                } else
                {
                    Object obj1 = zzd.get("gtm");
                    if (obj1 instanceof Map)
                    {
                        ((Map)obj1).put("lifetime", Long.valueOf(zzc.zzgo));
                    } else
                    {
                        zzbg.zzan("GaExperimentRandom: gtm not a map");
                    }
                }
            }
            datalayer.push(zzd);
        }
          goto _L3
        zzbg.zzan("GaExperimentRandom: random range invalid");
          goto _L3
          goto _L3
    }
}
