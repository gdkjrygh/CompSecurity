// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.qa;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzl

public class zzk
{

    private final String a;

    public zzk(String s)
    {
        a = s;
    }

    public boolean zza(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = zzp.zzbF().zze(intent);
            intent = zzp.zzbF().zzf(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(zzp.zzbF().zzao(s1)))
                {
                    zzb.zzaH("Developer payload not match.");
                    return false;
                }
                if (a != null && !zzl.zzc(a, s1, intent))
                {
                    zzb.zzaH("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String zzfq()
    {
        zzp.zzbv();
        return qa.b();
    }
}
