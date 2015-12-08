// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class czx
{

    private static final TimeInterpolator a;

    public static android.animation.AnimatorSet.Builder a(AnimatorSet animatorset, android.animation.AnimatorSet.Builder builder, Animator animator)
    {
        if (builder == null)
        {
            return animatorset.play(animator);
        } else
        {
            builder.with(animator);
            return builder;
        }
    }

    public static ObjectAnimator a()
    {
        ObjectAnimator objectanimator = new ObjectAnimator();
        objectanimator.setInterpolator(a);
        return objectanimator;
    }

    public static ViewPropertyAnimator a(View view)
    {
        return ((View)b.a(view, "view", null)).animate().setInterpolator(a);
    }

    public static void a(View view, boolean flag, int i)
    {
        Object obj = (Float)view.getTag(b.hr);
        float f;
        float f1;
        if (obj == null)
        {
            f = view.getAlpha();
        } else
        {
            f = ((Float) (obj)).floatValue();
        }
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        if (f1 != f)
        {
            view.setTag(b.hr, Float.valueOf(f1));
            obj = new czy(view);
            a(view).alpha(f1).setDuration(400L).withEndAction(((Runnable) (obj))).start();
        }
    }

    static 
    {
        a = dac.a;
    }
}
