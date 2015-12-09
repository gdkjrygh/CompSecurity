// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.feedback.FeedbackResponse;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class TrackerAPI
{

    PowerRestClient mPowerRestClient;

    public TrackerAPI()
    {
    }

    public FeedbackQuestions getFeedbackQuestions(String s, String s1, String s2)
    {
        return mPowerRestClient.getFeedbackQuestions(s, s1, s2);
    }

    public boolean submitFeedbackResponse(FeedbackResponse feedbackresponse, String s)
    {
        return feedbackresponse != null && mPowerRestClient.submitFeedback(feedbackresponse, s);
    }
}
