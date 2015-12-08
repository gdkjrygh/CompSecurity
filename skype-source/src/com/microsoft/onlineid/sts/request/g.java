// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class g
{

    public static Element a(String s)
        throws SAXException
    {
        try
        {
            s = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(s))).getDocumentElement();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static Element a(Node node, String s)
    {
        s = node.getOwnerDocument().createElement(s);
        node.appendChild(s);
        return s;
    }

    public static Element a(Node node, String s, String s1)
    {
        node = a(node, s);
        node.setTextContent(s1);
        return node;
    }
}
