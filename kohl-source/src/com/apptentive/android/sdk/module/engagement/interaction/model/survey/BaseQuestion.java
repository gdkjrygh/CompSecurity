// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            Question

public abstract class BaseQuestion extends JSONObject
    implements Question
{

    private static final String KEY_ANSWERS = "answers";
    public static final String KEY_ID = "id";
    private static final String KEY_INSTRUCTIONS = "instructions";
    private static final String KEY_METRIC_SENT = "metric_sent";
    public static final String KEY_NAME = "question";
    private static final String KEY_REQUIRED = "required";
    private static final String KEY_VALUE = "value";

    protected BaseQuestion(String s)
        throws JSONException
    {
        super(s);
    }

    public String getId()
    {
        return optString("id", null);
    }

    public String getInstructions()
    {
        return optString("instructions", null);
    }

    public int getMaxSelections()
    {
        return 1;
    }

    public int getMinSelections()
    {
        return 1;
    }

    public abstract int getType();

    public String getValue()
    {
        return optString("value", null);
    }

    public boolean isRequired()
    {
        return optBoolean("required", false);
    }
}
