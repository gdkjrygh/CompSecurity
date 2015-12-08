// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URL;

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
        } else
        {
            jsonreader = jsonreader.nextString();
            if (!"null".equals(jsonreader))
            {
                return new URL(jsonreader);
            }
        }
        return null;
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (URL)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URL) (obj)).toExternalForm();
        }
        jsonwriter.value(((String) (obj)));
    }

    r()
    {
    }
}
