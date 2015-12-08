// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzaz extends zzbb.zza
{

    private final zzc zzss;
    private final String zzst;
    private final String zzsu;

    public zzaz(zzc zzc1, String s, String s1)
    {
        zzss = zzc1;
        zzst = s;
        zzsu = s1;
    }

    public String getContent()
    {
        return zzsu;
    }

    public void recordClick()
    {
        zzss.recordClick();
    }

    public void recordImpression()
    {
        zzss.recordImpression();
    }

    public void zza(zzd zzd)
    {
        if (zzd == null)
        {
            return;
        } else
        {
            zzss.zzb((View)zze.zzg(zzd));
            return;
        }
    }

    public String zzcy()
    {
        return zzst;
    }
}
