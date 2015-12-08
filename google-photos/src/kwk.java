// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public final class kwk extends koo
{

    private static final kwk a = new kwk();

    private kwk()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static kwd a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
            {
                throw new kwl("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.m(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false))
        {
            b.p(3);
            return new jpk(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private kwd b(Activity activity)
    {
        try
        {
            kok kok = kon.a(activity);
            activity = kwe.a(((kwg)a(activity)).a(kok));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.b("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            b.b("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return kwh.a(ibinder);
    }

}
