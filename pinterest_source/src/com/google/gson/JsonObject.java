// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson:
//            JsonElement, JsonNull, JsonPrimitive, JsonArray

public final class JsonObject extends JsonElement
{

    private final LinkedTreeMap members = new LinkedTreeMap();

    public JsonObject()
    {
    }

    private JsonElement createJsonElement(Object obj)
    {
        if (obj == null)
        {
            return JsonNull.INSTANCE;
        } else
        {
            return new JsonPrimitive(obj);
        }
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

    public final void addProperty(String s, Boolean boolean1)
    {
        add(s, createJsonElement(boolean1));
    }

    public final void addProperty(String s, Character character)
    {
        add(s, createJsonElement(character));
    }

    public final void addProperty(String s, Number number)
    {
        add(s, createJsonElement(number));
    }

    public final void addProperty(String s, String s1)
    {
        add(s, createJsonElement(s1));
    }

    final volatile JsonElement deepCopy()
    {
        return deepCopy();
    }

    final JsonObject deepCopy()
    {
        JsonObject jsonobject = new JsonObject();
        java.util.Map.Entry entry;
        for (Iterator iterator = members.entrySet().iterator(); iterator.hasNext(); jsonobject.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return jsonobject;
    }

    public final Set entrySet()
    {
        return members.entrySet();
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonObject) && ((JsonObject)obj).members.equals(members);
    }

    public final JsonElement get(String s)
    {
        return (JsonElement)members.get(s);
    }

    public final JsonArray getAsJsonArray(String s)
    {
        return (JsonArray)members.get(s);
    }

    public final JsonObject getAsJsonObject(String s)
    {
        return (JsonObject)members.get(s);
    }

    public final JsonPrimitive getAsJsonPrimitive(String s)
    {
        return (JsonPrimitive)members.get(s);
    }

    public final boolean has(String s)
    {
        return members.containsKey(s);
    }

    public final int hashCode()
    {
        return members.hashCode();
    }

    public final JsonElement remove(String s)
    {
        return (JsonElement)members.remove(s);
    }
}
