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
//            FirstPartyApplication

public final class FirstPartyApplicationUpdates extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public FirstPartyApplicationUpdates()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final FirstPartyApplication getApplication()
    {
        return (FirstPartyApplication)mConcreteTypes.get("application");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getItems()
    {
        return (ArrayList)super.mValues.get("items");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("application", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("application", com/google/android/gms/games/server/api/FirstPartyApplication));
        sFields.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("applicationId"));
        sFields.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("items"));
        sFields.put("lastMetadataUpdatedTimestamp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("lastMetadataUpdatedTimestamp"));
        sFields.put("syncToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("syncToken"));
    }
}
