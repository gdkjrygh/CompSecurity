// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPromoted

class ickListener extends ickListener
{

    final PinFeedbackPromoted this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
        _sheet.dismissImmediately();
        showAddtionalOptions();
    }

    ()
    {
        this$0 = PinFeedbackPromoted.this;
        super(PinFeedbackPromoted.this);
    }
}
