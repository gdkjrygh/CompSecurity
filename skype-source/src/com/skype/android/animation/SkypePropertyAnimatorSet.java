// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.animation:
//            SkypeAbstractAnimatorSet, BezierEasingInterpolator

public class SkypePropertyAnimatorSet extends SkypeAbstractAnimatorSet
{

    private ArrayList f;
    private View g;

    public SkypePropertyAnimatorSet(View view, String s)
    {
        f = new ArrayList();
        g = view;
        f.add(s);
    }

    public transient SkypePropertyAnimatorSet(View view, String as[])
    {
        f = new ArrayList();
        g = view;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            view = as[i];
            f.add(view);
        }

    }

    public static SkypePropertyAnimatorSet a(View view, String s, float f1)
    {
        view = new SkypePropertyAnimatorSet(view, new String[] {
            s
        });
        view.a(0.0F, f1, SkypeAbstractAnimatorSet.Curve.a());
        view.a(0.454F, 0.0F + (0.0F - f1) * 0.1F, SkypeAbstractAnimatorSet.Curve.b());
        view.a(1.0F, 0.0F, null);
        return view;
    }

    protected final void a(float f1, float f2, float f3, float f4, String s, float f5, float f6, 
            long l)
    {
        if (f.size() == 1)
        {
            s = ObjectAnimator.ofFloat(g, (String)f.get(0), new float[] {
                f6
            });
        } else
        {
            s = new PropertyValuesHolder[f.size()];
            for (int i = 0; i < f.size(); i++)
            {
                s[i] = PropertyValuesHolder.ofFloat((String)f.get(i), new float[] {
                    f6
                });
            }

            s = ObjectAnimator.ofPropertyValuesHolder(g, s);
        }
        s.setDuration(l);
        s.setInterpolator(new BezierEasingInterpolator(f1, f2, f3, f4, l));
        b.add(s);
    }

    public final void a(long l)
    {
        a(l, "", c);
        a();
    }
}
