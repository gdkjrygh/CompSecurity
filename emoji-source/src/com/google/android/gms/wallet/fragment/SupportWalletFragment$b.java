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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.lk;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment, WalletFragmentOptions, WalletFragmentInitParams

private static class <init>
    implements LifecycleDelegate
{

    private final lk akr;

    static int a(<init> <init>1)
    {
        return <init>1.getState();
    }

    static void a(getState getstate, int i, int j, Intent intent)
    {
        getstate.onActivityResult(i, j, intent);
    }

    static void a(onActivityResult onactivityresult, MaskedWallet maskedwallet)
    {
        onactivityresult.updateMaskedWallet(maskedwallet);
    }

    static void a(updateMaskedWallet updatemaskedwallet, MaskedWalletRequest maskedwalletrequest)
    {
        updatemaskedwallet.updateMaskedWalletRequest(maskedwalletrequest);
    }

    static void a( , WalletFragmentInitParams walletfragmentinitparams)
    {
        .initialize(walletfragmentinitparams);
    }

    static void a( , boolean flag)
    {
        .setEnabled(flag);
    }

    private int getState()
    {
        int i;
        try
        {
            i = akr.getState();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
        return i;
    }

    private void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        try
        {
            akr.initialize(walletfragmentinitparams);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WalletFragmentInitParams walletfragmentinitparams)
        {
            throw new RuntimeException(walletfragmentinitparams);
        }
    }

    private void onActivityResult(int i, int j, Intent intent)
    {
        try
        {
            akr.onActivityResult(i, j, intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new RuntimeException(intent);
        }
    }

    private void setEnabled(boolean flag)
    {
        try
        {
            akr.setEnabled(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    private void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        try
        {
            akr.updateMaskedWallet(maskedwallet);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWallet maskedwallet)
        {
            throw new RuntimeException(maskedwallet);
        }
    }

    private void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        try
        {
            akr.updateMaskedWalletRequest(maskedwalletrequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            throw new RuntimeException(maskedwalletrequest);
        }
    }

    public void onCreate(Bundle bundle)
    {
        try
        {
            akr.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = (View)e.e(akr.onCreateView(e.h(layoutinflater), e.h(viewgroup), bundle));
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeException(layoutinflater);
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
    }

    public void onDestroyView()
    {
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
        try
        {
            akr.a(e.h(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
    }

    public void onLowMemory()
    {
    }

    public void onPause()
    {
        try
        {
            akr.onPause();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void onResume()
    {
        try
        {
            akr.onResume();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            akr.onSaveInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public void onStart()
    {
        try
        {
            akr.onStart();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public void onStop()
    {
        try
        {
            akr.onStop();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    private (lk lk1)
    {
        akr = lk1;
    }

    akr(lk lk1, akr akr1)
    {
        this(lk1);
    }
}
