// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            zzqt, zzqr, zzqq

public class zzqy extends zzg
{

    private static zzqy a;

    protected zzqy()
    {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    public static zzqq a(Activity activity, zzc zzc, WalletFragmentOptions walletfragmentoptions, zzqr zzqr)
    {
        int i = GooglePlayServicesUtil.a(activity);
        if (i != 0)
        {
            throw new GooglePlayServicesNotAvailableException(i);
        }
        try
        {
            activity = ((zzqt)a().a(((android.content.Context) (activity)))).a(zze.a(activity), zzc, walletfragmentoptions, zzqr);
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

    private static zzqy a()
    {
        if (a == null)
        {
            a = new zzqy();
        }
        return a;
    }

    protected Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected zzqt b(IBinder ibinder)
    {
        return zzqt.zza.a(ibinder);
    }
}
