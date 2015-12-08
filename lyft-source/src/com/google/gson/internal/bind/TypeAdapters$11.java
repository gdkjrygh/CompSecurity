// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public Number a(JsonReader jsonreader)
    {
        JsonToken jsontoken = jsonreader.f();
        switch (a[jsontoken.ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(jsontoken).toString());

        case 4: // '\004'
            jsonreader.j();
            return null;

        case 1: // '\001'
            return new LazilyParsedNumber(jsonreader.h());
        }
    }

    public void a(JsonWriter jsonwriter, Number number)
    {
        jsonwriter.a(number);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Number)obj);
    }

    ()
    {
    }
}
