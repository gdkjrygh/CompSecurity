// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzcf extends zzch.zza
{

    private final zzf zzuS;
    private final String zzuT;
    private final String zzuU;

    public zzcf(zzf zzf1, String s, String s1)
    {
        zzuS = zzf1;
        zzuT = s;
        zzuU = s1;
    }

    public String getContent()
    {
        return zzuU;
    }

    public void recordClick()
    {
        zzuS.recordClick();
    }

    public void recordImpression()
    {
        zzuS.recordImpression();
    }

    public void zza(zzd zzd)
    {
        if (zzd == null)
        {
            return;
        } else
        {
            zzuS.zzc((View)zze.zzn(zzd));
            return;
        }
    }

    public String zzdt()
    {
        return zzuT;
    }
}
