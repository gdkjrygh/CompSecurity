// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import Bt;
import Jo;
import Mf;
import OJ;
import Oi;
import UT;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.verification.PhoneVerificationFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodeFragment, TwoFactorSettingsEnabledFragment

public class TwoFAMobileSettingFragment extends PhoneVerificationFragment
{

    public TwoFAMobileSettingFragment()
    {
    }

    static View a(TwoFAMobileSettingFragment twofamobilesettingfragment)
    {
        return twofamobilesettingfragment.mFragmentLayout;
    }

    protected final void a(UT ut)
    {
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

    protected final void h()
    {
        Mf.a().a(new Oi(RecoveryCodeFragment.h(), com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
    }

    protected final UU.a m()
    {
        return UU.a.TWO_FA_TYPE;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040107, viewgroup, false);
        s();
        q();
        v();
        o();
        p();
        d(0x7f0d0547).setOnClickListener(new android.view.View.OnClickListener() {

            private TwoFAMobileSettingFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), TwoFAMobileSettingFragment.a(a));
                a.getActivity().onBackPressed();
            }

            
            {
                a = TwoFAMobileSettingFragment.this;
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
