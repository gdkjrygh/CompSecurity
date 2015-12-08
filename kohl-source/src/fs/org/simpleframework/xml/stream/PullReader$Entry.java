// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventAttribute, PullReader

private class source extends EventAttribute
{

    private final String name;
    private final String prefix;
    private final String reference;
    private final XmlPullParser source;
    final PullReader this$0;
    private final String value;

    public String getName()
    {
        return name;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getReference()
    {
        return reference;
    }

    public Object getSource()
    {
        return source;
    }

    public String getValue()
    {
        return value;
    }

    public boolean isReserved()
    {
        return false;
    }

    public (XmlPullParser xmlpullparser, int i)
    {
        this$0 = PullReader.this;
        super();
        reference = xmlpullparser.getAttributeNamespace(i);
        prefix = xmlpullparser.getAttributePrefix(i);
        value = xmlpullparser.getAttributeValue(i);
        name = xmlpullparser.getAttributeName(i);
        source = xmlpullparser;
    }
}
