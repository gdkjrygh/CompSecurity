// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.XmlUtils;
import java.util.EnumSet;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard.property:
//            SimpleProperty, HasAltId

public class Xml extends SimpleProperty
    implements HasAltId
{

    public Xml(String s)
        throws SAXException
    {
        this(XmlUtils.toDocument(s));
    }

    public Xml(Document document)
    {
        super(document);
    }

    public Xml(Element element)
    {
        this(detachElement(element));
    }

    private static Document detachElement(Element element)
    {
        Document document = XmlUtils.createDocument();
        document.appendChild(document.importNode(element, true));
        return document;
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }
}
