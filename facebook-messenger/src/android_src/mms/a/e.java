// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import java.util.NoSuchElementException;
import java.util.Vector;
import org.a.a.a.a;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

// Referenced classes of package android_src.mms.a:
//            f, b

public abstract class e
    implements a, Node
{

    b a;
    private Node b;
    private final Vector c = new Vector();
    private final a d = new android_src.mms.a.a.a(this);

    protected e(b b1)
    {
        a = b1;
    }

    private void a(Node node)
    {
        b = node;
    }

    public Node appendChild(Node node)
    {
        ((e)node).a(this);
        c.remove(node);
        c.add(node);
        return node;
    }

    public Node cloneNode(boolean flag)
    {
        return null;
    }

    public short compareDocumentPosition(Node node)
    {
        throw new DOMException((short)9, null);
    }

    public NamedNodeMap getAttributes()
    {
        return null;
    }

    public String getBaseURI()
    {
        return null;
    }

    public NodeList getChildNodes()
    {
        return new f(this, null, false);
    }

    public Object getFeature(String s, String s1)
    {
        return null;
    }

    public Node getFirstChild()
    {
        Node node;
        try
        {
            node = (Node)c.firstElement();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            return null;
        }
        return node;
    }

    public Node getLastChild()
    {
        Node node;
        try
        {
            node = (Node)c.lastElement();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            return null;
        }
        return node;
    }

    public String getLocalName()
    {
        return null;
    }

    public String getNamespaceURI()
    {
        return null;
    }

    public Node getNextSibling()
    {
        if (b != null && this != b.getLastChild())
        {
            Vector vector = ((e)b).c;
            return (Node)vector.elementAt(vector.indexOf(this) + 1);
        } else
        {
            return null;
        }
    }

    public String getNodeValue()
    {
        return null;
    }

    public Document getOwnerDocument()
    {
        return a;
    }

    public Node getParentNode()
    {
        return b;
    }

    public String getPrefix()
    {
        return null;
    }

    public Node getPreviousSibling()
    {
        if (b != null && this != b.getFirstChild())
        {
            Vector vector = ((e)b).c;
            return (Node)vector.elementAt(vector.indexOf(this) - 1);
        } else
        {
            return null;
        }
    }

    public String getTextContent()
    {
        throw new DOMException((short)9, null);
    }

    public Object getUserData(String s)
    {
        return null;
    }

    public boolean hasAttributes()
    {
        return false;
    }

    public boolean hasChildNodes()
    {
        return !c.isEmpty();
    }

    public Node insertBefore(Node node, Node node1)
    {
        return null;
    }

    public boolean isDefaultNamespace(String s)
    {
        throw new DOMException((short)9, null);
    }

    public boolean isEqualNode(Node node)
    {
        throw new DOMException((short)9, null);
    }

    public boolean isSameNode(Node node)
    {
        throw new DOMException((short)9, null);
    }

    public boolean isSupported(String s, String s1)
    {
        return false;
    }

    public String lookupNamespaceURI(String s)
    {
        return null;
    }

    public String lookupPrefix(String s)
    {
        return null;
    }

    public void normalize()
    {
    }

    public Node removeChild(Node node)
    {
        if (c.contains(node))
        {
            c.remove(node);
            ((e)node).a(null);
            return null;
        } else
        {
            throw new DOMException((short)8, "Child does not exist");
        }
    }

    public Node replaceChild(Node node, Node node1)
    {
        if (c.contains(node1))
        {
            try
            {
                c.remove(node);
            }
            catch (DOMException domexception) { }
            c.setElementAt(node, c.indexOf(node1));
            ((e)node).a(this);
            ((e)node1).a(null);
            return node1;
        } else
        {
            throw new DOMException((short)8, "Old child does not exist");
        }
    }

    public void setNodeValue(String s)
    {
    }

    public void setPrefix(String s)
    {
    }

    public void setTextContent(String s)
    {
        throw new DOMException((short)9, null);
    }

    public Object setUserData(String s, Object obj, UserDataHandler userdatahandler)
    {
        throw new DOMException((short)9, null);
    }
}
