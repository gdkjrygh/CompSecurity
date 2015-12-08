// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Dj;
import Eh;
import Ei;
import Ge;
import Mf;
import Oi;
import PG;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.settings.LeftSwipeSettingFragment;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodeFragment, ForgetDeviceFragment

public class TwoFactorSettingsEnabledFragment extends LeftSwipeSettingFragment
{

    private CheckBox a;
    private final Set b;
    private final Ei c;
    private Eh d = new Eh() {

        private TwoFactorSettingsEnabledFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (TwoFactorSettingsEnabledFragment.a(a).contains(Integer.valueOf(i)))
            {
                TwoFactorSettingsEnabledFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dj)
                {
                    TwoFactorSettingsEnabledFragment.a(a, ((Dj)cu).b);
                }
            }
        }

            
            {
                a = TwoFactorSettingsEnabledFragment.this;
                super();
            }
    };

    public TwoFactorSettingsEnabledFragment()
    {
        this(Ei.a());
    }

    private TwoFactorSettingsEnabledFragment(Ei ei)
    {
        b = new HashSet();
        c = ei;
    }

    static Set a(TwoFactorSettingsEnabledFragment twofactorsettingsenabledfragment)
    {
        return twofactorsettingsenabledfragment.b;
    }

    static void a(TwoFactorSettingsEnabledFragment twofactorsettingsenabledfragment, Dj.a a1)
    {
        if (a1.a)
        {
            PG.a(twofactorsettingsenabledfragment. new Runnable() {

                private TwoFactorSettingsEnabledFragment a;

                public final void run()
                {
                    a.d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag());
                }

            
            {
                a = TwoFactorSettingsEnabledFragment.this;
                super();
            }
            });
            return;
        } else
        {
            twofactorsettingsenabledfragment.a.setChecked(true);
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, a1.c));
            return;
        }
    }

    static CheckBox b(TwoFactorSettingsEnabledFragment twofactorsettingsenabledfragment)
    {
        return twofactorsettingsenabledfragment.a;
    }

    static Ei c(TwoFactorSettingsEnabledFragment twofactorsettingsenabledfragment)
    {
        return twofactorsettingsenabledfragment.c;
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
        mFragmentLayout = layoutinflater.inflate(0x7f040102, viewgroup, false);
        d(0x7f0d0532).setOnClickListener(new android.view.View.OnClickListener() {

            private TwoFactorSettingsEnabledFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = TwoFactorSettingsEnabledFragment.this;
                super();
            }
        });
        a = (CheckBox)d(0x7f0d0536);
        a.setChecked(true);
        d(0x7f0d0537).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                Mf.a().a(new Oi(new RecoveryCodeFragment()));
            }

        });
        d(0x7f0d0538).setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                Mf.a().a(new Oi(new ForgetDeviceFragment()));
            }

        });
        a.setOnClickListener(new android.view.View.OnClickListener() {

            final TwoFactorSettingsEnabledFragment a;

            public final void onClick(View view)
            {
                (new Ge(this, a.getActivity(), a.getString(0x7f080303), a.getString(0x7f080323), a.getString(0x7f08007f)) {

                    private _cls5 a;

                    protected final void a()
                    {
                        TwoFactorSettingsEnabledFragment.a(a.a).add(Integer.valueOf(TwoFactorSettingsEnabledFragment.c(a.a).a(getContext(), Ss.a.DISABLETWOFA, null, null)));
                    }

                    protected final void b()
                    {
                        TwoFactorSettingsEnabledFragment.b(a.a).setChecked(true);
                        dismiss();
                    }

            
            {
                a = _pcls5;
                super(context, s, s1, s2);
            }
                }).show();
            }

            
            {
                a = TwoFactorSettingsEnabledFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        c.b(1012, d);
        b.clear();
    }

    public void onResume()
    {
        super.onResume();
        c.a(1012, d);
    }
}
