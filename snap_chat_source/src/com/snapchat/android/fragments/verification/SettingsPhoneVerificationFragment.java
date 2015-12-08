// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bt;
import Jo;
import Mf;
import Nq;
import OJ;
import UT;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.util.AlertDialogUtils;
import com.squareup.otto.Bus;
import mH;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

public class SettingsPhoneVerificationFragment extends PhoneVerificationFragment
{

    private View a;
    private Button b;

    public SettingsPhoneVerificationFragment()
    {
        Bt.a();
        boolean flag;
        if (Bt.aS() && Bt.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
    }

    public SettingsPhoneVerificationFragment(byte byte0)
    {
        this();
    }

    static View a(SettingsPhoneVerificationFragment settingsphoneverificationfragment)
    {
        return settingsphoneverificationfragment.mFragmentLayout;
    }

    protected final void a(UT ut)
    {
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    protected final void h()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04009f, viewgroup, false);
        s();
        q();
        v();
        o();
        p();
        if (Bt.aS())
        {
            a = d(0x7f0d0351);
            a.setVisibility(0);
        }
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsPhoneVerificationFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), SettingsPhoneVerificationFragment.a(a));
                a.getActivity().onBackPressed();
            }

            
            {
                a = SettingsPhoneVerificationFragment.this;
                super();
            }
        });
        layoutinflater = (CheckBox)d(0x7f0d034f);
        layoutinflater.setChecked(Bt.at());
        layoutinflater.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                Ss.a a1 = Ss.a.UPDATESEARCHABLEBYPHONENUMBER;
                if (flag)
                {
                    compoundbutton = "1";
                } else
                {
                    compoundbutton = "0";
                }
                (new mH(a1, new String[] {
                    compoundbutton
                })).execute();
                AnalyticsEvents.a(flag);
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
            Jo.g(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        Jo.a(getActivity(), mFragmentLayout);
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }

    protected final void s()
    {
        super.s();
        b = (Button)d(0x7f0d0352);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
            }

        });
    }

    protected final void u()
    {
        super.u();
    }

    protected final void w()
    {
        n = false;
        e.setEnabled(true);
        i.setVisibility(8);
        j.setVisibility(8);
        h.setText("");
        h.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(8);
        Mf.a().a(new Nq());
        if (Bt.aS())
        {
            a.setVisibility(8);
            AlertDialogUtils.a(0x7f08030b, d);
            Bt.p(false);
            return;
        } else
        {
            AlertDialogUtils.a(0x7f0800d4, d);
            return;
        }
    }

    protected final boolean z()
    {
        return false;
    }
}
