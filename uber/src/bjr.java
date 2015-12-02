// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class bjr
    implements bkc, bkl
{

    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    bjr()
    {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public bjr(int i, int j)
    {
        this(DateFormat.getDateTimeInstance(i, j, Locale.US), DateFormat.getDateTimeInstance(i, j));
    }

    bjr(String s)
    {
        this(((DateFormat) (new SimpleDateFormat(s, Locale.US))), ((DateFormat) (new SimpleDateFormat(s))));
    }

    private bjr(DateFormat dateformat, DateFormat dateformat1)
    {
        a = dateformat;
        b = dateformat1;
        c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private bkd a(Date date)
    {
        synchronized (b)
        {
            date = new bkj(a.format(date));
        }
        return date;
        date;
        dateformat;
        JVM INSTR monitorexit ;
        throw date;
    }

    private Date a(bkd bkd1)
    {
        dateformat;
        JVM INSTR monitorenter ;
        Date date;
        synchronized (b)
        {
            date = b.parse(bkd1.b());
        }
        return date;
        ParseException parseexception;
        parseexception;
        Date date1 = a.parse(bkd1.b());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        bkd1;
        dateformat;
        JVM INSTR monitorexit ;
        throw bkd1;
        date1;
        date1 = c.parse(bkd1.b());
        dateformat;
        JVM INSTR monitorexit ;
        return date1;
        date1;
        throw new bkm(bkd1.b(), date1);
    }

    private Date a(bkd bkd1, Type type)
    {
        if (!(bkd1 instanceof bkj))
        {
            throw new bkh("The date should be a string value");
        }
        bkd1 = a(bkd1);
        if (type == java/util/Date)
        {
            return bkd1;
        }
        if (type == java/sql/Timestamp)
        {
            return new Timestamp(bkd1.getTime());
        }
        if (type == java/sql/Date)
        {
            return new java.sql.Date(bkd1.getTime());
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass()).append(" cannot deserialize to ").append(type).toString());
        }
    }

    public final volatile bkd a(Object obj)
    {
        return a((Date)obj);
    }

    public final volatile Object a(bkd bkd1, Type type, bkb bkb)
    {
        return a(bkd1, type);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(bjr.getSimpleName());
        stringbuilder.append('(').append(b.getClass().getSimpleName()).append(')');
        return stringbuilder.toString();
    }
}
