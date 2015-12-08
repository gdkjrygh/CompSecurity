// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.smartfeed.thrift.FeedbackType;
import com.pinterest.ui.grid.dialog.RecommendedPinFeedbackDialog;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPFY, PinFeedbackState, PinFeedbackBase

class temClickListener extends temClickListener
{

    final PinFeedbackPFY this$0;
    final boolean val$isRecentActivity;
    final String val$name;

    public void onClick(View view)
    {
        super.onClick(view);
        view = Resources.string(0x7f07039f, new Object[] {
            val$name
        });
        _pin.setFeedbackState(new PinFeedbackState(0x7f02003b, 0x7f020253, PinFeedbackBase.STR_GOT_IT, view));
        if (!val$isRecentActivity)
        {
            view = RecommendedPinFeedbackDialog.getThroughObjectUid(_pin, true);
        } else
        {
            _pin.setFeedbackType(Integer.valueOf(FeedbackType.d.getValue()));
            if (_pin.getRecommendationPin() != null)
            {
                view = _pin.getRecommendationPin().getCacheableId();
            } else
            {
                view = null;
            }
        }
        PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), view, Pin.getRecommendationUid(_pin.getRecommendationReason()), null, getApiTag());
    }

    ()
    {
        this$0 = final_pinfeedbackpfy;
        val$name = s;
        val$isRecentActivity = Z.this;
        super(final_pinfeedbackpfy);
    }
}
