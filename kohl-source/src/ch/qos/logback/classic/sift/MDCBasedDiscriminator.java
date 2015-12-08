// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

public class MDCBasedDiscriminator extends ContextAwareBase
{

    private String defaultValue;
    private String key;
    private boolean started;

    public String getDiscriminatingValue(ILoggingEvent iloggingevent)
    {
        iloggingevent = iloggingevent.getMDCPropertyMap();
        if (iloggingevent == null)
        {
            iloggingevent = defaultValue;
        } else
        {
            String s = (String)iloggingevent.get(key);
            iloggingevent = s;
            if (s == null)
            {
                return defaultValue;
            }
        }
        return iloggingevent;
    }

    public volatile String getDiscriminatingValue(Object obj)
    {
        return getDiscriminatingValue((ILoggingEvent)obj);
    }

    public String getKey()
    {
        return key;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void start()
    {
        int i = 0;
        if (OptionHelper.isEmpty(key))
        {
            addError("The \"Key\" property must be set");
            i = 1;
        }
        int j = i;
        if (OptionHelper.isEmpty(defaultValue))
        {
            j = i + 1;
            addError("The \"DefaultValue\" property must be set");
        }
        if (j == 0)
        {
            started = true;
        }
    }

    public void stop()
    {
        started = false;
    }
}
