// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.gw;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzl

public class zzk
{

    private final String zztn;

    public zzk(String s)
    {
        zztn = s;
    }

    public boolean zza(String s, int i, Intent intent)
    {
        if (s != null && intent != null)
        {
            String s1 = zzp.zzbH().zze(intent);
            intent = zzp.zzbH().zzf(intent);
            if (s1 != null && intent != null)
            {
                if (!s.equals(zzp.zzbH().zzal(s1)))
                {
                    zzb.zzaE("Developer payload not match.");
                    return false;
                }
                if (zztn != null && !zzl.zzc(zztn, s1, intent))
                {
                    zzb.zzaE("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String zzfk()
    {
        return zzp.zzbx().c();
    }
}
