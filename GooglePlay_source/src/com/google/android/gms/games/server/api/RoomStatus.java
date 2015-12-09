// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.games.server.converter.RoomStatusConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            RoomAutoMatchStatus, RoomParticipant

public final class RoomStatus extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public RoomStatus()
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

    public final RoomAutoMatchStatus getAutoMatchingStatus()
    {
        return (RoomAutoMatchStatus)mConcreteTypes.get("autoMatchingStatus");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getParticipants()
    {
        return (ArrayList)mConcreteTypeArrays.get("participants");
    }

    public final String getRoomId()
    {
        return (String)super.mValues.get("roomId");
    }

    public final Integer getStatus()
    {
        return (Integer)super.mValues.get("status");
    }

    public final Integer getStatusVersion()
    {
        return (Integer)super.mValues.get("statusVersion");
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
        treemap.put("autoMatchingStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingStatus", com/google/android/gms/games/server/api/RoomAutoMatchStatus));
        sFields.put("participants", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("participants", com/google/android/gms/games/server/api/RoomParticipant));
        sFields.put("roomId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("roomId"));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("status", com/google/android/gms/games/server/converter/RoomStatusConverter, false));
        sFields.put("statusVersion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("statusVersion"));
    }
}
