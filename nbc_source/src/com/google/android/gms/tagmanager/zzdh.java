// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzdh extends zzak
{

    private static final String ID;
    private static final String zzaLE;

    public zzdh()
    {
        super(ID, new String[] {
            zzaLE
        });
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        return zzdf.zzI(zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaLE)).toUpperCase());
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbR.toString();
        zzaLE = zzae.zzdw.toString();
    }
}
