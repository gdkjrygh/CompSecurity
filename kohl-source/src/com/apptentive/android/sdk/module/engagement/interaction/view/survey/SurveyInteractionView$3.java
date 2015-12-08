// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.widget.Button;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.Question;
import com.apptentive.android.sdk.module.survey.OnSurveyQuestionAnsweredListener;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            SurveyInteractionView

class val.send
    implements OnSurveyQuestionAnsweredListener
{

    final SurveyInteractionView this$0;
    final Activity val$activity;
    final Question val$question;
    final Button val$send;

    public void onAnswered()
    {
        sendMetricForQuestion(val$activity, val$question);
        val$send.setEnabled(isSurveyValid());
    }

    ()
    {
        this$0 = final_surveyinteractionview;
        val$activity = activity1;
        val$question = question1;
        val$send = Button.this;
        super();
    }
}
