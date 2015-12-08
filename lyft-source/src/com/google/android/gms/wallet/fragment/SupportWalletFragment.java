// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams

public final class SupportWalletFragment extends Fragment
{

    private zzb a;
    private boolean b;
    private final zzh c = zzh.a(this);
    private final zzc d = new zzc();
    private zza e;
    private final Fragment f = this;
    private WalletFragmentOptions g;
    private WalletFragmentInitParams h;
    private MaskedWalletRequest i;
    private MaskedWallet j;
    private Boolean k;

    public SupportWalletFragment()
    {
        b = false;
        e = new zza();
    }

    static Fragment a(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.f;
    }

    static MaskedWallet a(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.j = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.i = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static zzb a(SupportWalletFragment supportwalletfragment, zzb zzb)
    {
        supportwalletfragment.a = zzb;
        return zzb;
    }

    static WalletFragmentInitParams a(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.h = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions a(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.g = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean a(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.k = boolean1;
        return boolean1;
    }

    static zzb b(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.a;
    }

    static boolean c(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.b;
    }

    static zzh d(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.c;
    }

    static WalletFragmentOptions e(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.g;
    }

    static zza f(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.e;
    }

    static WalletFragmentInitParams g(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.h;
    }

    static MaskedWalletRequest h(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.i;
    }

    static MaskedWallet i(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.j;
    }

    static Boolean j(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.k;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (a != null)
        {
            zzb.a(a, l, i1, intent);
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
            if (h != null)
            {
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            h = walletfragmentinitparams;
        }
        if (i == null)
        {
            i = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (j == null)
        {
            j = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            g = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            k = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        b = true;
        d.a(bundle);
        return;
_L2:
        if (f.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)f.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.a(f.getActivity());
                g = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return d.a(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        b = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (g == null)
        {
            g = WalletFragmentOptions.a(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", g);
        d.a(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        d.d();
    }

    public void onResume()
    {
        super.onResume();
        d.c();
        FragmentManager fragmentmanager = f.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.b(GooglePlayServicesUtil.a(f.getActivity()), f.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        d.b(bundle);
        if (h != null)
        {
            bundle.putParcelable("walletFragmentInitParams", h);
            h = null;
        }
        if (i != null)
        {
            bundle.putParcelable("maskedWalletRequest", i);
            i = null;
        }
        if (j != null)
        {
            bundle.putParcelable("maskedWallet", j);
            j = null;
        }
        if (g != null)
        {
            bundle.putParcelable("walletFragmentOptions", g);
            g = null;
        }
        if (k != null)
        {
            bundle.putBoolean("enabled", k.booleanValue());
            k = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        d.b();
    }

    public void onStop()
    {
        super.onStop();
        d.e();
    }

    private class zzc extends com.google.android.gms.dynamic.zza
        implements android.view.View.OnClickListener
    {

        final SupportWalletFragment a;

        protected void a(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.a(a).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int i1 = byte1;
            int l = byte0;
            if (SupportWalletFragment.e(a) != null)
            {
                WalletFragmentStyle walletfragmentstyle = SupportWalletFragment.e(a).c();
                i1 = byte1;
                l = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.a(a).getResources().getDisplayMetrics();
                    l = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                    i1 = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(l, i1));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected void a(zzf zzf1)
        {
            Object obj = SupportWalletFragment.a(a).getActivity();
            if (SupportWalletFragment.b(a) == null && SupportWalletFragment.c(a) && obj != null)
            {
                try
                {
                    obj = zzqy.a(((Activity) (obj)), SupportWalletFragment.d(a), SupportWalletFragment.e(a), SupportWalletFragment.f(a));
                    SupportWalletFragment.a(a, new zzb(((zzqq) (obj))));
                    SupportWalletFragment.a(a, null);
                }
                // Misplaced declaration of an exception variable
                catch (zzf zzf1)
                {
                    return;
                }
                zzf1.a(SupportWalletFragment.b(a));
                if (SupportWalletFragment.g(a) != null)
                {
                    zzb.a(SupportWalletFragment.b(a), SupportWalletFragment.g(a));
                    SupportWalletFragment.a(a, null);
                }
                if (SupportWalletFragment.h(a) != null)
                {
                    zzb.a(SupportWalletFragment.b(a), SupportWalletFragment.h(a));
                    SupportWalletFragment.a(a, null);
                }
                if (SupportWalletFragment.i(a) != null)
                {
                    zzb.a(SupportWalletFragment.b(a), SupportWalletFragment.i(a));
                    SupportWalletFragment.a(a, null);
                }
                if (SupportWalletFragment.j(a) != null)
                {
                    zzb.a(SupportWalletFragment.b(a), SupportWalletFragment.j(a).booleanValue());
                    SupportWalletFragment.a(a, null);
                }
            }
        }

        public void onClick(View view)
        {
            view = SupportWalletFragment.a(a).getActivity();
            GooglePlayServicesUtil.b(GooglePlayServicesUtil.a(view), view, -1);
        }

        private zzc()
        {
            a = SupportWalletFragment.this;
            super();
        }

    }


    private class zza extends com.google.android.gms.internal.zzqr.zza
    {

        private OnStateChangedListener a;
        private final SupportWalletFragment b;

        public void a(int l, int i1, Bundle bundle)
        {
            if (a != null)
            {
                a.a(b, l, i1, bundle);
            }
        }

        zza()
        {
            b = SupportWalletFragment.this;
        }

        private class OnStateChangedListener
        {

            public abstract void a(SupportWalletFragment supportwalletfragment, int l, int i1, Bundle bundle);
        }

    }


    private class zzb
        implements LifecycleDelegate
    {

        private final zzqq a;

        private void a(int l, int i1, Intent intent)
        {
            try
            {
                a.a(l, i1, intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw new RuntimeException(intent);
            }
        }

        private void a(MaskedWallet maskedwallet)
        {
            try
            {
                a.a(maskedwallet);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWallet maskedwallet)
            {
                throw new RuntimeException(maskedwallet);
            }
        }

        private void a(MaskedWalletRequest maskedwalletrequest)
        {
            try
            {
                a.a(maskedwalletrequest);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWalletRequest maskedwalletrequest)
            {
                throw new RuntimeException(maskedwalletrequest);
            }
        }

        static void a(zzb zzb1, int l, int i1, Intent intent)
        {
            zzb1.a(l, i1, intent);
        }

        static void a(zzb zzb1, MaskedWallet maskedwallet)
        {
            zzb1.a(maskedwallet);
        }

        static void a(zzb zzb1, MaskedWalletRequest maskedwalletrequest)
        {
            zzb1.a(maskedwalletrequest);
        }

        static void a(zzb zzb1, WalletFragmentInitParams walletfragmentinitparams)
        {
            zzb1.a(walletfragmentinitparams);
        }

        static void a(zzb zzb1, boolean flag)
        {
            zzb1.a(flag);
        }

        private void a(WalletFragmentInitParams walletfragmentinitparams)
        {
            try
            {
                a.a(walletfragmentinitparams);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WalletFragmentInitParams walletfragmentinitparams)
            {
                throw new RuntimeException(walletfragmentinitparams);
            }
        }

        private void a(boolean flag)
        {
            try
            {
                a.a(flag);
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = (View)zze.a(a.a(zze.a(layoutinflater), zze.a(viewgroup), bundle));
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeException(layoutinflater);
            }
            return layoutinflater;
        }

        public void a()
        {
            try
            {
                a.a();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void a(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
            try
            {
                a.a(zze.a(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new RuntimeException(activity);
            }
        }

        public void a(Bundle bundle)
        {
            try
            {
                a.a(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public void b()
        {
            try
            {
                a.b();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void b(Bundle bundle)
        {
            try
            {
                a.b(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public void c()
        {
            try
            {
                a.c();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void d()
        {
            try
            {
                a.d();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void e()
        {
        }

        public void f()
        {
        }

        public void g()
        {
        }

        private zzb(zzqq zzqq1)
        {
            a = zzqq1;
        }

    }

}
