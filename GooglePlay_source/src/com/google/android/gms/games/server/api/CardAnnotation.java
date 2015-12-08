// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            ImageAsset, CardTuple

public final class CardAnnotation extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public CardAnnotation()
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

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ImageAsset getImage()
    {
        return (ImageAsset)mConcreteTypes.get("image");
    }

    public final ArrayList getModifiers()
    {
        return (ArrayList)mConcreteTypeArrays.get("modifiers");
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
        treemap.put("defaultAssetId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation_image_default_id"));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation_description"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation_id"));
        sFields.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("image", com/google/android/gms/games/server/api/ImageAsset));
        sFields.put("layoutSlot", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation_layout_slot"));
        sFields.put("modifiers", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("modifiers", com/google/android/gms/games/server/api/CardTuple));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation_title"));
    }
}
