// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class  extends TypeAdapter
{

    public Boolean read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        if (jsonreader.peek() == JsonToken.STRING)
        {
            return Boolean.valueOf(Boolean.parseBoolean(jsonreader.nextString()));
        } else
        {
            return Boolean.valueOf(jsonreader.nextBoolean());
        }
    }

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Boolean boolean1)
        throws IOException
    {
        if (boolean1 == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            jsonwriter.value(boolean1.booleanValue());
            return;
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Boolean)obj);
    }

    ()
    {
    }
}
