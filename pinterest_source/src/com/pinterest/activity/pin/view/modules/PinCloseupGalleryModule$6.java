// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.animation.Animator;
import com.pinterest.activity.pin.view.PinCloseupImageView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class val.nextView extends com.pinterest.kit.utils.stener
{

    final PinCloseupGalleryModule this$0;
    final PinCloseupImageView val$nextView;

    public void onAnimationEnd(Animator animator)
    {
        if (val$nextView != null)
        {
            val$nextView.darken();
        }
    }

    public void onAnimationStart(Animator animator)
    {
        if (val$nextView != null)
        {
            val$nextView.lighten();
        }
    }

    ()
    {
        this$0 = final_pincloseupgallerymodule;
        val$nextView = PinCloseupImageView.this;
        super();
    }
}
