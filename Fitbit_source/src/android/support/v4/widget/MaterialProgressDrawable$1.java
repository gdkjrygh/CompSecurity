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
            MaterialProgressDrawable.access$200(MaterialProgressDrawable.this, f, val$ring);
            return;
        } else
        {
            float f3 = (float)Math.toRadians((double)val$ring.getStrokeWidth() / (6.2831853071795862D * val$ring.getCenterRadius()));
            float f4 = val$ring.getStartingEndTrim();
            float f1 = val$ring.getStartingStartTrim();
            float f2 = val$ring.getStartingRotation();
            float f5 = MaterialProgressDrawable.access$300().getInterpolation(f);
            val$ring.setEndTrim((0.8F - f3) * f5 + f4);
            f3 = MaterialProgressDrawable.access$400().getInterpolation(f);
            val$ring.setStartTrim(f3 * 0.8F + f1);
            val$ring.setRotation(0.25F * f + f2);
            f1 = MaterialProgressDrawable.access$500(MaterialProgressDrawable.this) / 5F;
            setRotation(144F * f + 720F * f1);
            return;
        }
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
