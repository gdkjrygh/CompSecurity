// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventReader, EventNode, EventToken, EventAttribute, 
//            EventElement

class PullReader
    implements EventReader
{
    private static class End extends EventToken
    {

        public boolean isEnd()
        {
            return true;
        }

        private End()
        {
        }

    }

    private class Entry extends EventAttribute
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

        public Entry(XmlPullParser xmlpullparser, int i)
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

    private static class Start extends EventElement
    {

        private final int line;
        private final String name;
        private final String prefix;
        private final String reference;
        private final XmlPullParser source;

        public int getLine()
        {
            return line;
        }

        public String getName()
        {
            return name;
        }

        public Start(XmlPullParser xmlpullparser)
        {
            reference = xmlpullparser.getNamespace();
            line = xmlpullparser.getLineNumber();
            prefix = xmlpullparser.getPrefix();
            name = xmlpullparser.getName();
            source = xmlpullparser;
        }
    }

    private static class Text extends EventToken
    {

        private final XmlPullParser source;
        private final String text;

        public String getValue()
        {
            return text;
        }

        public boolean isText()
        {
            return true;
        }

        public Text(XmlPullParser xmlpullparser)
        {
            text = xmlpullparser.getText();
            source = xmlpullparser;
        }
    }


    private XmlPullParser parser;
    private EventNode peek;

    public PullReader(XmlPullParser xmlpullparser)
    {
        parser = xmlpullparser;
    }

    private Entry attribute(int i)
        throws Exception
    {
        return new Entry(parser, i);
    }

    private Start build(Start start1)
        throws Exception
    {
        int j = parser.getAttributeCount();
        for (int i = 0; i < j; i++)
        {
            Entry entry = attribute(i);
            if (!entry.isReserved())
            {
                start1.add(entry);
            }
        }

        return start1;
    }

    private End end()
        throws Exception
    {
        return new End();
    }

    private EventNode read()
        throws Exception
    {
        int i = parser.next();
        if (i != 1)
        {
            if (i == 2)
            {
                return start();
            }
            if (i == 4)
            {
                return text();
            }
            if (i == 3)
            {
                return end();
            } else
            {
                return read();
            }
        } else
        {
            return null;
        }
    }

    private Start start()
        throws Exception
    {
        Start start2 = new Start(parser);
        Start start1 = start2;
        if (start2.isEmpty())
        {
            start1 = build(start2);
        }
        return start1;
    }

    private Text text()
        throws Exception
    {
        return new Text(parser);
    }

    public EventNode next()
        throws Exception
    {
        EventNode eventnode = peek;
        if (eventnode == null)
        {
            return read();
        } else
        {
            peek = null;
            return eventnode;
        }
    }

    public EventNode peek()
        throws Exception
    {
        if (peek == null)
        {
            peek = next();
        }
        return peek;
    }
}
