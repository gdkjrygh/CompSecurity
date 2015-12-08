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

final class  extends TypeAdapter
{

    public URI a(JsonReader jsonreader)
    {
        if (jsonreader.f() != JsonToken.i) goto _L2; else goto _L1
_L1:
        jsonreader.j();
_L4:
        return null;
_L2:
        jsonreader = jsonreader.h();
        if ("null".equals(jsonreader)) goto _L4; else goto _L3
_L3:
        jsonreader = new URI(jsonreader);
        return jsonreader;
        jsonreader;
        throw new JsonIOException(jsonreader);
    }

    public void a(JsonWriter jsonwriter, URI uri)
    {
        if (uri == null)
        {
            uri = null;
        } else
        {
            uri = uri.toASCIIString();
        }
        jsonwriter.b(uri);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (URI)obj);
    }

    ()
    {
    }
}
