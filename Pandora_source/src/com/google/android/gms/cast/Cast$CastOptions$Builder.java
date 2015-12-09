// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class <init>
{

    CastDevice zzLR;
    zzLT zzLS;
    private int zzLT;

    static int zza(<init> <init>1)
    {
        return <init>1.zzLT;
    }

    public zzLT build()
    {
        return new zzLT(this, null);
    }

    public zzLT setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            zzLT = zzLT | 1;
            return this;
        } else
        {
            zzLT = zzLT & -2;
            return this;
        }
    }

    private (CastDevice castdevice,  )
    {
        zzv.zzb(castdevice, "CastDevice parameter cannot be null");
        zzv.zzb(, "CastListener parameter cannot be null");
        zzLR = castdevice;
        zzLS = ;
        zzLT = 0;
    }

    zzLT(CastDevice castdevice, zzLT zzlt, zzLT zzlt1)
    {
        this(castdevice, zzlt);
    }
}
