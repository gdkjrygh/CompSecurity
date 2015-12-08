// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            b, c

public final class a
{

    public static void a(View view, float f, float f1, long l, Interpolator interpolator, Runnable runnable)
    {
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        view = view.animate().alpha(f1);
        view.setDuration(l);
        if (interpolator != null)
        {
            view.setInterpolator(interpolator);
        }
        if (runnable == null) goto _L4; else goto _L3
_L3:
        view.setListener(new b(runnable));
_L6:
        return;
_L4:
        view.setListener(null);
        return;
_L2:
        if (view.getVisibility() == 0 && view.getWidth() > 0 && view.getHeight() > 0)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(f, f1);
            view.clearAnimation();
            alphaanimation.setDuration(l);
            alphaanimation.setFillAfter(true);
            if (interpolator != null)
            {
                alphaanimation.setInterpolator(interpolator);
            }
            if (runnable != null)
            {
                alphaanimation.setAnimationListener(new c(runnable));
            } else
            {
                alphaanimation.setAnimationListener(null);
            }
            view.startAnimation(alphaanimation);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
