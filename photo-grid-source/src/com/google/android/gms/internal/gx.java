// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.g;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, gs, ry, gq, 
//            gy

public final class gx
    implements fz
{

    public gx()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        zzp.zzbI();
        if (map.containsKey("abort"))
        {
            if (!gs.a(ry1))
            {
                zzb.zzaH("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            zzb.zzaH("Precache video action is missing the src parameter.");
            return;
        }
        try
        {
            Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception) { }
        if (map.containsKey("mimetype"))
        {
            map.get("mimetype");
        }
        if (gs.b(ry1))
        {
            zzb.zzaH("Precache task already running.");
            return;
        } else
        {
            g.a(ry1.g());
            (new gq(ry1, ry1.g().zzoG.a(ry1), s)).zzgz();
            return;
        }
    }
}
