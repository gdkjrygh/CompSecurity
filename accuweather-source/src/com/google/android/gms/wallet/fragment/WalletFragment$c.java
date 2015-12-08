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
import com.google.android.gms.internal.lt;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment, WalletFragmentOptions, WalletFragmentStyle

private class <init> extends a
    implements android.view.ner
{

    final WalletFragment akw;

    protected void a(FrameLayout framelayout)
    {
        Button button = new Button(com.google.android.gms.wallet.fragment.WalletFragment.a(akw).getActivity());
        button.setText(com.google.android.gms.uy_button_place_holder);
        byte byte0 = -1;
        byte byte1 = -2;
        int j = byte1;
        int i = byte0;
        if (WalletFragment.e(akw) != null)
        {
            WalletFragmentStyle walletfragmentstyle = WalletFragment.e(akw).getFragmentStyle();
            j = byte1;
            i = byte0;
            if (walletfragmentstyle != null)
            {
                android.util.DisplayMetrics displaymetrics = com.google.android.gms.wallet.fragment.WalletFragment.a(akw).getResources().getDisplayMetrics();
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
        Object obj = com.google.android.gms.wallet.fragment.WalletFragment.a(akw).getActivity();
        if (WalletFragment.b(akw) == null && WalletFragment.c(akw) && obj != null)
        {
            try
            {
                obj = lt.a(((android.app.Activity) (obj)), WalletFragment.d(akw), WalletFragment.e(akw), com.google.android.gms.wallet.fragment.WalletFragment.f(akw));
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, new <init>(((com.google.android.gms.internal.ll) (obj)), null));
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, null);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                return;
            }
            f1.a(WalletFragment.b(akw));
            if (WalletFragment.g(akw) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(akw), WalletFragment.g(akw));
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, null);
            }
            if (WalletFragment.h(akw) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(akw), WalletFragment.h(akw));
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, null);
            }
            if (WalletFragment.i(akw) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(akw), WalletFragment.i(akw));
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, null);
            }
            if (WalletFragment.j(akw) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(akw), WalletFragment.j(akw).booleanValue());
                com.google.android.gms.wallet.fragment.WalletFragment.a(akw, null);
            }
        }
    }

    public void onClick(View view)
    {
        view = com.google.android.gms.wallet.fragment.WalletFragment.a(akw).getActivity();
        GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
    }

    private ableException(WalletFragment walletfragment)
    {
        akw = walletfragment;
        super();
    }

    akw(WalletFragment walletfragment, akw akw1)
    {
        this(walletfragment);
    }
}
