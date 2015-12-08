// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, rb, ry

final class fx
    implements fz
{

    fx()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            zzb.zzaH("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new rb(ry1.getContext(), ry1.n().zzJu, map)).zzgz();
            return;
        }
    }
}
