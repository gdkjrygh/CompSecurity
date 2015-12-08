// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view.survey;

import android.content.Context;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.MultichoiceQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.MultiselectQuestion;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view.survey:
//            MultichoiceSurveyQuestionView, CheckboxChoice

public class MultiselectSurveyQuestionView extends MultichoiceSurveyQuestionView
{

    protected int maxSelections;
    protected int minSelections;

    public MultiselectSurveyQuestionView(Context context, SurveyState surveystate, MultiselectQuestion multiselectquestion)
    {
        super(context, surveystate, multiselectquestion);
        minSelections = multiselectquestion.getMinSelections();
        maxSelections = multiselectquestion.getMaxSelections();
        updateValidationState();
    }

    protected void choiceClicked(CheckboxChoice checkboxchoice)
    {
        checkboxchoice.toggle();
        checkboxchoice = new HashSet();
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
                checkboxchoice.add(s);
            }
        } while (true);
        surveyState.setAnswers(((MultichoiceQuestion)question).getId(), checkboxchoice);
        updateValidationState();
        requestFocus();
        fireListener();
    }
}
