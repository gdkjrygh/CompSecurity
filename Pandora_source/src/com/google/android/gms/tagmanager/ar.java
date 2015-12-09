// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzca, zzdf, bz

abstract class ar extends zzca
{

    public ar(String s)
    {
        super(s);
    }

    protected abstract boolean a(bz bz, bz bz1, Map map);

    protected boolean zza(com.google.android.gms.internal.zzd.zza zza1, com.google.android.gms.internal.zzd.zza zza2, Map map)
    {
        zza1 = zzdf.zzh(zza1);
        zza2 = zzdf.zzh(zza2);
        if (zza1 == zzdf.zzxU() || zza2 == zzdf.zzxU())
        {
            return false;
        } else
        {
            return a(zza1, zza2, map);
        }
    }
}
