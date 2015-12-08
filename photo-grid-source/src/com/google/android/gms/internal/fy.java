// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ry

final class fy
    implements fz
{

    fy()
    {
    }

    public final void zza(ry ry, Map map)
    {
        zzb.zzaG((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
    }
}
