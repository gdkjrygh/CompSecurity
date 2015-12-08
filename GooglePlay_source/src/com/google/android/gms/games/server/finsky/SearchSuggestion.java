// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.finsky;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;

public final class SearchSuggestion extends FastMapJsonResponse
{

    private static final HashMap sFields;

    public SearchSuggestion()
    {
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("s", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("suggestion"));
    }
}
