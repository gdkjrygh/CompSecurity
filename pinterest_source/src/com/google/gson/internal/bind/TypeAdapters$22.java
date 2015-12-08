// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.net.URI;
import java.net.URISyntaxException;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final URI read(JsonReader jsonreader)
    {
        if (jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
_L1:
        jsonreader.nextNull();
_L4:
        return null;
_L2:
        jsonreader = jsonreader.nextString();
        if ("null".equals(jsonreader)) goto _L4; else goto _L3
_L3:
        jsonreader = new URI(jsonreader);
        return jsonreader;
        jsonreader;
        throw new JsonIOException(jsonreader);
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (URI)obj);
    }

    public final void write(JsonWriter jsonwriter, URI uri)
    {
        if (uri == null)
        {
            uri = null;
        } else
        {
            uri = uri.toASCIIString();
        }
        jsonwriter.value(uri);
    }

    ()
    {
    }
}
