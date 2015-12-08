// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter, Gson

final class JsonWriter extends TypeAdapter
{

    public final Object read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return Long.valueOf(jsonreader.nextLong());
        }
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        obj = (Number)obj;
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            jsonwriter.value(obj.toString());
            return;
        }
    }

    JsonWriter()
    {
    }
}
