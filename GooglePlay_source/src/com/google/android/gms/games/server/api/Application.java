// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.StringListConverter;
import com.google.android.gms.games.server.postprocessor.ApplicationPostProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            ImageAsset, ApplicationCategory, Instance

public final class Application extends FastContentValuesJsonResponse
{

    private static final ApplicationPostProcessor PROCESSOR = new ApplicationPostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public Application()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final ArrayList getAssets()
    {
        return (ArrayList)mConcreteTypeArrays.get("assets");
    }

    public final ApplicationCategory getCategory()
    {
        return (ApplicationCategory)mConcreteTypes.get("category");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_game_id");
    }

    public final ArrayList getInstances()
    {
        return (ArrayList)mConcreteTypeArrays.get("instances");
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("achievement_count", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("achievement_total_count"));
        sFields.put("assets", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("assets", com/google/android/gms/games/server/api/ImageAsset));
        sFields.put("author", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("developer_name"));
        sFields.put("category", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("category", com/google/android/gms/games/server/api/ApplicationCategory));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("game_description"));
        sFields.put("enabledFeatures", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("enabledFeatures", com/google/android/gms/games/server/converter/StringListConverter, true));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_game_id"));
        sFields.put("instances", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("instances", com/google/android/gms/games/server/api/Instance));
        sFields.put("lastUpdatedTimestamp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("metadata_version"));
        sFields.put("leaderboard_count", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("leaderboard_count"));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_name"));
        sFields.put("themeColor", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("theme_color"));
    }
}
