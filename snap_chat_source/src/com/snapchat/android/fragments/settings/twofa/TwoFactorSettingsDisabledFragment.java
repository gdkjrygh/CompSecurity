// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import Bt;
import CU;
import Dj;
import Eh;
import Ei;
import IC;
import Ix;
import Mf;
import Oi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.telephony.PhoneNumberUtils;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.settings.LeftSwipeSettingFragment;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            TwoFAEnableCodeConfirmationFragment, TwoFAMobileSettingFragment

public class TwoFactorSettingsDisabledFragment extends LeftSwipeSettingFragment
{

    protected ProgressBar a;
    private Button b;
    private final Ix c;
    private final Ei d;
    private TextView e;
    private TextView f;
    private final Set g;
    private Eh h = new Eh() {

        private TwoFactorSettingsDisabledFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (TwoFactorSettingsDisabledFragment.a(a).contains(Integer.valueOf(i)))
            {
                TwoFactorSettingsDisabledFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dj)
                {
                    TwoFactorSettingsDisabledFragment.a(a, ((Dj)cu).b);
                }
            }
        }

            
            {
                a = TwoFactorSettingsDisabledFragment.this;
                super();
            }
    };

    public TwoFactorSettingsDisabledFragment()
    {
        Ei ei = Ei.a();
        Ix ix = new Ix();
        Bt.a();
        this(ei, ix);
    }

    private TwoFactorSettingsDisabledFragment(Ei ei, Ix ix)
    {
        g = new HashSet();
        d = ei;
        c = ix;
    }

    static Set a(TwoFactorSettingsDisabledFragment twofactorsettingsdisabledfragment)
    {
        return twofactorsettingsdisabledfragment.g;
    }

    static void a(TwoFactorSettingsDisabledFragment twofactorsettingsdisabledfragment, Dj.a a1)
    {
        twofactorsettingsdisabledfragment.a.setVisibility(8);
        twofactorsettingsdisabledfragment.b.setClickable(true);
        twofactorsettingsdisabledfragment.b.setText(0x7f080216);
        if (a1.a)
        {
            Mf.a().a(new Oi(new TwoFAEnableCodeConfirmationFragment()));
            return;
        } else
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, a1.c));
            return;
        }
    }

    static Ix b(TwoFactorSettingsDisabledFragment twofactorsettingsdisabledfragment)
    {
        return twofactorsettingsdisabledfragment.c;
    }

    static Ei c(TwoFactorSettingsDisabledFragment twofactorsettingsdisabledfragment)
    {
        return twofactorsettingsdisabledfragment.d;
    }

    static Button d(TwoFactorSettingsDisabledFragment twofactorsettingsdisabledfragment)
    {
        return twofactorsettingsdisabledfragment.b;
    }

    static void h()
    {
        Mf.a().a(new Oi(new TwoFAMobileSettingFragment()));
    }

    public final boolean f()
    {
        if (d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()))
        {
            return true;
        } else
        {
            return super.f();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040100, viewgroup, false);
        d(0x7f0d0526).setOnClickListener(new android.view.View.OnClickListener() {

            private TwoFactorSettingsDisabledFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = TwoFactorSettingsDisabledFragment.this;
                super();
            }
        });
        e = (TextView)d(0x7f0d0529);
        f = (TextView)d(0x7f0d052a);
        if (TextUtils.isEmpty(Bt.d()))
        {
            e.setText(IC.a(null, 0x7f0802ec, new Object[] {
                IC.a(null, 0x7f080305, new Object[0])
            }));
            f.setVisibility(8);
        } else
        {
            e.setText(IC.a(null, 0x7f0802ec, new Object[] {
                PhoneNumberUtils.formatNumber(Bt.d())
            }));
            f.setVisibility(0);
            f.setText(0x7f0802e9);
            bundle = getActivity();
            layoutinflater = f;
            viewgroup = new com.snapchat.android.ui.LinkTextViewUtils.a() {

                public final void a()
                {
                    TwoFactorSettingsDisabledFragment.h();
                }

            };
            layoutinflater.setLinkTextColor(bundle.getResources().getColor(0x7f0c0045));
            layoutinflater.setMovementMethod(LinkMovementMethod.getInstance());
            bundle = (Spannable)layoutinflater.getText();
            if (bundle == null)
            {
                throw new NullPointerException();
            }
            URLSpan aurlspan[] = (URLSpan[])bundle.getSpans(0, bundle.length(), android/text/style/URLSpan);
            int j = aurlspan.length;
            for (int i = 0; i < j; i++)
            {
                URLSpan urlspan = aurlspan[i];
                int k = bundle.getSpanStart(urlspan);
                int l = bundle.getSpanEnd(urlspan);
                bundle.removeSpan(urlspan);
                bundle.setSpan(new com.snapchat.android.ui.LinkTextViewUtils.CustomURLSpan(urlspan.getURL(), viewgroup), k, l, 0);
            }

            layoutinflater.setText(bundle);
        }
        b = (Button)d(0x7f0d052b);
        a = (ProgressBar)d(0x7f0d052c);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private TwoFactorSettingsDisabledFragment a;

            public final void onClick(View view)
            {
                TwoFactorSettingsDisabledFragment.b(a);
                if (TextUtils.isEmpty(Bt.d()))
                {
                    TwoFactorSettingsDisabledFragment.h();
                    return;
                } else
                {
                    TwoFactorSettingsDisabledFragment.a(a).add(Integer.valueOf(TwoFactorSettingsDisabledFragment.c(a).a(a.getActivity(), Ss.a.SENDTWOFACODE, null, null)));
                    TwoFactorSettingsDisabledFragment.d(a).setClickable(false);
                    TwoFactorSettingsDisabledFragment.d(a).setText("");
                    a.a.setVisibility(0);
                    return;
                }
            }

            
            {
                a = TwoFactorSettingsDisabledFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        d.b(1012, h);
        g.clear();
    }

    public void onResume()
    {
        super.onResume();
        d.a(1012, h);
    }
}
