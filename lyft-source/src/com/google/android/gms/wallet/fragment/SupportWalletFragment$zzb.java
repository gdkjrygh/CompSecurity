// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams

class <init>
    implements LifecycleDelegate
{

    private final zzqq a;

    private void a(int i, int j, Intent intent)
    {
        try
        {
            a.a(i, j, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new RuntimeException(intent);
        }
    }

    private void a(MaskedWallet maskedwallet)
    {
        try
        {
            a.a(maskedwallet);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWallet maskedwallet)
        {
            throw new RuntimeException(maskedwallet);
        }
    }

    private void a(MaskedWalletRequest maskedwalletrequest)
    {
        try
        {
            a.a(maskedwalletrequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            throw new RuntimeException(maskedwalletrequest);
        }
    }

    static void a(a a1, int i, int j, Intent intent)
    {
        a1.a(i, j, intent);
    }

    static void a(a a1, MaskedWallet maskedwallet)
    {
        a1.a(maskedwallet);
    }

    static void a(a a1, MaskedWalletRequest maskedwalletrequest)
    {
        a1.a(maskedwalletrequest);
    }

    static void a(a a1, WalletFragmentInitParams walletfragmentinitparams)
    {
        a1.a(walletfragmentinitparams);
    }

    static void a(a a1, boolean flag)
    {
        a1.a(flag);
    }

    private void a(WalletFragmentInitParams walletfragmentinitparams)
    {
        try
        {
            a.a(walletfragmentinitparams);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WalletFragmentInitParams walletfragmentinitparams)
        {
            throw new RuntimeException(walletfragmentinitparams);
        }
    }

    private void a(boolean flag)
    {
        try
        {
            a.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = (View)zze.a(a.a(zze.a(layoutinflater), zze.a(viewgroup), bundle));
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeException(layoutinflater);
        }
        return layoutinflater;
    }

    public void a()
    {
        try
        {
            a.a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void a(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
        try
        {
            a.a(zze.a(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
    }

    public void a(Bundle bundle)
    {
        try
        {
            a.a(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public void b()
    {
        try
        {
            a.b();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void b(Bundle bundle)
    {
        try
        {
            a.b(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public void c()
    {
        try
        {
            a.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void d()
    {
        try
        {
            a.d();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public void g()
    {
    }

    private (zzqq zzqq1)
    {
        a = zzqq1;
    }

    a(zzqq zzqq1, a a1)
    {
        this(zzqq1);
    }
}
