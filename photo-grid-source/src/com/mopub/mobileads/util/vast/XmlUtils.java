// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            f, g, h

final class XmlUtils
{

    static String a(Document document, String s)
    {
        f f1;
        int i;
        f1 = new f();
        if (document == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = document.getElementsByTagName(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        i = 0;
_L3:
        if (i >= s.getLength()) goto _L2; else goto _L1
_L1:
        document = s.item(i);
        if (document == null || !a(((Node) (document)), null, null))
        {
            continue; /* Loop/switch isn't completed */
        }
        document = ((Document) (f1.process(document)));
        if (document == null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        return (String)document;
        i++;
          goto _L3
_L2:
        document = null;
          goto _L4
    }

    static String a(Node node)
    {
        if (node != null && node.getFirstChild() != null && node.getFirstChild().getNodeValue() != null)
        {
            return node.getFirstChild().getNodeValue().trim();
        } else
        {
            return null;
        }
    }

    static List a(Document document, String s, String s1, String s2)
    {
        return a(document, s, s1, s2, ((NodeProcessor) (new g())));
    }

    private static List a(Document document, String s, String s1, String s2, NodeProcessor nodeprocessor)
    {
        int i = 0;
        ArrayList arraylist = new ArrayList();
        if (document == null)
        {
            return arraylist;
        }
        s = document.getElementsByTagName(s);
        if (s == null)
        {
            return arraylist;
        }
        if (s2 == null)
        {
            document = null;
        } else
        {
            document = Arrays.asList(new String[] {
                s2
            });
        }
        for (; i < s.getLength(); i++)
        {
            s2 = s.item(i);
            if (s2 == null || !a(((Node) (s2)), s1, ((List) (document))))
            {
                continue;
            }
            s2 = ((String) (nodeprocessor.process(s2)));
            if (s2 != null)
            {
                arraylist.add(s2);
            }
        }

        return arraylist;
    }

    static List a(Node node, String s, String s1, List list)
    {
        if (node == null || s == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        node = node.getChildNodes();
        for (int i = 0; i < node.getLength(); i++)
        {
            Node node1 = node.item(i);
            if (node1.getNodeName().equals(s) && a(node1, s1, list))
            {
                arraylist.add(node1);
            }
        }

        return arraylist;
    }

    static Node a(Node node, String s)
    {
        if (node != null)
        {
            if ((node = a(node, s, null, ((List) (null)))) != null && !node.isEmpty())
            {
                return (Node)node.get(0);
            }
        }
        return null;
    }

    private static boolean a(Node node, String s, List list)
    {
        if (s != null && list != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        node = node.getAttributes();
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        node = node.getNamedItem(s);
        if (node != null && list.contains(node.getNodeValue())) goto _L1; else goto _L3
_L3:
        return false;
    }

    static Integer b(Node node, String s)
    {
        if (node == null)
        {
            return null;
        }
        int i;
        try
        {
            i = Integer.parseInt(c(node, s));
        }
        // Misplaced declaration of an exception variable
        catch (Node node)
        {
            return null;
        }
        return Integer.valueOf(i);
    }

    static List b(Document document, String s, String s1, String s2)
    {
        return a(document, s, s1, s2, new h());
    }

    static String c(Node node, String s)
    {
        if (node != null && s != null)
        {
            if ((node = node.getAttributes().getNamedItem(s)) != null)
            {
                return node.getNodeValue();
            }
        }
        return null;
    }

    private class NodeProcessor
    {

        public abstract Object process(Node node);
    }

}
