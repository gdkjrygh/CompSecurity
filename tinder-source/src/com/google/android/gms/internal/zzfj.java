// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            bt, bs

public final class zzfj extends zzg
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }


    private static final zzfj a = new zzfj();

    private zzfj()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static bs a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
            {
                throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.e(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            com.google.android.gms.ads.internal.util.client.b.a("Using AdOverlay from the client jar.");
            return new zzd(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private bs b(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.a a1 = com.google.android.gms.dynamic.b.a(activity);
            activity = bs.a.a(((bt)a(activity)).a(a1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return bt.a.a(ibinder);
    }

}
