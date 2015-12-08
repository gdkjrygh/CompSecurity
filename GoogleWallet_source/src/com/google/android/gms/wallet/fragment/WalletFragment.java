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
import com.google.android.gms.internal.xe;
import com.google.android.gms.internal.xo;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class WalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {
    }

    static final class a extends com.google.android.gms.internal.xf.a
    {

        private OnStateChangedListener aUX;
        private final WalletFragment aUY;

        public final void a(int k, int l, Bundle bundle)
        {
            if (aUX != null)
            {
                bundle = aUX;
                bundle = aUY;
            }
        }

        a(WalletFragment walletfragment)
        {
            aUY = walletfragment;
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

        final WalletFragment aUZ;

        protected final void a(FrameLayout framelayout)
        {
            byte byte0 = -1;
            byte byte1 = -2;
            Button button = new Button(WalletFragment.a(aUZ).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.e(aUZ) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.e(aUZ).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.a(aUZ).getResources().getDisplayMetrics();
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
            Object obj = WalletFragment.a(aUZ).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ) == null && WalletFragment.c(aUZ) && obj != null)
            {
                try
                {
                    obj = xo.a(((Activity) (obj)), WalletFragment.d(aUZ), com.google.android.gms.wallet.fragment.WalletFragment.e(aUZ), com.google.android.gms.wallet.fragment.WalletFragment.f(aUZ));
                    WalletFragment.a(aUZ, new b(((xe) (obj))));
                    WalletFragment.a(aUZ, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ));
                if (WalletFragment.g(aUZ) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ), WalletFragment.g(aUZ));
                    WalletFragment.a(aUZ, null);
                }
                if (WalletFragment.h(aUZ) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ), WalletFragment.h(aUZ));
                    WalletFragment.a(aUZ, null);
                }
                if (WalletFragment.i(aUZ) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ), WalletFragment.i(aUZ));
                    WalletFragment.a(aUZ, null);
                }
                if (WalletFragment.j(aUZ) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(aUZ), WalletFragment.j(aUZ).booleanValue());
                    WalletFragment.a(aUZ, null);
                }
            }
        }

        public final void onClick(View view)
        {
            view = WalletFragment.a(aUZ).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            aUZ = WalletFragment.this;
            super();
        }

    }


    private WalletFragmentOptions aUK;
    private WalletFragmentInitParams aUL;
    private MaskedWalletRequest aUM;
    private MaskedWallet aUN;
    private Boolean aUO;
    private b aUT;
    private final com.google.android.gms.dynamic.b aUU = com.google.android.gms.dynamic.b.a(this);
    private final c aUV = new c();
    private a aUW;
    private final Fragment afI = this;
    private boolean mCreated;

    public WalletFragment()
    {
        mCreated = false;
        aUW = new a(this);
    }

    static Fragment a(WalletFragment walletfragment)
    {
        return walletfragment.afI;
    }

    static MaskedWallet a(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.aUN = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.aUM = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(WalletFragment walletfragment, b b1)
    {
        walletfragment.aUT = b1;
        return b1;
    }

    static WalletFragmentInitParams a(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.aUL = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.aUK = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.aUO = boolean1;
        return boolean1;
    }

    static b b(WalletFragment walletfragment)
    {
        return walletfragment.aUT;
    }

    static boolean c(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.b d(WalletFragment walletfragment)
    {
        return walletfragment.aUU;
    }

    static WalletFragmentOptions e(WalletFragment walletfragment)
    {
        return walletfragment.aUK;
    }

    static a f(WalletFragment walletfragment)
    {
        return walletfragment.aUW;
    }

    static WalletFragmentInitParams g(WalletFragment walletfragment)
    {
        return walletfragment.aUL;
    }

    static MaskedWalletRequest h(WalletFragment walletfragment)
    {
        return walletfragment.aUM;
    }

    static MaskedWallet i(WalletFragment walletfragment)
    {
        return walletfragment.aUN;
    }

    static Boolean j(WalletFragment walletfragment)
    {
        return walletfragment.aUO;
    }

    public final void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        if (aUT != null)
        {
            b.a(aUT, k, l, intent);
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
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        aUV.onCreate(bundle);
        return;
_L2:
        if (afI.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)afI.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.ah(afI.getActivity());
                aUK = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return aUV.onCreateView(layoutinflater, viewgroup, bundle);
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
        aUV.onInflate(activity, attributeset, bundle);
    }

    public final void onPause()
    {
        super.onPause();
        aUV.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        aUV.onResume();
        FragmentManager fragmentmanager = afI.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(afI.getActivity()), afI.getActivity(), -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        aUV.onSaveInstanceState(bundle);
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
        aUV.onStart();
    }

    public final void onStop()
    {
        super.onStop();
        aUV.onStop();
    }
}
