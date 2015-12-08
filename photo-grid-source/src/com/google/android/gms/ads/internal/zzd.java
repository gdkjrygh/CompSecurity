// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.zzj;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.gy;

public class zzd
{

    public final gy zzoG;
    public final zzj zzoH;

    public zzd(gy gy, zzj zzj)
    {
        zzoG = gy;
        zzoH = zzj;
    }

    public static zzd zzbd()
    {
        return new zzd(new fm(), new zzl());
    }
}
