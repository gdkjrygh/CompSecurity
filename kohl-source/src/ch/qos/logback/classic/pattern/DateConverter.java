// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.util.CachingDateFormatter;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public class DateConverter extends ClassicConverter
{

    CachingDateFormatter cachingDateFormatter;
    long lastTimestamp;
    String timestampStrCache;

    public DateConverter()
    {
        lastTimestamp = -1L;
        timestampStrCache = null;
        cachingDateFormatter = null;
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        long l = iloggingevent.getTimeStamp();
        return cachingDateFormatter.format(l);
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }

    public void start()
    {
        String s = getFirstOption();
        Object obj = s;
        if (s == null)
        {
            obj = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        if (((String) (obj)).equals("ISO8601"))
        {
            obj = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        try
        {
            cachingDateFormatter = new CachingDateFormatter(((String) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            addWarn((new StringBuilder()).append("Could not instantiate SimpleDateFormat with pattern ").append(((String) (obj))).toString(), illegalargumentexception);
            cachingDateFormatter = new CachingDateFormatter("yyyy-MM-dd HH:mm:ss,SSS");
        }
        obj = getOptionList();
        if (obj != null && ((List) (obj)).size() > 1)
        {
            obj = TimeZone.getTimeZone((String)((List) (obj)).get(1));
            cachingDateFormatter.setTimeZone(((TimeZone) (obj)));
        }
    }
}
