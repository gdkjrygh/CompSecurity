// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.model:
//            Interaction, UpgradeMessageInteraction, EnjoymentDialogInteraction, RatingDialogInteraction, 
//            FeedbackDialogInteraction, MessageCenterInteraction, AppStoreRatingInteraction, SurveyInteraction

public static class ction
{

    public static Interaction parseInteraction(String s)
    {
        ction ction;
        ction = nown;
        JSONObject jsonobject = new JSONObject(s);
        if (jsonobject.has("type"))
        {
            ction = se(jsonobject.getString("type"));
        }
        hMap.com.apptentive.android.sdk.module.engagement.interaction.model.Interaction.Type[ction.inal()];
        JVM INSTR tableswitch 1 7: default 149
    //                   1 84
    //                   2 93
    //                   3 102
    //                   4 111
    //                   5 120
    //                   6 129
    //                   7 138;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        return new UpgradeMessageInteraction(s);
_L3:
        return new EnjoymentDialogInteraction(s);
_L4:
        return new RatingDialogInteraction(s);
_L5:
        return new FeedbackDialogInteraction(s);
_L6:
        return new MessageCenterInteraction(s);
_L7:
        return new AppStoreRatingInteraction(s);
_L8:
        s = new SurveyInteraction(s);
        return s;
_L1:
        return null;
        s;
        if (true) goto _L1; else goto _L9
_L9:
    }

    public ction()
    {
    }
}
