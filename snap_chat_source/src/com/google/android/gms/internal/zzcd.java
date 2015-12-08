// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzcc, zzcb, zzhx

public class zzcd
{

    private boolean zzqO;

    public zzcd()
    {
        zzqO = false;
    }

    private zzcc zzb(zzcb zzcb1, int i)
    {
        zzcb1 = new zzcc(zzcb1.getContext(), zzcb1.zzaX(), zzcb1.zzce(), zzcb1.zzcf(), zzcb1.zzcg(), zzcb1.zzch(), zzcb1.zzci(), zzcb1.zzcj(), i);
        zzqO = true;
        return zzcb1;
    }

    public zzcc zza(zzcb zzcb1)
    {
        return zza(zzcb1, 1);
    }

    public zzcc zza(zzcb zzcb1, int i)
    {
        if (zzcb1 == null)
        {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!zzcb1.zzcd())
        {
            zzhx.zzaa("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (zzcb1.getContext() == null)
        {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzcb1.zzaX()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else
        {
            return zzb(zzcb1, i);
        }
    }

    public zzcc zzb(zzcb zzcb1)
    {
        return zza(zzcb1, 2);
    }

    public boolean zzcd()
    {
        return zzqO;
    }
}
