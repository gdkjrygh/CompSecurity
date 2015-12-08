// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            AddMessageDialog, SendPinTitleCell

class this._cls0
    implements android.view.r
{

    final SendPinTitleCell this$0;

    public void onClick(View view)
    {
        view.requestFocusFromTouch();
        Pinalytics.a(ElementType.ADD_MESSAGE_BUTTON, ComponentType.NAVIGATION);
        Events.post(new DialogEvent(new AddMessageDialog(SendPinTitleCell.access$000(SendPinTitleCell.this), SendPinTitleCell.access$100(SendPinTitleCell.this))));
        Events.post(new mMessageDialogEvent(SendPinTitleCell.this));
    }

    mMessageDialogEvent()
    {
        this$0 = SendPinTitleCell.this;
        super();
    }
}
