// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Set;

// Referenced classes of package com.google.gson:
//            JsonElement, JsonNull, JsonPrimitive

public final class JsonObject extends JsonElement
{

    private final LinkedTreeMap a = new LinkedTreeMap();

    public JsonObject()
    {
    }

    public JsonElement a(String s)
    {
        return (JsonElement)a.remove(s);
    }

    public Set a()
    {
        return a.entrySet();
    }

    public void a(String s, JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.a;
        }
        a.put(s, obj);
    }

    public JsonElement b(String s)
    {
        return (JsonElement)a.get(s);
    }

    public JsonPrimitive c(String s)
    {
        return (JsonPrimitive)a.get(s);
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonObject) && ((JsonObject)obj).a.equals(a);
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
