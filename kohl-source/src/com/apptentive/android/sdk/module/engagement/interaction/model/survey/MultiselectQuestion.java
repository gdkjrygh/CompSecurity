// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model.survey;

import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model.survey:
//            MultichoiceQuestion

public class MultiselectQuestion extends MultichoiceQuestion
{

    public MultiselectQuestion(String s)
        throws JSONException
    {
        super(s);
    }

    public int getMaxSelections()
    {
        return optInt("max_selections", getAnswerChoices().size());
    }

    public int getType()
    {
        return 3;
    }
}
