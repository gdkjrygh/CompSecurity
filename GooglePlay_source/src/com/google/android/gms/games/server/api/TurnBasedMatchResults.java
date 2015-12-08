// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            TurnBasedMatchDataRequest, MatchParticipantResult

public final class TurnBasedMatchResults extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;
    private final HashMap mConcreteTypes;

    public TurnBasedMatchResults()
    {
        mConcreteTypes = new HashMap();
        mConcreteTypeArrays = new HashMap();
    }

    public TurnBasedMatchResults(TurnBasedMatchDataRequest turnbasedmatchdatarequest, Integer integer, ArrayList arraylist)
    {
        mConcreteTypes = new HashMap();
        mConcreteTypeArrays = new HashMap();
        if (turnbasedmatchdatarequest != null)
        {
            addConcreteType("data", turnbasedmatchdatarequest);
        }
        if (integer != null)
        {
            setInteger("matchVersion", integer.intValue());
        }
        if (arraylist != null)
        {
            addConcreteTypeArray("results", arraylist);
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final TurnBasedMatchDataRequest getData()
    {
        return (TurnBasedMatchDataRequest)mConcreteTypes.get("data");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getResults()
    {
        return (ArrayList)mConcreteTypeArrays.get("results");
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
        treemap.put("data", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("data", com/google/android/gms/games/server/api/TurnBasedMatchDataRequest));
        sFields.put("matchVersion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("matchVersion"));
        sFields.put("results", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("results", com/google/android/gms/games/server/api/MatchParticipantResult));
    }
}
