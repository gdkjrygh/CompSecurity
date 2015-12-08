// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            CardAction, CardAnnotation, ContentEntry, CardTuple

public final class Section extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public Section()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final ArrayList getActions()
    {
        return (ArrayList)mConcreteTypeArrays.get("actions");
    }

    public final ArrayList getAnnotations()
    {
        return (ArrayList)mConcreteTypeArrays.get("annotations");
    }

    public final ArrayList getEntries()
    {
        return (ArrayList)mConcreteTypeArrays.get("entries");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getSectionData()
    {
        return (ArrayList)mConcreteTypeArrays.get("sectionData");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("actions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("actions", com/google/android/gms/games/server/api/CardAction));
        sFields.put("annotations", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("annotations", com/google/android/gms/games/server/api/CardAnnotation));
        sFields.put("cardType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_card_type"));
        sFields.put("contentDescription", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_content_description"));
        sFields.put("continues", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("continues"));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_description"));
        sFields.put("entries", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("entries", com/google/android/gms/games/server/api/ContentEntry));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_id"));
        sFields.put("sectionData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("sectionData", com/google/android/gms/games/server/api/CardTuple));
        sFields.put("subtitle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_subtitle"));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_title"));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("section_type"));
    }
}
