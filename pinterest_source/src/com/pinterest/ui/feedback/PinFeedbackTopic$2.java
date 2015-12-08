// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackTopic, PinFeedbackState, PinFeedbackBase

class mClickListener extends mClickListener
{

    final PinFeedbackTopic this$0;

    public void onClick(View view)
    {
        super.onClick(view);
        view = Resources.string(0x7f07061d);
        _pin.setFeedbackState(new PinFeedbackState(0x7f02003b, 0x7f020253, PinFeedbackBase.STR_THANKS, view));
        InterestsApi.a(_pin.getInterest().getUid(), _pin.getCacheableId(), "downvote", getApiTag());
        dematerializePin();
    }

    mClickListener()
    {
        this$0 = PinFeedbackTopic.this;
        super(PinFeedbackTopic.this);
    }
}
