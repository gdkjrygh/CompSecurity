// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public String a(JsonReader jsonreader)
    {
        JsonToken jsontoken = jsonreader.f();
        if (jsontoken == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        if (jsontoken == JsonToken.h)
        {
            return Boolean.toString(jsonreader.i());
        } else
        {
            return jsonreader.h();
        }
    }

    public void a(JsonWriter jsonwriter, String s)
    {
        jsonwriter.b(s);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (String)obj);
    }

    ()
    {
    }
}
