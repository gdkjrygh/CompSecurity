// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzid;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

public static class _cls9
    implements zzdg
{

    public void zza(zzid zzid, Map map)
    {
        zzid = (String)map.get("request_id");
        map = (String)map.get("errors");
        zzb.zzaC((new StringBuilder()).append("Invalid request: ").append(map).toString());
        zzl.zzfz().zzV(zzid);
    }

    public _cls9()
    {
    }
}
