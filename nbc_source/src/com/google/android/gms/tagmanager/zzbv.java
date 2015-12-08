// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzca, zzdf, zzde

abstract class zzbv extends zzca
{

    public zzbv(String s)
    {
        super(s);
    }

    protected boolean zza(com.google.android.gms.internal.zzag.zza zza1, com.google.android.gms.internal.zzag.zza zza2, Map map)
    {
        zza1 = zzdf.zzh(zza1);
        zza2 = zzdf.zzh(zza2);
        if (zza1 == zzdf.zzzO() || zza2 == zzdf.zzzO())
        {
            return false;
        } else
        {
            return zza(((zzde) (zza1)), ((zzde) (zza2)), map);
        }
    }

    protected abstract boolean zza(zzde zzde, zzde zzde1, Map map);
}
