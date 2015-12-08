// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            EventBatchRecordFailure, EventRecordFailure, PlayerEvent

public final class EventUpdateResponse extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public EventUpdateResponse()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final ArrayList getBatchFailures()
    {
        return (ArrayList)mConcreteTypeArrays.get("batchFailures");
    }

    public final ArrayList getEventFailures()
    {
        return (ArrayList)mConcreteTypeArrays.get("eventFailures");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getPlayerEvents()
    {
        return (ArrayList)mConcreteTypeArrays.get("playerEvents");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("batchFailures", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("batchFailures", com/google/android/gms/games/server/api/EventBatchRecordFailure));
        sFields.put("eventFailures", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("eventFailures", com/google/android/gms/games/server/api/EventRecordFailure));
        sFields.put("playerEvents", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("playerEvents", com/google/android/gms/games/server/api/PlayerEvent));
    }
}
