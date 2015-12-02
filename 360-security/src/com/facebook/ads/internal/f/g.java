// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class g
{
    private class a
        implements android.view.animation.Animation.AnimationListener
    {

        final g a;
        private final View b;
        private boolean c;
        private Animation d;
        private Animation e;

        private void a(Animation animation)
        {
            if (animation == d)
            {
                b.startAnimation(e);
            } else
            if (animation == e)
            {
                b.startAnimation(d);
                return;
            }
        }

        static void a(a a1, Animation animation)
        {
            a1.a(animation);
        }

        public a a(boolean flag)
        {
            c = flag;
            return this;
        }

        public void a()
        {
            d = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, 0.0F, 0, 0 - g.a(a));
            d.setDuration(g.b(a));
            d.setStartOffset(g.c(a));
            d.setFillAfter(true);
            d.setAnimationListener(this);
            e = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, g.a(a), 0, 0.0F);
            e.setDuration(g.b(a));
            e.setStartOffset(g.c(a));
            e.setFillAfter(true);
            e.setAnimationListener(this);
            View view = b;
            Animation animation;
            if (c)
            {
                animation = e;
            } else
            {
                animation = d;
            }
            view.startAnimation(animation);
        }

        public void onAnimationEnd(Animation animation)
        {
            if (!g.d(a))
            {
                a(animation);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            if (g.d(a))
            {
                (new Handler()).postDelayed(new Runnable(this, animation) {

                    final Animation a;
                    final a b;

                    public void run()
                    {
                        a.a(b, a);
                    }

            
            {
                b = a1;
                a = animation;
                super();
            }
                }, g.c(a));
            }
        }

        public a(View view)
        {
            a = g.this;
            super();
            c = false;
            b = view;
        }
    }


    private int a;
    private int b;
    private int c;
    private final a d;
    private final a e;
    private boolean f;

    public g(View view, View view1)
    {
        a = 200;
        b = 500;
        c = 4000;
        d = new a(view);
        e = (new a(view1)).a(true);
        f = "4.1.2".equals(android.os.Build.VERSION.RELEASE);
    }

    static int a(g g1)
    {
        return g1.a;
    }

    static int b(g g1)
    {
        return g1.b;
    }

    static int c(g g1)
    {
        return g1.c;
    }

    static boolean d(g g1)
    {
        return g1.f;
    }

    public g a()
    {
        d.a();
        e.a();
        return this;
    }

    public g a(int i)
    {
        a = i * 2;
        return this;
    }
}
