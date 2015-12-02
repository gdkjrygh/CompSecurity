// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class f
    implements NodeList
{

    private ArrayList a;
    private ArrayList b;
    private Node c;
    private String d;
    private boolean e;

    public f(Node node, String s, boolean flag)
    {
        c = node;
        d = s;
        e = flag;
    }

    private void a(Node node)
    {
        if (node == c)
        {
            a = new ArrayList();
            break MISSING_BLOCK_LABEL_19;
        } else
        {
            if (d == null || node.getNodeName().equals(d))
            {
                a.add(node);
            }
            continue;
        }
        do
        {
            node = node.getFirstChild();
            do
            {
                if (node == null)
                {
                    break;
                }
                if (e)
                {
                    a(node);
                } else
                if (d == null || node.getNodeName().equals(d))
                {
                    a.add(node);
                }
                node = node.getNextSibling();
            } while (true);
            return;
        } while (true);
    }

    public int getLength()
    {
        if (b == null)
        {
            a(c);
            return a.size();
        } else
        {
            return b.size();
        }
    }

    public Node item(int i)
    {
        if (b == null)
        {
            a(c);
            Node node;
            try
            {
                node = (Node)a.get(i);
            }
            catch (IndexOutOfBoundsException indexoutofboundsexception)
            {
                return null;
            }
            return node;
        }
        Node node1;
        try
        {
            node1 = (Node)b.get(i);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception1)
        {
            return null;
        }
        return node1;
    }
}
