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

    public Boolean a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        if (jsonreader.f() == JsonToken.f)
        {
            return Boolean.valueOf(Boolean.parseBoolean(jsonreader.h()));
        } else
        {
            return Boolean.valueOf(jsonreader.i());
        }
    }

    public void a(JsonWriter jsonwriter, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            jsonwriter.f();
            return;
        } else
        {
            jsonwriter.a(boolean1.booleanValue());
            return;
        }
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Boolean)obj);
    }

    ()
    {
    }
}
