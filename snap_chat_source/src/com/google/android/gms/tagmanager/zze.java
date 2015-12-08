// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzaw

class zze extends zzaj
{

    private static final String ID;
    private static final String zzaxn;
    private static final String zzaxo;
    private final Context zzlN;

    public zze(Context context)
    {
        super(ID, new String[] {
            zzaxo
        });
        zzlN = context;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaxo);
        if (obj == null)
        {
            return zzde.zzuf();
        }
        obj = zzde.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaxn);
        if (map != null)
        {
            map = zzde.zzg(map);
        } else
        {
            map = null;
        }
        map = zzaw.zzf(zzlN, ((String) (obj)), map);
        if (map != null)
        {
            return zzde.zzx(map);
        } else
        {
            return zzde.zzuf();
        }
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzY.toString();
        zzaxn = zzb.zzbW.toString();
        zzaxo = zzb.zzbZ.toString();
    }
}
