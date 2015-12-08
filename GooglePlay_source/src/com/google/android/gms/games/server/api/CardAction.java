// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            CardTuple, CardAnnotation, CardCondition

public final class CardAction extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public CardAction()
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

    public final ArrayList getActionParameters()
    {
        return (ArrayList)mConcreteTypeArrays.get("actionParameters");
    }

    public final CardAnnotation getAnnotation()
    {
        return (CardAnnotation)mConcreteTypes.get("annotation");
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

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("actionName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("action_type"));
        sFields.put("actionParameters", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("actionParameters", com/google/android/gms/games/server/api/CardTuple));
        sFields.put("annotation", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("annotation", com/google/android/gms/games/server/api/CardAnnotation));
        sFields.put("conditions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("conditions", com/google/android/gms/games/server/api/CardCondition));
        sFields.put("contentDescription", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("action_content_description"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("action_id"));
        sFields.put("overflowText", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("overflow_text"));
    }
}
