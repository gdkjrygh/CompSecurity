// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import ezvcard.property.Xml;
import ezvcard.util.XmlUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class XmlScribe extends VCardPropertyScribe
{

    public XmlScribe()
    {
        super(ezvcard/property/Xml, "XML");
    }

    private String valueToString(Document document)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("omit-xml-declaration", "yes");
        return XmlUtils.toString(document, hashmap);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Xml _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        try
        {
            vcarddatatype = jcardvalue.asSingle();
        }
        // Misplaced declaration of an exception variable
        catch (VCardDataType vcarddatatype)
        {
            throw new CannotParseException((new StringBuilder()).append("Cannot parse value as XML: ").append(jcardvalue).toString());
        }
        if (vcarddatatype != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        return new Xml((Document)null);
        vcarddatatype = new Xml(vcarddatatype);
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Xml _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        s = unescape(s);
        try
        {
            vcarddatatype = new Xml(s);
        }
        // Misplaced declaration of an exception variable
        catch (VCardDataType vcarddatatype)
        {
            throw new CannotParseException((new StringBuilder()).append("Cannot parse value as XML: ").append(s).toString());
        }
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected Xml _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = new Xml(xcardelement.element());
        vcardparameters = XmlUtils.getRootElement((Document)xcardelement.getValue());
        list = XmlUtils.toElementList(vcardparameters.getChildNodes()).iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Element element = (Element)list.next();
            if ("parameters".equals(element.getLocalName()) && VCardVersion.V4_0.getXmlNamespace().equals(element.getNamespaceURI()))
            {
                vcardparameters.removeChild(element);
            }
        } while (true);
        return xcardelement;
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Xml)vcardproperty);
    }

    protected JCardValue _writeJson(Xml xml)
    {
        Object obj = null;
        Document document = (Document)xml.getValue();
        xml = obj;
        if (document != null)
        {
            xml = valueToString(document);
        }
        return JCardValue.single(xml);
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Xml)vcardproperty, vcardversion);
    }

    protected String _writeText(Xml xml, VCardVersion vcardversion)
    {
        xml = (Document)xml.getValue();
        if (xml == null)
        {
            return "";
        } else
        {
            return escape(valueToString(xml));
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Xml)vcardproperty, xcardelement);
    }

    protected void _writeXml(Xml xml, XCardElement xcardelement)
    {
        super._writeXml(xml, xcardelement);
    }
}
