// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import Jo;
import OJ;
import UT;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.snapchat.android.fragments.verification.PhoneVerificationFragment;
import com.snapchat.android.ui.window.WindowConfiguration;

public class ReturningUserPhoneVerificationFragment extends PhoneVerificationFragment
{
    public static interface a
    {

        public abstract void N();
    }


    a a;

    public ReturningUserPhoneVerificationFragment()
    {
    }

    public ReturningUserPhoneVerificationFragment(WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
    }

    protected final void a(UT ut)
    {
    }

    protected final void e()
    {
        super.e();
        Jo.a(getActivity(), mFragmentLayout);
    }

    public final boolean f()
    {
        return false;
    }

    protected final void h()
    {
        if (a != null)
        {
            a.N();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        i.setBackgroundResource(0x7f020144);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        e.clearFocus();
        if (Bt.e())
        {
            h();
        }
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }

    protected void onVisible()
    {
        super.onVisible();
        if (TextUtils.isEmpty(e.getText()))
        {
            e.requestFocus();
        }
    }
}
