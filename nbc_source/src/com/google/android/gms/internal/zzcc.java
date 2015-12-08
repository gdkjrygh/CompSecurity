// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzcb, zzca

public class zzcc
{

    private boolean zzuy;

    public zzcc()
    {
        zzuy = false;
    }

    private zzcb zzb(zzca zzca1, int i)
    {
        zzca1 = new zzcb(zzca1.getContext(), zzca1.zzbR(), zzca1.zzdd(), zzca1.zzde(), zzca1.zzdf(), zzca1.zzdg(), zzca1.zzdh(), zzca1.zzdi(), i);
        zzuy = true;
        return zzca1;
    }

    public zzcb zza(zzca zzca1)
    {
        return zza(zzca1, 1);
    }

    public zzcb zza(zzca zzca1, int i)
    {
        if (zzca1 == null)
        {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!zzca1.zzdc())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaA("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (zzca1.getContext() == null)
        {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzca1.zzbR()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else
        {
            return zzb(zzca1, i);
        }
    }

    public zzcb zzb(zzca zzca1)
    {
        return zza(zzca1, 2);
    }

    public boolean zzdc()
    {
        return zzuy;
    }
}
