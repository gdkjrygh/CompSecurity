// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URL;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public URL a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
        } else
        {
            jsonreader = jsonreader.h();
            if (!"null".equals(jsonreader))
            {
                return new URL(jsonreader);
            }
        }
        return null;
    }

    public void a(JsonWriter jsonwriter, URL url)
    {
        if (url == null)
        {
            url = null;
        } else
        {
            url = url.toExternalForm();
        }
        jsonwriter.b(url);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (URL)obj);
    }

    ()
    {
    }
}
