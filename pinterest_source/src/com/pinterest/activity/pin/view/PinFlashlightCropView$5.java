// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ValueAnimator;
import android.graphics.RectF;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class val.originalFrameRect
    implements android.animation.dateListener
{

    final PinFlashlightCropView this$0;
    final RectF val$originalFrameRect;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        float f1 = val$originalFrameRect.height();
        float f2 = val$originalFrameRect.width();
        float f3 = PinFlashlightCropView.access$100(PinFlashlightCropView.this).centerX();
        float f4 = PinFlashlightCropView.access$100(PinFlashlightCropView.this).centerY();
        PinFlashlightCropView.access$800(PinFlashlightCropView.this, PinFlashlightCropView.access$100(PinFlashlightCropView.this), f2 * f, f1 * f, f3, f4);
        invalidate();
    }

    ()
    {
        this$0 = final_pinflashlightcropview;
        val$originalFrameRect = RectF.this;
        super();
    }
}
