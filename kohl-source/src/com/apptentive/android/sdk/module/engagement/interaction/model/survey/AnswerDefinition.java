// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import org.json.JSONException;
import org.json.JSONObject;

public class AnswerDefinition extends JSONObject
{

    private static final String KEY_ID = "id";
    private static final String KEY_VALUE = "value";

    public AnswerDefinition(String s)
        throws JSONException
    {
        super(s);
    }

    public String getId()
    {
        return optString("id", null);
    }

    public String getValue()
    {
        return optString("value", null);
    }
}
