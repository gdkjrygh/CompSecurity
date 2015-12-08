// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzw, zzgd

class a
    implements zzbs
{

    final zzw a;

    public void zza(zzgd zzgd, Map map)
    {
        while (!a.zza(map) || !map.containsKey("isVisible")) 
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
        a.zzh(Boolean.valueOf(flag).booleanValue());
    }

    (zzw zzw1)
    {
        a = zzw1;
        super();
    }
}
