// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf, DataLayer

class cp extends j
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final DataLayer d;

    public cp(DataLayer datalayer)
    {
        super(a, new String[] {
            b
        });
        d = datalayer;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = d.get(zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(b)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.zzd.zza)map.get(c);
            if (map != null)
            {
                return map;
            } else
            {
                return zzdf.zzxW();
            }
        } else
        {
            return zzdf.zzE(obj);
        }
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzC.toString();
        b = zzb.zzeg.toString();
        c = zzb.zzcR.toString();
    }
}
