// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.games.server.converter.GameBadgeTypeConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            ImageAsset

public final class MarketBadge extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public MarketBadge()
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

    public final ArrayList getImages()
    {
        return (ArrayList)mConcreteTypeArrays.get("images");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("badgeType", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("badge_type", com/google/android/gms/games/server/converter/GameBadgeTypeConverter, false));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("badge_description"));
        sFields.put("images", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("images", com/google/android/gms/games/server/api/ImageAsset));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("badge_title"));
    }
}
