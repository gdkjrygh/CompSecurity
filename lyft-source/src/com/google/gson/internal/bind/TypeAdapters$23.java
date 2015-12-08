// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public Calendar a(JsonReader jsonreader)
    {
        int j = 0;
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        jsonreader.c();
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        do
        {
            if (jsonreader.f() == JsonToken.d)
            {
                break;
            }
            String s = jsonreader.g();
            int i = jsonreader.m();
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
        jsonreader.d();
        return new GregorianCalendar(k1, j1, i1, l, k, j);
    }

    public void a(JsonWriter jsonwriter, Calendar calendar)
    {
        if (calendar == null)
        {
            jsonwriter.f();
            return;
        } else
        {
            jsonwriter.d();
            jsonwriter.a("year");
            jsonwriter.a(calendar.get(1));
            jsonwriter.a("month");
            jsonwriter.a(calendar.get(2));
            jsonwriter.a("dayOfMonth");
            jsonwriter.a(calendar.get(5));
            jsonwriter.a("hourOfDay");
            jsonwriter.a(calendar.get(11));
            jsonwriter.a("minute");
            jsonwriter.a(calendar.get(12));
            jsonwriter.a("second");
            jsonwriter.a(calendar.get(13));
            jsonwriter.e();
            return;
        }
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Calendar)obj);
    }

    ()
    {
    }
}
