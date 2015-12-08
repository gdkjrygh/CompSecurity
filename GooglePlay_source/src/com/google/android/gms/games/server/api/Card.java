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
//            CardAction, CardAnnotation, CardTuple, CardCondition

public final class Card extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public Card()
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

    public final ArrayList getCardData()
    {
        return (ArrayList)mConcreteTypeArrays.get("cardData");
    }

    public final ArrayList getConditions()
    {
        return (ArrayList)mConcreteTypeArrays.get("conditions");
    }

    public final Map getFieldMappings()
    {
        return sFields;
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
        sFields.put("cardData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("cardData", com/google/android/gms/games/server/api/CardTuple));
        sFields.put("conditions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("conditions", com/google/android/gms/games/server/api/CardCondition));
        sFields.put("contentDescription", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_content_description"));
        sFields.put("currentSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("card_current_steps"));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_description"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_id"));
        sFields.put("subtitle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_subtitle"));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_title"));
        sFields.put("totalSteps", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("card_total_steps"));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("card_type"));
    }
}
