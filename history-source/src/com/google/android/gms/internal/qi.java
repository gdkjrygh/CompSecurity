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
//            qd, qb, qa

public class qi extends g
{

    private static qi awH;

    protected qi()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static qa a(Activity activity, c c, WalletFragmentOptions walletfragmentoptions, qb qb)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            throw new GooglePlayServicesNotAvailableException(i);
        }
        try
        {
            activity = ((qd)rg().L(activity)).a(e.k(activity), c, walletfragmentoptions, qb);
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

    private static qi rg()
    {
        if (awH == null)
        {
            awH = new qi();
        }
        return awH;
    }

    protected qd bW(IBinder ibinder)
    {
        return qd.a.bS(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return bW(ibinder);
    }
}
