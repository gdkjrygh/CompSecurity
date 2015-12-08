// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzaf, zzic

class zznI
    implements zzcv
{

    final zzaf zznI;

    public void zza(zzic zzic, Map map)
    {
        while (!zznI.zza(map) || !map.containsKey("isVisible")) 
        {
            return;
        }
        boolean flag;
        if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zznI.zzg(Boolean.valueOf(flag).booleanValue());
    }

    (zzaf zzaf1)
    {
        zznI = zzaf1;
        super();
    }
}
