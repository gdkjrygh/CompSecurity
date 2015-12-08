// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.snapchat.android.analytics.framework.EasyMetric;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class NotificationSettingsFragment extends LeftSwipeSettingFragment
{

    private final Bt a;

    public NotificationSettingsFragment()
    {
        this(Bt.a());
    }

    private NotificationSettingsFragment(Bt bt)
    {
        a = bt;
    }

    static Bt a(NotificationSettingsFragment notificationsettingsfragment)
    {
        return notificationsettingsfragment.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400a7, viewgroup, false);
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private NotificationSettingsFragment a;

            public final void onClick(View view7)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
        });
        layoutinflater = (CheckBox)d(0x7f0d036d);
        viewgroup = (CheckBox)d(0x7f0d0370);
        bundle = (CheckBox)d(0x7f0d0373);
        CheckBox checkbox = (CheckBox)d(0x7f0d0376);
        CheckBox checkbox1 = (CheckBox)d(0x7f0d0379);
        d(0x7f0d036c).setOnClickListener(new android.view.View.OnClickListener(layoutinflater) {

            private CheckBox a;

            public final void onClick(View view7)
            {
                view7 = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view7.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        View view = d(0x7f0d036e);
        view.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private CheckBox a;

            public final void onClick(View view7)
            {
                view7 = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view7.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        View view1 = d(0x7f0d0374);
        view1.setOnClickListener(new android.view.View.OnClickListener(checkbox) {

            private CheckBox a;

            public final void onClick(View view7)
            {
                view7 = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view7.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        View view2 = d(0x7f0d0371);
        view2.setOnClickListener(new android.view.View.OnClickListener(bundle) {

            private CheckBox a;

            public final void onClick(View view7)
            {
                view7 = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view7.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        View view3 = d(0x7f0d0377);
        view3.setOnClickListener(new android.view.View.OnClickListener(checkbox1) {

            private CheckBox a;

            public final void onClick(View view7)
            {
                view7 = a;
                boolean flag;
                if (!a.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view7.setChecked(flag);
            }

            
            {
                a = checkbox;
                super();
            }
        });
        View view4 = d(0x7f0d036f);
        View view5 = d(0x7f0d0375);
        View view6 = d(0x7f0d0372);
        layoutinflater.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(checkbox, checkbox1, bundle, viewgroup, view1, view3, view2, view, view5, d(0x7f0d0378), view6, view4) {

            private CheckBox a;
            private CheckBox b;
            private CheckBox c;
            private CheckBox d;
            private View e;
            private View f;
            private View g;
            private View h;
            private View i;
            private View j;
            private View k;
            private View l;
            private NotificationSettingsFragment m;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                NotificationSettingsFragment.a(m);
                Bt.H(flag);
                a.setEnabled(flag);
                b.setEnabled(flag);
                c.setEnabled(flag);
                d.setEnabled(flag);
                e.setEnabled(flag);
                f.setEnabled(flag);
                g.setEnabled(flag);
                h.setEnabled(flag);
                i.setEnabled(flag);
                j.setEnabled(flag);
                k.setEnabled(flag);
                l.setEnabled(flag);
                StringBuilder stringbuilder = new StringBuilder("NOTIFICATIONS_");
                if (flag)
                {
                    compoundbutton = "ENABLED";
                } else
                {
                    compoundbutton = "DISABLED";
                }
                (new EasyMetric(stringbuilder.append(compoundbutton).toString())).e();
            }

            
            {
                m = NotificationSettingsFragment.this;
                a = checkbox;
                b = checkbox1;
                c = checkbox2;
                d = checkbox3;
                e = view;
                f = view1;
                g = view2;
                h = view3;
                i = view4;
                j = view5;
                k = view6;
                l = view7;
                super();
            }
        });
        layoutinflater.setChecked(Bt.bQ());
        checkbox.setChecked(Bt.bM());
        checkbox1.setChecked(Bt.bN());
        viewgroup.setChecked(Bt.bP());
        bundle.setChecked(Bt.bO());
        checkbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private NotificationSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                NotificationSettingsFragment.a(a);
                Bt.D(flag);
            }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
        });
        checkbox1.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private NotificationSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                NotificationSettingsFragment.a(a);
                Bt.E(flag);
            }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
        });
        bundle.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private NotificationSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                NotificationSettingsFragment.a(a);
                Bt.F(flag);
            }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
        });
        viewgroup.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private NotificationSettingsFragment a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                NotificationSettingsFragment.a(a);
                Bt.G(flag);
            }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }
}
