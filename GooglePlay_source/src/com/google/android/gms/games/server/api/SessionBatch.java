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
//            Session

public final class SessionBatch extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;

    public SessionBatch()
    {
        mConcreteTypeArrays = new HashMap();
    }

    public SessionBatch(String s, Long long1, String s1, Boolean boolean1, Long long2, ArrayList arraylist)
    {
        mConcreteTypeArrays = new HashMap();
        if (s != null)
        {
            setString("adId", s);
        }
        if (long1 != null)
        {
            setLong("clientReportTimeMillis", long1.longValue());
        }
        if (s1 != null)
        {
            setString("instanceId", s1);
        }
        if (boolean1 != null)
        {
            setBoolean("limitAdTracking", boolean1.booleanValue());
        }
        if (long2 != null)
        {
            setLong("requestId", long2.longValue());
        }
        if (arraylist != null)
        {
            addConcreteTypeArray("sessions", arraylist);
        }
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getSessions()
    {
        return (ArrayList)mConcreteTypeArrays.get("sessions");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("adId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("adId"));
        sFields.put("clientReportTimeMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("clientReportTimeMillis"));
        sFields.put("instanceId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("instanceId"));
        sFields.put("limitAdTracking", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("limitAdTracking"));
        sFields.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("sessions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("sessions", com/google/android/gms/games/server/api/Session));
    }
}
