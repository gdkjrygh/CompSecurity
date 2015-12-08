// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzax

class zze extends zzak
{

    private static final String ID;
    private static final String zzaKp;
    private static final String zzaKq;
    private final Context zzpH;

    public zze(Context context)
    {
        super(ID, new String[] {
            zzaKq
        });
        zzpH = context;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzag.zza)map.get(zzaKq);
        if (obj == null)
        {
            return zzdf.zzzQ();
        }
        obj = zzdf.zzg(((com.google.android.gms.internal.zzag.zza) (obj)));
        map = (com.google.android.gms.internal.zzag.zza)map.get(zzaKp);
        if (map != null)
        {
            map = zzdf.zzg(map);
        } else
        {
            map = null;
        }
        map = zzax.zzf(zzpH, ((String) (obj)), map);
        if (map != null)
        {
            return zzdf.zzI(map);
        } else
        {
            return zzdf.zzzQ();
        }
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbG.toString();
        zzaKp = zzae.zzdY.toString();
        zzaKq = zzae.zzeb.toString();
    }
}
