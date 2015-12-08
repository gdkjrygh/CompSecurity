// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.google.gson:
//            JsonDeserializer, JsonSerializer, JsonElement, JsonSyntaxException, 
//            JsonPrimitive, JsonParseException, JsonSerializationContext, JsonDeserializationContext

final class DefaultDateTypeAdapter
    implements JsonDeserializer, JsonSerializer
{

    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    DefaultDateTypeAdapter()
    {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public DefaultDateTypeAdapter(int i, int j)
    {
        this(DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
    }

    DefaultDateTypeAdapter(String s)
    {
        this(((DateFormat) (new SimpleDateFormat(s, Locale.US))), ((DateFormat) (new SimpleDateFormat(s))));
    }

    DefaultDateTypeAdapter(DateFormat dateformat, DateFormat dateformat1)
    {
        a = dateformat;
        b = dateformat1;
        c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private Date a(JsonElement jsonelement)
    {
        dateformat;
        JVM INSTR monitorenter ;
        Date date;
        synchronized (b)
        {
            date = b.parse(jsonelement.c());
        }
        return date;
        ParseException parseexception;
        parseexception;
        Date date1 = a.parse(jsonelement.c());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        jsonelement;
        dateformat;
        JVM INSTR monitorexit ;
        throw jsonelement;
        date1;
        date1 = c.parse(jsonelement.c());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        date1;
        throw new JsonSyntaxException(jsonelement.c(), date1);
    }

    public volatile JsonElement a(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return a((Date)obj, type, jsonserializationcontext);
    }

    public JsonElement a(Date date, Type type, JsonSerializationContext jsonserializationcontext)
    {
        synchronized (b)
        {
            date = new JsonPrimitive(a.format(date));
        }
        return date;
        date;
        type;
        JVM INSTR monitorexit ;
        throw date;
    }

    public Date a(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        if (!(jsonelement instanceof JsonPrimitive))
        {
            throw new JsonParseException("The date should be a string value");
        }
        jsonelement = a(jsonelement);
        if (type == java/util/Date)
        {
            return jsonelement;
        }
        if (type == java/sql/Timestamp)
        {
            return new Timestamp(jsonelement.getTime());
        }
        if (type == java/sql/Date)
        {
            return new java.sql.Date(jsonelement.getTime());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass()).append(" cannot deserialize to ").append(type).toString());
        }
    }

    public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
    {
        return a(jsonelement, type, jsondeserializationcontext);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(com/google/gson/DefaultDateTypeAdapter.getSimpleName());
        stringbuilder.append('(').append(b.getClass().getSimpleName()).append(')');
        return stringbuilder.toString();
    }
}
