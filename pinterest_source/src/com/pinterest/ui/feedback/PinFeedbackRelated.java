// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackRelated extends PinFeedbackBase
{

    public PinFeedbackRelated(Context context, Pin pin)
    {
        super(context, pin);
    }

    public void setupOptions()
    {
        com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f0706f5), new _cls1());
        _sheet.addItem(actionsheetitem);
    }

    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackRelated this$0;

        public void onClick(View view)
        {
            super.onClick(view);
            Events.post(new RemoveRelatedPinsEvent(_pin.getRelatedParentPin()));
        }

        _cls1()
        {
            this$0 = PinFeedbackRelated.this;
            super(PinFeedbackRelated.this);
        }

        private class RemoveRelatedPinsEvent
        {

            private Pin _parentPin;

            public Pin getParentPin()
            {
                return _parentPin;
            }

            public RemoveRelatedPinsEvent(Pin pin)
            {
                _parentPin = pin;
            }
        }

    }

}
