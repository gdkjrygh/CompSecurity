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
import com.google.android.gms.internal.ll;
import com.google.android.gms.internal.lt;
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

    static class a extends com.google.android.gms.internal.lm.a
    {

        private OnStateChangedListener akm;
        private final SupportWalletFragment akn;

        public void a(int k, int l, Bundle bundle)
        {
            if (akm != null)
            {
                akm.onStateChanged(akn, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            akm = onstatechangedlistener;
        }

        a(SupportWalletFragment supportwalletfragment)
        {
            akn = supportwalletfragment;
        }
    }

    private static class b
        implements LifecycleDelegate
    {

        private final ll ako;

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
                k = ako.getState();
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
                ako.initialize(walletfragmentinitparams);
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
                ako.onActivityResult(k, l, intent);
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
                ako.setEnabled(flag);
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
                ako.updateMaskedWallet(maskedwallet);
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
                ako.updateMaskedWalletRequest(maskedwalletrequest);
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
                ako.onCreate(bundle);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.e(ako.onCreateView(com.google.android.gms.dynamic.e.h(layoutinflater), com.google.android.gms.dynamic.e.h(viewgroup), bundle));
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
                ako.a(com.google.android.gms.dynamic.e.h(activity), bundle, bundle1);
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
                ako.onPause();
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
                ako.onResume();
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
                ako.onSaveInstanceState(bundle);
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
                ako.onStart();
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
                ako.onStop();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private b(ll ll1)
        {
            ako = ll1;
        }

    }

    private class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final SupportWalletFragment akp;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.a(akp).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.e(akp) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.e(akp).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(akp).getResources().getDisplayMetrics();
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
            Object obj = SupportWalletFragment.a(akp).getActivity();
            if (SupportWalletFragment.b(akp) == null && SupportWalletFragment.c(akp) && obj != null)
            {
                try
                {
                    obj = lt.a(((Activity) (obj)), SupportWalletFragment.d(akp), com.google.android.gms.wallet.fragment.SupportWalletFragment.e(akp), com.google.android.gms.wallet.fragment.SupportWalletFragment.f(akp));
                    SupportWalletFragment.a(akp, new b(((ll) (obj))));
                    SupportWalletFragment.a(akp, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(SupportWalletFragment.b(akp));
                if (SupportWalletFragment.g(akp) != null)
                {
                    b.a(SupportWalletFragment.b(akp), SupportWalletFragment.g(akp));
                    SupportWalletFragment.a(akp, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.h(akp) != null)
                {
                    b.a(SupportWalletFragment.b(akp), com.google.android.gms.wallet.fragment.SupportWalletFragment.h(akp));
                    SupportWalletFragment.a(akp, null);
                }
                if (SupportWalletFragment.i(akp) != null)
                {
                    b.a(SupportWalletFragment.b(akp), SupportWalletFragment.i(akp));
                    SupportWalletFragment.a(akp, null);
                }
                if (SupportWalletFragment.j(akp) != null)
                {
                    b.a(SupportWalletFragment.b(akp), SupportWalletFragment.j(akp).booleanValue());
                    SupportWalletFragment.a(akp, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = SupportWalletFragment.a(akp).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            akp = SupportWalletFragment.this;
            super();
        }

    }


    private final Fragment FS = this;
    private b akd;
    private final h ake = com.google.android.gms.dynamic.h.a(this);
    private final c akf = new c();
    private a akg;
    private WalletFragmentOptions akh;
    private WalletFragmentInitParams aki;
    private MaskedWalletRequest akj;
    private MaskedWallet akk;
    private Boolean akl;
    private boolean mCreated;

    public SupportWalletFragment()
    {
        mCreated = false;
        akg = new a(this);
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.FS;
    }

    static MaskedWallet a(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.akk = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.akj = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(SupportWalletFragment supportwalletfragment, b b1)
    {
        supportwalletfragment.akd = b1;
        return b1;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.aki = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.akh = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.akl = boolean1;
        return boolean1;
    }

    static b b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akd;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static h d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.ake;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akh;
    }

    static a f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akg;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aki;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akj;
    }

    static MaskedWallet i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akk;
    }

    static Boolean j(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.akl;
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.FS.setArguments(bundle);
        return supportwalletfragment;
    }

    public int getState()
    {
        if (akd != null)
        {
            return b.a(akd);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (akd != null)
        {
            b.a(akd, walletfragmentinitparams);
            aki = null;
        } else
        if (aki == null)
        {
            aki = walletfragmentinitparams;
            if (akj != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (akk != null)
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
        if (akd != null)
        {
            b.a(akd, k, l, intent);
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
            if (aki != null)
            {
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            aki = walletfragmentinitparams;
        }
        if (akj == null)
        {
            akj = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (akk == null)
        {
            akk = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            akh = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            akl = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        akf.onCreate(bundle);
        return;
_L2:
        if (FS.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)FS.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.N(FS.getActivity());
                akh = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return akf.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (akh == null)
        {
            akh = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", akh);
        akf.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        akf.onPause();
    }

    public void onResume()
    {
        super.onResume();
        akf.onResume();
        FragmentManager fragmentmanager = FS.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(FS.getActivity()), FS.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        akf.onSaveInstanceState(bundle);
        if (aki != null)
        {
            bundle.putParcelable("walletFragmentInitParams", aki);
            aki = null;
        }
        if (akj != null)
        {
            bundle.putParcelable("maskedWalletRequest", akj);
            akj = null;
        }
        if (akk != null)
        {
            bundle.putParcelable("maskedWallet", akk);
            akk = null;
        }
        if (akh != null)
        {
            bundle.putParcelable("walletFragmentOptions", akh);
            akh = null;
        }
        if (akl != null)
        {
            bundle.putBoolean("enabled", akl.booleanValue());
            akl = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        akf.onStart();
    }

    public void onStop()
    {
        super.onStop();
        akf.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (akd != null)
        {
            b.a(akd, flag);
            akl = null;
            return;
        } else
        {
            akl = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        akg.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (akd != null)
        {
            b.a(akd, maskedwallet);
            akk = null;
            return;
        } else
        {
            akk = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (akd != null)
        {
            b.a(akd, maskedwalletrequest);
            akj = null;
            return;
        } else
        {
            akj = maskedwalletrequest;
            return;
        }
    }
}
