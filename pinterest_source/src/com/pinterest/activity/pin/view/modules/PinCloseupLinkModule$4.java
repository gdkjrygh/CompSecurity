// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupLinkModule

class this._cls0
    implements com.pinterest.base.
{

    final PinCloseupLinkModule this$0;

    public void onEventMainThread(com.pinterest.activity.task.education.view.ickthroughToolTipEvent ickthroughtooltipevent)
    {
        Events.unregister(PinCloseupLinkModule.access$200(PinCloseupLinkModule.this), new Class[] {
            com/pinterest/activity/task/education/view/EducationToolTipView$ClickthroughToolTipEvent
        });
        if (!StopWatch.get().isActive("clickthrough_verify"))
        {
            PinCloseupLinkModule.access$100(PinCloseupLinkModule.this, null);
        }
    }

    .ClickthroughToolTipEvent()
    {
        this$0 = PinCloseupLinkModule.this;
        super();
    }
}
