// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public final class agp extends aak
{

    private static final agp a = new agp();

    private agp()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static agc a(Activity activity)
    {
        try
        {
            if (b(activity))
            {
                of.a("Using AdOverlay from the client jar.");
                return new mu(activity);
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

    private static agf b(IBinder ibinder)
    {
        return agg.a(ibinder);
    }

    private static boolean b(Activity activity)
    {
        activity = activity.getIntent();
        if (!activity.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
        {
            throw new agq("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        } else
        {
            return activity.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
    }

    private agc c(Activity activity)
    {
        try
        {
            aaf aaf = aai.a(activity);
            activity = agd.a(((agf)a(activity)).a(aaf));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            of.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            of.d("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

}
