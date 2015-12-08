// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

public class f
{

    private Element a;

    public f(InputStream inputstream)
        throws SAXException
    {
        DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
        try
        {
            a = documentbuilderfactory.newDocumentBuilder().parse(inputstream).getDocumentElement();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new SAXException(inputstream);
        }
    }

    private String a(Element element, int i)
    {
        XmlSerializer xmlserializer;
        StringWriter stringwriter;
        try
        {
            xmlserializer = Xml.newSerializer();
            stringwriter = new StringWriter();
            xmlserializer.setOutput(stringwriter);
            xmlserializer.startDocument("utf-8", null);
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            element.printStackTrace();
            return null;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        element = new char[i];
        Arrays.fill(element, ' ');
        element = new String(element);
_L1:
        a(a, xmlserializer, 0, ((String) (element)));
        xmlserializer.endDocument();
        element = stringwriter.toString();
        return element;
        element = null;
          goto _L1
    }

    private String a(Node node)
    {
        Object obj = null;
        node.getNodeType();
        JVM INSTR tableswitch 3 4: default 32
    //                   3 45
    //                   4 66;
           goto _L1 _L2 _L3
_L1:
        node = obj;
_L5:
        Object obj1 = node;
        if (node == null)
        {
            obj1 = "";
        }
        return ((String) (obj1));
_L2:
        String s = node.getNodeValue();
        node = s;
        if (s != null)
        {
            node = s.trim();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        node = node.getNodeValue();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(Element element, XmlSerializer xmlserializer, int i, String s)
        throws Exception
    {
        String s1;
        int k;
        k = 0;
        s1 = element.getTagName();
        a(xmlserializer, i, s);
        xmlserializer.startTag("", s1);
        if (!element.hasAttributes()) goto _L2; else goto _L1
_L1:
        Object obj;
        int j;
        obj = element.getAttributes();
        j = 0;
_L8:
        if (j < ((NamedNodeMap) (obj)).getLength()) goto _L3; else goto _L2
_L2:
        if (!element.hasChildNodes()) goto _L5; else goto _L4
_L4:
        element = element.getChildNodes();
        j = 0;
_L13:
        if (k < element.getLength()) goto _L7; else goto _L6
_L6:
        if (j > 0)
        {
            a(xmlserializer, i, s);
        }
_L5:
        xmlserializer.endTag("", s1);
        return;
_L3:
        Attr attr = (Attr)((NamedNodeMap) (obj)).item(j);
        xmlserializer.attribute("", attr.getName(), attr.getValue());
        j++;
          goto _L8
_L7:
        obj = element.item(k);
        ((Node) (obj)).getNodeType();
        JVM INSTR tableswitch 1 4: default 212
    //                   1 221
    //                   2 212
    //                   3 245
    //                   4 261;
           goto _L9 _L10 _L9 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_261;
_L14:
        k++;
          goto _L13
_L10:
        a((Element)obj, xmlserializer, i + 1, s);
        j++;
          goto _L14
_L11:
        xmlserializer.text(a(((Node) (obj))));
          goto _L14
        xmlserializer.cdsect(a(((Node) (obj))));
          goto _L14
    }

    private void a(XmlSerializer xmlserializer, int i, String s)
        throws Exception
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int j;
        xmlserializer.text("\n");
        j = 0;
_L5:
        if (j < i) goto _L3; else goto _L2
_L2:
        return;
_L3:
        xmlserializer.text(s);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String a(int i)
    {
        return a(a, i);
    }

    public String toString()
    {
        return a(0);
    }
}
