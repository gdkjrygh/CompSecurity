// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzbj, zzhx, zzbe, zzhw, 
//            zzt, zzhy, zzba, zzdq, 
//            zzbi

public class zzaw extends zzg
{

    public zzaw()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private zzbi zzb(Context context, zzba zzba, String s, zzdq zzdq)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzn(context);
            context = com.google.android.gms.internal.zzbi.zza.zzg(((zzbj)zzS(context)).zza(zzd1, zzba, s, zzdq, 0x6c42d8));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzd("Could not create remote AdManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzhx.zzd("Could not create remote AdManager.", context);
            return null;
        }
        return context;
    }

    public zzbi zza(Context context, zzba zzba, String s, zzdq zzdq)
    {
        Object obj;
label0:
        {
            if (zzbe.zzbD().zzA(context))
            {
                zzbi zzbi = zzb(context, zzba, s, zzdq);
                obj = zzbi;
                if (zzbi != null)
                {
                    break label0;
                }
            }
            zzhx.zzY("Using AdManager from the client jar.");
            obj = new zzt(context, zzba, s, zzdq, new zzhy(0x6c42d8, 0x6c42d8, true));
        }
        return ((zzbi) (obj));
    }

    protected zzbj zzc(IBinder ibinder)
    {
        return zzbj.zza.zzh(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzc(ibinder);
    }
}
