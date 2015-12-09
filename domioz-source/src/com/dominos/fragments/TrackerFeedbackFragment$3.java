// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestion;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestionModel;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import java.util.Map;

// Referenced classes of package com.dominos.fragments:
//            TrackerFeedbackFragment

class val.feedbackQuestions
    implements android.view.agment._cls3
{

    final TrackerFeedbackFragment this$0;
    final Map val$feedbackQuestions;

    public void onClick(View view)
    {
        view = (FeedbackQuestion)val$feedbackQuestions.get("09262007-000007");
        FeedbackQuestionModel feedbackquestionmodel = new FeedbackQuestionModel();
        feedbackquestionmodel.setResponse(mCommentBox.getText().toString());
        feedbackquestionmodel.setType(view.getType());
        feedbackquestionmodel.setCode(view.getCode());
        if (StringHelper.isNotEmpty(feedbackquestionmodel.getResponse()))
        {
            TrackerFeedbackFragment.access$000(TrackerFeedbackFragment.this).onSendButtonClicked(feedbackquestionmodel);
            if (TrackerFeedbackFragment.access$100(TrackerFeedbackFragment.this).getTrackerOrderStatus().getOrderStatus() == OrderStatus.COMPLETE)
            {
                mSendButton.setVisibility(8);
                mThanksCommentTextView.setVisibility(0);
                mCommentBox.setVisibility(8);
                mCommentsTitle.setVisibility(8);
            }
        }
    }

    Status()
    {
        this$0 = final_trackerfeedbackfragment;
        val$feedbackQuestions = Map.this;
        super();
    }
}
