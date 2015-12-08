// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class er extends r
{

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        JsonToken jsontoken = jsonreader.peek();
        switch (.a[jsontoken.ordinal()])
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

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        jsonwriter.value((Number)obj);
    }

    er()
    {
    }
}
