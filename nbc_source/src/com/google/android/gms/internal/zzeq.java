// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhm, zzid

public class zzeq
{

    private final zzid zzoA;
    private final boolean zzyJ;
    private final String zzyK;

    public zzeq(zzid zzid1, Map map)
    {
        zzoA = zzid1;
        zzyK = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            zzyJ = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            zzyJ = true;
            return;
        }
    }

    public void execute()
    {
        if (zzoA == null)
        {
            zzb.zzaC("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(zzyK))
        {
            i = zzo.zzbx().zzgr();
        } else
        if ("landscape".equalsIgnoreCase(zzyK))
        {
            i = zzo.zzbx().zzgq();
        } else
        if (zzyJ)
        {
            i = -1;
        } else
        {
            i = zzo.zzbx().zzgs();
        }
        zzoA.setRequestedOrientation(i);
    }
}
