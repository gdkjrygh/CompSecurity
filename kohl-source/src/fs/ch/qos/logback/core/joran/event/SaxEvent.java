// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

public class SaxEvent
{

    public final String localName;
    public final Locator locator;
    public final String namespaceURI;
    public final String qName;

    SaxEvent(String s, String s1, String s2, Locator locator1)
    {
        namespaceURI = s;
        localName = s1;
        qName = s2;
        locator = new LocatorImpl(locator1);
    }

    public Locator getLocator()
    {
        return locator;
    }

    public String getQName()
    {
        return qName;
    }
}
