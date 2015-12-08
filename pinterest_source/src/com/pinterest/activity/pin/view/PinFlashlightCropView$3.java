// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ValueAnimator;
import android.graphics.RectF;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class val.finalStartWidth
    implements android.animation.dateListener
{

    final PinFlashlightCropView this$0;
    final float val$finalStartHeight;
    final float val$finalStartWidth;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        float f1 = val$finalStartHeight;
        float f2 = val$finalStartWidth;
        PinFlashlightCropView.access$100(PinFlashlightCropView.this).right = f * f2 + PinFlashlightCropView.access$100(PinFlashlightCropView.this).left;
        PinFlashlightCropView.access$100(PinFlashlightCropView.this).bottom = f1 * f + PinFlashlightCropView.access$100(PinFlashlightCropView.this).top;
        invalidate();
    }

    ()
    {
        this$0 = final_pinflashlightcropview;
        val$finalStartHeight = f;
        val$finalStartWidth = F.this;
        super();
    }
}
