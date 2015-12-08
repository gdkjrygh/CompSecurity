// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.captcha;

import Bt;
import FV;
import HZ;
import Iq;
import Jo;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.api2.SolveCaptchaTask;
import com.snapchat.android.fragments.addfriends.NewUserContactBookFragment;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.fragment.SnapchatFragment;
import ja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb;
import jc;
import mk;
import wZ;

public class CaptchaFragment extends SnapchatFragment
    implements com.snapchat.android.api2.SolveCaptchaTask.a, mk.b, wZ.a
{

    private TextView a;
    private TextView b;
    private int c;
    private int d;
    private TextView e;
    private ProgressBar f;
    private Button g;
    private ProgressBar h;
    private int i;
    private GridView j;
    private RelativeLayout k;
    private boolean l;
    private final RegistrationAnalytics m;

    public CaptchaFragment()
    {
        this(new WindowConfiguration());
    }

    private CaptchaFragment(RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration)
    {
        super(windowconfiguration);
        m = registrationanalytics;
    }

    public CaptchaFragment(WindowConfiguration windowconfiguration)
    {
        RegistrationAnalytics registrationanalytics = RegistrationAnalytics.a();
        Bt.a();
        this(registrationanalytics, windowconfiguration);
    }

    static GridView a(CaptchaFragment captchafragment)
    {
        return captchafragment.j;
    }

    static Button b(CaptchaFragment captchafragment)
    {
        return captchafragment.g;
    }

    private void b(boolean flag)
    {
        if (Bt.e() || Bt.g() && flag)
        {
            NewUserContactBookFragment newusercontactbookfragment = new NewUserContactBookFragment();
            a(i, newusercontactbookfragment, com/snapchat/android/fragments/addfriends/NewUserContactBookFragment.getSimpleName());
            return;
        } else
        {
            HZ.a(getActivity());
            return;
        }
    }

    static ProgressBar c(CaptchaFragment captchafragment)
    {
        return captchafragment.h;
    }

    static TextView d(CaptchaFragment captchafragment)
    {
        return captchafragment.e;
    }

    static ProgressBar e(CaptchaFragment captchafragment)
    {
        return captchafragment.f;
    }

    public final void F_()
    {
        if (getActivity() == null)
        {
            return;
        }
        e.setText(0x7f080084);
        e.setVisibility(0);
        f.setVisibility(0);
        Object obj = new android.app.AlertDialog.Builder(getActivity());
        ((android.app.AlertDialog.Builder) (obj)).setMessage(0x7f080085).setCancelable(false).setPositiveButton(0x7f0801bc, new android.content.DialogInterface.OnClickListener() {

            public final void onClick(DialogInterface dialoginterface, int k1)
            {
                dialoginterface.cancel();
            }

        });
        if (!Bt.e())
        {
            ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f080086, new android.content.DialogInterface.OnClickListener() {

                private CaptchaFragment a;

                public final void onClick(DialogInterface dialoginterface, int k1)
                {
                    a.getActivity().onBackPressed();
                }

            
            {
                a = CaptchaFragment.this;
                super();
            }
            });
        }
        ((android.app.AlertDialog.Builder) (obj)).show();
        j.setVisibility(4);
        c = c + 1;
        obj = m;
        int i1 = c;
        int j1 = d;
        ja ja1 = new ja();
        ja1.attemptCount = Long.valueOf(i1);
        ja1.imageCount = Long.valueOf(j1);
        ((RegistrationAnalytics) (obj)).mBlizzardEventLogger.a(ja1);
        (new mk(this)).execute();
        a(0);
        k.setVisibility(8);
        h.setVisibility(4);
    }

    public final void a()
    {
        e.setText(0x7f080082);
        f.setVisibility(8);
        h.setVisibility(4);
        k.setVisibility(8);
        Button button = (Button)d(0x7f0d00d8);
        button.setVisibility(0);
        button.setOnClickListener(new android.view.View.OnClickListener(button) {

            private Button a;
            private CaptchaFragment b;

            public final void onClick(View view)
            {
                if (b.getActivity() == null)
                {
                    return;
                } else
                {
                    a.setVisibility(8);
                    CaptchaFragment.d(b).setText(0x7f080084);
                    CaptchaFragment.e(b).setVisibility(0);
                    (new mk(b)).execute();
                    return;
                }
            }

            
            {
                b = CaptchaFragment.this;
                a = button;
                super();
            }
        });
    }

    public final void a(int i1)
    {
        if (i1 > 0)
        {
            k.setVisibility(0);
            g.setText(0x7f080216);
            g.setClickable(true);
        } else
        {
            k.setVisibility(8);
        }
        d = i1;
    }

    public final void a(String s, List list)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            list = new wZ(fragmentactivity, list, this) {

                private CaptchaFragment b;

                public final boolean areAllItemsEnabled()
                {
                    return CaptchaFragment.a(b).isClickable();
                }

                public final boolean isEnabled(int i1)
                {
                    return CaptchaFragment.a(b).isClickable();
                }

            
            {
                b = CaptchaFragment.this;
                super(context, list, a1);
            }
            };
            j.setAdapter(list);
            j.setOnItemClickListener(list);
            j.setVisibility(0);
            j.setClickable(true);
            j.setOnTouchListener(new android.view.View.OnTouchListener() {

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    return motionevent.getAction() == 2;
                }

            });
            g.setOnClickListener(new android.view.View.OnClickListener(list, s) {

                private wZ a;
                private String b;
                private CaptchaFragment c;

                public final void onClick(View view)
                {
                    if (c.getActivity() == null)
                    {
                        return;
                    }
                    Object obj = a;
                    view = new ArrayList(((wZ) (obj)).a.size());
                    for (obj = ((wZ) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); view.add(Boolean.valueOf(((wZ.b)((Iterator) (obj)).next()).a))) { }
                    (new SolveCaptchaTask(b, view, c)).execute();
                    CaptchaFragment.a(c).setClickable(false);
                    CaptchaFragment.b(c).setText("");
                    CaptchaFragment.b(c).setClickable(false);
                    CaptchaFragment.c(c).setVisibility(0);
                }

            
            {
                c = CaptchaFragment.this;
                a = wz;
                b = s;
                super();
            }
            });
            e.setVisibility(8);
            f.setVisibility(8);
            return;
        }
    }

    public final void a(boolean flag)
    {
        Bt.e(false);
        Bt.h();
        Bt.a(flag);
        RegistrationAnalytics registrationanalytics = m;
        int i1 = c;
        int j1 = d;
        jc jc1 = new jc();
        jc1.attemptCount = Long.valueOf(i1 + 1);
        jc1.imageCount = Long.valueOf(j1);
        registrationanalytics.mBlizzardEventLogger.a(jc1);
        if (!Bt.f())
        {
            m.j();
        }
        b(flag);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final void c()
    {
        F_();
    }

    public final boolean f()
    {
        if (Bt.e() || l)
        {
            (new FV(getActivity())).show();
            return true;
        } else
        {
            return false;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04001a, viewgroup, false);
        Jo.a(getActivity(), mFragmentLayout);
        (new mk(this)).execute();
        a = (TextView)d(0x7f0d00d1);
        b = (TextView)d(0x7f0d00d3);
        e = (TextView)d(0x7f0d00d6);
        f = (ProgressBar)d(0x7f0d00d7);
        g = (Button)d(0x7f0d00da);
        layoutinflater = g;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        h = (ProgressBar)d(0x7f0d00db);
        k = (RelativeLayout)d(0x7f0d00d9);
        j = (GridView)d(0x7f0d00d5);
        j.setVerticalScrollBarEnabled(false);
        i = viewgroup.getId();
        layoutinflater = m;
        viewgroup = new jb();
        ((RegistrationAnalytics) (layoutinflater)).mBlizzardEventLogger.a(viewgroup);
        d(0x7f0d00d0).setOnClickListener(new android.view.View.OnClickListener() {

            private CaptchaFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = CaptchaFragment.this;
                super();
            }
        });
        layoutinflater = getArguments();
        boolean flag;
        if (layoutinflater != null && layoutinflater.containsKey("registrationRecovery") && layoutinflater.getBoolean("registrationRecovery"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        RegistrationStringKey.REG_CAPTCHA_TITLE.setTextViewIfNeeded(a);
        RegistrationStringKey.REG_CAPTCHA_DESC.setTextViewIfNeeded(b);
        return mFragmentLayout;
    }

    public void onResume()
    {
        super.onResume();
        if (Bt.g())
        {
            b(Bt.i());
        }
    }
}
