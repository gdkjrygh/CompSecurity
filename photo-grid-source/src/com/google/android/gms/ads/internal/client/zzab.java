// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzl, zzad, zzw, zzac

public class zzab
{

    private static zzab a;
    private static final Object b = new Object();
    private zzw c;
    private RewardedVideoAd d;

    private zzab()
    {
    }

    public static zzab zzcV()
    {
        zzab zzab1;
        synchronized (b)
        {
            if (a == null)
            {
                a = new zzab();
            }
            zzab1 = a;
        }
        return zzab1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public RewardedVideoAd getRewardedVideoAdInstance(Context context)
    {
label0:
        {
            synchronized (b)
            {
                if (d == null)
                {
                    break label0;
                }
                context = d;
            }
            return context;
        }
        io io1 = new io();
        d = new zzi(context, zzl.zzcK().zza(context, io1));
        context = d;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void initialize(Context context)
    {
label0:
        {
            synchronized (b)
            {
                if (c == null)
                {
                    break label0;
                }
            }
            return;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        throw new IllegalArgumentException("Context cannot be null.");
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        c = zzl.zzcI().zzt(context);
        c.zza();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        zzb.zzaH("Fail to initialize mobile ads setting manager");
          goto _L1
    }

    public void zza(Context context, String s, zzac zzac)
    {
        initialize(context);
    }

}
