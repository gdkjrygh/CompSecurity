// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public final class Ft extends Fr
{

    public Ft(View view, View view1)
    {
        super(view, view1, 0L);
    }

    public final ObjectAnimator a()
    {
        float f = (float)(-Jo.a(c)) / 2.0F;
        return ObjectAnimator.ofFloat(b, "translationY", new float[] {
            f
        });
    }

    protected final ObjectAnimator b()
    {
        return ObjectAnimator.ofFloat(c, "alpha", new float[] {
            1.0F
        });
    }

    public final void onAnimationCancel(Animator animator)
    {
        b.setTranslationY(0.0F);
        c.setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (super.d)
        {
            return;
        } else
        {
            b.setTranslationY(0.0F);
            c.setAlpha(1.0F);
            c.setVisibility(0);
            return;
        }
    }
}
