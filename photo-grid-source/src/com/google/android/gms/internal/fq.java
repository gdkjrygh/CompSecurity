// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ry, ad, w

final class fq
    implements fz
{

    fq()
    {
    }

    public final void zza(ry ry1, Map map)
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
            ry1 = ry1.m();
        }
        // Misplaced declaration of an exception variable
        catch (ry ry1)
        {
            zzb.zzaH("Could not parse touch parameters from gmsg.");
            return;
        }
        if (ry1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ry1.a().a(i, j, k);
    }
}
