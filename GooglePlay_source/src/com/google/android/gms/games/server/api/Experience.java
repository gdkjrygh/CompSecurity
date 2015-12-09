// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.ExperienceEventTypeConverter;
import com.google.android.gms.games.server.postprocessor.ExperiencePostProcessor;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            PlayerLevel

public final class Experience extends FastContentValuesJsonResponse
{

    private static final ExperiencePostProcessor PROCESSOR = new ExperiencePostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public Experience()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final String getApplicationId()
    {
        return (String)super.mValues.get("game_id");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final PlayerLevel getNewLevel()
    {
        return (PlayerLevel)mConcreteTypes.get("newLevel");
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("game_id"));
        sFields.put("createdTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("created_timestamp"));
        sFields.put("currentExperiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("current_xp"));
        sFields.put("displayDescription", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_description"));
        sFields.put("displayString", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_string"));
        sFields.put("displayTitle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_title"));
        sFields.put("experiencePointsEarned", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("xp_earned"));
        sFields.put("experienceType", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("type", com/google/android/gms/games/server/converter/ExperienceEventTypeConverter, false));
        sFields.put("iconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("icon_url"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_experience_id"));
        sFields.put("newLevel", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("newLevel", com/google/android/gms/games/server/api/PlayerLevel));
    }
}
