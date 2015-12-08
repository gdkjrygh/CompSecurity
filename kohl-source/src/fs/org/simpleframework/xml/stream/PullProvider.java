// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Provider, PullReader, EventReader

class PullProvider
    implements Provider
{

    private final XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

    public PullProvider()
        throws Exception
    {
        factory.setNamespaceAware(true);
    }

    public EventReader provide(Reader reader)
        throws Exception
    {
        XmlPullParser xmlpullparser = factory.newPullParser();
        if (reader != null)
        {
            xmlpullparser.setInput(reader);
        }
        return new PullReader(xmlpullparser);
    }
}
