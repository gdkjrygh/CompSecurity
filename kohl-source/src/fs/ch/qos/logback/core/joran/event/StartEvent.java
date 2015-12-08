// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.event;

import fs.ch.qos.logback.core.joran.spi.Pattern;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

// Referenced classes of package fs.ch.qos.logback.core.joran.event:
//            SaxEvent

public class StartEvent extends SaxEvent
{

    public final Attributes attributes;
    public final Pattern pattern;

    StartEvent(Pattern pattern1, String s, String s1, String s2, Attributes attributes1, Locator locator)
    {
        super(s, s1, s2, locator);
        attributes = new AttributesImpl(attributes1);
        pattern = pattern1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StartEvent(").append(getQName()).append(")  [").append(locator.getLineNumber()).append(",").append(locator.getColumnNumber()).append("]").toString();
    }
}
