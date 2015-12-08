// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzaf, zzad, zzhx, 
//            zzic

class zznI
    implements zzcv
{

    final zzaf zznI;

    public void zza(zzic zzic, Map map)
    {
        if (!zznI.zza(map))
        {
            return;
        } else
        {
            zzhx.zzY((new StringBuilder("Received request to untrack: ")).append(zzaf.zzb(zznI).zzaZ()).toString());
            zznI.destroy();
            return;
        }
    }

    (zzaf zzaf1)
    {
        zznI = zzaf1;
        super();
    }
}
