// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackTopic, PinFeedbackState, PinFeedbackBase

class mClickListener extends mClickListener
{

    final PinFeedbackTopic this$0;
    final String val$topicName;

    public void onClick(View view)
    {
        super.onClick(view);
        view = Resources.string(0x7f07039e, new Object[] {
            val$topicName
        });
        _pin.setFeedbackState((new PinFeedbackState(PinFeedbackBase.STR_UNFOLLOWED, view)).setDestination(new Navigation(Location.INTEREST, _pin.getInterest())));
        InterestsApi.a(_pin.getInterest(), false, null, _pin.getInterest().getRecommendationSource(), null, null, getApiTag());
        dematerializePin();
    }

    mClickListener()
    {
        this$0 = final_pinfeedbacktopic;
        val$topicName = String.this;
        super(final_pinfeedbacktopic);
    }
}
