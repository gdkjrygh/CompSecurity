// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.games.server.converter.MatchStatusConverter;
import com.google.android.gms.games.server.converter.MatchUserStatusConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            TurnBasedAutoMatchingCriteria, TurnBasedMatchModification, TurnBasedMatchData, TurnBasedMatchParticipant, 
//            MatchParticipantResult

public final class TurnBasedMatch extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public TurnBasedMatch()
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

    public final TurnBasedAutoMatchingCriteria getAutoMatchingCriteria()
    {
        return (TurnBasedAutoMatchingCriteria)mConcreteTypes.get("autoMatchingCriteria");
    }

    public final TurnBasedMatchModification getCreationDetails()
    {
        return (TurnBasedMatchModification)mConcreteTypes.get("creationDetails");
    }

    public final TurnBasedMatchData getData()
    {
        return (TurnBasedMatchData)mConcreteTypes.get("data");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final TurnBasedMatchModification getLastUpdateDetails()
    {
        return (TurnBasedMatchModification)mConcreteTypes.get("lastUpdateDetails");
    }

    public final String getMatchId()
    {
        return (String)super.mValues.get("external_match_id");
    }

    public final ArrayList getParticipants()
    {
        return (ArrayList)mConcreteTypeArrays.get("participants");
    }

    public final TurnBasedMatchData getPreviousMatchData()
    {
        return (TurnBasedMatchData)mConcreteTypes.get("previousMatchData");
    }

    public final ArrayList getResults()
    {
        return (ArrayList)mConcreteTypeArrays.get("results");
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
        sFields.put("autoMatchingCriteria", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingCriteria", com/google/android/gms/games/server/api/TurnBasedAutoMatchingCriteria));
        sFields.put("creationDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("creationDetails", com/google/android/gms/games/server/api/TurnBasedMatchModification));
        sFields.put("data", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("data", com/google/android/gms/games/server/api/TurnBasedMatchData));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description"));
        sFields.put("inviterId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("creator_external"));
        sFields.put("lastUpdateDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("lastUpdateDetails", com/google/android/gms/games/server/api/TurnBasedMatchModification));
        sFields.put("matchId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_match_id"));
        sFields.put("matchNumber", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("match_number"));
        sFields.put("matchVersion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("version"));
        sFields.put("participants", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("participants", com/google/android/gms/games/server/api/TurnBasedMatchParticipant));
        sFields.put("pendingParticipantId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("pending_participant_external"));
        sFields.put("previousMatchData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("previousMatchData", com/google/android/gms/games/server/api/TurnBasedMatchData));
        sFields.put("rematchId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("rematch_id"));
        sFields.put("results", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("results", com/google/android/gms/games/server/api/MatchParticipantResult));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("status", com/google/android/gms/games/server/converter/MatchStatusConverter, false));
        sFields.put("userMatchStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("user_match_status", com/google/android/gms/games/server/converter/MatchUserStatusConverter, false));
        sFields.put("variant", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("variant"));
        sFields.put("withParticipantId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description_participant_id"));
    }
}
