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
//            EventPeriodRange, EventUpdateRequest

public final class EventPeriodUpdate extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;
    private final HashMap mConcreteTypes;

    public EventPeriodUpdate()
    {
        mConcreteTypes = new HashMap();
        mConcreteTypeArrays = new HashMap();
    }

    public EventPeriodUpdate(EventPeriodRange eventperiodrange, ArrayList arraylist)
    {
        mConcreteTypes = new HashMap();
        mConcreteTypeArrays = new HashMap();
        addConcreteType("timePeriod", eventperiodrange);
        if (arraylist != null)
        {
            addConcreteTypeArray("updates", arraylist);
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

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final EventPeriodRange getTimePeriod()
    {
        return (EventPeriodRange)mConcreteTypes.get("timePeriod");
    }

    public final ArrayList getUpdates()
    {
        return (ArrayList)mConcreteTypeArrays.get("updates");
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
        treemap.put("timePeriod", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("timePeriod", com/google/android/gms/games/server/api/EventPeriodRange));
        sFields.put("updates", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("updates", com/google/android/gms/games/server/api/EventUpdateRequest));
    }
}
