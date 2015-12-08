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
//            CardTuple

public final class CardCondition extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public CardCondition()
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

    public final ArrayList getPredicateParameters()
    {
        return (ArrayList)mConcreteTypeArrays.get("predicateParameters");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("defaultValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("condition_default_value"));
        sFields.put("expectedValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("condition_expected_value"));
        sFields.put("predicate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("condition_predicate"));
        sFields.put("predicateParameters", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("predicateParameters", com/google/android/gms/games/server/api/CardTuple));
    }
}
