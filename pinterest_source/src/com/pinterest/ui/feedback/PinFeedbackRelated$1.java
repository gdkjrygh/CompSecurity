// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackRelated

class lickListener extends lickListener
{

    final PinFeedbackRelated this$0;

    public void onClick(View view)
    {
        super.onClick(view);
        Events.post(new moveRelatedPinsEvent(_pin.getRelatedParentPin()));
    }

    moveRelatedPinsEvent()
    {
        this$0 = PinFeedbackRelated.this;
        super(PinFeedbackRelated.this);
    }
}
