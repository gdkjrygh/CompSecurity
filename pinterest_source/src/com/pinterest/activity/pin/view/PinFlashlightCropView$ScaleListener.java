// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class <init> extends android.view.stureListener
{

    final PinFlashlightCropView this$0;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f1 = 1.0F;
        float f2 = scalegesturedetector.getFocusX();
        float f3 = scalegesturedetector.getFocusY();
        float f;
        if (scalegesturedetector.getPreviousSpanX() > 0.0F)
        {
            f = scalegesturedetector.getCurrentSpanX() / scalegesturedetector.getPreviousSpanX();
        } else
        {
            f = 1.0F;
        }
        if (scalegesturedetector.getPreviousSpanY() > 0.0F)
        {
            f1 = scalegesturedetector.getCurrentSpanY() / scalegesturedetector.getPreviousSpanY();
        }
        f *= PinFlashlightCropView.access$100(PinFlashlightCropView.this).width();
        f1 *= PinFlashlightCropView.access$100(PinFlashlightCropView.this).height();
        PinFlashlightCropView.access$1000(PinFlashlightCropView.this).top = Math.max(PinFlashlightCropView.access$1100(PinFlashlightCropView.this).top, f3 - f1 / 2.0F);
        PinFlashlightCropView.access$1000(PinFlashlightCropView.this).left = Math.max(PinFlashlightCropView.access$1100(PinFlashlightCropView.this).left, f2 - f / 2.0F);
        PinFlashlightCropView.access$1000(PinFlashlightCropView.this).right = Math.min(PinFlashlightCropView.access$1100(PinFlashlightCropView.this).right, f / 2.0F + f2);
        PinFlashlightCropView.access$1000(PinFlashlightCropView.this).bottom = Math.min(PinFlashlightCropView.access$1100(PinFlashlightCropView.this).bottom, f1 / 2.0F + f3);
        if (!PinFlashlightCropView.access$1200(PinFlashlightCropView.this, PinFlashlightCropView.access$1000(PinFlashlightCropView.this)) && !PinFlashlightCropView.access$1300(PinFlashlightCropView.this, PinFlashlightCropView.access$1000(PinFlashlightCropView.this)) && PinFlashlightCropView.access$1400(PinFlashlightCropView.this, PinFlashlightCropView.access$1000(PinFlashlightCropView.this)))
        {
            PinFlashlightCropView.access$100(PinFlashlightCropView.this).set(PinFlashlightCropView.access$1000(PinFlashlightCropView.this));
            invalidate();
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    private I()
    {
        this$0 = PinFlashlightCropView.this;
        super();
    }

    >(> >)
    {
        this();
    }
}
