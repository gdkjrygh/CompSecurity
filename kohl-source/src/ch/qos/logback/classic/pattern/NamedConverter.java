// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter, Abbreviator, ClassNameOnlyAbbreviator, TargetLengthBasedClassNameAbbreviator

public abstract class NamedConverter extends ClassicConverter
{

    Abbreviator abbreviator;

    public NamedConverter()
    {
        abbreviator = null;
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        iloggingevent = getFullyQualifiedName(iloggingevent);
        if (abbreviator == null)
        {
            return iloggingevent;
        } else
        {
            return abbreviator.abbreviate(iloggingevent);
        }
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }

    protected abstract String getFullyQualifiedName(ILoggingEvent iloggingevent);

    public void start()
    {
        String s;
        s = getFirstOption();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        int i = Integer.parseInt(s);
        if (i == 0)
        {
            try
            {
                abbreviator = new ClassNameOnlyAbbreviator();
                return;
            }
            catch (NumberFormatException numberformatexception) { }
            break MISSING_BLOCK_LABEL_48;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        abbreviator = new TargetLengthBasedClassNameAbbreviator(i);
        return;
    }
}
