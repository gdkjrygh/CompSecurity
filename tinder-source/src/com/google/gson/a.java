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
//            j, p, n, k, 
//            JsonSyntaxException, JsonParseException

public final class a
    implements j, p
{

    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    a()
    {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public a(int i, int l)
    {
        this(DateFormat.getDateTimeInstance(i, l, Locale.US), DateFormat.getDateTimeInstance(i, l));
    }

    public a(String s)
    {
        this(((DateFormat) (new SimpleDateFormat(s, Locale.US))), ((DateFormat) (new SimpleDateFormat(s))));
    }

    private a(DateFormat dateformat, DateFormat dateformat1)
    {
        a = dateformat;
        b = dateformat1;
        c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private k a(Date date)
    {
        synchronized (b)
        {
            date = new n(a.format(date));
        }
        return date;
        date;
        dateformat;
        JVM INSTR monitorexit ;
        throw date;
    }

    private Date a(k k1)
    {
        dateformat;
        JVM INSTR monitorenter ;
        Date date;
        synchronized (b)
        {
            date = b.parse(k1.b());
        }
        return date;
        ParseException parseexception;
        parseexception;
        Date date1 = a.parse(k1.b());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        k1;
        dateformat;
        JVM INSTR monitorexit ;
        throw k1;
        date1;
        date1 = c.parse(k1.b());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        date1;
        throw new JsonSyntaxException(k1.b(), date1);
    }

    public final volatile k a(Object obj)
    {
        return a((Date)obj);
    }

    public final Object a(k k1, Type type)
        throws JsonParseException
    {
        if (!(k1 instanceof n))
        {
            throw new JsonParseException("The date should be a string value");
        }
        k1 = a(k1);
        if (type == java/util/Date)
        {
            return k1;
        }
        if (type == java/sql/Timestamp)
        {
            return new Timestamp(k1.getTime());
        }
        if (type == java/sql/Date)
        {
            return new java.sql.Date(k1.getTime());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass()).append(" cannot deserialize to ").append(type).toString());
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(com/google/gson/a.getSimpleName());
        stringbuilder.append('(').append(b.getClass().getSimpleName()).append(')');
        return stringbuilder.toString();
    }
}
