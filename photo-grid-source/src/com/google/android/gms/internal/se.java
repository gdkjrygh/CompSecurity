// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fz, zzja, ry

final class se
    implements fz
{

    final zzja a;

    private se(zzja zzja1)
    {
        a = zzja1;
        super();
    }

    se(zzja zzja1, byte byte0)
    {
        this(zzja1);
    }

    public final void zza(ry ry, Map map)
    {
        if (map.keySet().contains("start"))
        {
            zzja.zza(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                zzja.zzb(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                zzja.zzc(a);
                return;
            }
        }
    }
}
