// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            lo, lm, ll

public class lt extends g
{

    private static lt akK;

    protected lt()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static ll a(Activity activity, c c, WalletFragmentOptions walletfragmentoptions, lm lm)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            throw new GooglePlayServicesNotAvailableException(i);
        }
        try
        {
            activity = ((lo)ne().D(activity)).a(e.h(activity), c, walletfragmentoptions, lm);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
        return activity;
    }

    private static lt ne()
    {
        if (akK == null)
        {
            akK = new lt();
        }
        return akK;
    }

    protected lo bv(IBinder ibinder)
    {
        return lo.a.br(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return bv(ibinder);
    }
}
