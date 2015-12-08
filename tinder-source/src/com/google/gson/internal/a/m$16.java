// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.gson.internal.a:
//            m

static final class r extends r
{

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        int j = 0;
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        jsonreader.beginObject();
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        do
        {
            if (jsonreader.peek() == JsonToken.END_OBJECT)
            {
                break;
            }
            String s = jsonreader.nextName();
            int i = jsonreader.nextInt();
            if ("year".equals(s))
            {
                k1 = i;
            } else
            if ("month".equals(s))
            {
                j1 = i;
            } else
            if ("dayOfMonth".equals(s))
            {
                i1 = i;
            } else
            if ("hourOfDay".equals(s))
            {
                l = i;
            } else
            if ("minute".equals(s))
            {
                k = i;
            } else
            if ("second".equals(s))
            {
                j = i;
            }
        } while (true);
        jsonreader.endObject();
        return new GregorianCalendar(k1, j1, i1, l, k, j);
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (Calendar)obj;
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            jsonwriter.beginObject();
            jsonwriter.name("year");
            jsonwriter.value(((Calendar) (obj)).get(1));
            jsonwriter.name("month");
            jsonwriter.value(((Calendar) (obj)).get(2));
            jsonwriter.name("dayOfMonth");
            jsonwriter.value(((Calendar) (obj)).get(5));
            jsonwriter.name("hourOfDay");
            jsonwriter.value(((Calendar) (obj)).get(11));
            jsonwriter.name("minute");
            jsonwriter.value(((Calendar) (obj)).get(12));
            jsonwriter.name("second");
            jsonwriter.value(((Calendar) (obj)).get(13));
            jsonwriter.endObject();
            return;
        }
    }

    r()
    {
    }
}
