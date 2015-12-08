// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;

// Referenced classes of package fs.ch.qos.logback.core.joran.event:
//            SaxEvent

public class BodyEvent extends SaxEvent
{

    private String text;

    BodyEvent(String s, Locator locator)
    {
        super(null, null, null, locator);
        text = s;
    }

    public void append(String s)
    {
        text = (new StringBuilder()).append(text).append(s).toString();
    }

    public String getText()
    {
        if (text != null)
        {
            return text.trim();
        } else
        {
            return text;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("BodyEvent(").append(getText()).append(")").append(locator.getLineNumber()).append(",").append(locator.getColumnNumber()).toString();
    }
}
