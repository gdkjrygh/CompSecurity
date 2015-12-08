// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public class MDCConverter extends ClassicConverter
{

    String key;

    public MDCConverter()
    {
    }

    private String outputMDCForAllKeys(Map map)
    {
        StringBuilder stringbuilder = new StringBuilder();
        map = map.entrySet().iterator();
        boolean flag = true;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((String)entry.getKey()).append('=').append((String)entry.getValue());
        }
        return stringbuilder.toString();
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        Object obj = iloggingevent.getMDCPropertyMap();
        if (obj == null)
        {
            iloggingevent = "";
        } else
        {
            if (key == null)
            {
                return outputMDCForAllKeys(((Map) (obj)));
            }
            obj = (String)iloggingevent.getMDCPropertyMap().get(key);
            iloggingevent = ((ILoggingEvent) (obj));
            if (obj == null)
            {
                return "";
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
        key = getFirstOption();
        super.start();
    }

    public void stop()
    {
        key = null;
        super.stop();
    }
}
