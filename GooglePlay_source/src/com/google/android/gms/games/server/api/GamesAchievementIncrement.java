// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class GamesAchievementIncrement extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public GamesAchievementIncrement()
    {
    }

    public GamesAchievementIncrement(Long long1, Integer integer)
    {
        if (long1 != null)
        {
            setLong("requestId", long1.longValue());
        }
        if (integer != null)
        {
            setInteger("steps", integer.intValue());
        }
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("steps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("steps"));
    }
}
