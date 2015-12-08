// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPromoted

class this._cls0
    implements android.view.ckPromoted._cls3
{

    final PinFeedbackPromoted this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
        _sheet.dismissImmediately();
        ActivityHelper.goIntentView(_context, Resources.string(0x7f07074b));
    }

    ()
    {
        this$0 = PinFeedbackPromoted.this;
        super();
    }
}
