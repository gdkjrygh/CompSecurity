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

final class  extends TypeAdapter
{

    public final Number read(JsonReader jsonreader)
    {
        JsonToken jsontoken = jsonreader.peek();
        switch (.SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            throw new JsonSyntaxException((new StringBuilder("Expecting number, got: ")).append(jsontoken).toString());

        case 4: // '\004'
            jsonreader.nextNull();
            return null;

        case 1: // '\001'
            return new LazilyParsedNumber(jsonreader.nextString());
        }
    }

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final void write(JsonWriter jsonwriter, Number number)
    {
        jsonwriter.value(number);
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Number)obj);
    }

    ()
    {
    }
}
