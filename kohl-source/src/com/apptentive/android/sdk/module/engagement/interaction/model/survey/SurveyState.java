// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import com.apptentive.android.sdk.module.engagement.interaction.model.SurveyInteraction;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            Question

public class SurveyState
{

    private Map questionToAnswersMap;
    private Map questionToMaxAnswersMap;
    private Map questionToMetricSentMap;
    private Map questionToMinAnswersMap;
    private boolean surveyLaunchSent;

    public SurveyState(SurveyInteraction surveyinteraction)
    {
        questionToAnswersMap = new HashMap();
        questionToMinAnswersMap = new HashMap();
        questionToMaxAnswersMap = new HashMap();
        questionToMetricSentMap = new HashMap();
        String s;
        for (surveyinteraction = surveyinteraction.getQuestions().iterator(); surveyinteraction.hasNext(); questionToMetricSentMap.put(s, Boolean.valueOf(false)))
        {
            Question question = (Question)surveyinteraction.next();
            s = question.getId();
            questionToAnswersMap.put(s, new HashSet());
            questionToMinAnswersMap.put(s, Integer.valueOf(question.getMinSelections()));
            questionToMaxAnswersMap.put(s, Integer.valueOf(question.getMaxSelections()));
        }

    }

    public void addAnswer(String s, String s1)
    {
        Set set = (Set)questionToAnswersMap.get(s);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            questionToAnswersMap.put(s, obj);
        }
        ((Set) (obj)).add(s1);
    }

    public void clearAnswers(String s)
    {
        questionToAnswersMap.put(s, new HashSet());
    }

    public Set getAnswers(String s)
    {
        return (Set)questionToAnswersMap.get(s);
    }

    public boolean isMetricSent(String s)
    {
        s = (Boolean)questionToMetricSentMap.get(s);
        if (s == null)
        {
            return false;
        } else
        {
            return s.booleanValue();
        }
    }

    public boolean isQuestionValid(Question question)
    {
        String s = question.getId();
        int i = ((Integer)questionToMinAnswersMap.get(s)).intValue();
        int j = ((Integer)questionToMaxAnswersMap.get(s)).intValue();
        int k = ((Set)questionToAnswersMap.get(s)).size();
        return !question.isRequired() && k == 0 || k >= i && k <= j;
    }

    public boolean isSurveyLaunchSent()
    {
        return surveyLaunchSent;
    }

    public void markMetricSent(String s)
    {
        questionToMetricSentMap.put(s, Boolean.valueOf(true));
    }

    public void setAnswers(String s, Set set)
    {
        questionToAnswersMap.put(s, set);
    }

    public void setSurveyLaunchSent()
    {
        surveyLaunchSent = true;
    }
}
