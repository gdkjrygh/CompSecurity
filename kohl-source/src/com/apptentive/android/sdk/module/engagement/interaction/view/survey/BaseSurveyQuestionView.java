// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.Question;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import com.apptentive.android.sdk.module.survey.OnSurveyQuestionAnsweredListener;
import com.apptentive.android.sdk.util.Util;

public abstract class BaseSurveyQuestionView extends FrameLayout
{

    protected OnSurveyQuestionAnsweredListener listener;
    protected Question question;
    protected SurveyState surveyState;

    protected BaseSurveyQuestionView(Context context, SurveyState surveystate, Question question1)
    {
        super(context);
        question = question1;
        surveyState = surveystate;
        setFocusable(true);
        setFocusableInTouchMode(true);
        ((Activity)context).getLayoutInflater().inflate(com.apptentive.android.sdk.R.layout.apptentive_survey_question_base, this);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final BaseSurveyQuestionView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (getContext() instanceof Activity)
                {
                    Util.hideSoftKeyboard((Activity)getContext(), BaseSurveyQuestionView.this);
                }
                return false;
            }

            
            {
                this$0 = BaseSurveyQuestionView.this;
                super();
            }
        });
        ((TextView)findViewById(com.apptentive.android.sdk.R.id.question_title)).setText(question1.getValue());
        setInstructions(question1.getInstructions());
        updateValidationState();
    }

    protected void fireListener()
    {
        if (listener != null)
        {
            listener.onAnswered();
        }
    }

    protected LinearLayout getAnswerContainer()
    {
        return (LinearLayout)findViewById(com.apptentive.android.sdk.R.id.answer_container);
    }

    protected void setInstructions(String s)
    {
        TextView textview = (TextView)findViewById(com.apptentive.android.sdk.R.id.question_instructions);
        FrameLayout framelayout = (FrameLayout)findViewById(com.apptentive.android.sdk.R.id.question_top_separater);
        if (s != null && s.length() > 0)
        {
            textview.setText(s);
            framelayout.setVisibility(8);
            textview.setVisibility(0);
            return;
        } else
        {
            framelayout.setVisibility(0);
            textview.setVisibility(8);
            return;
        }
    }

    public void setOnSurveyQuestionAnsweredListener(OnSurveyQuestionAnsweredListener onsurveyquestionansweredlistener)
    {
        listener = onsurveyquestionansweredlistener;
    }

    protected void updateValidationState()
    {
        Resources resources = getContext().getResources();
        TextView textview = (TextView)findViewById(com.apptentive.android.sdk.R.id.question_instructions);
        View view = findViewById(com.apptentive.android.sdk.R.id.question_background_validation);
        if (question != null && !surveyState.isQuestionValid(question))
        {
            textview.setTextColor(resources.getColor(com.apptentive.android.sdk.R.color.apptentive_survey_question_instruction_text_invalid));
            textview.setBackgroundColor(resources.getColor(com.apptentive.android.sdk.R.color.apptentive_survey_question_instruction_background_invalid));
            textview.setTypeface(Typeface.DEFAULT_BOLD);
            view.setBackgroundDrawable(resources.getDrawable(com.apptentive.android.sdk.R.drawable.apptentive_survey_question_background_invalid));
            return;
        } else
        {
            textview.setTextColor(resources.getColor(com.apptentive.android.sdk.R.color.apptentive_survey_question_instruction_text_valid));
            textview.setBackgroundColor(resources.getColor(com.apptentive.android.sdk.R.color.apptentive_survey_question_instruction_background_valid));
            textview.setTypeface(Typeface.DEFAULT);
            view.setBackgroundColor(0);
            return;
        }
    }
}
