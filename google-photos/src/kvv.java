// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public final class kvv extends koo
{

    private static final kvv a = new kvv();

    private kvv()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static kvx a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
            {
                throw new kvw("Ad overlay requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.m(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            b.p(3);
            return new jov(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private kvx b(Activity activity)
    {
        try
        {
            kok kok = kon.a(activity);
            activity = kvy.a(((kwa)a(activity)).a(kok));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return kwb.a(ibinder);
    }

}
