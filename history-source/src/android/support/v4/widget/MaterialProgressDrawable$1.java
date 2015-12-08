// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

class ng extends Animation
{

    final MaterialProgressDrawable this$0;
    final ng val$ring;

    public void applyTransformation(float f, Transformation transformation)
    {
        float f1 = (float)(Math.floor(val$ring.getStartingRotation() / 0.8F) + 1.0D);
        float f2 = val$ring.getStartingStartTrim();
        float f3 = val$ring.getStartingEndTrim();
        float f4 = val$ring.getStartingStartTrim();
        val$ring.setStartTrim(f2 + (f3 - f4) * f);
        f2 = val$ring.getStartingRotation();
        f3 = val$ring.getStartingRotation();
        val$ring.setRotation(f2 + (f1 - f3) * f);
        val$ring.setArrowScale(1.0F - f);
    }

    ng()
    {
        this$0 = final_materialprogressdrawable;
        val$ring = ng.this;
        super();
    }
}
