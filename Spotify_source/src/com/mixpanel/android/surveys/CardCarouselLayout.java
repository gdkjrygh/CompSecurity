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
import cyb;
import cyh;
import cyi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardCarouselLayout extends ViewGroup
{

    private static int d = 45;
    private static float e = 0.8F;
    private static float f = 0.5F;
    private static float g = 0.5F;
    cyi a;
    cyi b;
    cyh c;
    private final List h;

    public CardCarouselLayout(Context context)
    {
        super(context);
        h = new ArrayList(1);
        c = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new ArrayList(1);
        c = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        h = new ArrayList(1);
        c = null;
        a(context);
    }

    public static cyh a(CardCarouselLayout cardcarousellayout)
    {
        return cardcarousellayout.c;
    }

    private void a(Context context)
    {
        Object obj = LayoutInflater.from(context);
        context = ((LayoutInflater) (obj)).inflate(0x7f030066, this, false);
        a = new cyi(this, context);
        obj = ((LayoutInflater) (obj)).inflate(0x7f030066, this, false);
        b = new cyi(this, ((View) (obj)));
        addView(context);
        addView(((View) (obj)));
    }

    public final void a(cyb cyb, String s, Direction direction)
    {
        Object obj;
        View view;
        obj = b;
        b = a;
        a = ((cyi) (obj));
        a.a(cyb, s);
        obj = b.b;
        view = a.b;
        ((View) (obj)).setVisibility(0);
        view.setVisibility(0);
        s = null;
        cyb = null;
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[Direction.values().length];
                try
                {
                    a[Direction.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Direction.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[direction.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 122
    //                   2 366;
           goto _L1 _L2 _L3
_L1:
        s.setAnimationListener(new android.view.animation.Animation.AnimationListener(((View) (obj))) {

            private View a;

            public final void onAnimationEnd(Animation animation)
            {
                a.setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = view;
                super();
            }
        });
        ((View) (obj)).startAnimation(s);
        view.startAnimation(cyb);
        invalidate();
        return;
_L2:
        s = new AnimationSet(false);
        cyb = new RotateAnimation(0.0F, -d, 1, f, 1, g);
        cyb.setDuration(330L);
        cyb.setStartOffset(132L);
        s.addAnimation(cyb);
        cyb = new ScaleAnimation(1.0F, e, 1.0F, e, 1, f, 1, g);
        cyb.setDuration(330L);
        cyb.setStartOffset(132L);
        s.addAnimation(cyb);
        cyb = new TranslateAnimation(2, -1F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
        cyb.setInterpolator(new AccelerateInterpolator());
        cyb.setDuration(330L);
        s.addAnimation(cyb);
        cyb = new AnimationSet(false);
        direction = new RotateAnimation(d, 0.0F, 1, f, 1, g);
        direction.setDuration(198L);
        cyb.addAnimation(direction);
        direction = new ScaleAnimation(e, 1.0F, e, 1.0F, 1, f, 1, g);
        direction.setDuration(198L);
        cyb.addAnimation(direction);
        direction = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        direction.setDuration(330L);
        cyb.addAnimation(direction);
        continue; /* Loop/switch isn't completed */
_L3:
        s = new AnimationSet(false);
        cyb = new RotateAnimation(0.0F, d, 1, f, 1, g);
        cyb.setDuration(198L);
        cyb.setStartOffset(132L);
        s.addAnimation(cyb);
        cyb = new ScaleAnimation(1.0F, e, 1.0F, e, 1, f, 1, g);
        cyb.setDuration(198L);
        cyb.setStartOffset(132L);
        s.addAnimation(cyb);
        cyb = new TranslateAnimation(2, -1F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
        cyb.setInterpolator(new AccelerateInterpolator());
        cyb.setDuration(330L);
        s.addAnimation(cyb);
        cyb = new AnimationSet(false);
        direction = new RotateAnimation(-d, 0.0F, 1, f, 1, g);
        direction.setDuration(198L);
        cyb.addAnimation(direction);
        direction = new ScaleAnimation(e, 1.0F, e, 1.0F, 1, f, 1, g);
        direction.setDuration(198L);
        cyb.addAnimation(direction);
        direction = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        direction.setDuration(330L);
        cyb.addAnimation(direction);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = a.b;
        if (view.getVisibility() != 8)
        {
            i = view.getMeasuredWidth();
            view.layout(0, 0, i, view.getMeasuredHeight());
        } else
        {
            i = 0;
        }
        view = b.b;
        if (view.getVisibility() != 8)
        {
            view.layout(i, 0, view.getMeasuredWidth() + i, view.getMeasuredHeight());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k2 = getChildCount();
        int k;
        int i1;
        int k1;
        int j2;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000 || android.view.View.MeasureSpec.getMode(j) != 0x40000000)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        h.clear();
        i1 = 0;
        j2 = 0;
        int i2;
        for (k1 = 0; i1 < k2; k1 = i2)
        {
            int l1;
label0:
            {
                View view = getChildAt(i1);
                l1 = j2;
                i2 = k1;
                if (view.getVisibility() == 8)
                {
                    break label0;
                }
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                view.measure(getChildMeasureSpec(i, 0, layoutparams.width), getChildMeasureSpec(j, 0, layoutparams.height));
                j2 = Math.max(j2, view.getMeasuredWidth());
                k1 = Math.max(k1, view.getMeasuredHeight());
                l1 = j2;
                i2 = k1;
                if (!k)
                {
                    break label0;
                }
                if (layoutparams.width != -1)
                {
                    l1 = j2;
                    i2 = k1;
                    if (layoutparams.height != -1)
                    {
                        break label0;
                    }
                }
                h.add(view);
                i2 = k1;
                l1 = j2;
            }
            i1++;
            j2 = l1;
        }

        k = Math.max(k1, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(j2, getSuggestedMinimumWidth()), i), resolveSize(k, j));
        Iterator iterator = h.iterator();
        while (iterator.hasNext()) 
        {
            View view1 = (View)iterator.next();
            android.view.ViewGroup.LayoutParams layoutparams1 = view1.getLayoutParams();
            int l;
            int j1;
            if (layoutparams1.width == -1)
            {
                l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
            } else
            {
                l = getChildMeasureSpec(i, 0, layoutparams1.width);
            }
            if (layoutparams1.height == -1)
            {
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
            } else
            {
                j1 = getChildMeasureSpec(j, 0, layoutparams1.height);
            }
            view1.measure(l, j1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }


    private class Direction extends Enum
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

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }

}
