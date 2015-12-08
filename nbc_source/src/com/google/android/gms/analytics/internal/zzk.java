// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzan, zzf

public class zzk extends zzd
{

    private final zznx zzKm = new zznx();

    zzk(zzf zzf)
    {
        super(zzf);
    }

    public void zzhi()
    {
        Object obj = zzhm();
        String s = ((zzan) (obj)).zzjL();
        if (s != null)
        {
            zzKm.setAppName(s);
        }
        obj = ((zzan) (obj)).zzjN();
        if (obj != null)
        {
            zzKm.setAppVersion(((String) (obj)));
        }
    }

    protected void zzhn()
    {
        zzhS().zzwc().zza(zzKm);
        zzhi();
    }

    public zznx zzix()
    {
        zzia();
        return zzKm;
    }
}
