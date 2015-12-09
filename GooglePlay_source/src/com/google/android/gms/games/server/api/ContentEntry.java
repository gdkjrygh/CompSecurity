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
//            Card, Section

public final class ContentEntry extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public ContentEntry()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Card getCard()
    {
        return (Card)mConcreteTypes.get("card");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Section getSection()
    {
        return (Section)mConcreteTypes.get("section");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("card", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("card", com/google/android/gms/games/server/api/Card));
        sFields.put("section", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("section", com/google/android/gms/games/server/api/Section));
    }
}
