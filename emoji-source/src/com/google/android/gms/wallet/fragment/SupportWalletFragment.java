// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.dynamic.h;
import com.google.android.gms.internal.lk;
import com.google.android.gms.internal.ls;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class SupportWalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(SupportWalletFragment supportwalletfragment, int k, int l, Bundle bundle);
    }

    static class a extends com.google.android.gms.internal.ll.a
    {

        private OnStateChangedListener akp;
        private final SupportWalletFragment akq;

        public void a(int k, int l, Bundle bundle)
        {
            if (akp != null)
            {
                akp.onStateChanged(akq, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            akp = onstatechangedlistener;
        }

        a(SupportWalletFragment supportwalletfragment)
        {
            akq = supportwalletfragment;
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

        final SupportWalletFragment aks;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.a(aks).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aks) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aks).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(aks).getResources().getDisplayMetrics();
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
            Object obj = SupportWalletFragment.a(aks).getActivity();
            if (SupportWalletFragment.b(aks) == null && SupportWalletFragment.c(aks) && obj != null)
            {
                try
                {
                    obj = ls.a(((Activity) (obj)), SupportWalletFragment.d(aks), com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aks), com.google.android.gms.wallet.fragment.SupportWalletFragment.f(aks));
                    SupportWalletFragment.a(aks, new b(((lk) (obj))));
                    SupportWalletFragment.a(aks, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(SupportWalletFragment.b(aks));
                if (SupportWalletFragment.g(aks) != null)
                {
                    b.a(SupportWalletFragment.b(aks), SupportWalletFragment.g(aks));
                    SupportWalletFragment.a(aks, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.h(aks) != null)
                {
                    b.a(SupportWalletFragment.b(aks), com.google.android.gms.wallet.fragment.SupportWalletFragment.h(aks));
                    SupportWalletFragment.a(aks, null);
                }
                if (SupportWalletFragment.i(aks) != null)
                {
                    b.a(SupportWalletFragment.b(aks), SupportWalletFragment.i(aks));
                    SupportWalletFragment.a(aks, null);
                }
                if (SupportWalletFragment.j(aks) != null)
                {
                    b.a(SupportWalletFragment.b(aks), SupportWalletFragment.j(aks).booleanValue());
                    SupportWalletFragment.a(aks, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = SupportWalletFragment.a(aks).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            aks = SupportWalletFragment.this;
            super();
        }

    }


    private final Fragment FV = this;
    private b akg;
    private final h akh = com.google.android.gms.dynamic.h.a(this);
    private final c aki = new c();
    private a akj;
    private WalletFragmentOptions akk;
    private WalletFragmentInitParams akl;
    private MaskedWalletRequest akm;
    private MaskedWallet akn;
    private Boolean ako;
    private boolean mCreated;

    public SupportWalletFragment()
    {
        mCreated = false;
        akj = new a(this);
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.FV;
    }

    static MaskedWallet a(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.akn = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.akm = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(SupportWalletFragment supportwalletfragment, b b1)
    {
        supportwalletfragment.akg = b1;
        return b1;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.akl = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.akk = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.ako = boolean1;
        return boolean1;
    }

    static b b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akg;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static h d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akh;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akk;
    }

    static a f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akj;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akl;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akm;
    }

    static MaskedWallet i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akn;
    }

    static Boolean j(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.ako;
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.FV.setArguments(bundle);
        return supportwalletfragment;
    }

    public int getState()
    {
        if (akg != null)
        {
            return b.a(akg);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (akg != null)
        {
            b.a(akg, walletfragmentinitparams);
            akl = null;
        } else
        if (akl == null)
        {
            akl = walletfragmentinitparams;
            if (akm != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (akn != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (akg != null)
        {
            b.a(akg, k, l, intent);
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
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        aki.onCreate(bundle);
        return;
_L2:
        if (FV.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)FV.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.Q(FV.getActivity());
                akk = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return aki.onCreateView(layoutinflater, viewgroup, bundle);
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
        aki.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        aki.onPause();
    }

    public void onResume()
    {
        super.onResume();
        aki.onResume();
        FragmentManager fragmentmanager = FV.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(FV.getActivity()), FV.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        aki.onSaveInstanceState(bundle);
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
        aki.onStart();
    }

    public void onStop()
    {
        super.onStop();
        aki.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (akg != null)
        {
            b.a(akg, flag);
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
        akj.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (akg != null)
        {
            b.a(akg, maskedwallet);
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
        if (akg != null)
        {
            b.a(akg, maskedwalletrequest);
            akm = null;
            return;
        } else
        {
            akm = maskedwalletrequest;
            return;
        }
    }
}
