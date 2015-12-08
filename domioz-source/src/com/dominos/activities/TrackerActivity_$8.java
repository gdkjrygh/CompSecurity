// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity_

class k.FeedbackQuestions
    implements Runnable
{

    final TrackerActivity_ this$0;
    final FeedbackQuestions val$feedbackQuestions;

    public void run()
    {
        TrackerActivity_.access$601(TrackerActivity_.this, val$feedbackQuestions);
    }

    k.FeedbackQuestions()
    {
        this$0 = final_trackeractivity_;
        val$feedbackQuestions = FeedbackQuestions.this;
        super();
    }
}
