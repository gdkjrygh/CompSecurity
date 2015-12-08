// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.fitbit.util.b.a;

public class b
{

    private View a;
    private View b;
    private Drawable c[];
    private int d;
    private Interpolator e;

    public b(View view, View view1, Drawable adrawable[])
    {
        d = 0;
        e = new AccelerateDecelerateInterpolator();
        a = view;
        b = view1;
        c = adrawable;
    }

    private void a(View view, View view1)
    {
        view1.setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(1000L);
        alphaanimation.setInterpolator(e);
        alphaanimation.setAnimationListener(null);
        alphaanimation.setFillAfter(true);
        view1.startAnimation(alphaanimation);
        view1 = new AlphaAnimation(1.0F, 0.0F);
        view1.setDuration(1000L);
        view1.setInterpolator(e);
        view1.setFillAfter(true);
        view1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final b a;

            public void onAnimationEnd(Animation animation)
            {
                com.fitbit.onboarding.landing.b.a(a);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = b.this;
                super();
            }
        });
        view.startAnimation(view1);
    }

    static void a(b b1)
    {
        b1.d();
    }

    private void c()
    {
        int i = d + 1;
        if (d == c.length - 1)
        {
            i = 0;
        }
        c[d].setDither(true);
        c[i].setDither(true);
        com.fitbit.util.b.a.a(c[d], a);
        com.fitbit.util.b.a.a(c[i], b);
    }

    private void d()
    {
        a.setVisibility(8);
        d = d + 1;
        if (d == c.length)
        {
            d = 0;
        }
        View view = b;
        b = a;
        a = view;
        c();
    }

    public void a()
    {
        d = 0;
        c();
        a.setVisibility(0);
        b.setVisibility(8);
        a.clearAnimation();
        b.clearAnimation();
        a.setAnimation(null);
        b.setAnimation(null);
        com.fitbit.util.b.a.a(1.0F, a);
        com.fitbit.util.b.a.a(0.0F, b);
    }

    public void b()
    {
        a(a, b);
    }
}
