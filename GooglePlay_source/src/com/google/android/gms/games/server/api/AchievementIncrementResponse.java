// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class AchievementIncrementResponse extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public AchievementIncrementResponse()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Boolean isNewlyUnlocked()
    {
        return (Boolean)super.mValues.get("newlyUnlocked");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("currentSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("currentSteps"));
        sFields.put("newlyUnlocked", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("newlyUnlocked"));
    }
}
