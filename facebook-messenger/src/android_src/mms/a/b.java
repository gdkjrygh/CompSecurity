// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.a;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

// Referenced classes of package android_src.mms.a:
//            e, a

public abstract class b extends e
    implements Document
{

    public b()
    {
        super(null);
    }

    public Node adoptNode(Node node)
    {
        throw new DOMException((short)9, null);
    }

    public Attr createAttribute(String s)
    {
        return new a(this, s);
    }

    public Attr createAttributeNS(String s, String s1)
    {
        return null;
    }

    public CDATASection createCDATASection(String s)
    {
        return null;
    }

    public Comment createComment(String s)
    {
        return null;
    }

    public DocumentFragment createDocumentFragment()
    {
        return null;
    }

    public Element createElementNS(String s, String s1)
    {
        return null;
    }

    public EntityReference createEntityReference(String s)
    {
        return null;
    }

    public ProcessingInstruction createProcessingInstruction(String s, String s1)
    {
        return null;
    }

    public Text createTextNode(String s)
    {
        return null;
    }

    public DocumentType getDoctype()
    {
        return null;
    }

    public String getDocumentURI()
    {
        return null;
    }

    public DOMConfiguration getDomConfig()
    {
        throw new DOMException((short)9, null);
    }

    public Element getElementById(String s)
    {
        return null;
    }

    public NodeList getElementsByTagName(String s)
    {
        return null;
    }

    public NodeList getElementsByTagNameNS(String s, String s1)
    {
        return null;
    }

    public DOMImplementation getImplementation()
    {
        return null;
    }

    public String getInputEncoding()
    {
        return null;
    }

    public String getNodeName()
    {
        return "#document";
    }

    public short getNodeType()
    {
        return 9;
    }

    public boolean getStrictErrorChecking()
    {
        return true;
    }

    public String getXmlEncoding()
    {
        return null;
    }

    public boolean getXmlStandalone()
    {
        return false;
    }

    public String getXmlVersion()
    {
        return null;
    }

    public Node importNode(Node node, boolean flag)
    {
        return null;
    }

    public void normalizeDocument()
    {
        throw new DOMException((short)9, null);
    }

    public Node renameNode(Node node, String s, String s1)
    {
        throw new DOMException((short)9, null);
    }

    public void setDocumentURI(String s)
    {
    }

    public void setStrictErrorChecking(boolean flag)
    {
    }

    public void setXmlStandalone(boolean flag)
    {
    }

    public void setXmlVersion(String s)
    {
    }
}
