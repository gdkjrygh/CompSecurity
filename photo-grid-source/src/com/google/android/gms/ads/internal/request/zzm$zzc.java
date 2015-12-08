// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.ry;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

public class _cls9
    implements fz
{

    public void zza(ry ry, Map map)
    {
        ry = (String)map.get("request_id");
        map = (String)map.get("errors");
        zzb.zzaH((new StringBuilder("Invalid request: ")).append(map).toString());
        zzm.a().b(ry);
    }

    public _cls9()
    {
    }
}
