// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.MilestoneStateConverter;
import com.google.android.gms.games.server.postprocessor.QuestMilestonePostProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            QuestCriterion

public final class QuestMilestone extends FastContentValuesJsonResponse
{

    private static final QuestMilestonePostProcessor PROCESSOR = new QuestMilestonePostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public QuestMilestone()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final ArrayList getCriteria()
    {
        return (ArrayList)mConcreteTypeArrays.get("criteria");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_milestone_id");
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("completionRewardData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64UrlSafe("completion_reward_data"));
        sFields.put("criteria", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("criteria", com/google/android/gms/games/server/api/QuestCriterion));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_milestone_id"));
        sFields.put("state", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("milestone_state", com/google/android/gms/games/server/converter/MilestoneStateConverter, false));
    }
}
