// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.games.server.converter.AchievementStateConverter;
import java.util.Map;
import java.util.TreeMap;

public final class PlayerAchievement extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public PlayerAchievement()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("achievementState", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("state", com/google/android/gms/games/server/converter/AchievementStateConverter, false));
        sFields.put("application_id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_game_id"));
        sFields.put("currentSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("current_steps"));
        sFields.put("experiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("instance_xp_value"));
        sFields.put("formattedCurrentStepsString", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formatted_current_steps"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_achievement_id"));
        sFields.put("lastUpdatedTimestamp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("last_updated_timestamp"));
    }
}
