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
import com.google.android.gms.internal.xo;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment, WalletFragmentOptions, WalletFragmentStyle

final class <init> extends a
    implements android.view.ner
{

    final WalletFragment aUZ;

    protected final void a(FrameLayout framelayout)
    {
        byte byte0 = -1;
        byte byte1 = -2;
        Button button = new Button(com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ).getActivity());
        button.setText(com.google.android.gms.uy_button_place_holder);
        int j = byte1;
        int i = byte0;
        if (WalletFragment.e(aUZ) != null)
        {
            WalletFragmentStyle walletfragmentstyle = WalletFragment.e(aUZ).getFragmentStyle();
            j = byte1;
            i = byte0;
            if (walletfragmentstyle != null)
            {
                android.util.DisplayMetrics displaymetrics = com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ).getResources().getDisplayMetrics();
                i = walletfragmentstyle.a("buyButtonWidth", displaymetrics, -1);
                j = walletfragmentstyle.a("buyButtonHeight", displaymetrics, -2);
            }
        }
        button.setLayoutParams(new android.view.arams(i, j));
        button.setOnClickListener(this);
        framelayout.addView(button);
    }

    protected final void a(f f1)
    {
        Object obj = com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ).getActivity();
        if (WalletFragment.b(aUZ) == null && WalletFragment.c(aUZ) && obj != null)
        {
            try
            {
                obj = xo.a(((android.app.Activity) (obj)), WalletFragment.d(aUZ), WalletFragment.e(aUZ), com.google.android.gms.wallet.fragment.WalletFragment.f(aUZ));
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, new <init>(((com.google.android.gms.internal.xe) (obj)), null));
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, null);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                return;
            }
            f1.a(WalletFragment.b(aUZ));
            if (WalletFragment.g(aUZ) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(aUZ), WalletFragment.g(aUZ));
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, null);
            }
            if (WalletFragment.h(aUZ) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(aUZ), WalletFragment.h(aUZ));
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, null);
            }
            if (WalletFragment.i(aUZ) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(aUZ), WalletFragment.i(aUZ));
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, null);
            }
            if (WalletFragment.j(aUZ) != null)
            {
                com.google.android.gms.wallet.fragment.a(WalletFragment.b(aUZ), WalletFragment.j(aUZ).booleanValue());
                com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ, null);
            }
        }
    }

    public final void onClick(View view)
    {
        view = com.google.android.gms.wallet.fragment.WalletFragment.a(aUZ).getActivity();
        GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
    }

    private ableException(WalletFragment walletfragment)
    {
        aUZ = walletfragment;
        super();
    }

    aUZ(WalletFragment walletfragment, aUZ auz)
    {
        this(walletfragment);
    }
}
