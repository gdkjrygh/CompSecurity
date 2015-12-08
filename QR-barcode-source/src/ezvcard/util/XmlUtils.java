// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlUtils
{

    private XmlUtils()
    {
    }

    public static Document createDocument()
    {
        Object obj;
        try
        {
            obj = DocumentBuilderFactory.newInstance();
            ((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
            obj = ((DocumentBuilderFactory) (obj)).newDocumentBuilder().newDocument();
        }
        catch (ParserConfigurationException parserconfigurationexception)
        {
            throw new RuntimeException(parserconfigurationexception);
        }
        return ((Document) (obj));
    }

    public static Element getFirstChildElement(Element element)
    {
        return getFirstChildElement(((Node) (element)));
    }

    private static Element getFirstChildElement(Node node)
    {
        node = node.getChildNodes();
        for (int i = 0; i < node.getLength(); i++)
        {
            Node node1 = node.item(i);
            if (node1 instanceof Element)
            {
                return (Element)node1;
            }
        }

        return null;
    }

    public static Element getRootElement(Document document)
    {
        return getFirstChildElement(document);
    }

    public static Document toDocument(InputStream inputstream)
        throws SAXException, IOException
    {
        return toDocument(new InputSource(inputstream));
    }

    public static Document toDocument(Reader reader)
        throws SAXException, IOException
    {
        return toDocument(new InputSource(reader));
    }

    public static Document toDocument(String s)
        throws SAXException
    {
        try
        {
            s = toDocument(((Reader) (new StringReader(s))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    private static Document toDocument(InputSource inputsource)
        throws SAXException, IOException
    {
        try
        {
            DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
            documentbuilderfactory.setNamespaceAware(true);
            documentbuilderfactory.setIgnoringComments(true);
            inputsource = documentbuilderfactory.newDocumentBuilder().parse(inputsource);
        }
        // Misplaced declaration of an exception variable
        catch (InputSource inputsource)
        {
            throw new RuntimeException(inputsource);
        }
        return inputsource;
    }

    public static List toElementList(NodeList nodelist)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < nodelist.getLength(); i++)
        {
            Node node = nodelist.item(i);
            if (node instanceof Element)
            {
                arraylist.add((Element)node);
            }
        }

        return arraylist;
    }

    public static String toString(Node node)
    {
        return toString(node, ((Map) (new HashMap())));
    }

    public static String toString(Node node, Map map)
    {
        try
        {
            StringWriter stringwriter = new StringWriter();
            toWriter(node, stringwriter, map);
            node = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Node node)
        {
            throw new RuntimeException(node);
        }
        return node;
    }

    public static void toWriter(Node node, Writer writer)
        throws TransformerException
    {
        toWriter(node, writer, ((Map) (new HashMap())));
    }

    public static void toWriter(Node node, Writer writer, Map map)
        throws TransformerException
    {
        Transformer transformer;
        transformer = TransformerFactory.newInstance().newTransformer();
        map = map.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        if (!map.hasNext())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        entry = (java.util.Map.Entry)map.next();
        try
        {
            transformer.setOutputProperty((String)entry.getKey(), (String)entry.getValue());
        }
        catch (IllegalArgumentException illegalargumentexception) { }
          goto _L1
        try
        {
            transformer.transform(new DOMSource(node), new StreamResult(writer));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Node node)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Node node)
        {
            return;
        }
    }
}
