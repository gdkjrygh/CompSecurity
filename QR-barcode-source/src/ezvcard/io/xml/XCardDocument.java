// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.xml;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.scribe.ScribeIndex;
import ezvcard.io.scribe.VCardPropertyScribe;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.ProductId;
import ezvcard.property.VCardProperty;
import ezvcard.property.Xml;
import ezvcard.util.IOUtils;
import ezvcard.util.ListMultimap;
import ezvcard.util.StringUtils;
import ezvcard.util.XmlUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// Referenced classes of package ezvcard.io.xml:
//            XCardNamespaceContext

public class XCardDocument
{

    private static final XCardNamespaceContext nsContext;
    private static final VCardVersion version4;
    private boolean addProdId;
    private Document document;
    private ScribeIndex index;
    private final Map parameterDataTypes;
    private final List parseWarnings;
    private Element root;
    private boolean versionStrict;

    public XCardDocument()
    {
        parameterDataTypes = new HashMap();
        registerParameterDataType("ALTID", VCardDataType.TEXT);
        registerParameterDataType("CALSCALE", VCardDataType.TEXT);
        registerParameterDataType("GEO", VCardDataType.URI);
        registerParameterDataType("LABEL", VCardDataType.TEXT);
        registerParameterDataType("LANGUAGE", VCardDataType.LANGUAGE_TAG);
        registerParameterDataType("MEDIATYPE", VCardDataType.TEXT);
        registerParameterDataType("PID", VCardDataType.TEXT);
        registerParameterDataType("PREF", VCardDataType.INTEGER);
        registerParameterDataType("SORT-AS", VCardDataType.TEXT);
        registerParameterDataType("TYPE", VCardDataType.TEXT);
        registerParameterDataType("TZ", VCardDataType.URI);
        index = new ScribeIndex();
        addProdId = true;
        versionStrict = true;
        parseWarnings = new ArrayList();
        document = XmlUtils.createDocument();
        root = createElement("vcards");
        document.appendChild(root);
    }

    public XCardDocument(File file)
        throws SAXException, IOException
    {
        parameterDataTypes = new HashMap();
        registerParameterDataType("ALTID", VCardDataType.TEXT);
        registerParameterDataType("CALSCALE", VCardDataType.TEXT);
        registerParameterDataType("GEO", VCardDataType.URI);
        registerParameterDataType("LABEL", VCardDataType.TEXT);
        registerParameterDataType("LANGUAGE", VCardDataType.LANGUAGE_TAG);
        registerParameterDataType("MEDIATYPE", VCardDataType.TEXT);
        registerParameterDataType("PID", VCardDataType.TEXT);
        registerParameterDataType("PREF", VCardDataType.INTEGER);
        registerParameterDataType("SORT-AS", VCardDataType.TEXT);
        registerParameterDataType("TYPE", VCardDataType.TEXT);
        registerParameterDataType("TZ", VCardDataType.URI);
        index = new ScribeIndex();
        addProdId = true;
        versionStrict = true;
        parseWarnings = new ArrayList();
        file = new FileInputStream(file);
        init(XmlUtils.toDocument(file));
        IOUtils.closeQuietly(file);
        return;
        Exception exception;
        exception;
        IOUtils.closeQuietly(file);
        throw exception;
    }

    public XCardDocument(InputStream inputstream)
        throws SAXException, IOException
    {
        this(XmlUtils.toDocument(inputstream));
    }

    public XCardDocument(Reader reader)
        throws SAXException, IOException
    {
        this(XmlUtils.toDocument(reader));
    }

    public XCardDocument(String s)
        throws SAXException
    {
        this(XmlUtils.toDocument(s));
    }

    public XCardDocument(Document document1)
    {
        parameterDataTypes = new HashMap();
        registerParameterDataType("ALTID", VCardDataType.TEXT);
        registerParameterDataType("CALSCALE", VCardDataType.TEXT);
        registerParameterDataType("GEO", VCardDataType.URI);
        registerParameterDataType("LABEL", VCardDataType.TEXT);
        registerParameterDataType("LANGUAGE", VCardDataType.LANGUAGE_TAG);
        registerParameterDataType("MEDIATYPE", VCardDataType.TEXT);
        registerParameterDataType("PID", VCardDataType.TEXT);
        registerParameterDataType("PREF", VCardDataType.INTEGER);
        registerParameterDataType("SORT-AS", VCardDataType.TEXT);
        registerParameterDataType("TYPE", VCardDataType.TEXT);
        registerParameterDataType("TZ", VCardDataType.URI);
        index = new ScribeIndex();
        addProdId = true;
        versionStrict = true;
        parseWarnings = new ArrayList();
        init(document1);
    }

    private void addWarning(String s, String s1, List list)
    {
        list.add((new StringBuilder()).append(s1).append(" property: ").append(s).toString());
    }

    private Element createElement(String s)
    {
        return createElement(s, version4.getXmlNamespace());
    }

    private Element createElement(String s, String s1)
    {
        return document.createElementNS(s1, s);
    }

    private List getChildElements(Element element, String s)
    {
        ArrayList arraylist = new ArrayList();
        element = XmlUtils.toElementList(element.getChildNodes()).iterator();
        do
        {
            if (!element.hasNext())
            {
                break;
            }
            Element element1 = (Element)element.next();
            if (s.equals(element1.getLocalName()) && version4.getXmlNamespace().equals(element1.getNamespaceURI()))
            {
                arraylist.add(element1);
            }
        } while (true);
        return arraylist;
    }

    private List getVCardElements()
    {
        return getChildElements(root, "vcard");
    }

    private void init(Document document1)
    {
        XPath xpath = XPathFactory.newInstance().newXPath();
        xpath.setNamespaceContext(nsContext);
        try
        {
            String s = nsContext.getPrefix();
            root = (Element)xpath.evaluate((new StringBuilder()).append("//").append(s).append(":vcards").toString(), document1, XPathConstants.NODE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Document document1)
        {
            return;
        }
    }

    private Element marshalSubTypes(VCardParameters vcardparameters)
    {
        Element element = createElement("parameters");
        Element element1;
        for (Iterator iterator = vcardparameters.iterator(); iterator.hasNext(); element.appendChild(element1))
        {
            vcardparameters = (java.util.Map.Entry)iterator.next();
            String s = ((String)vcardparameters.getKey()).toLowerCase();
            element1 = createElement(s);
            Iterator iterator1 = ((List)vcardparameters.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                vcardparameters = (VCardDataType)parameterDataTypes.get(s);
                if (vcardparameters == null)
                {
                    vcardparameters = "unknown";
                } else
                {
                    vcardparameters = vcardparameters.getName().toLowerCase();
                }
                vcardparameters = createElement(vcardparameters);
                vcardparameters.setTextContent(s1);
                element1.appendChild(vcardparameters);
            }
        }

        return element;
    }

    private Element marshalType(VCardProperty vcardproperty, VCard vcard)
    {
        VCardPropertyScribe vcardpropertyscribe = index.getPropertyScribe(vcardproperty);
        if (vcardpropertyscribe == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No marshaller found for property class \"").append(vcardproperty.getClass().getName()).append("\".").toString());
        }
        vcard = vcardpropertyscribe.prepareParameters(vcardproperty, version4, vcard);
        Object obj = vcardpropertyscribe.getQName();
        obj = createElement(((QName) (obj)).getLocalPart(), ((QName) (obj)).getNamespaceURI());
        if (!vcard.isEmpty())
        {
            ((Element) (obj)).appendChild(marshalSubTypes(vcard));
        }
        vcardpropertyscribe.writeXml(vcardproperty, ((Element) (obj)));
        return ((Element) (obj));
    }

    private void parseAndAddElement(Element element, String s, VCard vcard, List list)
    {
        Object obj;
        String s2;
        VCardParameters vcardparameters;
        vcardparameters = parseSubTypes(element);
        s2 = element.getLocalName();
        obj = element.getNamespaceURI();
        obj = index.getPropertyScribe(new QName(((String) (obj)), s2));
        VCardProperty vcardproperty;
        Iterator iterator;
        obj = ((VCardPropertyScribe) (obj)).parseXml(element, vcardparameters);
        vcardproperty = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getProperty();
        vcardproperty.setGroup(s);
        iterator = ((ezvcard.io.scribe.VCardPropertyScribe.Result) (obj)).getWarnings().iterator();
_L2:
        obj = vcardproperty;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        addWarning((String)iterator.next(), s2, list);
        if (true) goto _L2; else goto _L1
        element;
        addWarning((new StringBuilder()).append("Property has requested that it be skipped: ").append(element.getMessage()).toString(), s2, list);
        return;
        obj;
        String s1 = XmlUtils.toString(element);
        addWarning((new StringBuilder()).append("Property value could not be parsed.  It will be unmarshalled as a ").append(ezvcard/property/Xml.getSimpleName()).append(" property instead.").append(StringUtils.NEWLINE).append("  XML: ").append(s1).append(StringUtils.NEWLINE).append("  Reason: ").append(((CannotParseException) (obj)).getMessage()).toString(), s2, list);
        obj = index.getPropertyScribe(ezvcard/property/Xml).parseXml(element, vcardparameters).getProperty();
        ((VCardProperty) (obj)).setGroup(s);
_L1:
        vcard.addProperty(((VCardProperty) (obj)));
        return;
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        unsupportedoperationexception = index.getPropertyScribe(ezvcard/property/Xml).parseXml(element, vcardparameters).getProperty();
        unsupportedoperationexception.setGroup(s);
        addWarning((new StringBuilder()).append("Property class \"").append(unsupportedoperationexception.getClass().getName()).append("\" does not support xCard unmarshalling.  It will be unmarshalled as a ").append(ezvcard/property/Xml.getSimpleName()).append(" property instead.").toString(), s2, list);
        if (true) goto _L1; else goto _L3
_L3:
        element;
        addWarning("Property will not be unmarshalled because xCard does not supported embedded vCards.", s2, list);
        return;
    }

    private VCardParameters parseSubTypes(Element element)
    {
        VCardParameters vcardparameters = new VCardParameters();
        for (element = XmlUtils.toElementList(element.getElementsByTagNameNS(version4.getXmlNamespace(), "parameters")).iterator(); element.hasNext();)
        {
            Iterator iterator = XmlUtils.toElementList(((Element)element.next()).getChildNodes()).iterator();
            while (iterator.hasNext()) 
            {
                Element element1 = (Element)iterator.next();
                String s = element1.getLocalName().toUpperCase();
                List list = XmlUtils.toElementList(element1.getChildNodes());
                if (list.isEmpty())
                {
                    vcardparameters.put(s, element1.getTextContent());
                } else
                {
                    Iterator iterator1 = list.iterator();
                    while (iterator1.hasNext()) 
                    {
                        vcardparameters.put(s, ((Element)iterator1.next()).getTextContent());
                    }
                }
            }
        }

        return vcardparameters;
    }

    private VCard parseVCardElement(Element element, List list)
    {
        VCard vcard = new VCard();
        vcard.setVersion(version4);
        String s = version4.getXmlNamespace();
        for (Iterator iterator = XmlUtils.toElementList(element.getChildNodes()).iterator(); iterator.hasNext();)
        {
            Element element1 = (Element)iterator.next();
            if ("group".equals(element1.getLocalName()) && s.equals(element1.getNamespaceURI()))
            {
                Object obj = element1.getAttribute("name");
                element = ((Element) (obj));
                if (((String) (obj)).length() == 0)
                {
                    element = null;
                }
                obj = XmlUtils.toElementList(element1.getChildNodes()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    parseAndAddElement((Element)((Iterator) (obj)).next(), element, vcard, list);
                }
            } else
            {
                parseAndAddElement(element1, null, vcard, list);
            }
        }

        return vcard;
    }

    public void add(VCard vcard)
    {
        ListMultimap listmultimap = new ListMultimap();
        Iterator iterator = vcard.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            VCardProperty vcardproperty = (VCardProperty)iterator.next();
            if ((!addProdId || !(vcardproperty instanceof ProductId)) && (!versionStrict || vcardproperty.getSupportedVersions().contains(version4)))
            {
                if (index.getPropertyScribe(vcardproperty) == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No scribe found for property class \"").append(vcardproperty.getClass().getName()).append("\".").toString());
                }
                listmultimap.put(vcardproperty.getGroup(), vcardproperty);
            }
        } while (true);
        if (addProdId)
        {
            ProductId productid = new ProductId((new StringBuilder()).append("ez-vcard ").append(Ezvcard.VERSION).toString());
            listmultimap.put(productid.getGroup(), productid);
        }
        Element element1 = createElement("vcard");
        for (Iterator iterator1 = listmultimap.keySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (String)iterator1.next();
            Element element;
            if (obj != null)
            {
                element = createElement("group");
                element.setAttribute("name", ((String) (obj)));
                element1.appendChild(element);
            } else
            {
                element = element1;
            }
            obj = listmultimap.get(obj).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                VCardProperty vcardproperty1 = (VCardProperty)((Iterator) (obj)).next();
                try
                {
                    element.appendChild(marshalType(vcardproperty1, vcard));
                }
                catch (SkipMeException skipmeexception) { }
                catch (EmbeddedVCardException embeddedvcardexception) { }
            }
        }

        root.appendChild(element1);
    }

    public Document getDocument()
    {
        return document;
    }

    public List getParseWarnings()
    {
        return parseWarnings;
    }

    public ScribeIndex getScribeIndex()
    {
        return index;
    }

    public boolean isAddProdId()
    {
        return addProdId;
    }

    public boolean isVersionStrict()
    {
        return versionStrict;
    }

    public List parseAll()
    {
        parseWarnings.clear();
        if (root != null) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getVCardElements().iterator();
        do
        {
            obj = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (Element)iterator.next();
            ArrayList arraylist1 = new ArrayList();
            parseWarnings.add(arraylist1);
            arraylist.add(parseVCardElement(((Element) (obj)), arraylist1));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public VCard parseFirst()
    {
        parseWarnings.clear();
        List list;
        if (root != null)
        {
            if (!(list = getVCardElements()).isEmpty())
            {
                ArrayList arraylist = new ArrayList();
                parseWarnings.add(arraylist);
                return parseVCardElement((Element)list.get(0), arraylist);
            }
        }
        return null;
    }

    public void registerParameterDataType(String s, VCardDataType vcarddatatype)
    {
        s = s.toLowerCase();
        if (vcarddatatype == null)
        {
            parameterDataTypes.remove(s);
            return;
        } else
        {
            parameterDataTypes.put(s, vcarddatatype);
            return;
        }
    }

    public void registerScribe(VCardPropertyScribe vcardpropertyscribe)
    {
        index.register(vcardpropertyscribe);
    }

    public void setAddProdId(boolean flag)
    {
        addProdId = flag;
    }

    public void setScribeIndex(ScribeIndex scribeindex)
    {
        index = scribeindex;
    }

    public void setVersionStrict(boolean flag)
    {
        versionStrict = flag;
    }

    public String write()
    {
        return write(-1);
    }

    public String write(int i)
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            write(((Writer) (stringwriter)), i);
        }
        catch (TransformerException transformerexception) { }
        return stringwriter.toString();
    }

    public void write(File file)
        throws TransformerException, IOException
    {
        write(file, -1);
    }

    public void write(File file, int i)
        throws TransformerException, IOException
    {
        file = IOUtils.utf8Writer(file);
        write(((Writer) (file)), i);
        IOUtils.closeQuietly(file);
        return;
        Exception exception;
        exception;
        IOUtils.closeQuietly(file);
        throw exception;
    }

    public void write(OutputStream outputstream)
        throws TransformerException
    {
        write(outputstream, -1);
    }

    public void write(OutputStream outputstream, int i)
        throws TransformerException
    {
        write(IOUtils.utf8Writer(outputstream), i);
    }

    public void write(Writer writer)
        throws TransformerException
    {
        write(writer, -1);
    }

    public void write(Writer writer, int i)
        throws TransformerException
    {
        HashMap hashmap = new HashMap();
        if (i >= 0)
        {
            hashmap.put("indent", "yes");
            hashmap.put("{http://xml.apache.org/xslt}indent-amount", (new StringBuilder()).append(i).append("").toString());
        }
        XmlUtils.toWriter(document, writer, hashmap);
    }

    static 
    {
        version4 = VCardVersion.V4_0;
        nsContext = new XCardNamespaceContext(version4, "v");
    }
}
