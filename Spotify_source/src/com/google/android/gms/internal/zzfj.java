// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import bka;
import bye;
import cgi;
import cgj;
import cgl;
import cgm;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.dynamic.zzg;

public final class zzfj extends zzg
{

    private static final zzfj a = new zzfj();

    private zzfj()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static cgi a(Activity activity)
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
            bka.e(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            bka.a("Using AdOverlay from the client jar.");
            return new zzd(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private cgi b(Activity activity)
    {
        try
        {
            byb byb = bye.a(activity);
            activity = cgj.a(((cgl)b(((android.content.Context) (activity)))).a(byb));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bka.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bka.c("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return cgm.a(ibinder);
    }


    private class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

}
