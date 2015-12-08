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

final class  extends TypeAdapter
{

    public JsonElement a(JsonReader jsonreader)
    {
        JsonObject jsonobject;
        switch (a[jsonreader.f().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new JsonPrimitive(jsonreader.h());

        case 1: // '\001'
            return new JsonPrimitive(new LazilyParsedNumber(jsonreader.h()));

        case 2: // '\002'
            return new JsonPrimitive(Boolean.valueOf(jsonreader.i()));

        case 4: // '\004'
            jsonreader.j();
            return JsonNull.a;

        case 5: // '\005'
            JsonArray jsonarray = new JsonArray();
            jsonreader.a();
            for (; jsonreader.e(); jsonarray.a(a(jsonreader))) { }
            jsonreader.b();
            return jsonarray;

        case 6: // '\006'
            jsonobject = new JsonObject();
            jsonreader.c();
            break;
        }
        for (; jsonreader.e(); jsonobject.a(jsonreader.g(), a(jsonreader))) { }
        jsonreader.d();
        return jsonobject;
    }

    public void a(JsonWriter jsonwriter, JsonElement jsonelement)
    {
        if (jsonelement == null || jsonelement.k())
        {
            jsonwriter.f();
            return;
        }
        if (jsonelement.j())
        {
            jsonelement = jsonelement.n();
            if (jsonelement.p())
            {
                jsonwriter.a(jsonelement.b());
                return;
            }
            if (jsonelement.a())
            {
                jsonwriter.a(jsonelement.g());
                return;
            } else
            {
                jsonwriter.b(jsonelement.c());
                return;
            }
        }
        if (jsonelement.h())
        {
            jsonwriter.b();
            for (jsonelement = jsonelement.m().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)jsonelement.next())) { }
            jsonwriter.c();
            return;
        }
        if (jsonelement.i())
        {
            jsonwriter.d();
            java.util.t t;
            for (jsonelement = jsonelement.l().a().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)t.ue()))
            {
                t = (java.util.ue)jsonelement.next();
                jsonwriter.a((String)t.());
            }

            jsonwriter.e();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(jsonelement.getClass()).toString());
        }
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (JsonElement)obj);
    }

    ()
    {
    }
}
