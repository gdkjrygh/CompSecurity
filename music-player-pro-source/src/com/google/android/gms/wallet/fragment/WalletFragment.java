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
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qi;
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

    static class a extends com.google.android.gms.internal.qb.a
    {

        private OnStateChangedListener awr;
        private final WalletFragment aws;

        public void a(int k, int l, Bundle bundle)
        {
            if (awr != null)
            {
                awr.onStateChanged(aws, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            awr = onstatechangedlistener;
        }

        a(WalletFragment walletfragment)
        {
            aws = walletfragment;
        }
    }

    private static class b
        implements LifecycleDelegate
    {

        private final qa awl;

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
                k = awl.getState();
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
                awl.initialize(walletfragmentinitparams);
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
                awl.onActivityResult(k, l, intent);
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
                awl.setEnabled(flag);
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
                awl.updateMaskedWallet(maskedwallet);
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
                awl.updateMaskedWalletRequest(maskedwalletrequest);
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
                awl.onCreate(bundle);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.f(awl.onCreateView(com.google.android.gms.dynamic.e.k(layoutinflater), com.google.android.gms.dynamic.e.k(viewgroup), bundle));
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
                awl.a(com.google.android.gms.dynamic.e.k(activity), bundle, bundle1);
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
                awl.onPause();
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
                awl.onResume();
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
                awl.onSaveInstanceState(bundle);
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
                awl.onStart();
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
                awl.onStop();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private b(qa qa1)
        {
            awl = qa1;
        }

    }

    private class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final WalletFragment awt;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.a(awt).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.e(awt) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.e(awt).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.a(awt).getResources().getDisplayMetrics();
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
            Object obj = WalletFragment.a(awt).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.b(awt) == null && WalletFragment.c(awt) && obj != null)
            {
                try
                {
                    obj = qi.a(((Activity) (obj)), WalletFragment.d(awt), com.google.android.gms.wallet.fragment.WalletFragment.e(awt), com.google.android.gms.wallet.fragment.WalletFragment.f(awt));
                    WalletFragment.a(awt, new b(((qa) (obj))));
                    WalletFragment.a(awt, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(com.google.android.gms.wallet.fragment.WalletFragment.b(awt));
                if (WalletFragment.g(awt) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(awt), WalletFragment.g(awt));
                    WalletFragment.a(awt, null);
                }
                if (WalletFragment.h(awt) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(awt), WalletFragment.h(awt));
                    WalletFragment.a(awt, null);
                }
                if (WalletFragment.i(awt) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(awt), WalletFragment.i(awt));
                    WalletFragment.a(awt, null);
                }
                if (WalletFragment.j(awt) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(awt), WalletFragment.j(awt).booleanValue());
                    WalletFragment.a(awt, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = WalletFragment.a(awt).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            awt = WalletFragment.this;
            super();
        }

    }


    private final Fragment TG = this;
    private WalletFragmentOptions awe;
    private WalletFragmentInitParams awf;
    private MaskedWalletRequest awg;
    private MaskedWallet awh;
    private Boolean awi;
    private b awn;
    private final com.google.android.gms.dynamic.b awo = com.google.android.gms.dynamic.b.a(this);
    private final c awp = new c();
    private a awq;
    private boolean mCreated;

    public WalletFragment()
    {
        mCreated = false;
        awq = new a(this);
    }

    static Fragment a(WalletFragment walletfragment)
    {
        return walletfragment.TG;
    }

    static MaskedWallet a(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.awh = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.awg = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(WalletFragment walletfragment, b b1)
    {
        walletfragment.awn = b1;
        return b1;
    }

    static WalletFragmentInitParams a(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.awf = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.awe = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.awi = boolean1;
        return boolean1;
    }

    static b b(WalletFragment walletfragment)
    {
        return walletfragment.awn;
    }

    static boolean c(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.b d(WalletFragment walletfragment)
    {
        return walletfragment.awo;
    }

    static WalletFragmentOptions e(WalletFragment walletfragment)
    {
        return walletfragment.awe;
    }

    static a f(WalletFragment walletfragment)
    {
        return walletfragment.awq;
    }

    static WalletFragmentInitParams g(WalletFragment walletfragment)
    {
        return walletfragment.awf;
    }

    static MaskedWalletRequest h(WalletFragment walletfragment)
    {
        return walletfragment.awg;
    }

    static MaskedWallet i(WalletFragment walletfragment)
    {
        return walletfragment.awh;
    }

    static Boolean j(WalletFragment walletfragment)
    {
        return walletfragment.awi;
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.TG.setArguments(bundle);
        return walletfragment;
    }

    public int getState()
    {
        if (awn != null)
        {
            return b.a(awn);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (awn != null)
        {
            b.a(awn, walletfragmentinitparams);
            awf = null;
        } else
        if (awf == null)
        {
            awf = walletfragmentinitparams;
            if (awg != null)
            {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (awh != null)
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
        if (awn != null)
        {
            b.a(awn, k, l, intent);
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
            if (awf != null)
            {
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            awf = walletfragmentinitparams;
        }
        if (awg == null)
        {
            awg = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (awh == null)
        {
            awh = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            awe = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            awi = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        awp.onCreate(bundle);
        return;
_L2:
        if (TG.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)TG.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.ab(TG.getActivity());
                awe = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return awp.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (awe == null)
        {
            awe = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", awe);
        awp.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        awp.onPause();
    }

    public void onResume()
    {
        super.onResume();
        awp.onResume();
        FragmentManager fragmentmanager = TG.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(TG.getActivity()), TG.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        awp.onSaveInstanceState(bundle);
        if (awf != null)
        {
            bundle.putParcelable("walletFragmentInitParams", awf);
            awf = null;
        }
        if (awg != null)
        {
            bundle.putParcelable("maskedWalletRequest", awg);
            awg = null;
        }
        if (awh != null)
        {
            bundle.putParcelable("maskedWallet", awh);
            awh = null;
        }
        if (awe != null)
        {
            bundle.putParcelable("walletFragmentOptions", awe);
            awe = null;
        }
        if (awi != null)
        {
            bundle.putBoolean("enabled", awi.booleanValue());
            awi = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        awp.onStart();
    }

    public void onStop()
    {
        super.onStop();
        awp.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (awn != null)
        {
            b.a(awn, flag);
            awi = null;
            return;
        } else
        {
            awi = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        awq.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (awn != null)
        {
            b.a(awn, maskedwallet);
            awh = null;
            return;
        } else
        {
            awh = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (awn != null)
        {
            b.a(awn, maskedwalletrequest);
            awg = null;
            return;
        } else
        {
            awg = maskedwalletrequest;
            return;
        }
    }
}
