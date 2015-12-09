// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzhc;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzx

public static final class zzHU
{

    private final Object zzHU;
    private final zzhc zzHV;
    private Object zzHW;

    static zzHU zza(String s, float f)
    {
        return zza(s, f, f);
    }

    static zza zza(String s, float f, float f1)
    {
        return new <init>(zzhc.zza(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static <init> zza(String s, int i, int j)
    {
        return new <init>(zzhc.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> zza(String s, long l, long l1)
    {
        return new <init>(zzhc.zza(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> zza(String s, boolean flag, boolean flag1)
    {
        return new <init>(zzhc.zzg(s, flag1), Boolean.valueOf(flag));
    }

    static <init> zzb(String s, long l)
    {
        return zza(s, l, l);
    }

    static zza zzd(String s, int i)
    {
        return zza(s, i, i);
    }

    static zza zzd(String s, String s1, String s2)
    {
        return new <init>(zzhc.zzr(s, s2), s1);
    }

    static <init> zzd(String s, boolean flag)
    {
        return zza(s, flag, flag);
    }

    static zza zzl(String s, String s1)
    {
        return zzd(s, s1, s1);
    }

    public Object get()
    {
        if (zzHW != null)
        {
            return zzHW;
        }
        if (zzd.zzSV && zzhc.isInitialized())
        {
            return zzHV.zzlk();
        } else
        {
            return zzHU;
        }
    }

    private (zzhc zzhc1, Object obj)
    {
        zzv.zzr(zzhc1);
        zzHV = zzhc1;
        zzHU = obj;
    }
}
