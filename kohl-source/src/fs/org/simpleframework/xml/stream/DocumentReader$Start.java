// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventElement, DocumentReader

private static class element extends EventElement
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

    public (Node node)
    {
        element = (Element)node;
    }
}
