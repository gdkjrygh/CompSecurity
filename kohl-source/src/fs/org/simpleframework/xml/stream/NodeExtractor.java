// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class NodeExtractor extends LinkedList
{

    public NodeExtractor(Document document)
    {
        extract(document);
    }

    private void extract(Document document)
    {
        document = document.getDocumentElement();
        if (document != null)
        {
            offer(document);
            extract(((Node) (document)));
        }
    }

    private void extract(Node node)
    {
        node = node.getChildNodes();
        int j = node.getLength();
        for (int i = 0; i < j; i++)
        {
            Node node1 = node.item(i);
            if (node1.getNodeType() != 8)
            {
                offer(node1);
                extract(node1);
            }
        }

    }
}
