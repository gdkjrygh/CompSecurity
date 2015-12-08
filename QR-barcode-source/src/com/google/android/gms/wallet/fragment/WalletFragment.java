// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.or;
import com.google.android.gms.internal.oz;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class WalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(WalletFragment walletfragment, int k, int l, Bundle bundle);
    }

    static class a extends com.google.android.gms.internal.os.a
    {

        private OnStateChangedListener auh;
        private final WalletFragment aui;

        public void a(int k, int l, Bundle bundle)
        {
            if (auh != null)
            {
                auh.onStateChanged(aui, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            auh = onstatechangedlistener;
        }

        a(WalletFragment walletfragment)
        {
            aui = walletfragment;
        }
    }

    private static class b
        implements LifecycleDelegate
    {

        private final or aub;

        static int a(b b1)
        {
            return b1.getState();
        }

        static void a(b b1, int k, int l, Intent intent)
        {
            b1.onActivityResult(k, l, intent);
        }

        static void a(b b1, MaskedWallet maskedwallet)
        {
            b1.updateMaskedWallet(maskedwallet);
        }

        static void a(b b1, MaskedWalletRequest maskedwalletrequest)
        {
            b1.updateMaskedWalletRequest(maskedwalletrequest);
        }

        static void a(b b1, WalletFragmentInitParams walletfragmentinitparams)
        {
            b1.initialize(walletfragmentinitparams);
        }

        static void a(b b1, boolean flag)
        {
            b1.setEnabled(flag);
        }

        private int getState()
        {
            int k;
            try
            {
                k = aub.getState();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
            return k;
        }

        private void initialize(WalletFragmentInitParams walletfragmentinitparams)
        {
            try
            {
                aub.initialize(walletfragmentinitparams);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WalletFragmentInitParams walletfragmentinitparams)
            {
                throw new RuntimeException(walletfragmentinitparams);
            }
        }

        private void onActivityResult(int k, int l, Intent intent)
        {
            try
            {
                aub.onActivityResult(k, l, intent);
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
                aub.setEnabled(flag);
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
                aub.updateMaskedWallet(maskedwallet);
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
                aub.updateMaskedWalletRequest(maskedwalletrequest);
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
                aub.onCreate(bundle);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.f(aub.onCreateView(com.google.android.gms.dynamic.e.k(layoutinflater), com.google.android.gms.dynamic.e.k(viewgroup), bundle));
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
                aub.a(com.google.android.gms.dynamic.e.k(activity), bundle, bundle1);
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
                aub.onPause();
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
                aub.onResume();
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
                aub.onSaveInstanceState(bundle);
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
                aub.onStart();
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
                aub.onStop();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private b(or or1)
        {
            aub = or1;
        }

    }

    private class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final WalletFragment auj;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.a(auj).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.e(auj) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.e(auj).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.a(auj).getResources().getDisplayMetrics();
                    k = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                    l = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(k, l));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected void a(f f1)
        {
            Object obj = WalletFragment.a(auj).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.b(auj) == null && WalletFragment.c(auj) && obj != null)
            {
                try
                {
                    obj = oz.a(((Activity) (obj)), WalletFragment.d(auj), com.google.android.gms.wallet.fragment.WalletFragment.e(auj), com.google.android.gms.wallet.fragment.WalletFragment.f(auj));
                    WalletFragment.a(auj, new b(((or) (obj))));
                    WalletFragment.a(auj, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(com.google.android.gms.wallet.fragment.WalletFragment.b(auj));
                if (WalletFragment.g(auj) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(auj), WalletFragment.g(auj));
                    WalletFragment.a(auj, null);
                }
                if (WalletFragment.h(auj) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(auj), WalletFragment.h(auj));
                    WalletFragment.a(auj, null);
                }
                if (WalletFragment.i(auj) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(auj), WalletFragment.i(auj));
                    WalletFragment.a(auj, null);
                }
                if (WalletFragment.j(auj) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(auj), WalletFragment.j(auj).booleanValue());
                    WalletFragment.a(auj, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = WalletFragment.a(auj).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            auj = WalletFragment.this;
            super();
        }

    }


    private final Fragment Sj = this;
    private WalletFragmentOptions atU;
    private WalletFragmentInitParams atV;
    private MaskedWalletRequest atW;
    private MaskedWallet atX;
    private Boolean atY;
    private b aud;
    private final com.google.android.gms.dynamic.b aue = com.google.android.gms.dynamic.b.a(this);
    private final c auf = new c();
    private a aug;
    private boolean mCreated;

    public WalletFragment()
    {
        mCreated = false;
        aug = new a(this);
    }

    static Fragment a(WalletFragment walletfragment)
    {
        return walletfragment.Sj;
    }

    static MaskedWallet a(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.atX = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.atW = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(WalletFragment walletfragment, b b1)
    {
        walletfragment.aud = b1;
        return b1;
    }

    static WalletFragmentInitParams a(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.atV = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.atU = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.atY = boolean1;
        return boolean1;
    }

    static b b(WalletFragment walletfragment)
    {
        return walletfragment.aud;
    }

    static boolean c(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.b d(WalletFragment walletfragment)
    {
        return walletfragment.aue;
    }

    static WalletFragmentOptions e(WalletFragment walletfragment)
    {
        return walletfragment.atU;
    }

    static a f(WalletFragment walletfragment)
    {
        return walletfragment.aug;
    }

    static WalletFragmentInitParams g(WalletFragment walletfragment)
    {
        return walletfragment.atV;
    }

    static MaskedWalletRequest h(WalletFragment walletfragment)
    {
        return walletfragment.atW;
    }

    static MaskedWallet i(WalletFragment walletfragment)
    {
        return walletfragment.atX;
    }

    static Boolean j(WalletFragment walletfragment)
    {
        return walletfragment.atY;
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.Sj.setArguments(bundle);
        return walletfragment;
    }

    public int getState()
    {
        if (aud != null)
        {
            return b.a(aud);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (aud != null)
        {
            b.a(aud, walletfragmentinitparams);
            atV = null;
        } else
        if (atV == null)
        {
            atV = walletfragmentinitparams;
            if (atW != null)
            {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (atX != null)
            {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (aud != null)
        {
            b.a(aud, k, l, intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        WalletFragmentInitParams walletfragmentinitparams = (WalletFragmentInitParams)bundle.getParcelable("walletFragmentInitParams");
        if (walletfragmentinitparams != null)
        {
            if (atV != null)
            {
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            atV = walletfragmentinitparams;
        }
        if (atW == null)
        {
            atW = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (atX == null)
        {
            atX = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            atU = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            atY = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        auf.onCreate(bundle);
        return;
_L2:
        if (Sj.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)Sj.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.aa(Sj.getActivity());
                atU = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return auf.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (atU == null)
        {
            atU = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", atU);
        auf.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        auf.onPause();
    }

    public void onResume()
    {
        super.onResume();
        auf.onResume();
        FragmentManager fragmentmanager = Sj.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(Sj.getActivity()), Sj.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        auf.onSaveInstanceState(bundle);
        if (atV != null)
        {
            bundle.putParcelable("walletFragmentInitParams", atV);
            atV = null;
        }
        if (atW != null)
        {
            bundle.putParcelable("maskedWalletRequest", atW);
            atW = null;
        }
        if (atX != null)
        {
            bundle.putParcelable("maskedWallet", atX);
            atX = null;
        }
        if (atU != null)
        {
            bundle.putParcelable("walletFragmentOptions", atU);
            atU = null;
        }
        if (atY != null)
        {
            bundle.putBoolean("enabled", atY.booleanValue());
            atY = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        auf.onStart();
    }

    public void onStop()
    {
        super.onStop();
        auf.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (aud != null)
        {
            b.a(aud, flag);
            atY = null;
            return;
        } else
        {
            atY = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        aug.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (aud != null)
        {
            b.a(aud, maskedwallet);
            atX = null;
            return;
        } else
        {
            atX = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (aud != null)
        {
            b.a(aud, maskedwalletrequest);
            atW = null;
            return;
        } else
        {
            atW = maskedwalletrequest;
            return;
        }
    }
}
