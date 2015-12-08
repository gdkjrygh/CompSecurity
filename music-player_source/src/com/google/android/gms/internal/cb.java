// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.f;
import com.google.android.gms.a.h;
import com.google.android.gms.a.i;

// Referenced classes of package com.google.android.gms.internal:
//            cc, ek, bp, ci, 
//            cg, cj, ce

public final class cb extends h
{

    private static final cb a = new cb();

    private cb()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static ce a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
            {
                throw new cc("Ad overlay requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ek.d(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            ek.a("Using AdOverlay from the client jar.");
            return new bp(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private ce b(Activity activity)
    {
        try
        {
            com.google.android.gms.a.c c = f.a(activity);
            activity = cg.a(((ci)a(activity)).a(c));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ek.a("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            ek.a("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return cj.a(ibinder);
    }

}
