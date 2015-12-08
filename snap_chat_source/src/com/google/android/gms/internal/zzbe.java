// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzhw, zzaw, zzbf, zzbr

public class zzbe
{

    private static final Object zzmz = new Object();
    private static zzbe zzpg;
    private final zzhw zzph = new zzhw();
    private final zzaw zzpi = new zzaw();
    private final zzbf zzpj = new zzbf();
    private final zzbr zzpk = new zzbr();

    protected zzbe()
    {
    }

    protected static void zza(zzbe zzbe1)
    {
        synchronized (zzmz)
        {
            zzpg = zzbe1;
        }
        return;
        zzbe1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbe1;
    }

    private static zzbe zzbC()
    {
        zzbe zzbe1;
        synchronized (zzmz)
        {
            zzbe1 = zzpg;
        }
        return zzbe1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zzhw zzbD()
    {
        return zzbC().zzph;
    }

    public static zzaw zzbE()
    {
        return zzbC().zzpi;
    }

    public static zzbf zzbF()
    {
        return zzbC().zzpj;
    }

    static 
    {
        zza(new zzbe());
    }
}
