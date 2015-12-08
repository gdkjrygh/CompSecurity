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
import com.google.android.gms.internal.or;
import com.google.android.gms.internal.oz;
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

    static class a extends com.google.android.gms.internal.os.a
    {

        private OnStateChangedListener atZ;
        private final SupportWalletFragment aua;

        public void a(int k, int l, Bundle bundle)
        {
            if (atZ != null)
            {
                atZ.onStateChanged(aua, k, l, bundle);
            }
        }

        public void a(OnStateChangedListener onstatechangedlistener)
        {
            atZ = onstatechangedlistener;
        }

        a(SupportWalletFragment supportwalletfragment)
        {
            aua = supportwalletfragment;
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

        final SupportWalletFragment auc;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.a(auc).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int l = byte1;
            int k = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.e(auc) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.e(auc).getFragmentStyle();
                l = byte1;
                k = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(auc).getResources().getDisplayMetrics();
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
            Object obj = SupportWalletFragment.a(auc).getActivity();
            if (SupportWalletFragment.b(auc) == null && SupportWalletFragment.c(auc) && obj != null)
            {
                try
                {
                    obj = oz.a(((Activity) (obj)), SupportWalletFragment.d(auc), com.google.android.gms.wallet.fragment.SupportWalletFragment.e(auc), com.google.android.gms.wallet.fragment.SupportWalletFragment.f(auc));
                    SupportWalletFragment.a(auc, new b(((or) (obj))));
                    SupportWalletFragment.a(auc, null);
                }
                // Misplaced declaration of an exception variable
                catch (f f1)
                {
                    return;
                }
                f1.a(SupportWalletFragment.b(auc));
                if (SupportWalletFragment.g(auc) != null)
                {
                    b.a(SupportWalletFragment.b(auc), SupportWalletFragment.g(auc));
                    SupportWalletFragment.a(auc, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.h(auc) != null)
                {
                    b.a(SupportWalletFragment.b(auc), com.google.android.gms.wallet.fragment.SupportWalletFragment.h(auc));
                    SupportWalletFragment.a(auc, null);
                }
                if (SupportWalletFragment.i(auc) != null)
                {
                    b.a(SupportWalletFragment.b(auc), SupportWalletFragment.i(auc));
                    SupportWalletFragment.a(auc, null);
                }
                if (SupportWalletFragment.j(auc) != null)
                {
                    b.a(SupportWalletFragment.b(auc), SupportWalletFragment.j(auc).booleanValue());
                    SupportWalletFragment.a(auc, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = SupportWalletFragment.a(auc).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        private c()
        {
            auc = SupportWalletFragment.this;
            super();
        }

    }


    private final Fragment Lt = this;
    private b atQ;
    private final h atR = com.google.android.gms.dynamic.h.a(this);
    private final c atS = new c();
    private a atT;
    private WalletFragmentOptions atU;
    private WalletFragmentInitParams atV;
    private MaskedWalletRequest atW;
    private MaskedWallet atX;
    private Boolean atY;
    private boolean mCreated;

    public SupportWalletFragment()
    {
        mCreated = false;
        atT = new a(this);
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.Lt;
    }

    static MaskedWallet a(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.atX = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.atW = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static b a(SupportWalletFragment supportwalletfragment, b b1)
    {
        supportwalletfragment.atQ = b1;
        return b1;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.atV = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.atU = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.atY = boolean1;
        return boolean1;
    }

    static b b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atQ;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static h d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atR;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atU;
    }

    static a f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atT;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atV;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atW;
    }

    static MaskedWallet i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atX;
    }

    static Boolean j(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.atY;
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.Lt.setArguments(bundle);
        return supportwalletfragment;
    }

    public int getState()
    {
        if (atQ != null)
        {
            return b.a(atQ);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (atQ != null)
        {
            b.a(atQ, walletfragmentinitparams);
            atV = null;
        } else
        if (atV == null)
        {
            atV = walletfragmentinitparams;
            if (atW != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (atX != null)
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
        if (atQ != null)
        {
            b.a(atQ, k, l, intent);
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
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        atS.onCreate(bundle);
        return;
_L2:
        if (Lt.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)Lt.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.aa(Lt.getActivity());
                atU = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return atS.onCreateView(layoutinflater, viewgroup, bundle);
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
        atS.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        atS.onPause();
    }

    public void onResume()
    {
        super.onResume();
        atS.onResume();
        FragmentManager fragmentmanager = Lt.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(Lt.getActivity()), Lt.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        atS.onSaveInstanceState(bundle);
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
        atS.onStart();
    }

    public void onStop()
    {
        super.onStop();
        atS.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (atQ != null)
        {
            b.a(atQ, flag);
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
        atT.a(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (atQ != null)
        {
            b.a(atQ, maskedwallet);
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
        if (atQ != null)
        {
            b.a(atQ, maskedwalletrequest);
            atW = null;
            return;
        } else
        {
            atW = maskedwalletrequest;
            return;
        }
    }
}
