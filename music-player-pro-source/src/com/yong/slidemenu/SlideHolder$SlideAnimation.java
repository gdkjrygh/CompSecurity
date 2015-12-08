// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.slidemenu;

import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;

// Referenced classes of package com.yong.slidemenu:
//            SlideHolder

private class mStart extends Animation
{

    private static final float SPEED = 0.6F;
    private float mEnd;
    private float mStart;
    final SlideHolder this$0;

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        float f1 = mEnd;
        float f2 = mStart;
        float f3 = mStart;
        SlideHolder.access$2(SlideHolder.this, (int)((f1 - f2) * f + f3));
        postInvalidate();
    }

    public (float f, float f1)
    {
        this$0 = SlideHolder.this;
        super();
        mStart = f;
        mEnd = f1;
        setInterpolator(new DecelerateInterpolator());
        setDuration((long)(Math.abs(mEnd - mStart) / 0.6F));
    }
}
