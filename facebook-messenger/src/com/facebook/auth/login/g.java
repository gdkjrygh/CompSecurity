// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.facebook.auth.login:
//            e, AuthFragmentLogoViewGroup, i, j, 
//            h, l, c, d

class g
    implements e
{

    final AuthFragmentLogoViewGroup a;

    private g(AuthFragmentLogoViewGroup authfragmentlogoviewgroup)
    {
        a = authfragmentlogoviewgroup;
        super();
    }

    g(AuthFragmentLogoViewGroup authfragmentlogoviewgroup, d d1)
    {
        this(authfragmentlogoviewgroup);
    }

    private AnimationSet a(View view, View view1)
    {
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        view.getLocationInWindow(ai);
        ai[2] = view.getWidth();
        ai[3] = view.getHeight();
        view = new int[4];
        View _tmp1 = view;
        view[0] = 0;
        view[1] = 0;
        view[2] = 0;
        view[3] = 0;
        view1.getLocationInWindow(view);
        view[2] = view1.getWidth();
        view[3] = view1.getHeight();
        view1 = new AnimationSet(true);
        view1.addAnimation(new ScaleAnimation(1.0F, (float)view[2] / (float)ai[2], 1.0F, (float)view[3] / (float)ai[3]));
        view1.addAnimation(new TranslateAnimation(0.0F, view[0] - ai[0], 0.0F, view[1] - ai[1]));
        return view1;
    }

    static AnimationSet a(g g1, View view, View view1)
    {
        return g1.a(view, view1);
    }

    private Bitmap[] a(int k, int i1)
    {
        Bitmap abitmap[] = new Bitmap[2];
        abitmap[0] = null;
        abitmap[1] = null;
        if (k != 0)
        {
            abitmap[0] = BitmapFactory.decodeResource(a.getResources(), k);
        }
        if (i1 == k)
        {
            abitmap[1] = abitmap[0];
        } else
        if (i1 != 0)
        {
            abitmap[1] = BitmapFactory.decodeResource(a.getResources(), i1);
            return abitmap;
        }
        return abitmap;
    }

    private void b()
    {
        LinearLayout linearlayout = (LinearLayout)AuthFragmentLogoViewGroup.access$300(a);
        LinearLayout linearlayout1 = (LinearLayout)AuthFragmentLogoViewGroup.access$400(a);
        DisplayMetrics displaymetrics = a.getResources().getDisplayMetrics();
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            linearlayout.setOrientation(1);
            linearlayout1.setOrientation(1);
            return;
        } else
        {
            linearlayout.setOrientation(0);
            linearlayout1.setOrientation(0);
            return;
        }
    }

    private void c()
    {
        AuthFragmentLogoViewGroup.access$600(a).setImageResource(AuthFragmentLogoViewGroup.access$500(a));
        AuthFragmentLogoViewGroup.access$800(a).setImageResource(AuthFragmentLogoViewGroup.access$700(a));
        AuthFragmentLogoViewGroup.access$400(a).setVisibility(8);
        AuthFragmentLogoViewGroup.access$900(a).setVisibility(0);
        AuthFragmentLogoViewGroup.access$300(a).setVisibility(0);
    }

    private void d()
    {
        Object obj = new i(this);
        Bitmap abitmap[] = a(AuthFragmentLogoViewGroup.access$1000(a), AuthFragmentLogoViewGroup.access$500(a));
        Bitmap abitmap1[] = a(AuthFragmentLogoViewGroup.access$1100(a), AuthFragmentLogoViewGroup.access$700(a));
        obj = new j(this, ((Runnable) (obj)));
        AuthFragmentLogoViewGroup.access$1200(a).setImageBitmap(abitmap[0]);
        AuthFragmentLogoViewGroup.access$1400(a).setImageBitmap(abitmap1[0]);
        AuthFragmentLogoViewGroup.access$600(a).setImageBitmap(abitmap[1]);
        AuthFragmentLogoViewGroup.access$800(a).setImageBitmap(abitmap1[1]);
        a.postDelayed(((Runnable) (obj)), 200L);
    }

    public void a()
    {
        b();
        if (a.getArguments().getString("orca:authparam:help_url") != null)
        {
            AuthFragmentLogoViewGroup.access$200(a).setVisibility(0);
        }
        AuthFragmentLogoViewGroup.access$200(a).setOnClickListener(new h(this));
        l l1 = (l)a.getArguments().getSerializable("orca:authparam:splash_transition");
        if (!a.control.O())
        {
            l1 = l.NONE;
        }
        switch (d.a[l1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            c();
            return;

        case 2: // '\002'
            d();
            break;
        }
    }

    public void a(Configuration configuration)
    {
        b();
    }
}
