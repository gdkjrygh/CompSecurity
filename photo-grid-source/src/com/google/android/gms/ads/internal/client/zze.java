// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzt, zzl, AdSizeParcel, zzs

public class zze extends e
{

    public zze()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private zzs a(Context context, AdSizeParcel adsizeparcel, String s, io io, int i)
    {
        com.google.android.gms.b.a a1 = d.a(context);
        context = com.google.android.gms.ads.internal.client.zzs.zza.zzk(((zzt)a(context)).zza(a1, adsizeparcel, s, io, 0x7bd338, i));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zza("Could not create remote AdManager.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final Object a(IBinder ibinder)
    {
        return zzt.zza.zzl(ibinder);
    }

    public zzs zza(Context context, AdSizeParcel adsizeparcel, String s, io io)
    {
        Object obj;
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                zzs zzs = a(context, adsizeparcel, s, io, 1);
                obj = zzs;
                if (zzs != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("Using BannerAdManager from the client jar.");
            obj = new zzf(context, adsizeparcel, s, io, new VersionInfoParcel(0x7bd338, 0x7bd338, true), zzd.zzbd());
        }
        return ((zzs) (obj));
    }

    public zzs zzb(Context context, AdSizeParcel adsizeparcel, String s, io io)
    {
        Object obj;
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                zzs zzs = a(context, adsizeparcel, s, io, 2);
                obj = zzs;
                if (zzs != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Using InterstitialAdManager from the client jar.");
            obj = new zzk(context, adsizeparcel, s, io, new VersionInfoParcel(0x7bd338, 0x7bd338, true), zzd.zzbd());
        }
        return ((zzs) (obj));
    }
}
