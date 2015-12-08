// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde

class zzbh extends zzaj
{

    private static final String ID;
    private static final String zzayC;

    public zzbh()
    {
        super(ID, new String[] {
            zzayC
        });
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        return zzde.zzx(zzde.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzayC)).toLowerCase());
    }

    public boolean zzsD()
    {
        return true;
    }

    static 
    {
        ID = zza.zzai.toString();
        zzayC = zzb.zzbw.toString();
    }
}
