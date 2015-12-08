// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;

final class DateType extends Enum
{
    private static class DateFormat
    {

        private SimpleDateFormat format;

        public Date getDate(String s)
            throws Exception
        {
            this;
            JVM INSTR monitorenter ;
            s = format.parse(s);
            this;
            JVM INSTR monitorexit ;
            return s;
            s;
            throw s;
        }

        public String getText(Date date)
            throws Exception
        {
            this;
            JVM INSTR monitorenter ;
            date = format.format(date);
            this;
            JVM INSTR monitorexit ;
            return date;
            date;
            throw date;
        }

        public DateFormat(String s)
        {
            format = new SimpleDateFormat(s);
        }
    }


    private static final DateType $VALUES[];
    public static final DateType FULL;
    public static final DateType LONG;
    public static final DateType NORMAL;
    public static final DateType SHORT;
    private DateFormat format;

    private DateType(String s, int i, String s1)
    {
        super(s, i);
        format = new DateFormat(s1);
    }

    public static Date getDate(String s)
        throws Exception
    {
        return getType(s).getFormat().getDate(s);
    }

    private DateFormat getFormat()
    {
        return format;
    }

    public static String getText(Date date)
        throws Exception
    {
        return FULL.getFormat().getText(date);
    }

    public static DateType getType(String s)
    {
        int i = s.length();
        if (i > 23)
        {
            return FULL;
        }
        if (i > 20)
        {
            return LONG;
        }
        if (i > 11)
        {
            return NORMAL;
        } else
        {
            return SHORT;
        }
    }

    public static DateType valueOf(String s)
    {
        return (DateType)Enum.valueOf(fs/org/simpleframework/xml/transform/DateType, s);
    }

    public static final DateType[] values()
    {
        return (DateType[])$VALUES.clone();
    }

    static 
    {
        FULL = new DateType("FULL", 0, "yyyy-MM-dd HH:mm:ss.S z");
        LONG = new DateType("LONG", 1, "yyyy-MM-dd HH:mm:ss z");
        NORMAL = new DateType("NORMAL", 2, "yyyy-MM-dd z");
        SHORT = new DateType("SHORT", 3, "yyyy-MM-dd");
        $VALUES = (new DateType[] {
            FULL, LONG, NORMAL, SHORT
        });
    }
}
