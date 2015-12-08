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
//            RoomLeaveDiagnostics

public final class RoomLeaveRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public RoomLeaveRequest()
    {
        mConcreteTypes = new HashMap();
    }

    public RoomLeaveRequest(RoomLeaveDiagnostics roomleavediagnostics, String s)
    {
        mConcreteTypes = new HashMap();
        if (roomleavediagnostics != null)
        {
            addConcreteType("leaveDiagnostics", roomleavediagnostics);
        }
        if (s != null)
        {
            setString("reason", s);
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final RoomLeaveDiagnostics getLeaveDiagnostics()
    {
        return (RoomLeaveDiagnostics)mConcreteTypes.get("leaveDiagnostics");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("leaveDiagnostics", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("leaveDiagnostics", com/google/android/gms/games/server/api/RoomLeaveDiagnostics));
        sFields.put("reason", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("reason"));
    }
}
