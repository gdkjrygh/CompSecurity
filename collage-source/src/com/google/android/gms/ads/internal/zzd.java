// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.zzj;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.cu;

public class zzd
{

    public final cu zzoF;
    public final zzj zzoG;

    public zzd(cu cu, zzj zzj)
    {
        zzoF = cu;
        zzoG = zzj;
    }

    public static zzd zzbd()
    {
        return new zzd(new cf(), new zzl());
    }
}
