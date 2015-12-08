// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URL;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final URL read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
        } else
        {
            jsonreader = jsonreader.nextString();
            if (!"null".equals(jsonreader))
            {
                return new URL(jsonreader);
            }
        }
        return null;
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (URL)obj);
    }

    public final void write(JsonWriter jsonwriter, URL url)
    {
        if (url == null)
        {
            url = null;
        } else
        {
            url = url.toExternalForm();
        }
        jsonwriter.value(url);
    }

    ()
    {
    }
}
