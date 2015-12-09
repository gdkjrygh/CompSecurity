// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.QuestStateConverter;
import com.google.android.gms.games.server.postprocessor.QuestPostProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            QuestMilestone

public final class Quest extends FastContentValuesJsonResponse
{

    private static final QuestPostProcessor PROCESSOR = new QuestPostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public Quest()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final String getApplicationId()
    {
        return (String)super.mValues.get("external_game_id");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_quest_id");
    }

    public final ArrayList getMilestones()
    {
        return (ArrayList)mConcreteTypeArrays.get("milestones");
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
        treemap.put("acceptedTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("accepted_ts"));
        sFields.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_game_id"));
        sFields.put("bannerUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("quest_banner_image_url"));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("quest_description"));
        sFields.put("endTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("quest_end_ts"));
        sFields.put("iconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("quest_icon_image_url"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_quest_id"));
        sFields.put("lastUpdatedTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("quest_last_updated_ts"));
        sFields.put("milestones", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("milestones", com/google/android/gms/games/server/api/QuestMilestone));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("quest_name"));
        sFields.put("notifyTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("notification_ts"));
        sFields.put("startTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("quest_start_ts"));
        sFields.put("state", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("quest_state", com/google/android/gms/games/server/converter/QuestStateConverter, false));
    }
}
