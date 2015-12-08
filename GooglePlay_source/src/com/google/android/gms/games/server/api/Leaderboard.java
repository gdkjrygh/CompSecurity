// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.ScoreOrderConverter;
import com.google.android.gms.games.server.postprocessor.LeaderboardPostProcessor;
import java.util.Map;
import java.util.TreeMap;

public final class Leaderboard extends FastContentValuesJsonResponse
{

    private static final LeaderboardPostProcessor PROCESSOR = new LeaderboardPostProcessor();
    private static final TreeMap sFields;

    public Leaderboard()
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
        treemap.put("iconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("board_icon_image_url"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_leaderboard_id"));
        sFields.put("isIconUrlDefault", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("is_board_icon_default"));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name"));
        sFields.put("order", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("score_order", com/google/android/gms/games/server/converter/ScoreOrderConverter, false));
    }
}
