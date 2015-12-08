// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            eh, eg

public final class ef extends c
{

    private static final ef a = new ef();

    private ef()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static eg a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                zzb.zzaC("Using AdOverlay from the client jar.");
                return new zzd(activity);
            }
            activity = a.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
    /* block-local class not found */
    class a {}

            zzb.zzaE(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static boolean b(Activity activity)
        throws a
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new a("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private eg c(Activity activity)
    {
        try
        {
            com.google.android.gms.a.a a1 = com.google.android.gms.a.b.a(activity);
            activity = eg.a.zzK(((eh)zzar(activity)).a(a1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            zzb.zzd("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected eh a(IBinder ibinder)
    {
        return eh.a.a(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return a(ibinder);
    }

}
