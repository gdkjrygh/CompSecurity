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
import com.google.android.gms.internal.qi;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment, WalletFragmentOptions, WalletFragmentStyle

private class <init> extends a
    implements android.view.ner
{

    final WalletFragment awt;

    protected void a(FrameLayout framelayout)
    {
        Button button = new Button(com.google.android.gms.wallet.fragment.WalletFragment.a(awt).getActivity());
        button.setText(com.google.android.gms.uy_button_place_holder);
        byte byte0 = -1;
        byte byte1 = -2;
        int j = byte1;
        int i = byte0;
        if (WalletFragment.e(awt) != null)
        {
            WalletFragmentStyle walletfragmentstyle = WalletFragment.e(awt).getFragmentStyle();
            j = byte1;
            i = byte0;
            if (walletfragmentstyle != null)
            {
                android.util.DisplayMetrics displaymetrics = com.google.android.gms.wallet.fragment.WalletFragment.a(awt).getResources().getDisplayMetrics();
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
        Object obj = com.google.android.gms.wallet.fragment.WalletFragment.a(awt).getActivity();
        if (WalletFragment.b(awt) == null && WalletFragment.c(awt) && obj != null)
        {
            try
            {
                obj = qi.a(((android.app.Activity) (obj)), WalletFragment.d(awt), WalletFragment.e(awt), com.google.android.gms.wallet.fragment.WalletFragment.f(awt));
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, new <init>(((com.google.android.gms.internal.qa) (obj)), null));
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, null);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                return;
            }
            f1.a(WalletFragment.b(awt));
            if (WalletFragment.g(awt) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(awt), WalletFragment.g(awt));
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, null);
            }
            if (WalletFragment.h(awt) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(awt), WalletFragment.h(awt));
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, null);
            }
            if (WalletFragment.i(awt) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(awt), WalletFragment.i(awt));
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, null);
            }
            if (WalletFragment.j(awt) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(awt), WalletFragment.j(awt).booleanValue());
                com.google.android.gms.wallet.fragment.WalletFragment.a(awt, null);
            }
        }
    }

    public void onClick(View view)
    {
        view = com.google.android.gms.wallet.fragment.WalletFragment.a(awt).getActivity();
        GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
    }

    private ableException(WalletFragment walletfragment)
    {
        awt = walletfragment;
        super();
    }

    awt(WalletFragment walletfragment, awt awt1)
    {
        this(walletfragment);
    }
}
