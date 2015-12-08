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
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx, zzl, zzw

public class zzad extends e
{

    public zzad()
    {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    private zzw b(Context context)
    {
        try
        {
            com.google.android.gms.b.a a1 = d.a(context);
            context = zzw.zza.zzo(((zzx)a(context)).zza(a1, 0x7bd338));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", context);
            return null;
        }
        return context;
    }

    protected final Object a(IBinder ibinder)
    {
        return zzx.zza.zzp(ibinder);
    }

    public zzw zzt(Context context)
    {
        Object obj;
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                zzw zzw = b(context);
                obj = zzw;
                if (zzw != null)
                {
                    break label0;
                }
            }
            zzb.zzaF("Using MobileAdsSettingManager from the client jar.");
            new VersionInfoParcel(0x7bd338, 0x7bd338, true);
            obj = zzm.zzq(context);
        }
        return ((zzw) (obj));
    }
}
