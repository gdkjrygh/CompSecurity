// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.bx;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zze, zzl, zzac

public class zzk
{

    private static final Object zzpm = new Object();
    private static zzk zzsM;
    private final zza zzsN = new zza();
    private final zze zzsO = new zze();
    private final zzl zzsP = new zzl();
    private final zzac zzsQ = new zzac();
    private final bx zzsR = new bx();
    private final zzf zzsS = new zzf();

    protected zzk()
    {
    }

    protected static void zza(zzk zzk1)
    {
        synchronized (zzpm)
        {
            zzsM = zzk1;
        }
        return;
        zzk1;
        obj;
        JVM INSTR monitorexit ;
        throw zzk1;
    }

    private static zzk zzcD()
    {
        zzk zzk1;
        synchronized (zzpm)
        {
            zzk1 = zzsM;
        }
        return zzk1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zza zzcE()
    {
        return zzcD().zzsN;
    }

    public static zze zzcF()
    {
        return zzcD().zzsO;
    }

    public static zzl zzcG()
    {
        return zzcD().zzsP;
    }

    public static zzac zzcH()
    {
        return zzcD().zzsQ;
    }

    public static bx zzcI()
    {
        return zzcD().zzsR;
    }

    public static zzf zzcJ()
    {
        return zzcD().zzsS;
    }

    static 
    {
        zza(new zzk());
    }
}
