// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            by, zzdf, DataLayer

class cr extends by
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final DataLayer d;

    public cr(DataLayer datalayer)
    {
        super(a, new String[] {
            b
        });
        d = datalayer;
    }

    private void a(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzdf.zzxQ())
        {
            if ((zza1 = zzdf.zzg(zza1)) != zzdf.zzxV())
            {
                d.zzdF(zza1);
                return;
            }
        }
    }

    private void b(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzdf.zzxQ())
        {
            if ((zza1 = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl(zza1)))) instanceof List)
            {
                zza1 = ((List)zza1).iterator();
                while (zza1.hasNext()) 
                {
                    Object obj = zza1.next();
                    if (obj instanceof Map)
                    {
                        obj = (Map)obj;
                        d.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void zzF(Map map)
    {
        b((com.google.android.gms.internal.zzd.zza)map.get(b));
        a((com.google.android.gms.internal.zzd.zza)map.get(c));
    }

    static 
    {
        a = zza.zzah.toString();
        b = zzb.zzfU.toString();
        c = zzb.zzcl.toString();
    }
}
