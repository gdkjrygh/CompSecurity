// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.kit.activity:
//            DialogHostActivity

class this._cls0
    implements com.pinterest.base.er
{

    final DialogHostActivity this$0;

    public void onEventMainThread(DialogEvent dialogevent)
    {
        Events.removeStickyEvent(dialogevent);
        show(dialogevent.getDialog());
    }

    public void onEventMainThread(DialogHideEvent dialoghideevent)
    {
        Events.removeStickyEvent(dialoghideevent);
        if (dialoghideevent.waitDialogOnly())
        {
            hideWaitDialog();
            return;
        } else
        {
            show(null);
            return;
        }
    }

    t()
    {
        this$0 = DialogHostActivity.this;
        super();
    }
}
