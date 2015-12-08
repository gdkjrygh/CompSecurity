// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzta

public static final class zzatD
{

    private String zzFr;
    private boolean zzatB;
    private boolean zzatC;
    private final String zzatD;

    static String zza(zzatD zzatd)
    {
        return zzatd.zzatD;
    }

    static boolean zzb(zzatD zzatd)
    {
        return zzatd.zzatB;
    }

    static boolean zzc(zzatB zzatb)
    {
        return zzatb.zzatC;
    }

    static String zzd(zzatC zzatc)
    {
        return zzatc.zzFr;
    }

    public final zzFr zzab(boolean flag)
    {
        zzatB = flag;
        return this;
    }

    public final zzatB zzac(boolean flag)
    {
        zzatC = flag;
        return this;
    }

    public final zzatC zzcA(String s)
    {
        zzFr = s;
        return this;
    }

    public final zzta zzrA()
    {
        return new zzta(this, null);
    }

    public (String s)
    {
        zzatB = true;
        zzatC = false;
        zzatD = s;
    }
}
