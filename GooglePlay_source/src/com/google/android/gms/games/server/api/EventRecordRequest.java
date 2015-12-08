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
//            EventPeriodUpdate

public final class EventRecordRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;

    public EventRecordRequest()
    {
        mConcreteTypeArrays = new HashMap();
    }

    public EventRecordRequest(Long long1, Long long2, ArrayList arraylist)
    {
        mConcreteTypeArrays = new HashMap();
        if (long1 != null)
        {
            setLong("currentTimeMillis", long1.longValue());
        }
        if (long2 != null)
        {
            setLong("requestId", long2.longValue());
        }
        addConcreteTypeArray("timePeriods", arraylist);
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getTimePeriods()
    {
        return (ArrayList)mConcreteTypeArrays.get("timePeriods");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("currentTimeMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("currentTimeMillis"));
        sFields.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("timePeriods", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("timePeriods", com/google/android/gms/games/server/api/EventPeriodUpdate));
    }
}
