// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class  extends TypeAdapter
{

    public Character read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        jsonreader = jsonreader.nextString();
        if (jsonreader.length() != 1)
        {
            throw new JsonSyntaxException((new StringBuilder()).append("Expecting character, got: ").append(jsonreader).toString());
        } else
        {
            return Character.valueOf(jsonreader.charAt(0));
        }
    }

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Character character)
        throws IOException
    {
        if (character == null)
        {
            character = null;
        } else
        {
            character = String.valueOf(character);
        }
        jsonwriter.value(character);
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Character)obj);
    }

    ()
    {
    }
}
