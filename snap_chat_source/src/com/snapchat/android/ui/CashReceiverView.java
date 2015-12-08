// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import IE;
import Jo;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CashReceiverView extends RelativeLayout
{

    public int a;
    public List b;
    public ViewGroup c;
    public boolean d;
    public ValueAnimator e;
    public HashMap f;
    private boolean g;

    public CashReceiverView(Context context)
    {
        super(context);
        a = 0;
        f = new HashMap();
        b();
    }

    public CashReceiverView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        f = new HashMap();
        b();
    }

    public CashReceiverView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 0;
        f = new HashMap();
        b();
    }

    static ValueAnimator a(CashReceiverView cashreceiverview)
    {
        return cashreceiverview.e;
    }

    static void a(CashReceiverView cashreceiverview, int i)
    {
        cashreceiverview.a(i);
    }

    static ViewGroup b(CashReceiverView cashreceiverview)
    {
        return cashreceiverview.c;
    }

    private void b()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f040025, this);
        c = (ViewGroup)findViewById(0x7f0d0109);
        b = new ArrayList();
        a();
    }

    private float c()
    {
        long l = SystemClock.elapsedRealtime();
        Iterator iterator = b.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Long)iterator.next()).longValue() > l - 2000L)
            {
                i++;
            }
        } while (true);
        return (float)Math.sqrt(Math.min((float)i / 6F, 1.0F));
    }

    static boolean c(CashReceiverView cashreceiverview)
    {
        return cashreceiverview.g;
    }

    static boolean d(CashReceiverView cashreceiverview)
    {
        cashreceiverview.g = true;
        return true;
    }

    public final void a()
    {
        d = IE.a().nextBoolean();
        a = 0;
        b.clear();
        if (e != null)
        {
            e.cancel();
        }
        c.setTranslationX(0.0F);
        c.setTranslationY(0.0F);
        Iterator iterator = Jo.a(c).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view = (View)iterator.next();
            if (TextUtils.equals((CharSequence)view.getTag(), "CAUGHT_DOLLAR_TAG"))
            {
                c.removeView(view);
            }
        } while (true);
        iterator = Jo.a(this).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            View view1 = (View)iterator.next();
            if (TextUtils.equals((CharSequence)view1.getTag(), "FALLING_DOLLAR_TAG"))
            {
                removeView(view1);
            }
        } while (true);
    }

    public final void a(int i)
    {
        g = false;
        e = ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        });
        e.setInterpolator(new LinearInterpolator());
        e.setDuration((long)(950F - 650F * c()));
        float f2 = IE.a().nextFloat() * 50F + 50F + c() * (IE.a().nextFloat() * 25F + 25F);
        float f1 = f2;
        if (i == 2)
        {
            f1 = -f2;
        }
        f1 = Jo.a(f1, getContext());
        f2 = c.getTranslationX();
        float f3 = Jo.a(IE.a().nextFloat() * 25F + 50F + c() * (IE.a().nextFloat() * 75F + 75F), getContext());
        e.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(f3, f2, f1) {

            private float a;
            private float b;
            private float c;
            private CashReceiverView d;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                float f6;
                float f4 = ((Float)CashReceiverView.a(d).getAnimatedValue()).floatValue();
                CashReceiverView.b(d).setTranslationY(a * f4 * (f4 - 1.0F));
                f6 = b;
                f6 = f4 * c + f6;
                if (f6 >= 0.0F) goto _L2; else goto _L1
_L1:
                float f5 = -f6;
_L4:
                CashReceiverView.b(d).setTranslationX(f5);
                return;
_L2:
                f5 = f6;
                if ((float)CashReceiverView.b(d).getMeasuredWidth() + f6 > (float)d.getMeasuredWidth())
                {
                    f5 = f6 - 2.0F * (((float)CashReceiverView.b(d).getMeasuredWidth() + f6) - (float)d.getMeasuredWidth());
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                d = CashReceiverView.this;
                a = f1;
                b = f2;
                c = f3;
                super();
            }
        });
        e.addListener(new android.animation.Animator.AnimatorListener(f2, f1, i) {

            private float a;
            private float b;
            private int c;
            private CashReceiverView d;

            public final void onAnimationCancel(Animator animator)
            {
                CashReceiverView.d(d);
            }

            public final void onAnimationEnd(Animator animator)
            {
                if (CashReceiverView.c(d))
                {
                    return;
                }
                if (a + b < 0.0F)
                {
                    CashReceiverView.a(d, 1);
                    return;
                }
                if (a + b + (float)CashReceiverView.b(d).getMeasuredWidth() > (float)d.getMeasuredWidth())
                {
                    CashReceiverView.a(d, 2);
                    return;
                } else
                {
                    CashReceiverView.a(d, c);
                    return;
                }
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                d = CashReceiverView.this;
                a = f1;
                b = f2;
                c = i;
                super();
            }
        });
        e.start();
    }

    // Unreferenced inner class com/snapchat/android/ui/CashReceiverView$3

/* anonymous class */
    public final class _cls3
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private View a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue() * 5000F;
            a.setTranslationX((float)(Math.sin(b * f1 + c) * (double)d + (double)e));
            a.setTranslationY(f + g * f1);
            a.setRotation((float)(-Math.sin(f1 * b + c) * (double)h));
        }

            public 
            {
                a = view;
                b = f1;
                c = f2;
                d = f3;
                e = f4;
                f = f5;
                g = f6;
                h = f7;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/CashReceiverView$4

/* anonymous class */
    public final class _cls4
        implements android.animation.Animator.AnimatorListener
    {

        private View a;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            animator = (ViewGroup)a.getParent();
            if (animator != null)
            {
                animator.removeView(a);
            }
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = view;
                super();
            }
    }

}
