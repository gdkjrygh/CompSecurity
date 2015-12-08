// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ValueAnimator;
import android.graphics.RectF;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class this._cls0
    implements android.animation.dateListener
{

    final PinFlashlightCropView this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
        PinFlashlightCropView.access$100(PinFlashlightCropView.this).top = f;
    }

    ()
    {
        this$0 = PinFlashlightCropView.this;
        super();
    }
}
