// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;

// Referenced classes of package fs.ch.qos.logback.core.joran.event:
//            SaxEvent

public class EndEvent extends SaxEvent
{

    EndEvent(String s, String s1, String s2, Locator locator)
    {
        super(s, s1, s2, locator);
    }

    public String toString()
    {
        return (new StringBuilder()).append("  EndEvent(").append(getQName()).append(")  [").append(locator.getLineNumber()).append(",").append(locator.getColumnNumber()).append("]").toString();
    }
}
