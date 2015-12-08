// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public final class PropertyConverter extends ClassicConverter
{

    String key;

    public PropertyConverter()
    {
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        if (key == null)
        {
            iloggingevent = "Property_HAS_NO_KEY";
        } else
        {
            String s = (String)iloggingevent.getLoggerContextVO().getPropertyMap().get(key);
            iloggingevent = s;
            if (s == null)
            {
                return System.getProperty(key);
            }
        }
        return iloggingevent;
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }

    public void start()
    {
        String s = getFirstOption();
        if (s != null)
        {
            key = s;
            super.start();
        }
    }
}
