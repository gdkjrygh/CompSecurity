// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            BaseQuestion, AnswerDefinition

public class MultichoiceQuestion extends BaseQuestion
{

    private static final String KEY_ANSWER_CHOICES = "answer_choices";
    protected static final String KEY_MAX_SELECTIONS = "max_selections";
    protected static final String KEY_MIN_SELECTIONS = "min_selections";

    public MultichoiceQuestion(String s)
        throws JSONException
    {
        super(s);
    }

    public List getAnswerChoices()
    {
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = getJSONArray("answer_choices");
        int i = 0;
_L1:
        JSONObject jsonobject;
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        jsonobject = jsonarray.optJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        arraylist.add(new AnswerDefinition(jsonobject.toString()));
        i++;
          goto _L1
        JSONException jsonexception;
        jsonexception;
        return arraylist;
    }

    public int getMaxSelections()
    {
        return optInt("max_selections", 1);
    }

    public int getMinSelections()
    {
        return optInt("min_selections", 1);
    }

    public int getType()
    {
        return 2;
    }
}
