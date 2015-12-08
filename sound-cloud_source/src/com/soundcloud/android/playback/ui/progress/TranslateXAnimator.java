// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressAnimator

public class TranslateXAnimator extends ProgressAnimator
{

    public TranslateXAnimator(View view, float f, float f1)
    {
        super(view, f, f1);
    }

    protected ObjectAnimator createAnimator(float f, float f1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(progressView, "translationX", new float[] {
            f, f1
        });
        objectanimator.setInterpolator(new LinearInterpolator());
        return objectanimator;
    }

    public float getDifferenceFromCurrentValue(float f)
    {
        return ((Float)wrappedAnimator.getAnimatedValue()).floatValue() - f;
    }
}
