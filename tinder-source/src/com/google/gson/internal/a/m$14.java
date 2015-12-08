// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class r extends r
{

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return UUID.fromString(jsonreader.nextString());
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (UUID)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((UUID) (obj)).toString();
        }
        jsonwriter.value(((String) (obj)));
    }

    r()
    {
    }
}
