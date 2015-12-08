// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.Reader;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Provider, StreamReader, EventReader

class StreamProvider
    implements Provider
{

    private final XMLInputFactory factory = XMLInputFactory.newInstance();

    public StreamProvider()
    {
    }

    private EventReader provide(XMLEventReader xmleventreader)
        throws Exception
    {
        return new StreamReader(xmleventreader);
    }

    public EventReader provide(Reader reader)
        throws Exception
    {
        return provide(factory.createXMLEventReader(reader));
    }
}
