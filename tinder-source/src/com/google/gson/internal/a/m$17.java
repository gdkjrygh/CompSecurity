// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

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
        }
        Object obj = new StringTokenizer(jsonreader.nextString(), "_");
        String s;
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            jsonreader = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            jsonreader = null;
        }
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            s = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            s = null;
        }
        if (((StringTokenizer) (obj)).hasMoreElements())
        {
            obj = ((StringTokenizer) (obj)).nextToken();
        } else
        {
            obj = null;
        }
        if (s == null && obj == null)
        {
            return new Locale(jsonreader);
        }
        if (obj == null)
        {
            return new Locale(jsonreader, s);
        } else
        {
            return new Locale(jsonreader, s, ((String) (obj)));
        }
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (Locale)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Locale) (obj)).toString();
        }
        jsonwriter.value(((String) (obj)));
    }

    r()
    {
    }
}
