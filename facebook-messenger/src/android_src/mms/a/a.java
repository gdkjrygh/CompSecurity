// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.TypeInfo;

// Referenced classes of package android_src.mms.a:
//            e, b

public class a extends e
    implements Attr
{

    private String b;
    private String c;

    protected a(b b1, String s)
    {
        super(b1);
        b = s;
    }

    public String getName()
    {
        return b;
    }

    public Node getNextSibling()
    {
        return null;
    }

    public String getNodeName()
    {
        return b;
    }

    public short getNodeType()
    {
        return 2;
    }

    public Element getOwnerElement()
    {
        return null;
    }

    public Node getParentNode()
    {
        return null;
    }

    public Node getPreviousSibling()
    {
        return null;
    }

    public TypeInfo getSchemaTypeInfo()
    {
        return null;
    }

    public boolean getSpecified()
    {
        return c != null;
    }

    public String getValue()
    {
        return c;
    }

    public boolean isId()
    {
        return false;
    }

    public void setNodeValue(String s)
    {
        setValue(s);
    }

    public void setValue(String s)
    {
        c = s;
    }
}
