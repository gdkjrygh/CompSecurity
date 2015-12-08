// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class er extends r
{

    private static BigDecimal b(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        try
        {
            jsonreader = new BigDecimal(jsonreader.nextString());
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException(jsonreader);
        }
        return jsonreader;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        return b(jsonreader);
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        jsonwriter.value((BigDecimal)obj);
    }

    er()
    {
    }
}
