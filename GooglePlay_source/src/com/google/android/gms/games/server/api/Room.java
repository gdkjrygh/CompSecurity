// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.games.server.converter.RoomStatusConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            RoomAutoMatchingCriteria, RoomAutoMatchStatus, RoomModification, RoomParticipant

public final class Room extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public Room()
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

    public final String getApplicationId()
    {
        return (String)super.mValues.get("external_game_id");
    }

    public final RoomAutoMatchingCriteria getAutoMatchingCriteria()
    {
        return (RoomAutoMatchingCriteria)mConcreteTypes.get("autoMatchingCriteria");
    }

    public final RoomAutoMatchStatus getAutoMatchingStatus()
    {
        return (RoomAutoMatchStatus)mConcreteTypes.get("autoMatchingStatus");
    }

    public final RoomModification getCreationDetails()
    {
        return (RoomModification)mConcreteTypes.get("creationDetails");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final RoomModification getLastUpdateDetails()
    {
        return (RoomModification)mConcreteTypes.get("lastUpdateDetails");
    }

    public final ArrayList getParticipants()
    {
        return (ArrayList)mConcreteTypeArrays.get("participants");
    }

    public final String getRoomId()
    {
        return (String)super.mValues.get("external_match_id");
    }

    public final Integer getStatus()
    {
        return (Integer)super.mValues.get("status");
    }

    public final Integer getVariant()
    {
        return (Integer)super.mValues.get("variant");
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
        treemap.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_game_id"));
        sFields.put("autoMatchingCriteria", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingCriteria", com/google/android/gms/games/server/api/RoomAutoMatchingCriteria));
        sFields.put("autoMatchingStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingStatus", com/google/android/gms/games/server/api/RoomAutoMatchStatus));
        sFields.put("creationDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("creationDetails", com/google/android/gms/games/server/api/RoomModification));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description"));
        sFields.put("inviterId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("creator_external"));
        sFields.put("lastUpdateDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("lastUpdateDetails", com/google/android/gms/games/server/api/RoomModification));
        sFields.put("participants", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("participants", com/google/android/gms/games/server/api/RoomParticipant));
        sFields.put("roomId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_match_id"));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("status", com/google/android/gms/games/server/converter/RoomStatusConverter, false));
        sFields.put("variant", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("variant"));
    }
}
