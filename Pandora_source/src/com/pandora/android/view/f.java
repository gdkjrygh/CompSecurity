// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Stack;

public interface f
{
    public static class a
    {

        public static f a(View view, c c1)
        {
            return new b(view, c1);
        }
    }

    public static class b
        implements f
    {

        private View a;
        private TextView b;
        private ObjectAnimator c;
        private Handler d;
        private c e;
        private Stack f;
        private int g;
        private CharSequence h;
        private Runnable i;

        static Stack a(b b1)
        {
            return b1.f;
        }

        static c b(b b1)
        {
            return b1.e;
        }

        static int c(b b1)
        {
            int j = b1.g;
            b1.g = j - 1;
            return j;
        }

        static View d(b b1)
        {
            return b1.a;
        }

        public int a()
        {
            return f.size();
        }

        public void a(String s)
        {
            b.setText(s);
        }

        public void a(boolean flag)
        {
            a(flag, true);
        }

        public void a(boolean flag, CharSequence charsequence, Parcelable parcelable)
        {
            if (parcelable != null)
            {
                f.push(parcelable);
                if (((Bundle)parcelable).getBoolean("isNonAdvertiserStation"))
                {
                    g = g + 1;
                }
            }
            h = charsequence;
            b.setText(h);
            d.removeCallbacks(i);
            d.postDelayed(i, a.getResources().getInteger(0x7f0c0007));
            if (flag)
            {
                a.setAlpha(1.0F);
            } else
            {
                if (a.getVisibility() == 0)
                {
                    a.setAlpha(0.5F);
                } else
                {
                    a.setAlpha(0.0F);
                }
                if (c != null)
                {
                    c.cancel();
                }
                c = ObjectAnimator.ofFloat(a, "alpha", new float[] {
                    a.getAlpha(), 1.0F
                });
                c.setDuration(a.getResources().getInteger(0x10e0000));
                c.start();
            }
            a.setVisibility(0);
        }

        protected void a(boolean flag, boolean flag1)
        {
            d.removeCallbacks(i);
            if (flag)
            {
                a.setVisibility(8);
                a.setAlpha(0.0F);
            } else
            {
                if (c != null)
                {
                    c.cancel();
                }
                c = ObjectAnimator.ofFloat(a, "alpha", new float[] {
                    1.0F, 0.0F
                });
                c.setDuration(a.getResources().getInteger(0x10e0000));
                c.addListener(new AnimatorListenerAdapter(this) {

                    final b a;

                    public void onAnimationEnd(Animator animator)
                    {
                        b.d(a).setVisibility(8);
                    }

            
            {
                a = b1;
                super();
            }
                });
                c.start();
            }
            h = null;
            if (flag1 && !f.isEmpty())
            {
                e.a(f.iterator());
                g = 0;
            }
            f.clear();
        }

        public int b()
        {
            return g;
        }

        public Iterator c()
        {
            return f.iterator();
        }

        public b(View view, c c1)
        {
            d = new Handler();
            i = new _cls3(this);
            a = view;
            e = c1;
            f = new Stack();
            b = (TextView)a.findViewById(0x7f1002a7);
            a.findViewById(0x7f1002a8).setOnClickListener(new _cls1(this));
            a(true);
        }
    }

    public static interface c
    {

        public abstract void a(Parcelable parcelable);

        public abstract void a(Iterator iterator);
    }


    public abstract int a();

    public abstract void a(String s);

    public abstract void a(boolean flag);

    public abstract void a(boolean flag, CharSequence charsequence, Parcelable parcelable);

    public abstract int b();

    public abstract Iterator c();

    // Unreferenced inner class com/pandora/android/view/f$b$1

/* anonymous class */
    class b._cls1
        implements android.view.View.OnClickListener
    {

        final b a;

        public void onClick(View view)
        {
            if (!b.a(a).isEmpty())
            {
                view = (Parcelable)b.a(a).pop();
                b.b(a).a(view);
                if (((Bundle)view).getBoolean("isNonAdvertiserStation"))
                {
                    b.c(a);
                }
                if (b.a(a).isEmpty())
                {
                    a.a(false, false);
                }
            }
        }

            
            {
                a = b1;
                super();
            }
    }


    // Unreferenced inner class com/pandora/android/view/f$b$3

/* anonymous class */
    class b._cls3
        implements Runnable
    {

        final b a;

        public void run()
        {
            a.a(false);
        }

            
            {
                a = b1;
                super();
            }
    }

}
