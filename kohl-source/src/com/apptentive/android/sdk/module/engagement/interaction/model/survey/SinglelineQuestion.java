// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            BaseQuestion

public class SinglelineQuestion extends BaseQuestion
{

    private static final String KEY_MULTILINE = "multiline";

    public SinglelineQuestion(String s)
        throws JSONException
    {
        super(s);
    }

    public int getType()
    {
        return 1;
    }

    public boolean isMultiLine()
    {
        return optBoolean("multiline", false);
    }
}
