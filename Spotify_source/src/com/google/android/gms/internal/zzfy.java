// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import bih;
import bka;
import bye;
import cgy;
import cgz;
import chb;
import chc;
import com.google.android.gms.dynamic.zzg;

public final class zzfy extends zzg
{

    private static final zzfy a = new zzfy();

    private zzfy()
    {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static cgy a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar"))
            {
                throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bka.e(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false))
        {
            bka.a("Using AdOverlay from the client jar.");
            return new bih(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private cgy b(Activity activity)
    {
        try
        {
            byb byb = bye.a(activity);
            activity = cgz.a(((chb)b(((android.content.Context) (activity)))).a(byb));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bka.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bka.c("Could not create remote InAppPurchaseManager.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return chc.a(ibinder);
    }


    private class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

}
