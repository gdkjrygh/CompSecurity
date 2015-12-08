// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.animation;

import android.animation.ValueAnimator;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.animation:
//            SkypeAbstractAnimatorSet, BezierEasingInterpolator

public class SkypeValueAnimatorSet extends SkypeAbstractAnimatorSet
{

    private android.animation.ValueAnimator.AnimatorUpdateListener f;

    public SkypeValueAnimatorSet(android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
    {
        f = animatorupdatelistener;
    }

    protected final void a(float f1, float f2, float f3, float f4, String s, float f5, float f6, 
            long l)
    {
        if (f == null)
        {
            throw new IllegalStateException("You need to supply an update listener");
        } else
        {
            s = ValueAnimator.ofFloat(new float[] {
                f5, f6
            });
            s.setDuration(l);
            s.setInterpolator(new BezierEasingInterpolator(f1, f2, f3, f4, l));
            s.addUpdateListener(f);
            b.add(s);
            return;
        }
    }

    public final void a(long l)
    {
        a(l, "", c);
        a();
    }
}
