// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.support.v4.view.ViewPager;
import android.support.v4.view.b.a;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import com.tinder.base.f;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            g

public final class ay extends f
    implements android.view.View.OnClickListener
{

    com.tinder.managers.i c;
    private ViewPager d;
    private TabLayout e;
    private Toolbar f;
    private View g;
    private View h;
    private View i;
    private EditText j;
    private TextView k;
    private p l;
    private boolean m;

    public ay()
    {
        m = false;
    }

    public static ay a()
    {
        return new ay();
    }

    static void a(ay ay1, String s)
    {
        g g1 = (g)ay1.l.a(0);
        ay1 = (g)ay1.l.a(1);
        g1.a(s);
        ay1.a(s);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131624335 2131624338: default 36
    //                   2131624335 230
    //                   2131624336 230
    //                   2131624337 37
    //                   2131624338 146;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (!m)
        {
            m = true;
            float f1 = -(ad.a(h).x - getResources().getDimensionPixelOffset(0x7f0901a1));
            h.animate().translationX(f1).setDuration(165L).setInterpolator(new a()).start();
            i.setVisibility(4);
            k.setVisibility(4);
            j.setVisibility(0);
            g.setVisibility(0);
            ad.a(getActivity(), j);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m)
        {
            ad.c(j);
            h.animate().translationX(0.0F).setDuration(165L).setInterpolator(new DecelerateInterpolator()).start();
            j.setVisibility(8);
            i.setVisibility(0);
            k.setVisibility(0);
            g.setVisibility(8);
            m = false;
            return;
        }
        if (true) goto _L1; else goto _L2
_L2:
        getActivity().onBackPressed();
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ManagerApp.h().a(this);
        return layoutinflater.inflate(0x7f030058, viewgroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d = (ViewPager)view.findViewById(0x7f0e0195);
        e = (TabLayout)view.findViewById(0x7f0e0194);
        f = (Toolbar)view.findViewById(0x7f0e018e);
        k = (TextView)view.findViewById(0x7f0e0190);
        i = view.findViewById(0x7f0e018f);
        j = (EditText)view.findViewById(0x7f0e0193);
        g = view.findViewById(0x7f0e0192);
        h = view.findViewById(0x7f0e0191);
        k.setOnClickListener(this);
        i.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        j.addTextChangedListener(new TextWatcher() {

            final ay a;

            public final void afterTextChanged(Editable editable)
            {
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                com.tinder.fragments.ay.a(a, charsequence.toString());
            }

            
            {
                a = ay.this;
                super();
            }
        });
        l = new p(getChildFragmentManager()) {

            final ay a;

            public final Fragment a(int i1)
            {
                switch (i1)
                {
                default:
                    return null;

                case 0: // '\0'
                    return com.tinder.fragments.g.a(a.c.g());

                case 1: // '\001'
                    return com.tinder.fragments.g.a(a.c.b());
                }
            }

            public final int getCount()
            {
                return 2;
            }

            public final CharSequence getPageTitle(int i1)
            {
                switch (i1)
                {
                default:
                    return null;

                case 0: // '\0'
                    return a.getResources().getString(0x7f060134);

                case 1: // '\001'
                    return a.getResources().getString(0x7f06005f);
                }
            }

            
            {
                a = ay.this;
                super(m1);
            }
        };
        d.setOffscreenPageLimit(2);
        d.setAdapter(l);
        e.setTabsFromPagerAdapter(l);
        e.setupWithViewPager(d);
    }
}
