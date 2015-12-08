// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.activity.report.ReportPinDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

class this._cls0
    implements android.view.er
{

    final PinFeedbackBase this$0;

    public void onClick(View view)
    {
        view = new ReportPinDialog(_pin.getUid());
        view.setFromGrid(true);
        Events.post(new DialogEvent(view));
        _sheet.dismiss();
    }

    ment()
    {
        this$0 = PinFeedbackBase.this;
        super();
    }
}
