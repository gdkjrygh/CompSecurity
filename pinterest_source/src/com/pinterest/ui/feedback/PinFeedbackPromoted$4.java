// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.smartfeed.thrift.FeedbackType;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackPromoted, PinFeedbackState, PinFeedbackBase

class ickListener extends ickListener
{

    final PinFeedbackPromoted this$0;
    final int val$index;
    final ActionSheetFragment val$sheet;

    public void onClick(View view)
    {
        super.onClick(view);
        val$sheet.dismiss();
        _pin.setFeedbackType(Integer.valueOf(FeedbackType.a.getValue()));
        _pin.setFeedbackState(new PinFeedbackState(PinFeedbackBase.STR_PIN_HIDDEN, null));
        Pinalytics.a(PinFeedbackPromoted.access$000()[val$index]);
        PinApi.a(_pin.getUid(), _pin.getFeedbackType().intValue(), PinFeedbackPromoted.access$100()[val$index], null, getApiTag());
    }

    ()
    {
        this$0 = final_pinfeedbackpromoted;
        val$sheet = actionsheetfragment;
        val$index = I.this;
        super(final_pinfeedbackpromoted);
    }
}
