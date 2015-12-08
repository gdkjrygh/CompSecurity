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
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.jh;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class WalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(WalletFragment walletfragment, int j, int k, Bundle bundle);
    }

    static class a extends com.google.android.gms.internal.ja.a
    {

        private OnStateChangedListener acL;
        private final WalletFragment acM;

        public void a(int j, int k, Bundle bundle)
        {
            if (acL != null)
            {
                acL.onStateChanged(acM, j, k, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            acL = onstatechangedlistener;
        }

        a(WalletFragment walletfragment)
        {
            acM = walletfragment;
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

        final WalletFragment acN;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.a(acN).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int k = byte1;
            int j = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.e(acN) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.e(acN).getFragmentStyle();
                k = byte1;
                j = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.a(acN).getResources().getDisplayMetrics();
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
            Object obj = WalletFragment.a(acN).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.b(acN) == null && WalletFragment.c(acN) && obj != null)
            {
                try
                {
                    obj = jh.a(((Activity) (obj)), WalletFragment.d(acN), com.google.android.gms.wallet.fragment.WalletFragment.e(acN), com.google.android.gms.wallet.fragment.WalletFragment.f(acN));
                    WalletFragment.a(acN, new b(((iz) (obj))));
                    WalletFragment.a(acN, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(com.google.android.gms.wallet.fragment.WalletFragment.b(acN));
                if (WalletFragment.g(acN) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(acN), WalletFragment.g(acN));
                    WalletFragment.a(acN, null);
                }
                if (WalletFragment.h(acN) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(acN), WalletFragment.h(acN));
                    WalletFragment.a(acN, null);
                }
                if (WalletFragment.i(acN) != null)
                {
                    b.a(com.google.android.gms.wallet.fragment.WalletFragment.b(acN), WalletFragment.i(acN).booleanValue());
                    WalletFragment.a(acN, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = WalletFragment.a(acN).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            acN = WalletFragment.this;
            super();
        }

    }


    private final Fragment Hv = this;
    private WalletFragmentInitParams acA;
    private MaskedWalletRequest acB;
    private Boolean acC;
    private b acH;
    private final com.google.android.gms.dynamic.b acI = com.google.android.gms.dynamic.b.a(this);
    private final c acJ = new c();
    private a acK;
    private WalletFragmentOptions acz;
    private boolean mCreated;

    public WalletFragment()
    {
        mCreated = false;
        acK = new a(this);
    }

    static Fragment a(WalletFragment walletfragment)
    {
        return walletfragment.Hv;
    }

    static MaskedWalletRequest a(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.acB = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(WalletFragment walletfragment, b b1)
    {
        walletfragment.acH = b1;
        return b1;
    }

    static WalletFragmentInitParams a(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.acA = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.acz = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.acC = boolean1;
        return boolean1;
    }

    static b b(WalletFragment walletfragment)
    {
        return walletfragment.acH;
    }

    static boolean c(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.b d(WalletFragment walletfragment)
    {
        return walletfragment.acI;
    }

    static WalletFragmentOptions e(WalletFragment walletfragment)
    {
        return walletfragment.acz;
    }

    static a f(WalletFragment walletfragment)
    {
        return walletfragment.acK;
    }

    static WalletFragmentInitParams g(WalletFragment walletfragment)
    {
        return walletfragment.acA;
    }

    static MaskedWalletRequest h(WalletFragment walletfragment)
    {
        return walletfragment.acB;
    }

    static Boolean i(WalletFragment walletfragment)
    {
        return walletfragment.acC;
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.Hv.setArguments(bundle);
        return walletfragment;
    }

    public int getState()
    {
        if (acH != null)
        {
            return b.a(acH);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (acH != null)
        {
            b.a(acH, walletfragmentinitparams);
            acA = null;
        } else
        if (acA == null)
        {
            acA = walletfragmentinitparams;
            if (acB != null)
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

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (acH != null)
        {
            b.a(acH, j, k, intent);
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
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        acJ.onCreate(bundle);
        return;
_L2:
        if (Hv.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)Hv.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.I(Hv.getActivity());
                acz = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return acJ.onCreateView(layoutinflater, viewgroup, bundle);
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
        acJ.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        acJ.onPause();
    }

    public void onResume()
    {
        super.onResume();
        acJ.onResume();
        FragmentManager fragmentmanager = Hv.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(Hv.getActivity()), Hv.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        acJ.onSaveInstanceState(bundle);
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
        acJ.onStart();
    }

    public void onStop()
    {
        super.onStop();
        acJ.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (acH != null)
        {
            b.a(acH, flag);
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
        acK.a(onstatechangedlistener);
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (acH != null)
        {
            b.a(acH, maskedwalletrequest);
            acB = null;
            return;
        } else
        {
            acB = maskedwalletrequest;
            return;
        }
    }
}
