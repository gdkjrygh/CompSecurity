// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.animation.Animator;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderListCell

class nit> extends com.pinterest.kit.utils.stener
{

    final HomefeedBuilderListCell this$0;

    public void onAnimationEnd(Animator animator)
    {
        Events.post(new deoutDismissedViewEndEvent(HomefeedBuilderListCell.access$000(HomefeedBuilderListCell.this)));
    }

    public void onAnimationStart(Animator animator)
    {
        Events.post(new deoutDismissedViewStartEvent(HomefeedBuilderListCell.access$000(HomefeedBuilderListCell.this)));
    }

    deoutDismissedViewStartEvent()
    {
        this$0 = HomefeedBuilderListCell.this;
        super();
    }
}
