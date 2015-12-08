// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.finsky;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.server.finsky:
//            SearchSuggestion

public final class SearchSuggestResponse extends FastMapJsonResponse
{

    private static final HashMap sFields;
    public final HashMap mConcreteTypeArrays = new HashMap();

    public SearchSuggestResponse()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("suggestions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("suggestions", com/google/android/gms/games/server/finsky/SearchSuggestion));
    }
}
