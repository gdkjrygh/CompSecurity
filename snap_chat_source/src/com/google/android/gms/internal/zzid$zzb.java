// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzid, zzic

class <init>
    implements zzcv
{

    final zzid zzzZ;

    public void zza(zzic zzic, Map map)
    {
        if (map.keySet().contains("start"))
        {
            zzid.zza(zzzZ);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                zzid.zzb(zzzZ);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                zzid.zzc(zzzZ);
                return;
            }
        }
    }

    private (zzid zzid1)
    {
        zzzZ = zzid1;
        super();
    }

    zzzZ(zzid zzid1, zzzZ zzzz)
    {
        this(zzid1);
    }
}
