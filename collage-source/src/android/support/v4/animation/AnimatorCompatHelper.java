// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;

// Referenced classes of package android.support.v4.animation:
//            HoneycombMr1AnimatorCompatProvider, DonutAnimatorCompatProvider, AnimatorProvider, ValueAnimatorCompat

public abstract class AnimatorCompatHelper
{

    static AnimatorProvider IMPL;

    AnimatorCompatHelper()
    {
    }

    public static void clearInterpolator(View view)
    {
        IMPL.clearInterpolator(view);
    }

    public static ValueAnimatorCompat emptyValueAnimator()
    {
        return IMPL.emptyValueAnimator();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            IMPL = new HoneycombMr1AnimatorCompatProvider();
        } else
        {
            IMPL = new DonutAnimatorCompatProvider();
        }
    }
}
