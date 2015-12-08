// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.oi;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzc, zzb

public class zzf extends e
{

    public zzf()
    {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    private com.google.android.gms.ads.internal.reward.client.zzb a(Context context, io io)
    {
        com.google.android.gms.b.a a1 = d.a(context);
        context = zzb.zza.zzaa(((zzc)a(context)).zza(a1, io, 0x7bd338));
        return context;
        context;
_L2:
        zzb.zzd("Could not get remote RewardedVideoAd.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return zzc.zza.zzab(ibinder);
    }

    public com.google.android.gms.ads.internal.reward.client.zzb zza(Context context, io io)
    {
        Object obj;
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                com.google.android.gms.ads.internal.reward.client.zzb zzb1 = a(context, io);
                obj = zzb1;
                if (zzb1 != null)
                {
                    break label0;
                }
            }
            zzb.zzaF("Using RewardedVideoAd from the client jar.");
            obj = new oi(context, io, new VersionInfoParcel(0x7bd338, 0x7bd338, true));
        }
        return ((com.google.android.gms.ads.internal.reward.client.zzb) (obj));
    }
}
