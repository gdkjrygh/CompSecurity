// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.activity.interest.InterestFragment;
import com.pinterest.activity.search.GuidedSearchFragment;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackNotRelevant, PinFeedbackState, PinFeedbackBase

class Listener extends Listener
{

    final PinFeedbackNotRelevant this$0;
    final String val$name;

    public void onClick(View view)
    {
        super.onClick(view);
        view = Resources.string(0x7f07061d);
        _pin.setFeedbackState(new PinFeedbackState(0x7f02003b, 0x7f020253, PinFeedbackBase.STR_THANKS, view));
        if (PinFeedbackNotRelevant.access$000(PinFeedbackNotRelevant.this) instanceof GuidedSearchFragment)
        {
            SearchApi.a(_pin.getUid(), val$name, getApiTag());
        } else
        if (PinFeedbackNotRelevant.access$000(PinFeedbackNotRelevant.this) instanceof InterestFragment)
        {
            InterestsApi.a(_pin.getInterest().getUid(), _pin.getCacheableId(), "downvote", getApiTag());
        } else
        {
            com.pinterest.activity.task.fragment.BaseFragment _tmp = PinFeedbackNotRelevant.access$000(PinFeedbackNotRelevant.this);
        }
        dematerializePin();
    }

    Listener()
    {
        this$0 = final_pinfeedbacknotrelevant;
        val$name = String.this;
        super(final_pinfeedbacknotrelevant);
    }
}
