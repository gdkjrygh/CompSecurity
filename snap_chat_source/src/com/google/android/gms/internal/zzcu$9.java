// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcu, zzic, zzk, 
//            zzg, zzhx

static final class 
    implements zzcv
{

    public final void zza(zzic zzic1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        map = (String)map.get("td");
        int i;
        int j;
        int k;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            k = Integer.parseInt(map);
            zzic1 = zzic1.zzeI();
        }
        // Misplaced declaration of an exception variable
        catch (zzic zzic1)
        {
            zzhx.zzac("Could not parse touch parameters from gmsg.");
            return;
        }
        if (zzic1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        zzic1.zzC().zza(i, j, k);
    }

    ()
    {
    }
}
