// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbo, zzcc, zzcb, zzgd

public class zzce extends zzbo
{

    public zzce()
    {
    }

    public void zzb(zzgd zzgd, Map map)
    {
        zzcc zzcc1 = zzh.zzbb();
        if (map.containsKey("abort"))
        {
            if (!zzcc1.zza(zzgd))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzan("Precache abort but no preload task running.");
            }
            return;
        }
        map = (String)map.get("src");
        if (map == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Precache video action is missing the src parameter.");
            return;
        }
        if (zzcc1.zzb(zzgd))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Precache task already running.");
            return;
        } else
        {
            (new zzcb(zzgd, map)).zzeW();
            return;
        }
    }
}
