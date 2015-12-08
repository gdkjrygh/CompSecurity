// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import android.support.v4.view.ViewPager;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class this._cls0
    implements android.animation.teListener
{

    final PinCloseupGalleryModule this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PinCloseupGalleryModule.access$400(PinCloseupGalleryModule.this).setPadding(HORIZONTAL_PADDING_SMALL, 0, ((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
    }

    ()
    {
        this$0 = PinCloseupGalleryModule.this;
        super();
    }
}
