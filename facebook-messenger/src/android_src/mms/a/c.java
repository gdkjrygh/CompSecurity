// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;

// Referenced classes of package android_src.mms.a:
//            e, d, f, b

public class c extends e
    implements Element
{

    private String b;
    private NamedNodeMap c;

    protected c(b b1, String s)
    {
        super(b1);
        c = new d();
        b = s;
    }

    public String getAttribute(String s)
    {
        Attr attr = getAttributeNode(s);
        s = "";
        if (attr != null)
        {
            s = attr.getValue();
        }
        return s;
    }

    public String getAttributeNS(String s, String s1)
    {
        return null;
    }

    public Attr getAttributeNode(String s)
    {
        return (Attr)c.getNamedItem(s);
    }

    public Attr getAttributeNodeNS(String s, String s1)
    {
        return null;
    }

    public NamedNodeMap getAttributes()
    {
        return c;
    }

    public NodeList getElementsByTagName(String s)
    {
        return new f(this, s, true);
    }

    public NodeList getElementsByTagNameNS(String s, String s1)
    {
        return null;
    }

    public String getNodeName()
    {
        return b;
    }

    public short getNodeType()
    {
        return 1;
    }

    public TypeInfo getSchemaTypeInfo()
    {
        return null;
    }

    public String getTagName()
    {
        return b;
    }

    public boolean hasAttribute(String s)
    {
        return getAttributeNode(s) != null;
    }

    public boolean hasAttributeNS(String s, String s1)
    {
        return false;
    }

    public boolean hasAttributes()
    {
        return c.getLength() > 0;
    }

    public void removeAttribute(String s)
    {
    }

    public void removeAttributeNS(String s, String s1)
    {
    }

    public Attr removeAttributeNode(Attr attr)
    {
        return null;
    }

    public void setAttribute(String s, String s1)
    {
        Attr attr1 = getAttributeNode(s);
        Attr attr = attr1;
        if (attr1 == null)
        {
            attr = a.createAttribute(s);
        }
        attr.setNodeValue(s1);
        c.setNamedItem(attr);
    }

    public void setAttributeNS(String s, String s1, String s2)
    {
    }

    public Attr setAttributeNode(Attr attr)
    {
        return null;
    }

    public Attr setAttributeNodeNS(Attr attr)
    {
        return null;
    }

    public void setIdAttribute(String s, boolean flag)
    {
        throw new DOMException((short)9, null);
    }

    public void setIdAttributeNS(String s, String s1, boolean flag)
    {
        throw new DOMException((short)9, null);
    }

    public void setIdAttributeNode(Attr attr, boolean flag)
    {
        throw new DOMException((short)9, null);
    }
}
