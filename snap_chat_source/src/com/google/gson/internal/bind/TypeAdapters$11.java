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

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class  extends TypeAdapter
{

    private static URI a(JsonReader jsonreader)
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

    public final Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        obj = (URI)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URI) (obj)).toASCIIString();
        }
        jsonwriter.value(((String) (obj)));
    }

    ()
    {
    }
}
