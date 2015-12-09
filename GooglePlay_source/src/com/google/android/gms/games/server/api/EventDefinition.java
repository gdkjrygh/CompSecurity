// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.PostProcessor;
import com.google.android.gms.games.server.converter.EventVisibilityConverter;
import com.google.android.gms.games.server.postprocessor.EventDefinitionPostProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class EventDefinition extends FastContentValuesJsonResponse
{

    private static final EventDefinitionPostProcessor PROCESSOR = new EventDefinitionPostProcessor();
    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public EventDefinition()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final volatile PostProcessor getPostProcessor()
    {
        return PROCESSOR;
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description"));
        sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_event_id"));
        sFields.put("imageUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("icon_image_url"));
        sFields.put("isDefaultImageUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("icon_default"));
        sFields.put("visibility", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("visibility", com/google/android/gms/games/server/converter/EventVisibilityConverter, false));
    }
}
