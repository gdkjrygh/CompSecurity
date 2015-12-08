// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public class LineOfCallerConverter extends ClassicConverter
{

    public LineOfCallerConverter()
    {
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        iloggingevent = iloggingevent.getCallerData();
        if (iloggingevent != null && iloggingevent.length > 0)
        {
            return Integer.toString(iloggingevent[0].getLineNumber());
        } else
        {
            return "?";
        }
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }
}
