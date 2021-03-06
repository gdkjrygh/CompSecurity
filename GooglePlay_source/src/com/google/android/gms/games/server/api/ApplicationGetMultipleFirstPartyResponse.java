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
//            InvalidId, FirstPartyApplication

public final class ApplicationGetMultipleFirstPartyResponse extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public ApplicationGetMultipleFirstPartyResponse()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getInvalidIds()
    {
        return (ArrayList)mConcreteTypeArrays.get("invalidIds");
    }

    public final ArrayList getItems()
    {
        return (ArrayList)mConcreteTypeArrays.get("items");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("invalidIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("invalidIds", com/google/android/gms/games/server/api/InvalidId));
        sFields.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", com/google/android/gms/games/server/api/FirstPartyApplication));
        sFields.put("nextPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nextPageToken"));
    }
}
