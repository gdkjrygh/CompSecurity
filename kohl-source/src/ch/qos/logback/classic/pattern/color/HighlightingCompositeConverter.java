// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern.color;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class HighlightingCompositeConverter extends ForegroundCompositeConverterBase
{

    public HighlightingCompositeConverter()
    {
    }

    protected String getForegroundColorCode(ILoggingEvent iloggingevent)
    {
        switch (iloggingevent.getLevel().toInt())
        {
        default:
            return "39";

        case 40000: 
            return "1;31";

        case 30000: 
            return "31";

        case 20000: 
            return "34";
        }
    }

    protected volatile String getForegroundColorCode(Object obj)
    {
        return getForegroundColorCode((ILoggingEvent)obj);
    }
}
