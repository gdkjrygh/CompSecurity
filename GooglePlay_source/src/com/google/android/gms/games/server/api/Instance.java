// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            InstanceAndroidDetails, InstanceIosDetails, InstanceWebDetails

public final class Instance extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public Instance()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final InstanceAndroidDetails getAndroidInstance()
    {
        return (InstanceAndroidDetails)mConcreteTypes.get("androidInstance");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final InstanceIosDetails getIosInstance()
    {
        return (InstanceIosDetails)mConcreteTypes.get("iosInstance");
    }

    public final InstanceWebDetails getWebInstance()
    {
        return (InstanceWebDetails)mConcreteTypes.get("webInstance");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("androidInstance", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("androidInstance", com/google/android/gms/games/server/api/InstanceAndroidDetails));
        sFields.put("iosInstance", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("iosInstance", com/google/android/gms/games/server/api/InstanceIosDetails));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("instance_display_name"));
        sFields.put("platformType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("platform_type"));
        sFields.put("realtimePlay", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("real_time_support"));
        sFields.put("turnBasedPlay", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("turn_based_support"));
        sFields.put("webInstance", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("webInstance", com/google/android/gms/games/server/api/InstanceWebDetails));
    }
}
