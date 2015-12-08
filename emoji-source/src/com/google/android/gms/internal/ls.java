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
//            ln, ll, lk

public class ls extends g
{

    private static ls akN;

    protected ls()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static lk a(Activity activity, c c, WalletFragmentOptions walletfragmentoptions, ll ll)
        throws GooglePlayServicesNotAvailableException
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            throw new GooglePlayServicesNotAvailableException(i);
        }
        try
        {
            activity = ((ln)nj().G(activity)).a(e.h(activity), c, walletfragmentoptions, ll);
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

    private static ls nj()
    {
        if (akN == null)
        {
            akN = new ls();
        }
        return akN;
    }

    protected ln bv(IBinder ibinder)
    {
        return ln.a.br(ibinder);
    }

    protected Object d(IBinder ibinder)
    {
        return bv(ibinder);
    }
}
