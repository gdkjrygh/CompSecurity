// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzey, zzex

public final class zzew extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzew zzAr = new zzew();

    private zzew()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static zzex zzb(Activity activity)
    {
        try
        {
            if (zzc(activity))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzay("Using AdOverlay from the client jar.");
                return new zzc(activity);
            }
            activity = zzAr.zzd(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean zzc(Activity activity)
        throws zza
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

    private zzex zzd(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzw(activity);
            activity = zzex.zza.zzI(((zzey)zzak(activity)).zzc(zzd1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected zzey zzH(IBinder ibinder)
    {
        return zzey.zza.zzJ(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzH(ibinder);
    }

}
