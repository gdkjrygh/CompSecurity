// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class  extends TypeAdapter
{

    private JsonElement a(JsonReader jsonreader)
    {
        JsonObject jsonobject;
        switch (a[jsonreader.peek().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new JsonPrimitive(jsonreader.nextString());

        case 1: // '\001'
            return new JsonPrimitive(new LazilyParsedNumber(jsonreader.nextString()));

        case 2: // '\002'
            return new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()));

        case 4: // '\004'
            jsonreader.nextNull();
            return JsonNull.INSTANCE;

        case 5: // '\005'
            JsonArray jsonarray = new JsonArray();
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); jsonarray.add(a(jsonreader))) { }
            jsonreader.endArray();
            return jsonarray;

        case 6: // '\006'
            jsonobject = new JsonObject();
            jsonreader.beginObject();
            break;
        }
        for (; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), a(jsonreader))) { }
        jsonreader.endObject();
        return jsonobject;
    }

    private void a(JsonWriter jsonwriter, JsonElement jsonelement)
    {
        if (jsonelement == null || jsonelement.isJsonNull())
        {
            jsonwriter.nullValue();
            return;
        }
        if (jsonelement.isJsonPrimitive())
        {
            jsonelement = jsonelement.getAsJsonPrimitive();
            if (jsonelement.isNumber())
            {
                jsonwriter.value(jsonelement.getAsNumber());
                return;
            }
            if (jsonelement.isBoolean())
            {
                jsonwriter.value(jsonelement.getAsBoolean());
                return;
            } else
            {
                jsonwriter.value(jsonelement.getAsString());
                return;
            }
        }
        if (jsonelement.isJsonArray())
        {
            jsonwriter.beginArray();
            for (jsonelement = jsonelement.getAsJsonArray().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)jsonelement.next())) { }
            jsonwriter.endArray();
            return;
        }
        if (jsonelement.isJsonObject())
        {
            jsonwriter.beginObject();
            java.util.t t;
            for (jsonelement = jsonelement.getAsJsonObject().entrySet().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)t.ue()))
            {
                t = (java.util.ue)jsonelement.next();
                jsonwriter.name((String)t.());
            }

            jsonwriter.endObject();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(jsonelement.getClass()).toString());
        }
    }

    public final Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (JsonElement)obj);
    }

    ()
    {
    }
}
