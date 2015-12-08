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

class zzav extends zzaj
{

    private static final String ID;
    private static final String zzaxn;
    private final Context zzlN;

    public zzav(Context context)
    {
        super(ID, new String[0]);
        zzlN = context;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        if ((com.google.android.gms.internal.zzd.zza)map.get(zzaxn) != null)
        {
            map = zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaxn));
        } else
        {
            map = null;
        }
        map = zzaw.zzi(zzlN, map);
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
        ID = zza.zzad.toString();
        zzaxn = zzb.zzbW.toString();
    }
}
