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

    private final LinkedTreeMap a = new LinkedTreeMap();

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
        a.put(s, obj);
    }

    public final Set entrySet()
    {
        return a.entrySet();
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonObject) && ((JsonObject)obj).a.equals(a);
    }

    public final JsonElement get(String s)
    {
        return (JsonElement)a.get(s);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
