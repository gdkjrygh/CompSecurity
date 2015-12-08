// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Locale;
import java.util.StringTokenizer;

final class  extends TypeAdapter
{

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final Locale read(JsonReader jsonreader)
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

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Locale)obj);
    }

    public final void write(JsonWriter jsonwriter, Locale locale)
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
