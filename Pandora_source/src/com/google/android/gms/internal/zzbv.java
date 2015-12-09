// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbw, zzgd

public class zzbv
    implements zzbs
{

    private final zzbw zztF;

    public zzbv(zzbw zzbw1)
    {
        zztF = zzbw1;
    }

    public void zza(zzgd zzgd, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        zztF.zzd(flag);
    }
}
