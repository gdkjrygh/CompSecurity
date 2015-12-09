// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class PlayedApp extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public PlayedApp()
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
        treemap.put("applicationIconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("most_recent_game_icon_url"));
        sFields.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("most_recent_external_game_id"));
        sFields.put("applicationName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("most_recent_game_name"));
        sFields.put("featuredImageUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("most_recent_game_featured_url"));
        sFields.put("timeMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("most_recent_activity_timestamp"));
    }
}
