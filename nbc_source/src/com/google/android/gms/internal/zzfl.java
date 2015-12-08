// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzfg

public final class zzfl extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfl zzBb = new zzfl();

    private zzfl()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private static boolean zzc(Activity activity)
        throws zza
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
        {
            throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
    }

    public static zzfg zze(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                zzb.zzay("Using AdOverlay from the client jar.");
                return new zze(activity);
            }
            activity = zzBb.zzf(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzaC(activity.getMessage());
            return null;
        }
        return activity;
    }

    private zzfg zzf(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = com.google.android.gms.dynamic.zze.zzw(activity);
            activity = zzfg.zza.zzN(((zzfh)zzak(activity)).zzd(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected zzfh zzR(IBinder ibinder)
    {
        return zzfh.zza.zzO(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzR(ibinder);
    }

}
