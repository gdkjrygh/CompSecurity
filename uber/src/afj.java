// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public final class afj extends aak
{

    private static final afj a = new afj();

    private afj()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static afl a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                of.a("Using AdOverlay from the client jar.");
                return new me(activity);
            }
            activity = a.c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            of.e(activity.getMessage());
            return null;
        }
        return activity;
    }

    private static afo b(IBinder ibinder)
    {
        return afp.a(ibinder);
    }

    private static boolean b(Activity activity)
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
        {
            throw new afk("Ad overlay requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
    }

    private afl c(Activity activity)
    {
        try
        {
            aaf aaf = aai.a(activity);
            activity = afm.a(((afo)a(activity)).a(aaf));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            of.d("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            of.d("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

}
