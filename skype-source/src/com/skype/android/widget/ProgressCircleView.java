// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.android.animation.BezierEasingInterpolator;
import com.skype.android.util.FloatMath;
import java.util.ArrayList;
import java.util.HashMap;

public class ProgressCircleView extends RelativeLayout
{

    private static final float a[] = {
        0.33F, 0.0F, 0.67F, 1.0F
    };
    private static final float b[] = {
        1.0F, 0.2F, 0.25F, 0.76F
    };
    private static final float c[] = {
        0.88F, 0.21F, 0.25F, 0.76F
    };
    private static final float d[] = {
        0.76F, 0.21F, 0.25F, 0.76F
    };
    private static final float e[] = {
        0.65F, 0.21F, 0.25F, 0.76F
    };
    private static HashMap f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private AnimatorSet k;
    private Context l;
    private float m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;

    public ProgressCircleView(Context context)
    {
        super(context);
        p = true;
        q = false;
        l = context;
        a(((AttributeSet) (null)));
    }

    public ProgressCircleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        p = true;
        q = false;
        l = context;
        a(attributeset);
    }

    public ProgressCircleView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        p = true;
        q = false;
        l = context;
        a(((AttributeSet) (null)));
    }

    private void a()
    {
        q = true;
        k.cancel();
    }

    private void a(AnimatorSet animatorset)
    {
        animatorset = animatorset.getChildAnimations();
        int j1 = animatorset.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = (Animator)animatorset.get(i1);
            if (obj instanceof AnimatorSet)
            {
                a((AnimatorSet)obj);
            } else
            {
                obj = (ObjectAnimator)obj;
                float af[] = (float[])f.get(((ObjectAnimator) (obj)).getPropertyName());
                ((ObjectAnimator) (obj)).setInterpolator(new BezierEasingInterpolator(af[0], af[1], af[2], af[3], ((ObjectAnimator) (obj)).getDuration()));
            }
            i1++;
        }
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = l.getTheme().obtainStyledAttributes(attributeset, R.styleable.ProgressCircleViewStyle, 0, 0);
        int i1;
        int j1;
        boolean flag;
        if (attributeset != null)
        {
            i1 = attributeset.getResourceId(2, R.layout.progress_circle_elements);
        } else
        {
            i1 = 0;
        }
        if (attributeset != null)
        {
            j1 = attributeset.getResourceId(0, R.drawable.animated_circle_white);
        } else
        {
            j1 = 0;
        }
        n = j1;
        if (attributeset != null)
        {
            j1 = attributeset.getInt(1, -1);
        } else
        {
            j1 = -1;
        }
        if (j1 == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        o = j1;
        attributeset.recycle();
        attributeset = LayoutInflater.from(l).inflate(i1, this, true);
        g = (ImageView)attributeset.findViewById(R.id.circle1);
        h = (ImageView)attributeset.findViewById(R.id.circle2);
        i = (ImageView)attributeset.findViewById(R.id.circle3);
        j = (ImageView)attributeset.findViewById(R.id.circle4);
        b();
        k = (AnimatorSet)AnimatorInflater.loadAnimator(getContext(), R.animator.progress_circle_animation);
        k.setTarget(this);
        k.addListener(new android.animation.Animator.AnimatorListener() {

            final ProgressCircleView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                ProgressCircleView.a(a);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = ProgressCircleView.this;
                super();
            }
        });
        a(k);
        if (getVisibility() == 0)
        {
            a(false);
        }
    }

    private static void a(View view, float f1)
    {
        view.setScaleX(f1);
        view.setScaleY(f1);
    }

    static void a(ProgressCircleView progresscircleview)
    {
        progresscircleview.a(false);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            q = false;
        }
        if (!q)
        {
            k.start();
        }
    }

    private void b()
    {
        g.setImageResource(n);
        h.setImageResource(n);
        i.setImageResource(n);
        j.setImageResource(n);
        m = c();
    }

    private void b(View view, float f1)
    {
        float f4 = FloatMath.b(f1);
        f1 = m;
        float f2 = (float)Math.cos(f4);
        float f3 = m;
        f4 = (float)Math.sin(f4);
        view.setTranslationX(f1 * f2);
        view.setTranslationY(f3 * f4);
    }

    private float c()
    {
        return TypedValue.applyDimension(1, o, getResources().getDisplayMetrics());
    }

    protected void onDetachedFromWindow()
    {
        a();
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (p)
        {
            i1 = getMeasuredHeight();
            j1 = getMeasuredWidth();
            float f1 = getResources().getDisplayMetrics().density;
            o = (int)((float)Math.min(j1, i1) / f1) / 2;
            i1 = (int)((float)g.getMeasuredHeight() / f1 / 2.0F);
            o = o - i1;
            m = c();
        }
    }

    public void setCircleDrawable(int i1)
    {
        n = i1;
        b();
    }

    public void setCircleFourRotation(float f1)
    {
        b(j, f1);
    }

    public void setCircleFourScale(float f1)
    {
        a(j, f1);
    }

    public void setCircleOneRotation(float f1)
    {
        b(g, f1);
    }

    public void setCircleOneScale(float f1)
    {
        a(g, f1);
    }

    public void setCircleThreeRotation(float f1)
    {
        b(i, f1);
    }

    public void setCircleThreeScale(float f1)
    {
        a(i, f1);
    }

    public void setCircleTwoRotation(float f1)
    {
        b(h, f1);
    }

    public void setCircleTwoScale(float f1)
    {
        a(h, f1);
    }

    public void setProgressRadius(int i1)
    {
        o = i1;
        p = false;
        b();
    }

    public void setVisibility(int i1)
    {
        if (i1 == 0)
        {
            a(true);
        } else
        {
            a();
        }
        super.setVisibility(i1);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        f = hashmap;
        hashmap.put("circleOneScale", a);
        f.put("circleTwoScale", a);
        f.put("circleThreeScale", a);
        f.put("circleFourScale", a);
        f.put("circleOneRotation", e);
        f.put("circleTwoRotation", d);
        f.put("circleThreeRotation", c);
        f.put("circleFourRotation", b);
    }
}
