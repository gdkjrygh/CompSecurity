// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.xml;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.util.XmlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XCardElement
{

    private final Document document;
    private final Element element;
    private final String namespace;
    private final VCardVersion version;

    public XCardElement(String s)
    {
        this(s, VCardVersion.V4_0);
    }

    public XCardElement(String s, VCardVersion vcardversion)
    {
        version = vcardversion;
        namespace = vcardversion.getXmlNamespace();
        document = XmlUtils.createDocument();
        element = document.createElementNS(namespace, s);
        document.appendChild(element);
    }

    public XCardElement(Element element1)
    {
        this(element1, VCardVersion.V4_0);
    }

    public XCardElement(Element element1, VCardVersion vcardversion)
    {
        document = element1.getOwnerDocument();
        element = element1;
        version = vcardversion;
        namespace = vcardversion.getXmlNamespace();
    }

    private List children()
    {
        return XmlUtils.toElementList(element.getChildNodes());
    }

    private String toLocalName(VCardDataType vcarddatatype)
    {
        if (vcarddatatype == null)
        {
            return "unknown";
        } else
        {
            return vcarddatatype.getName().toLowerCase();
        }
    }

    public List all(VCardDataType vcarddatatype)
    {
        return all(toLocalName(vcarddatatype));
    }

    public List all(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = children().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Element element1 = (Element)iterator.next();
            if (s.equals(element1.getLocalName()) && namespace.equals(element1.getNamespaceURI()) && element1.getTextContent().length() > 0)
            {
                arraylist.add(element1.getTextContent());
            }
        } while (true);
        return arraylist;
    }

    public List append(String s, Collection collection)
    {
        if (!collection.isEmpty()) goto _L2; else goto _L1
_L1:
        collection = Arrays.asList(new Element[] {
            append(s, (String)null)
        });
_L4:
        return collection;
_L2:
        ArrayList arraylist = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        do
        {
            collection = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(append(s, (String)iterator.next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Element append(VCardDataType vcarddatatype, String s)
    {
        return append(toLocalName(vcarddatatype), s);
    }

    public Element append(String s, String s1)
    {
        s = document.createElementNS(namespace, s);
        s.setTextContent(s1);
        element.appendChild(s);
        return s;
    }

    public Document document()
    {
        return document;
    }

    public Element element()
    {
        return element;
    }

    public transient String first(VCardDataType avcarddatatype[])
    {
        String as[] = new String[avcarddatatype.length];
        for (int i = 0; i < avcarddatatype.length; i++)
        {
            as[i] = toLocalName(avcarddatatype[i]);
        }

        return first(as);
    }

    public transient String first(String as[])
    {
        as = Arrays.asList(as);
        for (Iterator iterator = children().iterator(); iterator.hasNext();)
        {
            Element element1 = (Element)iterator.next();
            if (as.contains(element1.getLocalName()) && namespace.equals(element1.getNamespaceURI()))
            {
                return element1.getTextContent();
            }
        }

        return null;
    }

    public VCardVersion version()
    {
        return version;
    }
}
