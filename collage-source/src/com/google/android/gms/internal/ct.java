// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ch, cr, hs, cq, 
//            cu

public class ct
    implements ch
{

    public ct()
    {
    }

    public void zza(hs hs1, Map map)
    {
        cr cr1 = zzp.zzbK();
        if (map.containsKey("abort"))
        {
            if (!cr1.a(hs1))
            {
                zzb.zzaE("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            zzb.zzaE("Precache video action is missing the src parameter.");
            return;
        }
        int i;
        try
        {
            i = Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception)
        {
            i = 0;
        }
        if (map.containsKey("mimetype"))
        {
            map = (String)map.get("mimetype");
        } else
        {
            map = "";
        }
        if (cr1.b(hs1))
        {
            zzb.zzaE("Precache task already running.");
            return;
        } else
        {
            e.a(hs1.e());
            (new cq(hs1, hs1.e().zzoF.a(hs1, i, map), s)).zzgn();
            return;
        }
    }
}
