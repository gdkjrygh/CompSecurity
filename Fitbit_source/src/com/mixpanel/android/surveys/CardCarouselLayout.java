// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardCarouselLayout extends ViewGroup
{
    public static final class Direction extends Enum
    {

        public static final Direction a;
        public static final Direction b;
        private static final Direction c[];

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/mixpanel/android/surveys/CardCarouselLayout$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])c.clone();
        }

        static 
        {
            a = new Direction("FORWARD", 0);
            b = new Direction("BACKWARD", 1);
            c = (new Direction[] {
                a, b
            });
        }

        private Direction(String s, int k)
        {
            super(s, k);
        }
    }

    public static class UnrecognizedAnswerTypeException extends Exception
    {

        private static final long serialVersionUID = 0xac2c3044c7bf6078L;

        private UnrecognizedAnswerTypeException(String s)
        {
            super(s);
        }

        UnrecognizedAnswerTypeException(String s, _cls1 _pcls1)
        {
            this(s);
        }
    }

    public static interface b
    {

        public abstract void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s);
    }


    private static int a = 0;
    private static float b = 0F;
    private static float c = 0F;
    private static float d = 0F;
    private static final long i = 330L;
    private static final long j = 198L;
    private final List e;
    private c f;
    private c g;
    private b h;

    public CardCarouselLayout(Context context)
    {
        super(context);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    private Animation a()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(a, 0.0F, 1, c, 1, d);
        ((RotateAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
        ((ScaleAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    static b a(CardCarouselLayout cardcarousellayout)
    {
        return cardcarousellayout.h;
    }

    private void a(Context context)
    {
        Object obj = LayoutInflater.from(context);
        context = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.R.layout.com_mixpanel_android_question_card, this, false);
    /* block-local class not found */
    class c {}

        f = new c(context);
        obj = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.R.layout.com_mixpanel_android_question_card, this, false);
        g = new c(((View) (obj)));
        addView(context);
        addView(((View) (obj)));
    }

    private Animation b()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(0.0F, a, 1, c, 1, d);
        ((RotateAnimation) (obj)).setDuration(198L);
        ((RotateAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
        ((ScaleAnimation) (obj)).setDuration(198L);
        ((ScaleAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new AccelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation c()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(-a, 0.0F, 1, c, 1, d);
        ((RotateAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
        ((ScaleAnimation) (obj)).setDuration(198L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation d()
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new RotateAnimation(0.0F, -a, 1, c, 1, d);
        ((RotateAnimation) (obj)).setDuration(330L);
        ((RotateAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
        ((ScaleAnimation) (obj)).setDuration(330L);
        ((ScaleAnimation) (obj)).setStartOffset(132L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(2, -1F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj)).setInterpolator(new AccelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(330L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    public void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
        throws UnrecognizedAnswerTypeException
    {
        f.a(a1, s);
        removeAllViews();
        addView(f.a());
        addView(g.a());
        invalidate();
    }

    public void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s, Direction direction)
        throws UnrecognizedAnswerTypeException
    {
        Object obj;
        Object obj1;
        View view;
        obj = null;
        obj1 = g;
        g = f;
        f = ((c) (obj1));
        f.a(a1, s);
        obj1 = g.a();
        view = f.a();
        ((View) (obj1)).setVisibility(0);
        view.setVisibility(0);
    /* anonymous class not found */
    class _anm2 {}

        _cls2.a[direction.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 128
    //                   2 141;
           goto _L1 _L2 _L3
_L1:
        s = null;
        a1 = obj;
_L5:
        s.setAnimationListener(new _cls1(((View) (obj1))));
        ((View) (obj1)).startAnimation(s);
        view.startAnimation(a1);
        invalidate();
        return;
_L2:
        s = d();
        a1 = a();
        continue; /* Loop/switch isn't completed */
_L3:
        s = b();
        a1 = c();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(b b1)
    {
        h = b1;
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        View view = f.a();
        if (view.getVisibility() != 8)
        {
            k = view.getMeasuredWidth();
            view.layout(0, 0, k, view.getMeasuredHeight());
        } else
        {
            k = 0;
        }
        view = g.a();
        if (view.getVisibility() != 8)
        {
            view.layout(k, 0, view.getMeasuredWidth() + k, view.getMeasuredHeight());
        }
    }

    protected void onMeasure(int k, int l)
    {
        int i3 = getChildCount();
        int i1;
        int k1;
        int i2;
        int l2;
        if (android.view.View.MeasureSpec.getMode(k) != 0x40000000 || android.view.View.MeasureSpec.getMode(l) != 0x40000000)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        e.clear();
        k1 = 0;
        l2 = 0;
        int k2;
        for (i2 = 0; k1 < i3; i2 = k2)
        {
            int j2;
label0:
            {
                View view = getChildAt(k1);
                j2 = l2;
                k2 = i2;
                if (view.getVisibility() == 8)
                {
                    break label0;
                }
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                view.measure(getChildMeasureSpec(k, 0, layoutparams.width), getChildMeasureSpec(l, 0, layoutparams.height));
                l2 = Math.max(l2, view.getMeasuredWidth());
                i2 = Math.max(i2, view.getMeasuredHeight());
                j2 = l2;
                k2 = i2;
                if (!i1)
                {
                    break label0;
                }
                if (layoutparams.width != -1)
                {
                    j2 = l2;
                    k2 = i2;
                    if (layoutparams.height != -1)
                    {
                        break label0;
                    }
                }
                e.add(view);
                k2 = i2;
                j2 = l2;
            }
            k1++;
            l2 = j2;
        }

        i1 = Math.max(i2, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(l2, getSuggestedMinimumWidth()), k), resolveSize(i1, l));
        Iterator iterator = e.iterator();
        while (iterator.hasNext()) 
        {
            View view1 = (View)iterator.next();
            android.view.ViewGroup.LayoutParams layoutparams1 = view1.getLayoutParams();
            int j1;
            int l1;
            if (layoutparams1.width == -1)
            {
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
            } else
            {
                j1 = getChildMeasureSpec(k, 0, layoutparams1.width);
            }
            if (layoutparams1.height == -1)
            {
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
            } else
            {
                l1 = getChildMeasureSpec(l, 0, layoutparams1.height);
            }
            view1.measure(j1, l1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = 45;
        b = 0.8F;
        c = 0.5F;
        d = 0.5F;
    }

    // Unreferenced inner class com/mixpanel/android/surveys/CardCarouselLayout$a
    /* block-local class not found */
    class a {}


    /* member class not found */
    class _cls1 {}

}
