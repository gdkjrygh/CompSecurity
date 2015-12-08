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

    public StringBuilder a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        } else
        {
            return new StringBuilder(jsonreader.h());
        }
    }

    public void a(JsonWriter jsonwriter, StringBuilder stringbuilder)
    {
        if (stringbuilder == null)
        {
            stringbuilder = null;
        } else
        {
            stringbuilder = stringbuilder.toString();
        }
        jsonwriter.b(stringbuilder);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (StringBuilder)obj);
    }

    ()
    {
    }
}
