// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;

// Referenced classes of package com.dominos.views:
//            TrackerQuestionView

class ack.FeedbackQuestionModel
    implements android.view.ew._cls1
{

    final TrackerQuestionView this$0;
    final FeedbackQuestionModel val$questionModel;

    public void onClick(View view)
    {
        if (val$questionModel.isBeforeArrived())
        {
            TrackerQuestionView.access$000(TrackerQuestionView.this).onBeforeQuestionClicked();
            return;
        } else
        {
            TrackerQuestionView.access$000(TrackerQuestionView.this).onAfterQuestionClicked();
            return;
        }
    }

    ack.FeedbackQuestionModel()
    {
        this$0 = final_trackerquestionview;
        val$questionModel = FeedbackQuestionModel.this;
        super();
    }
}
