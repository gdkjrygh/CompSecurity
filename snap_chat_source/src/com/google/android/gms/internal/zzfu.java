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
//            zzhx, zzff, zzfq, zzfp

public final class zzfu extends zzg
{
    static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfu zzvw = new zzfu();

    private zzfu()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    private static boolean zzc(Activity activity)
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

    public static zzfp zze(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                zzhx.zzY("Using AdOverlay from the client jar.");
                return new zzff(activity);
            }
            activity = zzvw.zzf(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzac(activity.getMessage());
            return null;
        }
        return activity;
    }

    private zzfp zzf(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = com.google.android.gms.dynamic.zze.zzn(activity);
            activity = zzfp.zza.zzA(((zzfq)zzS(activity)).zzc(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzhx.zzd("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final zzfq zzE(IBinder ibinder)
    {
        return zzfq.zza.zzB(ibinder);
    }

    protected final Object zzd(IBinder ibinder)
    {
        return zzE(ibinder);
    }

}
