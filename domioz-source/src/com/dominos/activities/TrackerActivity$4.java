// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity

class dbackQuestionsCallback extends com.dominos.android.sdk.core.tracker.dFeedbackQuestionsCallback
{

    final TrackerActivity this$0;

    public void onLoadFeedbackFailure()
    {
    }

    public void onLoadFeedbackSuccess(FeedbackQuestions feedbackquestions)
    {
        updateFeedbackData(feedbackquestions);
    }

    ck.FeedbackQuestions()
    {
        this$0 = TrackerActivity.this;
        super();
    }
}
