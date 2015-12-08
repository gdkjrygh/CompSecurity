// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p.cw.c;

public class com.pandora.android.daydream.a
{
    public static class a
    {

        private float a;
        private float b;
        private WeakReference c;
        private ObjectAnimator d;
        private boolean e;

        static ObjectAnimator a(a a1, ObjectAnimator objectanimator)
        {
            a1.d = objectanimator;
            return objectanimator;
        }

        static boolean a(a a1)
        {
            return a1.e;
        }

        static WeakReference b(a a1)
        {
            return a1.c;
        }

        static ObjectAnimator c(a a1)
        {
            return a1.d;
        }

        public int a()
        {
            float f = ((ImageView)c.get()).getWidth();
            float f1 = ((ImageView)c.get()).getHeight();
            if (f > f1)
            {
                f = (f * b) / a - f1;
            } else
            {
                f = (f1 * a) / b - f;
            }
            return Math.round(f / 2.0F);
        }

        public void a(float f, float f1)
        {
            a = f;
            b = f1;
        }

        public void b()
        {
            ImageView imageview = (ImageView)c.get();
            float f = imageview.getWidth();
            f = imageview.getHeight();
            if (imageview == null)
            {
                return;
            }
            int j = a();
            String s;
            int i;
            if (c.z.s().getResources().getConfiguration().orientation == 1)
            {
                s = "scrollX";
                i = imageview.getScrollX();
            } else
            {
                s = "scrollY";
                i = imageview.getScrollY();
            }
            e = false;
            d = ObjectAnimator.ofInt(imageview, s, new int[] {
                i, j
            });
            d.addListener(new AnimatorListenerAdapter(this, s, j) {

                final String a;
                final int b;
                final a c;

                public void onAnimationEnd(Animator animator)
                {
                    if (a.a(c))
                    {
                        return;
                    } else
                    {
                        a.a(c, ObjectAnimator.ofInt(a.b(c).get(), a, new int[] {
                            b, -b
                        }));
                        com.pandora.android.daydream.a.c(c).setRepeatCount(-1);
                        com.pandora.android.daydream.a.c(c).setRepeatMode(2);
                        com.pandora.android.daydream.a.c(c).setDuration(25000L);
                        com.pandora.android.daydream.a.c(c).start();
                        return;
                    }
                }

            
            {
                c = a1;
                a = s;
                b = i;
                super();
            }
            });
            d.setDuration(Math.abs(((i - j) * 12500) / j));
            d.start();
        }

        public void c()
        {
            if (d == null)
            {
                return;
            } else
            {
                e = true;
                d.end();
                d = null;
                ImageView imageview = (ImageView)c.get();
                imageview.setScrollX(0);
                imageview.setScrollY(0);
                return;
            }
        }

        public a(ImageView imageview)
        {
            c = new WeakReference(imageview);
        }
    }


    protected static ObjectAnimator a(View view, float f, float f1)
    {
        return ObjectAnimator.ofFloat(view, "y", new float[] {
            f, f1
        });
    }

    protected static ValueAnimator a(int i, int j)
    {
        return ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    public static void a(View view, Runnable runnable)
    {
        a(view, runnable, 0.0F, 400L);
    }

    public static void a(View view, Runnable runnable, float f)
    {
        view.setAlpha(f);
        view.setVisibility(0);
        view.animate().alpha(0.0F).setDuration(400L).withEndAction(runnable).start();
    }

    public static void a(View view, Runnable runnable, float f, long l)
    {
        view.setAlpha(f);
        view.setVisibility(0);
        view.animate().alpha(1.0F).setDuration(l).withEndAction(runnable).start();
    }

    public static void a(View view, Runnable runnable, int i)
    {
        view.setX(i);
        view.setVisibility(0);
        view.animate().x(0.0F).withEndAction(runnable).setInterpolator(new DecelerateInterpolator(1.7F)).start();
    }

    public static void a(View view, Runnable runnable, long l)
    {
        a(view, runnable, 0.0F, l);
    }

    public static void a(String s, TextView textview, LinearLayout linearlayout)
    {
        textview.setText(s);
        s = new Runnable(linearlayout, new Runnable(linearlayout) {

            final LinearLayout a;

            public void run()
            {
                a.setVisibility(4);
            }

            
            {
                a = linearlayout;
                super();
            }
        }) {

            final LinearLayout a;
            final Runnable b;

            public void run()
            {
                a.animate().alpha(0.0F).setDuration(300L).setStartDelay(5000L).withEndAction(b).start();
            }

            
            {
                a = linearlayout;
                b = runnable;
                super();
            }
        };
        linearlayout.setAlpha(0.0F);
        linearlayout.setVisibility(0);
        linearlayout.animate().alpha(1.0F).setDuration(300L).setStartDelay(0L).withEndAction(s).start();
    }

    public static void b(View view, Runnable runnable)
    {
        a(view, runnable, 1.0F);
    }
}
