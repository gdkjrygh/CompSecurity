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
//            RelatedEntity

public final class ApplicationExplanation extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public ApplicationExplanation()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final RelatedEntity getRelatedEntity()
    {
        return (RelatedEntity)mConcreteTypes.get("relatedEntity");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("reason", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("reason"));
        sFields.put("relatedEntity", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("relatedEntity", com/google/android/gms/games/server/api/RelatedEntity));
        sFields.put("relationship", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("relationship"));
    }
}
