// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.ff;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zze, zzm, zzad

public class zzl
{

    private static final Object a;
    private static zzl b;
    private final zza c = new zza();
    private final zze d = new zze();
    private final zzm e = new zzm();
    private final zzad f = new zzad();
    private final ff g = new ff();
    private final zzf h = new zzf();

    protected zzl()
    {
    }

    private static zzl a()
    {
        zzl zzl1;
        synchronized (a)
        {
            zzl1 = b;
        }
        return zzl1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zza zzcF()
    {
        return a().c;
    }

    public static zze zzcG()
    {
        return a().d;
    }

    public static zzm zzcH()
    {
        return a().e;
    }

    public static zzad zzcI()
    {
        return a().f;
    }

    public static ff zzcJ()
    {
        return a().g;
    }

    public static zzf zzcK()
    {
        return a().h;
    }

    static 
    {
        a = new Object();
        zzl zzl1 = new zzl();
        synchronized (a)
        {
            b = zzl1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
