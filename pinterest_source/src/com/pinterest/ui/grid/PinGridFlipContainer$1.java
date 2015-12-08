// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.animation.Animator;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridFlipContainer, PinGridCell, PinGridFeedbackView

class ionListener extends com.pinterest.kit.utils.nListener
{

    final PinGridFlipContainer this$0;

    public void onAnimationEnd(Animator animator)
    {
        gridCell.setVisibility(4);
        feedbackView.setVisibility(0);
    }

    ionListener()
    {
        this$0 = PinGridFlipContainer.this;
        super();
    }
}
