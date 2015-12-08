// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            Request

public final class RequestUpdateResult extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public RequestUpdateResult()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("id");
    }

    public final String getOutcome()
    {
        return (String)super.mValues.get("outcome");
    }

    public final Request getUpdatedRequest()
    {
        return (Request)mConcreteTypes.get("updatedRequest");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id"));
        sFields.put("outcome", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("outcome"));
        sFields.put("updatedRequest", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("updatedRequest", com/google/android/gms/games/server/api/Request));
    }
}
