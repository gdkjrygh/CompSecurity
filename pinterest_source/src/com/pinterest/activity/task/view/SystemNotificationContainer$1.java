// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.animation.ValueAnimator;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.task.view:
//            SystemNotificationContainer

class this._cls0
    implements android.animation.stener
{

    final SystemNotificationContainer this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        SystemNotificationContainer.access$000(SystemNotificationContainer.this).getLayoutParams().rams = ((Float)valueanimator.getAnimatedValue()).intValue();
        SystemNotificationContainer.access$000(SystemNotificationContainer.this).requestLayout();
    }

    ()
    {
        this$0 = SystemNotificationContainer.this;
        super();
    }
}
