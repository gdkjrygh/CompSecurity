// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

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
import com.android.a.e;
import com.android.slyce.report.mpmetrics.bf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.android.slyce.report.surveys:
//            f, b, d, a, 
//            e

public class CardCarouselLayout extends ViewGroup
{

    private static int a = 45;
    private static float b = 0.8F;
    private static float c = 0.5F;
    private static float d = 0.5F;
    private final List e;
    private f f;
    private f g;
    private com.android.slyce.report.surveys.e h;

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

    public CardCarouselLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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

    static com.android.slyce.report.surveys.e a(CardCarouselLayout cardcarousellayout)
    {
        return cardcarousellayout.h;
    }

    private void a(Context context)
    {
        Object obj = LayoutInflater.from(context);
        context = ((LayoutInflater) (obj)).inflate(e.com_mixpanel_android_question_card, this, false);
        f = new f(this, context);
        obj = ((LayoutInflater) (obj)).inflate(e.com_mixpanel_android_question_card, this, false);
        g = new f(this, ((View) (obj)));
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

    public void a(bf bf, String s)
    {
        f.a(bf, s);
        removeAllViews();
        addView(f.a());
        addView(g.a());
        invalidate();
    }

    public void a(bf bf, String s, d d1)
    {
        Object obj;
        Object obj1;
        View view;
        obj = null;
        obj1 = g;
        g = f;
        f = ((f) (obj1));
        f.a(bf, s);
        obj1 = g.a();
        view = f.a();
        ((View) (obj1)).setVisibility(0);
        view.setVisibility(0);
        b.a[d1.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 128
    //                   2 141;
           goto _L1 _L2 _L3
_L1:
        s = null;
        bf = obj;
_L5:
        s.setAnimationListener(new a(this, ((View) (obj1))));
        ((View) (obj1)).startAnimation(s);
        view.startAnimation(bf);
        invalidate();
        return;
_L2:
        s = d();
        bf = a();
        continue; /* Loop/switch isn't completed */
_L3:
        s = b();
        bf = c();
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = f.a();
        if (view.getVisibility() != 8)
        {
            i = view.getMeasuredWidth();
            view.layout(0, 0, i, view.getMeasuredHeight());
        } else
        {
            i = 0;
        }
        view = g.a();
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
        e.clear();
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
                e.add(view);
                i2 = k1;
                l1 = j2;
            }
            i1++;
            j2 = l1;
        }

        k = Math.max(k1, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(j2, getSuggestedMinimumWidth()), i), resolveSize(k, j));
        Iterator iterator = e.iterator();
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

    public void setOnQuestionAnsweredListener(com.android.slyce.report.surveys.e e1)
    {
        h = e1;
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

}
