// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class PlayerLevel extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public PlayerLevel()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Integer getLevel()
    {
        return (Integer)super.mValues.get("level_value");
    }

    public final Long getMaxExperiencePoints()
    {
        return (Long)super.mValues.get("level_max_xp");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("level", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("level_value"));
        sFields.put("maxExperiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("level_max_xp"));
        sFields.put("minExperiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("level_min_xp"));
    }
}
