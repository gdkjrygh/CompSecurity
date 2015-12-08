// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDatePrinter, FastDateParser, FormatCache

public class FastDateFormat extends Format
{

    private static final FormatCache cache = new FormatCache() {

        protected final volatile Format createInstance(String s, TimeZone timezone, Locale locale)
        {
            return createInstance(s, timezone, locale);
        }

        protected final FastDateFormat createInstance(String s, TimeZone timezone, Locale locale)
        {
            return new FastDateFormat(s, timezone, locale);
        }

    };
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    protected FastDateFormat(String s, TimeZone timezone, Locale locale)
    {
        this(s, timezone, locale, null);
    }

    protected FastDateFormat(String s, TimeZone timezone, Locale locale, Date date)
    {
        printer = new FastDatePrinter(s, timezone, locale);
        parser = new FastDateParser(s, timezone, locale, date);
    }

    public static FastDateFormat getInstance(String s)
    {
        return (FastDateFormat)cache.getInstance(s, null, null);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof FastDateFormat))
        {
            return false;
        } else
        {
            obj = (FastDateFormat)obj;
            return printer.equals(((FastDateFormat) (obj)).printer);
        }
    }

    public String format(Date date)
    {
        return printer.format(date);
    }

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return printer.format(obj, stringbuffer, fieldposition);
    }

    public int hashCode()
    {
        return printer.hashCode();
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        return parser.parseObject(s, parseposition);
    }

    public String toString()
    {
        return (new StringBuilder("FastDateFormat[")).append(printer.getPattern()).append(",").append(printer.getLocale()).append(",").append(printer.getTimeZone().getID()).append("]").toString();
    }

}
