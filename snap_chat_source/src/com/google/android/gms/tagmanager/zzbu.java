// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbz, zzde, zzdd

abstract class zzbu extends zzbz
{

    public zzbu(String s)
    {
        super(s);
    }

    protected boolean zza(com.google.android.gms.internal.zzd.zza zza1, com.google.android.gms.internal.zzd.zza zza2, Map map)
    {
        zza1 = zzde.zzh(zza1);
        zza2 = zzde.zzh(zza2);
        if (zza1 == zzde.zzud() || zza2 == zzde.zzud())
        {
            return false;
        } else
        {
            return zza(((zzdd) (zza1)), ((zzdd) (zza2)), map);
        }
    }

    protected abstract boolean zza(zzdd zzdd, zzdd zzdd1, Map map);
}
