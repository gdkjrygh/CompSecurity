// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzfj, zzhx, zzfm, 
//            zzho

public class zzfl
{

    private final String zzpH;

    public zzfl(String s)
    {
        zzpH = s;
    }

    public boolean zza(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = zzab.zzaU().zze(intent);
            intent = zzab.zzaU().zzf(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(zzab.zzaU().zzL(s1)))
                {
                    zzhx.zzac("Developer payload not match.");
                    return false;
                }
                if (zzpH != null && !zzfm.zzc(zzpH, s1, intent))
                {
                    zzhx.zzac("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String zzdB()
    {
        return zzab.zzaM().zzeu();
    }
}
