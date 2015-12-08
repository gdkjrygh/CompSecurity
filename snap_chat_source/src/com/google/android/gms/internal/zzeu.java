// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzel, zzew, zzev

public final class zzeu extends zzg
{
    static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzeu zzuL = new zzeu();

    private zzeu()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static zzev zzb(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                zzhx.zzY("Using AdOverlay from the client jar.");
                return new zzel(activity);
            }
            activity = zzuL.zzd(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzac(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean zzc(Activity activity)
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private zzev zzd(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzn(activity);
            activity = zzev.zza.zzv(((zzew)zzS(activity)).zzb(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object zzd(IBinder ibinder)
    {
        return zzu(ibinder);
    }

    protected final zzew zzu(IBinder ibinder)
    {
        return zzew.zza.zzw(ibinder);
    }

}
