// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

class ng extends Animation
{

    final MaterialProgressDrawable this$0;
    final ng val$ring;

    public void applyTransformation(float f, Transformation transformation)
    {
        if (mFinishing)
        {
            MaterialProgressDrawable.access$000(MaterialProgressDrawable.this, f, val$ring);
            return;
        }
        float f1 = MaterialProgressDrawable.access$100(MaterialProgressDrawable.this, val$ring);
        float f2 = val$ring.getStartingEndTrim();
        float f4 = val$ring.getStartingStartTrim();
        float f3 = val$ring.getStartingRotation();
        MaterialProgressDrawable.access$200(MaterialProgressDrawable.this, f, val$ring);
        if (f <= 0.5F)
        {
            float f6 = f / 0.5F;
            f6 = MaterialProgressDrawable.access$300().getInterpolation(f6);
            val$ring.setStartTrim(f4 + f6 * (0.8F - f1));
        }
        if (f > 0.5F)
        {
            float f5 = (f - 0.5F) / 0.5F;
            f5 = MaterialProgressDrawable.access$300().getInterpolation(f5);
            val$ring.setEndTrim((0.8F - f1) * f5 + f2);
        }
        val$ring.setRotation(0.25F * f + f3);
        f1 = MaterialProgressDrawable.access$400(MaterialProgressDrawable.this) / 5F;
        setRotation(216F * f + 1080F * f1);
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
