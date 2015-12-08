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

static final class  extends TypeAdapter
{

    public final Object read(JsonReader jsonreader)
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

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        obj = (URL)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URL) (obj)).toExternalForm();
        }
        jsonwriter.value(((String) (obj)));
    }

    ()
    {
    }
}
