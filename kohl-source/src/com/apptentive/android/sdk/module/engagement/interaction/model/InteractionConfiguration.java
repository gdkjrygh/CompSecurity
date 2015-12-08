// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import org.json.JSONException;
import org.json.JSONObject;

public class InteractionConfiguration extends JSONObject
{

    private static final String KEY_SHOW_POWERED_BY = "show_powered_by";

    public InteractionConfiguration()
    {
    }

    public InteractionConfiguration(String s)
        throws JSONException
    {
        super(s);
    }

    public boolean isShowPoweredBy()
    {
        boolean flag;
        if (isNull("show_powered_by"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = getBoolean("show_powered_by");
        return flag;
        JSONException jsonexception;
        jsonexception;
        return false;
    }
}
