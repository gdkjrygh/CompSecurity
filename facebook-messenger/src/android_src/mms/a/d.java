// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import java.util.Vector;
import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class d
    implements NamedNodeMap
{

    private Vector a;

    public d()
    {
        a = new Vector();
    }

    public int getLength()
    {
        return a.size();
    }

    public Node getNamedItem(String s)
    {
        for (int i = 0; i < a.size(); i++)
        {
            if (s.equals(((Node)a.elementAt(i)).getNodeName()))
            {
                return (Node)a.elementAt(i);
            }
        }

        return null;
    }

    public Node getNamedItemNS(String s, String s1)
    {
        return null;
    }

    public Node item(int i)
    {
        if (i < a.size())
        {
            return (Node)a.elementAt(i);
        } else
        {
            return null;
        }
    }

    public Node removeNamedItem(String s)
    {
        s = getNamedItem(s);
        if (s == null)
        {
            throw new DOMException((short)8, "Not found");
        } else
        {
            a.remove(s);
            return s;
        }
    }

    public Node removeNamedItemNS(String s, String s1)
    {
        return null;
    }

    public Node setNamedItem(Node node)
    {
        Node node1 = getNamedItem(node.getNodeName());
        if (node1 != null)
        {
            a.remove(node1);
        }
        a.add(node);
        return node1;
    }

    public Node setNamedItemNS(Node node)
    {
        return null;
    }
}
