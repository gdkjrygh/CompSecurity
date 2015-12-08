// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.feedback.RecommendationComplaintReason;
import com.pinterest.smartfeed.thrift.FeedbackType;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPromoted, PinFeedbackState, PinFeedbackBase

class ickListener extends ickListener
{

    final PinFeedbackPromoted this$0;

    public void onClick(View view)
    {
        super.onClick(view);
        Pinalytics.a(ElementType.PIN_FEEDBACK_DIALOG_BUTTON_HIDE_PIN_PROMOTED, ComponentType.PIN_FEEDBACK_DIALOG_PROMOTED);
        _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
        _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
        PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), RecommendationComplaintReason.DO_NOT_WANT_ALCOHOL_ADS.getValue(), null, getApiTag());
    }

    plaintReason()
    {
        this$0 = PinFeedbackPromoted.this;
        super(PinFeedbackPromoted.this);
    }
}
