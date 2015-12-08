// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.w3c.dom.Node;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventAttribute, DocumentReader

private static class node extends EventAttribute
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

    public (Node node1)
    {
        node = node1;
    }
}
