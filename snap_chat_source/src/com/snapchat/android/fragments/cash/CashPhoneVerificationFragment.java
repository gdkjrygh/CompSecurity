// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import Jo;
import OJ;
import S;
import UT;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.fragments.verification.PhoneVerificationFragment;

public class CashPhoneVerificationFragment extends PhoneVerificationFragment
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    public a a;
    public boolean b;

    public CashPhoneVerificationFragment()
    {
    }

    static View a(CashPhoneVerificationFragment cashphoneverificationfragment)
    {
        return cashphoneverificationfragment.mFragmentLayout;
    }

    protected final void a(UT ut)
    {
    }

    protected final void a(String s)
    {
        AnalyticsEvents.e(s);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    protected final void e()
    {
        super.e();
        Jo.a(getActivity(), mFragmentLayout);
    }

    public final boolean f()
    {
        if (!b && a != null)
        {
            a.b();
        }
        a = null;
        Timber.b("CashPhoneVerificationFragment", "CASH-LOG: Phone is not verified. Closing", new Object[0]);
        return super.f();
    }

    protected final void h()
    {
        Timber.b("CashPhoneVerificationFragment", "CASH-LOG: Phone is verified successfully. Closing", new Object[0]);
        b = true;
        getActivity().mFragments.d();
        if (a != null)
        {
            a.a();
        }
        a = null;
    }

    public final boolean k_()
    {
        return true;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040024, viewgroup, false);
        s();
        q();
        v();
        o();
        p();
        d(0x7f0d00fd).setOnClickListener(new android.view.View.OnClickListener() {

            private CashPhoneVerificationFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), CashPhoneVerificationFragment.a(a));
                a.getActivity().onBackPressed();
            }

            
            {
                a = CashPhoneVerificationFragment.this;
                super();
            }
        });
        if (!Bt.e()) goto _L2; else goto _L1
_L1:
        e.setText(Bt.d());
_L4:
        return mFragmentLayout;
_L2:
        if (e.requestFocus() && !Bt.aS())
        {
            Jo.h(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onResume()
    {
        super.onResume();
        e.clearFocus();
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }

    protected void onVisible()
    {
        super.onVisible();
        if (TextUtils.isEmpty(e.getText()) && e.requestFocus())
        {
            Jo.h(getActivity());
        }
    }
}
