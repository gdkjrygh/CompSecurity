// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Fragment;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.oz;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment, WalletFragmentOptions, WalletFragmentStyle

private class <init> extends a
    implements android.view.ner
{

    final WalletFragment auj;

    protected void a(FrameLayout framelayout)
    {
        Button button = new Button(com.google.android.gms.wallet.fragment.WalletFragment.a(auj).getActivity());
        button.setText(com.google.android.gms.uy_button_place_holder);
        byte byte0 = -1;
        byte byte1 = -2;
        int j = byte1;
        int i = byte0;
        if (WalletFragment.e(auj) != null)
        {
            WalletFragmentStyle walletfragmentstyle = WalletFragment.e(auj).getFragmentStyle();
            j = byte1;
            i = byte0;
            if (walletfragmentstyle != null)
            {
                android.util.DisplayMetrics displaymetrics = com.google.android.gms.wallet.fragment.WalletFragment.a(auj).getResources().getDisplayMetrics();
                i = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                j = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
            }
        }
        button.setLayoutParams(new android.view.arams(i, j));
        button.setOnClickListener(this);
        framelayout.addView(button);
    }

    protected void a(f f1)
    {
        Object obj = com.google.android.gms.wallet.fragment.WalletFragment.a(auj).getActivity();
        if (WalletFragment.b(auj) == null && WalletFragment.c(auj) && obj != null)
        {
            try
            {
                obj = oz.a(((android.app.Activity) (obj)), WalletFragment.d(auj), WalletFragment.e(auj), com.google.android.gms.wallet.fragment.WalletFragment.f(auj));
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, new <init>(((com.google.android.gms.internal.or) (obj)), null));
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, null);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                return;
            }
            f1.a(WalletFragment.b(auj));
            if (WalletFragment.g(auj) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(auj), WalletFragment.g(auj));
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, null);
            }
            if (WalletFragment.h(auj) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(auj), WalletFragment.h(auj));
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, null);
            }
            if (WalletFragment.i(auj) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(auj), WalletFragment.i(auj));
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, null);
            }
            if (WalletFragment.j(auj) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(auj), WalletFragment.j(auj).booleanValue());
                com.google.android.gms.wallet.fragment.WalletFragment.a(auj, null);
            }
        }
    }

    public void onClick(View view)
    {
        view = com.google.android.gms.wallet.fragment.WalletFragment.a(auj).getActivity();
        GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
    }

    private ableException(WalletFragment walletfragment)
    {
        auj = walletfragment;
        super();
    }

    auj(WalletFragment walletfragment, auj auj1)
    {
        this(walletfragment);
    }
}
