// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import com.spotify.android.paste.widget.ViewPagerIndicator;
import fou;
import fpc;
import fyw;
import gbu;
import gix;
import gjh;
import java.util.List;
import lu;

public class ShowcaseActivity extends fou
{

    private ViewPager d;
    private fpc i;
    private Button j;
    private Button k;
    private gix l;
    private List m;

    public ShowcaseActivity()
    {
    }

    static ViewPager a(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.d;
    }

    static fpc b(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.i;
    }

    static List c(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.m;
    }

    static gix d(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.l;
    }

    static Button e(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.k;
    }

    static void f(ShowcaseActivity showcaseactivity)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(150L);
        alphaanimation.setAnimationListener(showcaseactivity. new gbu() {

            private ShowcaseActivity a;

            public final void onAnimationEnd(Animation animation)
            {
                ShowcaseActivity.e(a).setVisibility(4);
            }

            
            {
                a = ShowcaseActivity.this;
                super();
            }
        });
        showcaseactivity.k.startAnimation(alphaanimation);
        showcaseactivity.j.setVisibility(0);
    }

    static void g(ShowcaseActivity showcaseactivity)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(150L);
        alphaanimation.setAnimationListener(showcaseactivity. new gbu() {

            private ShowcaseActivity a;

            public final void onAnimationEnd(Animation animation)
            {
                ShowcaseActivity.e(a).setVisibility(0);
                ShowcaseActivity.h(a).setVisibility(4);
            }

            
            {
                a = ShowcaseActivity.this;
                super();
            }
        });
        showcaseactivity.k.startAnimation(alphaanimation);
    }

    static Button h(ShowcaseActivity showcaseactivity)
    {
        return showcaseactivity.j;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030030);
        Object obj = fyw.a(this);
        i = new fpc(a_());
        d = (ViewPager)findViewById(0x7f1102cf);
        d.a(i);
        bundle = (ViewPagerIndicator)findViewById(0x7f1102d0);
        bundle.a(d);
        j = (Button)findViewById(0x7f1102d1);
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private ShowcaseActivity a;

            public final void onClick(View view)
            {
                int i1 = Math.min(ShowcaseActivity.a(a).b() + 1, ShowcaseActivity.b(a).b());
                ShowcaseActivity.a(a).b(i1);
            }

            
            {
                a = ShowcaseActivity.this;
                super();
            }
        });
        k = (Button)findViewById(0x7f1102d2);
        k.setOnClickListener(new android.view.View.OnClickListener() {

            private ShowcaseActivity a;

            public final void onClick(View view)
            {
                ShowcaseActivity.d(a).a(ShowcaseActivity.c(a));
                a.finish();
            }

            
            {
                a = ShowcaseActivity.this;
                super();
            }
        });
        lu lu = new lu() {

            private ShowcaseActivity a;

            public final void a(int i1)
            {
                if (i1 < ShowcaseActivity.b(a).b() - 1)
                {
                    if (ShowcaseActivity.e(a).getVisibility() == 0)
                    {
                        ShowcaseActivity.f(a);
                    }
                } else
                if (ShowcaseActivity.e(a).getVisibility() == 4)
                {
                    ShowcaseActivity.g(a);
                    return;
                }
            }

            public final void a(int i1, float f1, int j1)
            {
            }

            public final void b(int i1)
            {
            }

            
            {
                a = ShowcaseActivity.this;
                super();
            }
        };
        l = new gix(this);
        m = l.a(((com.spotify.mobile.android.ui.fragments.logic.Flags) (obj)));
        obj = i;
        obj.b = m;
        ((fpc) (obj)).c();
        if (m.size() == 1)
        {
            j.setVisibility(4);
            k.setVisibility(0);
        }
        obj = new gjh();
        ((gjh) (obj)).a(lu);
        ((gjh) (obj)).a(bundle);
        d.a(((lu) (obj)));
    }
}
