// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzfm, zzgd

public class zzdc
{

    private final zzgd zznp;
    private final boolean zzvE;
    private final String zzvF;

    public zzdc(zzgd zzgd1, Map map)
    {
        zznp = zzgd1;
        zzvF = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            zzvE = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            zzvE = true;
            return;
        }
    }

    public void execute()
    {
        if (zznp == null)
        {
            zzb.zzan("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(zzvF))
        {
            i = zzh.zzaS().zzff();
        } else
        if ("landscape".equalsIgnoreCase(zzvF))
        {
            i = zzh.zzaS().zzfe();
        } else
        if (zzvE)
        {
            i = -1;
        } else
        {
            i = zzh.zzaS().zzfg();
        }
        zznp.setRequestedOrientation(i);
    }
}
