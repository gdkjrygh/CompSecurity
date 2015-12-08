// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class LeaderboardScoreRank extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public LeaderboardScoreRank()
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
        treemap.put("formattedRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("player_display_rank"));
        sFields.put("numScores", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("total_scores"));
        sFields.put("rank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("player_rank"));
    }
}
