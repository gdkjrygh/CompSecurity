// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzbs;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzgd;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

public static class _cls9
    implements zzbs
{

    public void zza(zzgd zzgd, Map map)
    {
        zzgd = (String)map.get("request_id");
        map = (String)map.get("errors");
        zzb.zzan((new StringBuilder()).append("Invalid request: ").append(map).toString());
        zzl.zzet().zzH(zzgd);
    }

    public _cls9()
    {
    }
}
