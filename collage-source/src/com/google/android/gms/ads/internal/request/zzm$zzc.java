// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.hs;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

public static class _cls9
    implements ch
{

    public void zza(hs hs, Map map)
    {
        hs = (String)map.get("request_id");
        map = (String)map.get("errors");
        zzb.zzaE((new StringBuilder()).append("Invalid request: ").append(map).toString());
        zzm.zzfD().b(hs);
    }

    public _cls9()
    {
    }
}
