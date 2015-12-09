// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class XmlDomUtils
{

    private XmlDomUtils()
    {
    }

    public static Document createDocument(String s)
        throws IOException, ParserConfigurationException, SAXException
    {
        DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource inputsource = new InputSource();
        inputsource.setCharacterStream(new StringReader(s));
        return documentbuilder.parse(inputsource);
    }

    public static boolean getBooleanAttribute(Element element, String s)
    {
        for (element = element.getAttribute(s); element == null || !element.equalsIgnoreCase("true");)
        {
            return false;
        }

        return true;
    }

    public static Element getChildElementByTagName(Element element, String s)
    {
        element = element.getChildNodes();
        int j = element.getLength();
        for (int i = 0; i < j; i++)
        {
            if (element.item(i).getNodeType() == 1 && s.equals(element.item(i).getNodeName()))
            {
                return (Element)element.item(i);
            }
        }

        return null;
    }

    public static int getChildElementCountByTagName(Element element, String s)
    {
        element = element.getChildNodes();
        int l = element.getLength();
        int j = 0;
        for (int i = 0; i < l;)
        {
            int k = j;
            if (element.item(i).getNodeType() == 1)
            {
                k = j;
                if (s.equals(element.item(i).getNodeName()))
                {
                    k = j + 1;
                }
            }
            i++;
            j = k;
        }

        return j;
    }

    public static Element[] getChildElementsByTagName(Element element, String s)
    {
        ArrayList arraylist = new ArrayList();
        element = element.getChildNodes();
        int j = element.getLength();
        for (int i = 0; i < j; i++)
        {
            if (element.item(i).getNodeType() == 1 && s.equals(element.item(i).getNodeName()))
            {
                arraylist.add(element.item(i));
            }
        }

        return (Element[])arraylist.toArray(new Element[arraylist.size()]);
    }

    public static String getChildValueByTagName(Element element, String s)
    {
        element = getChildElementByTagName(element, s);
        if (element != null)
        {
            return getElementText(element);
        } else
        {
            return null;
        }
    }

    public static String getElementText(Element element)
    {
        element = element.getChildNodes();
        int j = element.getLength();
        for (int i = 0; i < j; i++)
        {
            if (element.item(i) instanceof Text)
            {
                return ((Text)element.item(i)).getData();
            }
        }

        return null;
    }

    public static Element getFirstFoundElementByTagName(Element element, String s)
    {
        element = element.getElementsByTagName(s);
        int j = element.getLength();
        for (int i = 0; i < j; i++)
        {
            if (element.item(i).getNodeType() == 1)
            {
                return (Element)element.item(i);
            }
        }

        return null;
    }

    public static String getFirstFoundElementValueByTagName(Element element, String s)
    {
        element = getFirstFoundElementByTagName(element, s);
        if (element != null)
        {
            return getElementText(element);
        } else
        {
            return null;
        }
    }
}
