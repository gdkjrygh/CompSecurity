// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.AnswerDefinition;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.MultichoiceQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import com.apptentive.android.sdk.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            BaseSurveyQuestionView, CheckboxChoice

public class MultichoiceSurveyQuestionView extends BaseSurveyQuestionView
{

    protected Map answersChoices;
    protected Map answersChoicesReverse;

    public MultichoiceSurveyQuestionView(Context context, SurveyState surveystate, MultichoiceQuestion multichoicequestion)
    {
        super(context, surveystate, multichoicequestion);
        answersChoices = new HashMap();
        answersChoicesReverse = new HashMap();
        List list = multichoicequestion.getAnswerChoices();
        surveystate = surveystate.getAnswers(multichoicequestion.getId());
        multichoicequestion = (LinearLayout)((Activity)context).getLayoutInflater().inflate(com.apptentive.android.sdk.R.layout.apptentive_survey_question_multichoice, getAnswerContainer()).findViewById(com.apptentive.android.sdk.R.id.choice_container);
        for (int i = 0; i < list.size(); i++)
        {
            AnswerDefinition answerdefinition = (AnswerDefinition)list.get(i);
            final CheckboxChoice choice = new CheckboxChoice(context, answerdefinition.getValue());
            if (surveystate.contains(answerdefinition.getId()))
            {
                choice.post(new Runnable() {

                    final MultichoiceSurveyQuestionView this$0;
                    final CheckboxChoice val$choice;

                    public void run()
                    {
                        choice.check();
                    }

            
            {
                this$0 = MultichoiceSurveyQuestionView.this;
                choice = checkboxchoice;
                super();
            }
                });
            }
            choice.setOnClickListener(new android.view.View.OnClickListener() {

                final MultichoiceSurveyQuestionView this$0;
                final CheckboxChoice val$choice;

                public void onClick(View view)
                {
                    if (getContext() instanceof Activity)
                    {
                        Util.hideSoftKeyboard((Activity)getContext(), MultichoiceSurveyQuestionView.this);
                    }
                    choiceClicked(choice);
                }

            
            {
                this$0 = MultichoiceSurveyQuestionView.this;
                choice = checkboxchoice;
                super();
            }
            });
            answersChoices.put(answerdefinition.getId(), choice);
            answersChoicesReverse.put(choice, answerdefinition.getId());
            multichoicequestion.addView(choice);
            if (i != list.size() - 1)
            {
                FrameLayout framelayout = new FrameLayout(context);
                framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 1));
                framelayout.setBackgroundColor(context.getResources().getColor(com.apptentive.android.sdk.R.color.apptentive_survey_question_separator));
                multichoicequestion.addView(framelayout);
            }
        }

    }

    protected void choiceClicked(CheckboxChoice checkboxchoice)
    {
        Object obj = (String)answersChoicesReverse.get(checkboxchoice);
        Set set = surveyState.getAnswers(((MultichoiceQuestion)question).getId());
        boolean flag;
        if (set != null && set.contains(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            checkboxchoice.toggle();
        } else
        {
            if (countSelectedChoices() != 0)
            {
                clearAllChoices();
            }
            checkboxchoice.toggle();
        }
        checkboxchoice = new HashSet();
        obj = answersChoices.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (((CheckboxChoice)answersChoices.get(s)).isChecked())
            {
                checkboxchoice.add(s);
            }
        } while (true);
        surveyState.setAnswers(((MultichoiceQuestion)question).getId(), checkboxchoice);
        updateValidationState();
        requestFocus();
        fireListener();
    }

    protected void clearAllChoices()
    {
        surveyState.clearAnswers(((MultichoiceQuestion)question).getId());
        Iterator iterator = answersChoices.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (((CheckboxChoice)answersChoices.get(s)).isChecked())
            {
                ((CheckboxChoice)answersChoices.get(s)).toggle();
            }
        } while (true);
    }

    protected int countSelectedChoices()
    {
        int i = 0;
        Iterator iterator = answersChoices.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (((CheckboxChoice)answersChoices.get(s)).isChecked())
            {
                i++;
            }
        } while (true);
        return i;
    }
}
