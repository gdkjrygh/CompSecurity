// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.dh;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzk, zzac, zzv, MobileAdsSettingsParcel, 
//            zzab

public class zzaa
{

    private static final Object zzpm = new Object();
    private static zzaa zztt;
    private zzv zztu;
    private RewardedVideoAd zztv;

    private zzaa()
    {
    }

    public static zzaa zzcU()
    {
        zzaa zzaa1;
        synchronized (zzpm)
        {
            if (zztt == null)
            {
                zztt = new zzaa();
            }
            zzaa1 = zztt;
        }
        return zzaa1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public RewardedVideoAd getRewardedVideoAdInstance(Context context)
    {
label0:
        {
            synchronized (zzpm)
            {
                if (zztv == null)
                {
                    break label0;
                }
                context = zztv;
            }
            return context;
        }
        dh dh1 = new dh();
        zztv = new zzi(context, zzk.zzcJ().zza(context, dh1));
        context = zztv;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(Context context, String s, zzab zzab)
    {
label0:
        {
            synchronized (zzpm)
            {
                if (zztu == null)
                {
                    break label0;
                }
            }
            return;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        throw new IllegalArgumentException("Context cannot be null.");
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("applicationCode cannot be empty.");
        }
        zzv zzv1;
        zztu = zzk.zzcH().zzt(context);
        zzv1 = zztu;
        if (zzab != null) goto _L2; else goto _L1
_L1:
        context = null;
_L3:
        zzv1.zza(s, context);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        context = new MobileAdsSettingsParcel(zzab);
          goto _L3
        context;
        zzb.zzaE("Fail to initialize mobile ads setting manager");
          goto _L4
    }

}
