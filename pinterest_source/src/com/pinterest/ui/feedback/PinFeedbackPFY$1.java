// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.smartfeed.thrift.FeedbackType;
import com.pinterest.ui.grid.dialog.RecommendedPinFeedbackDialog;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPFY, PinFeedbackState, PinFeedbackBase

class temClickListener extends temClickListener
{

    final PinFeedbackPFY this$0;

    public void onClick(View view)
    {
        super.onClick(view);
        _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
        _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
        view = RecommendedPinFeedbackDialog.getThroughObjectUid(_pin, false);
        PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), view, Pin.getRecommendationUid(_pin.getRecommendationReason()), null, getApiTag());
    }

    FeedbackDialog()
    {
        this$0 = PinFeedbackPFY.this;
        super(PinFeedbackPFY.this);
    }
}
