// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            eg, ef

public final class ee extends f
{
    private static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }


    private static final ee a = new ee();

    private ee()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static ef a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
            {
                throw new a("Ad overlay requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.c(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return new c(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private ef b(Activity activity)
    {
        try
        {
            com.google.android.gms.b.c c1 = d.a(activity);
            activity = ef.a.a(((eg)a(activity)).a(c1));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return eg.a.a(ibinder);
    }

}
