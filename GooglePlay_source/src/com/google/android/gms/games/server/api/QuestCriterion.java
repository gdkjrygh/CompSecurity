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
//            QuestContribution

public final class QuestCriterion extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public QuestCriterion()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final QuestContribution getCompletionContribution()
    {
        return (QuestContribution)mConcreteTypes.get("completionContribution");
    }

    public final QuestContribution getCurrentContribution()
    {
        return (QuestContribution)mConcreteTypes.get("currentContribution");
    }

    public final String getEventId()
    {
        return (String)super.mValues.get("eventId");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final QuestContribution getInitialPlayerProgress()
    {
        return (QuestContribution)mConcreteTypes.get("initialPlayerProgress");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("completionContribution", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("completionContribution", com/google/android/gms/games/server/api/QuestContribution));
        sFields.put("currentContribution", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("currentContribution", com/google/android/gms/games/server/api/QuestContribution));
        sFields.put("eventId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("eventId"));
        sFields.put("initialPlayerProgress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("initialPlayerProgress", com/google/android/gms/games/server/api/QuestContribution));
    }
}
