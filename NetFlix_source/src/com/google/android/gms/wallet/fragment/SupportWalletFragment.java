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
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.jh;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class SupportWalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(SupportWalletFragment supportwalletfragment, int j, int k, Bundle bundle);
    }

    static class a extends com.google.android.gms.internal.ja.a
    {

        private OnStateChangedListener acD;
        private final SupportWalletFragment acE;

        public void a(int j, int k, Bundle bundle)
        {
            if (acD != null)
            {
                acD.onStateChanged(acE, j, k, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            acD = onstatechangedlistener;
        }

        a(SupportWalletFragment supportwalletfragment)
        {
            acE = supportwalletfragment;
        }
    }

    private static class b
        implements LifecycleDelegate
    {

        private final iz acF;

        static int a(b b1)
        {
            return b1.getState();
        }

        static void a(b b1, int j, int k, Intent intent)
        {
            b1.onActivityResult(j, k, intent);
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
            int j;
            try
            {
                j = acF.getState();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
            return j;
        }

        private void initialize(WalletFragmentInitParams walletfragmentinitparams)
        {
            try
            {
                acF.initialize(walletfragmentinitparams);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WalletFragmentInitParams walletfragmentinitparams)
            {
                throw new RuntimeException(walletfragmentinitparams);
            }
        }

        private void onActivityResult(int j, int k, Intent intent)
        {
            try
            {
                acF.onActivityResult(j, k, intent);
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
                acF.setEnabled(flag);
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            try
            {
                acF.updateMaskedWalletRequest(maskedwalletrequest);
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
                acF.onCreate(bundle);
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
                layoutinflater = (View)com.google.android.gms.dynamic.e.d(acF.onCreateView(com.google.android.gms.dynamic.e.h(layoutinflater), com.google.android.gms.dynamic.e.h(viewgroup), bundle));
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
                acF.a(com.google.android.gms.dynamic.e.h(activity), bundle, bundle1);
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
                acF.onPause();
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
                acF.onResume();
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
                acF.onSaveInstanceState(bundle);
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
                acF.onStart();
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
                acF.onStop();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private b(iz iz1)
        {
            acF = iz1;
        }

    }

    private class c extends com.google.android.gms.dynamic.a
        implements android.view.View.OnClickListener
    {

        final SupportWalletFragment acG;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.a(acG).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int k = byte1;
            int j = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.e(acG) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.e(acG).getFragmentStyle();
                k = byte1;
                j = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(acG).getResources().getDisplayMetrics();
                    j = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                    k = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(j, k));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected void a(f f1)
        {
            Object obj = SupportWalletFragment.a(acG).getActivity();
            if (SupportWalletFragment.b(acG) == null && SupportWalletFragment.c(acG) && obj != null)
            {
                try
                {
                    obj = jh.a(((Activity) (obj)), SupportWalletFragment.d(acG), com.google.android.gms.wallet.fragment.SupportWalletFragment.e(acG), com.google.android.gms.wallet.fragment.SupportWalletFragment.f(acG));
                    SupportWalletFragment.a(acG, new b(((iz) (obj))));
                    SupportWalletFragment.a(acG, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(SupportWalletFragment.b(acG));
                if (SupportWalletFragment.g(acG) != null)
                {
                    b.a(SupportWalletFragment.b(acG), SupportWalletFragment.g(acG));
                    SupportWalletFragment.a(acG, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.h(acG) != null)
                {
                    b.a(SupportWalletFragment.b(acG), com.google.android.gms.wallet.fragment.SupportWalletFragment.h(acG));
                    SupportWalletFragment.a(acG, null);
                }
                if (SupportWalletFragment.i(acG) != null)
                {
                    b.a(SupportWalletFragment.b(acG), SupportWalletFragment.i(acG).booleanValue());
                    SupportWalletFragment.a(acG, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = SupportWalletFragment.a(acG).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            acG = SupportWalletFragment.this;
            super();
        }

    }


    private final Fragment Hz = this;
    private WalletFragmentInitParams acA;
    private MaskedWalletRequest acB;
    private Boolean acC;
    private b acv;
    private final h acw = com.google.android.gms.dynamic.h.a(this);
    private final c acx = new c();
    private a acy;
    private WalletFragmentOptions acz;
    private boolean mCreated;

    public SupportWalletFragment()
    {
        mCreated = false;
        acy = new a(this);
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.Hz;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.acB = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(SupportWalletFragment supportwalletfragment, b b1)
    {
        supportwalletfragment.acv = b1;
        return b1;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.acA = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.acz = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.acC = boolean1;
        return boolean1;
    }

    static b b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acv;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static h d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acw;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acz;
    }

    static a f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acy;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acA;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acB;
    }

    static Boolean i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.acC;
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.Hz.setArguments(bundle);
        return supportwalletfragment;
    }

    public int getState()
    {
        if (acv != null)
        {
            return b.a(acv);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (acv != null)
        {
            b.a(acv, walletfragmentinitparams);
            acA = null;
        } else
        if (acA == null)
        {
            acA = walletfragmentinitparams;
            if (acB != null)
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

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (acv != null)
        {
            b.a(acv, j, k, intent);
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
            if (acA != null)
            {
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            acA = walletfragmentinitparams;
        }
        if (acB == null)
        {
            acB = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            acz = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            acC = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        acx.onCreate(bundle);
        return;
_L2:
        if (Hz.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)Hz.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.I(Hz.getActivity());
                acz = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return acx.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (acz == null)
        {
            acz = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", acz);
        acx.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        acx.onPause();
    }

    public void onResume()
    {
        super.onResume();
        acx.onResume();
        FragmentManager fragmentmanager = Hz.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(Hz.getActivity()), Hz.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        acx.onSaveInstanceState(bundle);
        if (acA != null)
        {
            bundle.putParcelable("walletFragmentInitParams", acA);
            acA = null;
        }
        if (acB != null)
        {
            bundle.putParcelable("maskedWalletRequest", acB);
            acB = null;
        }
        if (acz != null)
        {
            bundle.putParcelable("walletFragmentOptions", acz);
            acz = null;
        }
        if (acC != null)
        {
            bundle.putBoolean("enabled", acC.booleanValue());
            acC = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        acx.onStart();
    }

    public void onStop()
    {
        super.onStop();
        acx.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (acv != null)
        {
            b.a(acv, flag);
            acC = null;
            return;
        } else
        {
            acC = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        acy.a(onstatechangedlistener);
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (acv != null)
        {
            b.a(acv, maskedwalletrequest);
            acB = null;
            return;
        } else
        {
            acB = maskedwalletrequest;
            return;
        }
    }
}
