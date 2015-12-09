// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Set;

// Referenced classes of package com.google.gson:
//            JsonElement, JsonNull

public final class JsonObject extends JsonElement
{

    private final LinkedTreeMap members = new LinkedTreeMap();

    public JsonObject()
    {
    }

    public final void add(String s, JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.INSTANCE;
        }
        members.put(s, obj);
    }

    public final Set entrySet()
    {
        return members.entrySet();
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonObject) && ((JsonObject)obj).members.equals(members);
    }

    public final int hashCode()
    {
        return members.hashCode();
    }
}
