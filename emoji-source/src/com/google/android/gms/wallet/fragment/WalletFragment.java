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
import com.google.android.gms.internal.lk;
import com.google.android.gms.internal.ls;
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

    static class a extends com.google.android.gms.internal.ll.a
    {

        private OnStateChangedListener akx;
        private final WalletFragment aky;

        public void a(int k, int l, Bundle bundle)
        {
            if (akx != null)
            {
                akx.onStateChanged(aky, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            akx = onstatechangedlistener;
        }

        a(WalletFragment walletfragment)
        {
            aky = walletfragment;
        }
    }

    private static class b
        implements LifecycleDelegate
    {

        private final lk akr;

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
                k = akr.getState();
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
                akr.initialize(walletfragmentinitparams);
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
                akr.onActivityResult(k, l, intent);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.e(akr.onCreateView(com.google.android.gms.dynamic.e.h(layoutinflater), com.google.android.gms.dynamic.e.h(viewgroup), bundle));
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
                akr.a(com.google.android.gms.dynamic.e.h(activity), bundle, bundle1);
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

        private b(lk lk1)
        {
            akr = lk1;
        }

    }

    private class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final WalletFragment akz;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.a(akz).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.e(akz) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.e(akz).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.a(akz).getResources().getDisplayMetrics();
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
            Object obj = WalletFragment.a(akz).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.b(akz) == null && WalletFragment.c(akz) && obj != null)
            {
                try
                {
                    obj = ls.a(((Activity) (obj)), WalletFragment.d(akz), com.google.android.gms.wallet.fragment.WalletFragment.e(akz), com.google.android.gms.wallet.fragment.WalletFragment.f(akz));
                    WalletFragment.a(akz, new b(((lk) (obj))));
                    WalletFragment.a(akz, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(com.google.android.gms.wallet.fragment.WalletFragment.b(akz));
                if (WalletFragment.g(akz) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(akz), WalletFragment.g(akz));
                    WalletFragment.a(akz, null);
                }
                if (WalletFragment.h(akz) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(akz), WalletFragment.h(akz));
                    WalletFragment.a(akz, null);
                }
                if (WalletFragment.i(akz) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(akz), WalletFragment.i(akz));
                    WalletFragment.a(akz, null);
                }
                if (WalletFragment.j(akz) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(akz), WalletFragment.j(akz).booleanValue());
                    WalletFragment.a(akz, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = WalletFragment.a(akz).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            akz = WalletFragment.this;
            super();
        }

    }


    private final Fragment Mj = this;
    private WalletFragmentOptions akk;
    private WalletFragmentInitParams akl;
    private MaskedWalletRequest akm;
    private MaskedWallet akn;
    private Boolean ako;
    private b akt;
    private final com.google.android.gms.dynamic.b aku = com.google.android.gms.dynamic.b.a(this);
    private final c akv = new c();
    private a akw;
    private boolean mCreated;

    public WalletFragment()
    {
        mCreated = false;
        akw = new a(this);
    }

    static Fragment a(WalletFragment walletfragment)
    {
        return walletfragment.Mj;
    }

    static MaskedWallet a(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.akn = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.akm = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(WalletFragment walletfragment, b b1)
    {
        walletfragment.akt = b1;
        return b1;
    }

    static WalletFragmentInitParams a(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.akl = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.akk = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.ako = boolean1;
        return boolean1;
    }

    static b b(WalletFragment walletfragment)
    {
        return walletfragment.akt;
    }

    static boolean c(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.b d(WalletFragment walletfragment)
    {
        return walletfragment.aku;
    }

    static WalletFragmentOptions e(WalletFragment walletfragment)
    {
        return walletfragment.akk;
    }

    static a f(WalletFragment walletfragment)
    {
        return walletfragment.akw;
    }

    static WalletFragmentInitParams g(WalletFragment walletfragment)
    {
        return walletfragment.akl;
    }

    static MaskedWalletRequest h(WalletFragment walletfragment)
    {
        return walletfragment.akm;
    }

    static MaskedWallet i(WalletFragment walletfragment)
    {
        return walletfragment.akn;
    }

    static Boolean j(WalletFragment walletfragment)
    {
        return walletfragment.ako;
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.Mj.setArguments(bundle);
        return walletfragment;
    }

    public int getState()
    {
        if (akt != null)
        {
            return b.a(akt);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (akt != null)
        {
            b.a(akt, walletfragmentinitparams);
            akl = null;
        } else
        if (akl == null)
        {
            akl = walletfragmentinitparams;
            if (akm != null)
            {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (akn != null)
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
        if (akt != null)
        {
            b.a(akt, k, l, intent);
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
            if (akl != null)
            {
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            akl = walletfragmentinitparams;
        }
        if (akm == null)
        {
            akm = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (akn == null)
        {
            akn = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            akk = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            ako = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        akv.onCreate(bundle);
        return;
_L2:
        if (Mj.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)Mj.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.Q(Mj.getActivity());
                akk = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return akv.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (akk == null)
        {
            akk = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", akk);
        akv.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        akv.onPause();
    }

    public void onResume()
    {
        super.onResume();
        akv.onResume();
        FragmentManager fragmentmanager = Mj.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(Mj.getActivity()), Mj.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        akv.onSaveInstanceState(bundle);
        if (akl != null)
        {
            bundle.putParcelable("walletFragmentInitParams", akl);
            akl = null;
        }
        if (akm != null)
        {
            bundle.putParcelable("maskedWalletRequest", akm);
            akm = null;
        }
        if (akn != null)
        {
            bundle.putParcelable("maskedWallet", akn);
            akn = null;
        }
        if (akk != null)
        {
            bundle.putParcelable("walletFragmentOptions", akk);
            akk = null;
        }
        if (ako != null)
        {
            bundle.putBoolean("enabled", ako.booleanValue());
            ako = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        akv.onStart();
    }

    public void onStop()
    {
        super.onStop();
        akv.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (akt != null)
        {
            b.a(akt, flag);
            ako = null;
            return;
        } else
        {
            ako = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        akw.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (akt != null)
        {
            b.a(akt, maskedwallet);
            akn = null;
            return;
        } else
        {
            akn = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (akt != null)
        {
            b.a(akt, maskedwalletrequest);
            akm = null;
            return;
        } else
        {
            akm = maskedwalletrequest;
            return;
        }
    }
}
