// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.os.Handler;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXAnimatedInterestCellsView

class  extends com.pinterest.kit.utils.r
{

    final NUXAnimatedInterestCellsView this$0;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        NUXAnimatedInterestCellsView.access$500(NUXAnimatedInterestCellsView.this).postDelayed(NUXAnimatedInterestCellsView.access$400(NUXAnimatedInterestCellsView.this), 1000L);
    }

    ()
    {
        this$0 = NUXAnimatedInterestCellsView.this;
        super();
    }
}
