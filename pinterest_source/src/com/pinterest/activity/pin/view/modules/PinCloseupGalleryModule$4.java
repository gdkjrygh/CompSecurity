// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.ValueAnimator;
import com.pinterest.activity.pin.view.PinCloseupImageView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class val.nextView
    implements android.animation.teListener
{

    final PinCloseupGalleryModule this$0;
    final PinCloseupImageView val$nextView;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).setItemHeight(i, false);
        if (val$nextView != null)
        {
            val$nextView.setItemHeight(i, false);
        }
    }

    ()
    {
        this$0 = final_pincloseupgallerymodule;
        val$nextView = PinCloseupImageView.this;
        super();
    }
}
