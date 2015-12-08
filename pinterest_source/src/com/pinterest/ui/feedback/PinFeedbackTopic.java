// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.content.Context;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionsheet.ActionSheetFragment;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackBase

public class PinFeedbackTopic extends PinFeedbackBase
{

    static final String DOWN_VOTE = "downvote";

    public PinFeedbackTopic(Context context, Pin pin)
    {
        super(context, pin);
    }

    public void setupOptions()
    {
        if (_pin.getInterest() == null)
        {
            return;
        } else
        {
            final String topicName = _pin.getInterest().getName();
            com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem actionsheetitem = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f0705bd, new Object[] {
                topicName
            }), new _cls1());
            _sheet.addItem(actionsheetitem);
            topicName = new com.pinterest.ui.actionsheet.ActionSheetFragment.ActionSheetItem(Resources.string(0x7f070207, new Object[] {
                topicName
            }), new _cls2());
            _sheet.addItem(topicName);
            return;
        }
    }

    private class _cls1 extends PinFeedbackBase.ItemClickListener
    {

        final PinFeedbackTopic this$0;
        final String val$topicName;

        public void onClick(View view)
        {
            super.onClick(view);
            view = Resources.string(0x7f07039e, new Object[] {
                topicName
            });
            _pin.setFeedbackState((new PinFeedbackState(PinFeedbackBase.STR_UNFOLLOWED, view)).setDestination(new Navigation(Location.INTEREST, _pin.getInterest())));
            InterestsApi.a(_pin.getInterest(), false, null, _pin.getInterest().getRecommendationSource(), null, null, getApiTag());
            dematerializePin();
        }

        _cls1()
        {
            this$0 = PinFeedbackTopic.this;
            topicName = s;
            super(PinFeedbackTopic.this);
        }
    }


    private class _cls2 extends PinFeedbackBase.ItemClickListener
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

        _cls2()
        {
            this$0 = PinFeedbackTopic.this;
            super(PinFeedbackTopic.this);
        }
    }

}
