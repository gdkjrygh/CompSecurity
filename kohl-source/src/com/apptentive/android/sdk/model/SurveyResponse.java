// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.module.engagement.interaction.model.SurveyInteraction;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.Question;
import com.apptentive.android.sdk.module.engagement.interaction.model.survey.SurveyState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ConversationItem

public class SurveyResponse extends ConversationItem
{

    private static final String KEY_SURVEY_ANSWERS = "answers";
    private static final String KEY_SURVEY_ID = "id";

    public SurveyResponse(SurveyInteraction surveyinteraction, SurveyState surveystate)
    {
        JSONObject jsonobject;
        put("id", surveyinteraction.getId());
        jsonobject = new JSONObject();
        put("answers", jsonobject);
        surveyinteraction = surveyinteraction.getQuestions().iterator();
_L5:
        if (!surveyinteraction.hasNext()) goto _L2; else goto _L1
_L1:
        Question question;
        String s;
        Set set;
        question = (Question)surveyinteraction.next();
        s = question.getId();
        set = surveystate.getAnswers(s);
        if (set.size() <= 1 && question.getType() != 3) goto _L4; else goto _L3
_L3:
        jsonobject.put(s, new JSONArray(set));
          goto _L5
        surveyinteraction;
        Log.e("Unable to construct survey payload.", surveyinteraction, new Object[0]);
_L2:
        return;
_L4:
        if (set.size() != 1) goto _L5; else goto _L6
_L6:
        jsonobject.put(s, (new ArrayList(set)).get(0));
          goto _L5
    }

    public SurveyResponse(String s)
        throws JSONException
    {
        super(s);
    }

    public String getId()
    {
        return optString("id", "");
    }

    protected void initBaseType()
    {
        setBaseType(Payload.BaseType.survey);
    }

    public String marshallForSending()
    {
        return super.marshallForSending();
    }
}
