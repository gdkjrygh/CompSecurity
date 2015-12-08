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
//            zzdc, zzde, DataLayer

class zzw extends zzdc
{

    private static final String ID;
    private static final String VALUE;
    private static final String zzayx;
    private final DataLayer zzaxx;

    public zzw(DataLayer datalayer)
    {
        super(ID, new String[] {
            VALUE
        });
        zzaxx = datalayer;
    }

    private void zza(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzde.zztZ())
        {
            if ((zza1 = zzde.zzg(zza1)) != zzde.zzue())
            {
                zzaxx.zzcU(zza1);
                return;
            }
        }
    }

    private void zzb(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 != null && zza1 != zzde.zztZ())
        {
            if ((zza1 = ((com.google.android.gms.internal.zzd.zza) (zzde.zzl(zza1)))) instanceof List)
            {
                zza1 = ((List)zza1).iterator();
                while (zza1.hasNext()) 
                {
                    Object obj = zza1.next();
                    if (obj instanceof Map)
                    {
                        obj = (Map)obj;
                        zzaxx.push(((Map) (obj)));
                    }
                }
            }
        }
    }

    public void zzJ(Map map)
    {
        zzb((com.google.android.gms.internal.zzd.zza)map.get(VALUE));
        zza((com.google.android.gms.internal.zzd.zza)map.get(zzayx));
    }

    static 
    {
        ID = zza.zzah.toString();
        VALUE = zzb.zzff.toString();
        zzayx = zzb.zzbS.toString();
    }
}
