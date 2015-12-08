// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.pinterest.base.Constants;
import com.pinterest.ui.imageview.WebImageView;

public class ExpandableView extends LinearLayout
{

    private boolean a;
    private LinearLayout b;
    private LinearLayout c;
    private int d;
    private WebImageView e;
    private int f;

    public ExpandableView(Context context)
    {
        super(context);
        f = Constants.ANIM_SPEED_FAST;
        a = false;
        setOrientation(1);
        context = new LinearLayout(getContext());
        context.setOrientation(0);
        context.setGravity(16);
        b = new LinearLayout(getContext());
        b.setOrientation(0);
        b.setGravity(16);
        context.addView(b, -2, -1);
        e = new WebImageView(getContext());
        e.setImageResource(0x7f0201d7);
        context.addView(e, -2, -1);
        context.setOnClickListener(new _cls2());
        addView(context);
        c = new LinearLayout(getContext());
        c.setOrientation(1);
        addView(c, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    static int a(ExpandableView expandableview, int i)
    {
        expandableview.d = i;
        return i;
    }

    static LinearLayout a(ExpandableView expandableview)
    {
        return expandableview.c;
    }

    static void b(ExpandableView expandableview)
    {
        float f2 = -180F;
        float f1;
        ExpandCollapseAnimation expandcollapseanimation;
        ObjectAnimator objectanimator;
        boolean flag;
        if (!expandableview.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        expandableview.a = flag;
        expandcollapseanimation = new ExpandCollapseAnimation(expandableview.c, expandableview.d, expandableview.a);
        expandcollapseanimation.setDuration(expandableview.f);
        expandcollapseanimation.setFillAfter(true);
        expandcollapseanimation.setFillEnabled(true);
        expandcollapseanimation.setRepeatCount(0);
        expandcollapseanimation.setAnimationListener(expandableview. new _cls3());
        if (expandableview.a)
        {
            f1 = 0.0F;
        } else
        {
            f1 = -180F;
        }
        if (!expandableview.a)
        {
            f2 = 0.0F;
        }
        objectanimator = ObjectAnimator.ofFloat(expandableview.e, "rotation", new float[] {
            f1, f2
        });
        objectanimator.setDuration(expandableview.f);
        expandableview.c.startAnimation(expandcollapseanimation);
        objectanimator.start();
    }

    static boolean c(ExpandableView expandableview)
    {
        return expandableview.a;
    }

    public final void a(View view)
    {
        b.addView(view, -1, -2);
    }

    public final void b(View view)
    {
        c.addView(view, -1, -2);
        c.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
    }

    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ExpandableView a;

        public void onClick(View view)
        {
            ExpandableView.b(a);
        }

        _cls2()
        {
            a = ExpandableView.this;
            super();
        }
    }


    private class ExpandCollapseAnimation extends Animation
    {

        private int a;
        private View b;
        private boolean c;

        protected void applyTransformation(float f1, Transformation transformation)
        {
            super.applyTransformation(f1, transformation);
            int i;
            if (c)
            {
                i = (int)((float)a * f1);
            } else
            {
                i = (int)((float)a * (1.0F - f1));
            }
            b.getLayoutParams().height = i;
            b.requestLayout();
        }

        public boolean willChangeBounds()
        {
            return true;
        }

        public ExpandCollapseAnimation(View view, int i, boolean flag)
        {
            a = i;
            b = view;
            c = flag;
        }
    }


    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final ExpandableView a;

        public void onAnimationEnd(Animation animation)
        {
            a.clearAnimation();
            if (!ExpandableView.c(a))
            {
                ExpandableView.a(a).setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            if (ExpandableView.c(a))
            {
                ExpandableView.a(a).setVisibility(0);
            }
        }

        _cls3()
        {
            a = ExpandableView.this;
            super();
        }
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final ExpandableView a;

        public void onGlobalLayout()
        {
            ExpandableView.a(a, ExpandableView.a(a).getHeight());
            ExpandableView.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            ExpandableView.a(a).setVisibility(8);
        }

        _cls1()
        {
            a = ExpandableView.this;
            super();
        }
    }

}
