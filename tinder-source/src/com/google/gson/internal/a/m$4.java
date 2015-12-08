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

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class er extends r
{

    public final Object a(JsonReader jsonreader)
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
            throw new JsonSyntaxException((new StringBuilder("Expecting character, got: ")).append(jsonreader).toString());
        } else
        {
            return Character.valueOf(jsonreader.charAt(0));
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (Character)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        jsonwriter.value(((String) (obj)));
    }

    er()
    {
    }
}
