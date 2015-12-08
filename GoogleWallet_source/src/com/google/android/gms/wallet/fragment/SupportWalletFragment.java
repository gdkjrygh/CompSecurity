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
import com.google.android.gms.internal.xe;
import com.google.android.gms.internal.xo;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class SupportWalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {
    }

    static final class a extends com.google.android.gms.internal.xf.a
    {

        private OnStateChangedListener aUP;
        private final SupportWalletFragment aUQ;

        public final void a(int k, int l, Bundle bundle)
        {
            if (aUP != null)
            {
                bundle = aUP;
                bundle = aUQ;
            }
        }

        a(SupportWalletFragment supportwalletfragment)
        {
            aUQ = supportwalletfragment;
        }
    }

    static final class b
        implements LifecycleDelegate
    {

        private final xe aUR;

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

        private void onActivityResult(int k, int l, Intent intent)
        {
            try
            {
                aUR.onActivityResult(k, l, intent);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.i(aUR.onCreateView(com.google.android.gms.dynamic.e.q(layoutinflater), com.google.android.gms.dynamic.e.q(viewgroup), bundle));
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
                aUR.a(com.google.android.gms.dynamic.e.q(activity), bundle, bundle1);
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

        private b(xe xe1)
        {
            aUR = xe1;
        }

    }

    final class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final SupportWalletFragment aUS;

        protected final void a(FrameLayout framelayout)
        {
            byte byte0 = -1;
            byte byte1 = -2;
            Button button = new Button(SupportWalletFragment.a(aUS).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aUS) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aUS).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(aUS).getResources().getDisplayMetrics();
                    k = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                    l = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(k, l));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected final void a(f f1)
        {
            Object obj = SupportWalletFragment.a(aUS).getActivity();
            if (SupportWalletFragment.b(aUS) == null && SupportWalletFragment.c(aUS) && obj != null)
            {
                try
                {
                    obj = xo.a(((Activity) (obj)), SupportWalletFragment.d(aUS), com.google.android.gms.wallet.fragment.SupportWalletFragment.e(aUS), com.google.android.gms.wallet.fragment.SupportWalletFragment.f(aUS));
                    SupportWalletFragment.a(aUS, new b(((xe) (obj))));
                    SupportWalletFragment.a(aUS, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(SupportWalletFragment.b(aUS));
                if (SupportWalletFragment.g(aUS) != null)
                {
                    b.a(SupportWalletFragment.b(aUS), SupportWalletFragment.g(aUS));
                    SupportWalletFragment.a(aUS, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.h(aUS) != null)
                {
                    b.a(SupportWalletFragment.b(aUS), com.google.android.gms.wallet.fragment.SupportWalletFragment.h(aUS));
                    SupportWalletFragment.a(aUS, null);
                }
                if (SupportWalletFragment.i(aUS) != null)
                {
                    b.a(SupportWalletFragment.b(aUS), SupportWalletFragment.i(aUS));
                    SupportWalletFragment.a(aUS, null);
                }
                if (SupportWalletFragment.j(aUS) != null)
                {
                    b.a(SupportWalletFragment.b(aUS), SupportWalletFragment.j(aUS).booleanValue());
                    SupportWalletFragment.a(aUS, null);
                }
            }
        }

        public final void onClick(View view)
        {
            view = SupportWalletFragment.a(aUS).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            aUS = SupportWalletFragment.this;
            super();
        }

    }


    private final Fragment VB = this;
    private b aUG;
    private final h aUH = com.google.android.gms.dynamic.h.a(this);
    private final c aUI = new c();
    private a aUJ;
    private WalletFragmentOptions aUK;
    private WalletFragmentInitParams aUL;
    private MaskedWalletRequest aUM;
    private MaskedWallet aUN;
    private Boolean aUO;
    private boolean mCreated;

    public SupportWalletFragment()
    {
        mCreated = false;
        aUJ = new a(this);
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.VB;
    }

    static MaskedWallet a(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.aUN = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.aUM = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(SupportWalletFragment supportwalletfragment, b b1)
    {
        supportwalletfragment.aUG = b1;
        return b1;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.aUL = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.aUK = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.aUO = boolean1;
        return boolean1;
    }

    static b b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUG;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static h d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUH;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUK;
    }

    static a f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUJ;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUL;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUM;
    }

    static MaskedWallet i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUN;
    }

    static Boolean j(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.aUO;
    }

    public final void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (aUG != null)
        {
            b.a(aUG, k, l, intent);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        WalletFragmentInitParams walletfragmentinitparams = (WalletFragmentInitParams)bundle.getParcelable("walletFragmentInitParams");
        if (walletfragmentinitparams != null)
        {
            if (aUL != null)
            {
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            aUL = walletfragmentinitparams;
        }
        if (aUM == null)
        {
            aUM = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (aUN == null)
        {
            aUN = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            aUK = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            aUO = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        aUI.onCreate(bundle);
        return;
_L2:
        if (VB.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)VB.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.ah(VB.getActivity());
                aUK = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return aUI.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public final void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public final void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (aUK == null)
        {
            aUK = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", aUK);
        aUI.onInflate(activity, attributeset, bundle);
    }

    public final void onPause()
    {
        super.onPause();
        aUI.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        aUI.onResume();
        FragmentManager fragmentmanager = VB.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(VB.getActivity()), VB.getActivity(), -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        aUI.onSaveInstanceState(bundle);
        if (aUL != null)
        {
            bundle.putParcelable("walletFragmentInitParams", aUL);
            aUL = null;
        }
        if (aUM != null)
        {
            bundle.putParcelable("maskedWalletRequest", aUM);
            aUM = null;
        }
        if (aUN != null)
        {
            bundle.putParcelable("maskedWallet", aUN);
            aUN = null;
        }
        if (aUK != null)
        {
            bundle.putParcelable("walletFragmentOptions", aUK);
            aUK = null;
        }
        if (aUO != null)
        {
            bundle.putBoolean("enabled", aUO.booleanValue());
            aUO = null;
        }
    }

    public final void onStart()
    {
        super.onStart();
        aUI.onStart();
    }

    public final void onStop()
    {
        super.onStop();
        aUI.onStop();
    }
}
