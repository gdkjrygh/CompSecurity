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
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzcq;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzo, zzj, AdSizeParcel, zzn

public class zzd extends zzg
{

    public zzd()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private zzn zzb(Context context, AdSizeParcel adsizeparcel, String s, zzcq zzcq)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzt(context);
            context = com.google.android.gms.ads.internal.client.zzn.zza.zzg(((zzo)zzX(context)).zza(zzd1, adsizeparcel, s, zzcq, 0x6fcd18));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    public zzn zza(Context context, AdSizeParcel adsizeparcel, String s, zzcq zzcq)
    {
        Object obj;
label0:
        {
            if (zzj.zzbJ().zzD(context))
            {
                zzn zzn = zzb(context, adsizeparcel, s, zzcq);
                obj = zzn;
                if (zzn != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Using AdManager from the client jar.");
            obj = new com.google.android.gms.ads.internal.zza(context, adsizeparcel, s, zzcq, new VersionInfoParcel(0x6fcd18, 0x6fcd18, true));
        }
        return ((zzn) (obj));
    }

    protected zzo zzc(IBinder ibinder)
    {
        return zzo.zza.zzh(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzc(ibinder);
    }
}
