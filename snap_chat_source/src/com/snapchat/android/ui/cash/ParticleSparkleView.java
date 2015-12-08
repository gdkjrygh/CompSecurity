// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import Jo;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.Random;
import sg;

// Referenced classes of package com.snapchat.android.ui.cash:
//            ParticleView

public class ParticleSparkleView extends ViewGroup
    implements ParticleView.a
{

    public int a;
    public sg b;
    public boolean c;
    private Drawable d;
    private Context e;
    private Random f;
    private int g;
    private int h;

    public ParticleSparkleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Random();
        c = false;
        e = context;
        context = context.obtainStyledAttributes(attributeset, kx.a.ParticleSparkleView);
        d = context.getDrawable(0);
        a = context.getInt(1, 1);
        context.recycle();
        g = (int)Jo.a(25F, e);
        h = (int)Jo.a(125F, e);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public final void a()
    {
        ParticleView particleview = new ParticleView(e);
        particleview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        particleview.setImageDrawable(d);
        particleview.setAnimationListener(this);
        particleview.setCenterPoint(b.a());
        particleview.setFinalSize(f.nextInt(h - g) + g);
        particleview.setAlpha(0.0F);
        addView(particleview);
        AnimatorSet animatorset = new AnimatorSet();
        int i = ParticleView.c.nextInt(300);
        int j = ParticleView.c.nextInt(100);
        int k = ParticleView.c.nextInt(100);
        particleview.setScaleX(0.3F);
        particleview.setScaleY(0.3F);
        Object obj1 = PropertyValuesHolder.ofFloat(ParticleView.SCALE_X, new float[] {
            1.0F
        });
        PropertyValuesHolder propertyvaluesholder2 = PropertyValuesHolder.ofFloat(ParticleView.SCALE_Y, new float[] {
            1.0F
        });
        PropertyValuesHolder propertyvaluesholder3 = PropertyValuesHolder.ofFloat(ParticleView.ALPHA, new float[] {
            1.0F
        });
        Object obj = PropertyValuesHolder.ofFloat(ParticleView.SCALE_X, new float[] {
            0.3F
        });
        PropertyValuesHolder propertyvaluesholder = PropertyValuesHolder.ofFloat(ParticleView.SCALE_Y, new float[] {
            0.3F
        });
        PropertyValuesHolder propertyvaluesholder1 = PropertyValuesHolder.ofFloat(ParticleView.ALPHA, new float[] {
            0.0F
        });
        obj1 = ObjectAnimator.ofPropertyValuesHolder(particleview, new PropertyValuesHolder[] {
            obj1, propertyvaluesholder2, propertyvaluesholder3
        }).setDuration(j + 300);
        obj = ObjectAnimator.ofPropertyValuesHolder(particleview, new PropertyValuesHolder[] {
            obj, propertyvaluesholder, propertyvaluesholder1
        }).setDuration(k + 300);
        animatorset.play(((android.animation.Animator) (obj1))).after(i);
        animatorset.play(((android.animation.Animator) (obj))).after(((android.animation.Animator) (obj1)));
        animatorset.addListener(new ParticleView._cls1(particleview, particleview));
        animatorset.start();
    }

    public final void a(ParticleView particleview)
    {
        b.a(particleview.a);
        removeView(particleview);
        if (c)
        {
            a();
        }
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = getChildCount();
        for (i = 0; i < j; i++)
        {
            ParticleView particleview = (ParticleView)getChildAt(i);
            int i2 = particleview.getMeasuredWidth();
            k = particleview.getMeasuredHeight();
            Point point = particleview.a;
            l = point.x;
            int i1 = i2 / 2;
            int j1 = point.y;
            int k1 = k / 2;
            int l1 = point.x;
            i2 /= 2;
            int j2 = point.y;
            particleview.layout(l - i1, j1 - k1, i2 + l1, k / 2 + j2);
        }

    }

    protected void onMeasure(int i, int j)
    {
        int k = getChildCount();
        setMeasuredDimension(i, j);
        for (i = 0; i < k; i++)
        {
            ParticleView particleview = (ParticleView)getChildAt(i);
            j = android.view.View.MeasureSpec.makeMeasureSpec(particleview.b, 0x40000000);
            measureChild(particleview, j, j);
        }

    }
}
