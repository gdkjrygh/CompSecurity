// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.AchievementStateConverter;
import com.google.android.gms.games.server.converter.AchievementTypeConverter;
import com.google.android.gms.games.server.postprocessor.AchievementDefinitionPostProcessor;
import java.util.Map;
import java.util.TreeMap;

public final class AchievementDefinition extends FastContentValuesJsonResponse
{

    private static final AchievementDefinitionPostProcessor PROCESSOR = new AchievementDefinitionPostProcessor();
    private static final TreeMap sFields;

    public AchievementDefinition()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("achievementType", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("type", com/google/android/gms/games/server/converter/AchievementTypeConverter, false));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description"));
        sFields.put("experiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("definition_xp_value"));
        sFields.put("formattedTotalSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formatted_total_steps"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_achievement_id"));
        sFields.put("initialState", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("initial_state", com/google/android/gms/games/server/converter/AchievementStateConverter, false));
        sFields.put("isRevealedIconUrlDefault", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("is_revealed_icon_default"));
        sFields.put("isUnlockedIconUrlDefault", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("is_unlocked_icon_default"));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name"));
        sFields.put("revealedIconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("revealed_icon_image_url"));
        sFields.put("totalSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("total_steps"));
        sFields.put("unlockedIconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("unlocked_icon_image_url"));
    }
}
