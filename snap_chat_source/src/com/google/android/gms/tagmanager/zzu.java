// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, DataLayer

class zzu extends zzaj
{

    private static final String ID;
    private static final String NAME;
    private static final String zzaym;
    private final DataLayer zzaxx;

    public zzu(DataLayer datalayer)
    {
        super(ID, new String[] {
            NAME
        });
        zzaxx = datalayer;
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj = zzaxx.get(zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(NAME)));
        if (obj == null)
        {
            map = (com.google.android.gms.internal.zzd.zza)map.get(zzaym);
            if (map != null)
            {
                return map;
            } else
            {
                return zzde.zzuf();
            }
        } else
        {
            return zzde.zzx(obj);
        }
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = zza.zzC.toString();
        NAME = zzb.zzdB.toString();
        zzaym = zzb.zzcr.toString();
    }
}
