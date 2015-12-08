// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzaz, zzid

class zzqT
    implements zzdg
{

    final zzaz zzqT;

    public void zza(zzid zzid1, Map map)
    {
        if (!zzqT.zzb(map))
        {
            return;
        } else
        {
            zzqT.zza(zzid1.getWebView(), map);
            return;
        }
    }

    (zzaz zzaz1)
    {
        zzqT = zzaz1;
        super();
    }
}
