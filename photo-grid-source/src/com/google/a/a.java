// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.google.a:
//            af, w, ad, x, 
//            ag, ab

final class a
    implements af, w
{

    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    a()
    {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public a(int i, int j)
    {
        this(DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
    }

    a(String s)
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

    private x a(Date date)
    {
        synchronized (b)
        {
            date = new ad(a.format(date));
        }
        return date;
        date;
        dateformat;
        JVM INSTR monitorexit ;
        throw date;
    }

    private Date a(x x1)
    {
        dateformat;
        JVM INSTR monitorenter ;
        Date date;
        synchronized (b)
        {
            date = b.parse(x1.c());
        }
        return date;
        ParseException parseexception;
        parseexception;
        Date date1 = a.parse(x1.c());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        x1;
        dateformat;
        JVM INSTR monitorexit ;
        throw x1;
        date1;
        date1 = c.parse(x1.c());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        date1;
        throw new ag(x1.c(), date1);
    }

    public final volatile x a(Object obj)
    {
        return a((Date)obj);
    }

    public final Object a(x x1, Type type)
    {
        if (!(x1 instanceof ad))
        {
            throw new ab("The date should be a string value");
        }
        x1 = a(x1);
        if (type == java/util/Date)
        {
            return x1;
        }
        if (type == java/sql/Timestamp)
        {
            return new Timestamp(x1.getTime());
        }
        if (type == java/sql/Date)
        {
            return new java.sql.Date(x1.getTime());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass()).append(" cannot deserialize to ").append(type).toString());
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(com/google/a/a.getSimpleName());
        stringbuilder.append('(').append(b.getClass().getSimpleName()).append(')');
        return stringbuilder.toString();
    }
}
