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
//            ContactChannelSetting

public final class ContactSettings extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;

    public ContactSettings()
    {
        mConcreteTypeArrays = new HashMap();
    }

    public ContactSettings(Boolean boolean1, ArrayList arraylist)
    {
        mConcreteTypeArrays = new HashMap();
        if (boolean1 != null)
        {
            setBoolean("enableMobileNotifications", boolean1.booleanValue());
        }
        addConcreteTypeArray("perChannelSettings", arraylist);
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getPerChannelSettings()
    {
        return (ArrayList)mConcreteTypeArrays.get("perChannelSettings");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("enableMobileNotifications", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("enableMobileNotifications"));
        sFields.put("perChannelSettings", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("perChannelSettings", com/google/android/gms/games/server/api/ContactChannelSetting));
    }
}
