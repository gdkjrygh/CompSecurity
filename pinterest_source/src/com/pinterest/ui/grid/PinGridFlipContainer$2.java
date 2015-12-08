// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.animation.Animator;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridFlipContainer

class ionListener extends com.pinterest.kit.utils.nListener
{

    final PinGridFlipContainer this$0;

    public void onAnimationEnd(Animator animator)
    {
        PinGridFlipContainer.access$000(PinGridFlipContainer.this).setHiddenState(Integer.valueOf(1));
        Events.postSticky(new com.pinterest.api.model.is._cls0(PinGridFlipContainer.access$000(PinGridFlipContainer.this)));
    }

    ionListener()
    {
        this$0 = PinGridFlipContainer.this;
        super();
    }
}
