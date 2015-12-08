// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.widget.EditText;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SinglelineQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            BaseSurveyQuestionView

public class TextSurveyQuestionView extends BaseSurveyQuestionView
{

    public TextSurveyQuestionView(Context context, final SurveyState state, final SinglelineQuestion question)
    {
        super(context, state, question);
        ((Activity)context).getLayoutInflater().inflate(com.apptentive.android.sdk.R.layout.apptentive_survey_question_singleline, getAnswerContainer());
        Set set;
        if (question.isRequired())
        {
            context = context.getString(com.apptentive.android.sdk.R.string.apptentive_required);
        } else
        {
            context = context.getString(com.apptentive.android.sdk.R.string.apptentive_optional);
        }
        setInstructions(context);
        context = (EditText)findViewById(com.apptentive.android.sdk.R.id.answer_text);
        set = state.getAnswers(question.getId());
        if (set.size() > 0)
        {
            context.setText((CharSequence)(new ArrayList(set)).get(0));
        }
        context.addTextChangedListener(new TextWatcher() {

            final TextSurveyQuestionView this$0;
            final SinglelineQuestion val$question;
            final SurveyState val$state;

            public void afterTextChanged(Editable editable)
            {
                String s = question.getId();
                Set set1 = state.getAnswers(s);
                if (set1.isEmpty() || !set1.isEmpty() && !set1.contains(editable.toString()))
                {
                    state.clearAnswers(s);
                    if (editable.length() != 0)
                    {
                        state.addAnswer(s, editable.toString().trim());
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

            
            {
                this$0 = TextSurveyQuestionView.this;
                question = singlelinequestion;
                state = surveystate;
                super();
            }
        });
        if (question.isMultiLine())
        {
            context.setGravity(48);
            context.setMinLines(5);
            context.setMaxLines(12);
            return;
        } else
        {
            context.setGravity(16);
            context.setMinLines(1);
            context.setMaxLines(5);
            return;
        }
    }
}
