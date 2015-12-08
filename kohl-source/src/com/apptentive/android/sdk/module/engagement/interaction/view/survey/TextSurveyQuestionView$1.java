// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.text.Editable;
import android.text.TextWatcher;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SinglelineQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            TextSurveyQuestionView

class val.state
    implements TextWatcher
{

    final TextSurveyQuestionView this$0;
    final SinglelineQuestion val$question;
    final SurveyState val$state;

    public void afterTextChanged(Editable editable)
    {
        String s = val$question.getId();
        Set set = val$state.getAnswers(s);
        if (set.isEmpty() || !set.isEmpty() && !set.contains(editable.toString()))
        {
            val$state.clearAnswers(s);
            if (editable.length() != 0)
            {
                val$state.addAnswer(s, editable.toString().trim());
            }
            updateValidationState();
            fireListener();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = final_textsurveyquestionview;
        val$question = singlelinequestion;
        val$state = SurveyState.this;
        super();
    }
}
