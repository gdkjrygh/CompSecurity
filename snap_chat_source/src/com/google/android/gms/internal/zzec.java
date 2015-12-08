// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzab, zzhp, zzic

public class zzec
{

    private final zzic zzmu;
    private final boolean zztv;
    private final String zztw;

    public zzec(zzic zzic1, Map map)
    {
        zzmu = zzic1;
        zztw = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            zztv = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            zztv = true;
            return;
        }
    }

    public void execute()
    {
        if (zzmu == null)
        {
            zzhx.zzac("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(zztw))
        {
            i = zzab.zzaO().zzey();
        } else
        if ("landscape".equalsIgnoreCase(zztw))
        {
            i = zzab.zzaO().zzex();
        } else
        if (zztv)
        {
            i = -1;
        } else
        {
            i = zzab.zzaO().zzez();
        }
        zzmu.setRequestedOrientation(i);
    }
}
