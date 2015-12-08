// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c extends r
{

    public static final s a = new s() {

        public final r a(e e, a a1)
        {
            if (a1.a == java/util/Date)
            {
                return new c();
            } else
            {
                return null;
            }
        }

    };
    private final DateFormat b;
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d;

    public c()
    {
        b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        d = simpledateformat;
    }

    private Date a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Date date = c.parse(s);
        s = date;
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
        ParseException parseexception;
        parseexception;
        parseexception = b.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        parseexception = d.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        throw new JsonSyntaxException(s, parseexception);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void a(JsonWriter jsonwriter, Date date)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        jsonwriter.nullValue();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        jsonwriter.value(b.format(date));
        if (true) goto _L4; else goto _L3
_L3:
        jsonwriter;
        throw jsonwriter;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return a(jsonreader.nextString());
        }
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        a(jsonwriter, (Date)obj);
    }

}
