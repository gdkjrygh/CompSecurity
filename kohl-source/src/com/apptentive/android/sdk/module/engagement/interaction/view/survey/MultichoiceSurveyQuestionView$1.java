// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            MultichoiceSurveyQuestionView, CheckboxChoice

class val.choice
    implements Runnable
{

    final MultichoiceSurveyQuestionView this$0;
    final CheckboxChoice val$choice;

    public void run()
    {
        val$choice.check();
    }

    ()
    {
        this$0 = final_multichoicesurveyquestionview;
        val$choice = CheckboxChoice.this;
        super();
    }
}
