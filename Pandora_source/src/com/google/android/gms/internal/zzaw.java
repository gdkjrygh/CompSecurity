// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzav, zzau

public class zzaw
{

    private boolean zzrY;

    public zzaw()
    {
        zzrY = false;
    }

    private zzav zzb(zzau zzau1, int i)
    {
        zzau1 = new zzav(zzau1.getContext(), zzau1.zzbd(), zzau1.zzci(), zzau1.zzcj(), zzau1.zzck(), zzau1.zzcl(), zzau1.zzcm(), zzau1.zzcn(), i);
        zzrY = true;
        return zzau1;
    }

    public zzav zza(zzau zzau1)
    {
        return zza(zzau1, 1);
    }

    public zzav zza(zzau zzau1, int i)
    {
        if (zzau1 == null)
        {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!zzau1.zzch())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzal("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        }
        if (zzau1.getContext() == null)
        {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzau1.zzbd()))
        {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        } else
        {
            return zzb(zzau1, i);
        }
    }

    public zzav zzb(zzau zzau1)
    {
        return zza(zzau1, 2);
    }

    public boolean zzch()
    {
        return zzrY;
    }
}
