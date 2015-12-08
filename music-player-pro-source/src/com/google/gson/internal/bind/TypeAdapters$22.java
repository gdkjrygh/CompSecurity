// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

static final class  extends TypeAdapter
{

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public Locale read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        StringTokenizer stringtokenizer = new StringTokenizer(jsonreader.nextString(), "_");
        jsonreader = null;
        String s = null;
        String s1 = null;
        if (stringtokenizer.hasMoreElements())
        {
            jsonreader = stringtokenizer.nextToken();
        }
        if (stringtokenizer.hasMoreElements())
        {
            s = stringtokenizer.nextToken();
        }
        if (stringtokenizer.hasMoreElements())
        {
            s1 = stringtokenizer.nextToken();
        }
        if (s == null && s1 == null)
        {
            return new Locale(jsonreader);
        }
        if (s1 == null)
        {
            return new Locale(jsonreader, s);
        } else
        {
            return new Locale(jsonreader, s, s1);
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Locale)obj);
    }

    public void write(JsonWriter jsonwriter, Locale locale)
        throws IOException
    {
        if (locale == null)
        {
            locale = null;
        } else
        {
            locale = locale.toString();
        }
        jsonwriter.value(locale);
    }

    ()
    {
    }
}
