// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzn extends Enum
{

    public static final zzn zzGO;
    public static final zzn zzGP;
    private static final zzn zzGQ[];

    private zzn(String s, int i)
    {
        super(s, i);
    }

    public static zzn valueOf(String s)
    {
        return (zzn)Enum.valueOf(com/google/android/gms/analytics/internal/zzn, s);
    }

    public static zzn[] values()
    {
        return (zzn[])zzGQ.clone();
    }

    public static zzn zzaP(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return zzGP;
        } else
        {
            return zzGO;
        }
    }

    static 
    {
        zzGO = new zzn("NONE", 0);
        zzGP = new zzn("GZIP", 1);
        zzGQ = (new zzn[] {
            zzGO, zzGP
        });
    }
}
