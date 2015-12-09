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
import com.google.android.gms.internal.xe;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment, WalletFragmentOptions, WalletFragmentInitParams

static final class <init>
    implements LifecycleDelegate
{

    private final xe aUR;

    static void a(<init> <init>1, int i, int j, Intent intent)
    {
        <init>1.onActivityResult(i, j, intent);
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

    private void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        try
        {
            aUR.initialize(walletfragmentinitparams);
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
            aUR.onActivityResult(i, j, intent);
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
            aUR.setEnabled(flag);
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
            aUR.updateMaskedWallet(maskedwallet);
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
            aUR.updateMaskedWalletRequest(maskedwalletrequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            throw new RuntimeException(maskedwalletrequest);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        try
        {
            aUR.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = (View)e.i(aUR.onCreateView(e.q(layoutinflater), e.q(viewgroup), bundle));
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeException(layoutinflater);
        }
        return layoutinflater;
    }

    public final void onDestroy()
    {
    }

    public final void onDestroyView()
    {
    }

    public final void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
        try
        {
            aUR.a(e.q(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeException(activity);
        }
    }

    public final void onLowMemory()
    {
    }

    public final void onPause()
    {
        try
        {
            aUR.onPause();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public final void onResume()
    {
        try
        {
            aUR.onResume();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            aUR.onSaveInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException(bundle);
        }
    }

    public final void onStart()
    {
        try
        {
            aUR.onStart();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    public final void onStop()
    {
        try
        {
            aUR.onStop();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
    }

    private (xe xe1)
    {
        aUR = xe1;
    }

    aUR(xe xe1, aUR aur)
    {
        this(xe1);
    }
}
