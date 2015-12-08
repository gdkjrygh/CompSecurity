// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.x;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            h, m, c, b

final class j extends h
{

    private Drawable g;
    private RippleDrawable h;
    private Drawable i;
    private Interpolator j;

    j(View view, m m1)
    {
        super(view, m1);
        if (!view.isInEditMode())
        {
            j = AnimationUtils.loadInterpolator(e.getContext(), 0x10c000d);
        }
    }

    private Animator a(Animator animator)
    {
        animator.setInterpolator(j);
        return animator;
    }

    final void a()
    {
    }

    public final void a(float f)
    {
        x.f(e, f);
    }

    final void a(int k)
    {
        h.setColor(ColorStateList.valueOf(k));
    }

    final void a(ColorStateList colorstatelist)
    {
        android.support.v4.graphics.drawable.a.a(g, colorstatelist);
        if (i != null)
        {
            android.support.v4.graphics.drawable.a.a(i, colorstatelist);
        }
    }

    final void a(android.graphics.PorterDuff.Mode mode)
    {
        android.support.v4.graphics.drawable.a.a(g, mode);
    }

    final void a(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int k, int l)
    {
        g = android.support.v4.graphics.drawable.a.c(drawable.mutate());
        android.support.v4.graphics.drawable.a.a(g, colorstatelist);
        if (mode != null)
        {
            android.support.v4.graphics.drawable.a.a(g, mode);
        }
        if (l > 0)
        {
            i = a(l, colorstatelist);
            drawable = new LayerDrawable(new Drawable[] {
                i, g
            });
        } else
        {
            i = null;
            drawable = g;
        }
        h = new RippleDrawable(ColorStateList.valueOf(k), drawable, null);
        f.a(h);
        f.a(0, 0, 0, 0);
    }

    final void a(int ai[])
    {
    }

    final void b(float f)
    {
        StateListAnimator statelistanimator = new StateListAnimator();
        statelistanimator.addState(b, a(ObjectAnimator.ofFloat(e, "translationZ", new float[] {
            f
        })));
        statelistanimator.addState(c, a(ObjectAnimator.ofFloat(e, "translationZ", new float[] {
            f
        })));
        statelistanimator.addState(d, a(ObjectAnimator.ofFloat(e, "translationZ", new float[] {
            0.0F
        })));
        e.setStateListAnimator(statelistanimator);
    }

    final b d()
    {
        return new c();
    }
}
