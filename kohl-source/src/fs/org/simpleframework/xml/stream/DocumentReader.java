// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventReader, NodeExtractor, NodeStack, Attribute, 
//            EventNode, EventToken, EventAttribute, EventElement

class DocumentReader
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

    private static class Entry extends EventAttribute
    {

        private final Node node;

        public String getName()
        {
            return node.getLocalName();
        }

        public String getPrefix()
        {
            return node.getPrefix();
        }

        public String getReference()
        {
            return node.getNamespaceURI();
        }

        public Object getSource()
        {
            return node;
        }

        public String getValue()
        {
            return node.getNodeValue();
        }

        public boolean isReserved()
        {
            String s = getPrefix();
            String s1 = getName();
            if (s != null)
            {
                return s.startsWith("xml");
            } else
            {
                return s1.startsWith("xml");
            }
        }

        public Entry(Node node1)
        {
            node = node1;
        }
    }

    private static class Start extends EventElement
    {

        private final Element element;

        public NamedNodeMap getAttributes()
        {
            return element.getAttributes();
        }

        public String getName()
        {
            return element.getLocalName();
        }

        public Start(Node node)
        {
            element = (Element)node;
        }
    }

    private static class Text extends EventToken
    {

        private final Node node;

        public String getValue()
        {
            return node.getNodeValue();
        }

        public boolean isText()
        {
            return true;
        }

        public Text(Node node1)
        {
            node = node1;
        }
    }


    private EventNode peek;
    private NodeExtractor queue;
    private NodeStack stack;

    public DocumentReader(Document document)
    {
        queue = new NodeExtractor(document);
        stack = new NodeStack();
        stack.push(document);
    }

    private Entry attribute(Node node)
    {
        return new Entry(node);
    }

    private Start build(Start start1)
    {
        NamedNodeMap namednodemap = start1.getAttributes();
        int j = namednodemap.getLength();
        for (int i = 0; i < j; i++)
        {
            Entry entry = attribute(namednodemap.item(i));
            if (!entry.isReserved())
            {
                start1.add(entry);
            }
        }

        return start1;
    }

    private EventNode convert(Node node)
        throws Exception
    {
        if (node.getNodeType() == 1)
        {
            if (node != null)
            {
                stack.push(node);
            }
            return start(node);
        } else
        {
            return text(node);
        }
    }

    private End end()
    {
        return new End();
    }

    private EventNode read()
        throws Exception
    {
        Node node = (Node)queue.peek();
        if (node == null)
        {
            return end();
        } else
        {
            return read(node);
        }
    }

    private EventNode read(Node node)
        throws Exception
    {
        Node node1 = node.getParentNode();
        Node node2 = (Node)stack.top();
        if (node1 != node2)
        {
            if (node2 != null)
            {
                stack.pop();
            }
            return end();
        }
        if (node != null)
        {
            queue.poll();
        }
        return convert(node);
    }

    private Start start(Node node)
    {
        Start start1 = new Start(node);
        node = start1;
        if (start1.isEmpty())
        {
            node = build(start1);
        }
        return node;
    }

    private Text text(Node node)
    {
        return new Text(node);
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
