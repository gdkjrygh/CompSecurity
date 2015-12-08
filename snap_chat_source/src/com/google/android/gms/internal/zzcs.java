// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzhx, zzct, zzic

public final class zzcs
    implements zzcv
{

    private final zzct zzry;

    public zzcs(zzct zzct1)
    {
        zzry = zzct1;
    }

    public final void zza(zzic zzic, Map map)
    {
        zzic = (String)map.get("name");
        if (zzic == null)
        {
            zzhx.zzac("App event with no name parameter.");
            return;
        } else
        {
            zzry.onAppEvent(zzic, (String)map.get("info"));
            return;
        }
    }
}
