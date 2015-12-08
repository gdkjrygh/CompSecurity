// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelXMLElement

public class AdMarvelXMLReader extends DefaultHandler
{

    private AdMarvelXMLElement parsedXMLData;
    private Stack parsingStack;

    public AdMarvelXMLReader()
    {
        parsedXMLData = null;
        parsingStack = null;
    }

    private static String chkAndReplace(String s, String s1, String s2)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        s = new StringBuffer(s);
_L5:
        int i = 0;
_L6:
        i = s.toString().indexOf(s1, i);
        if (i != -1) goto _L4; else goto _L3
_L3:
        if (s == null)
        {
            return null;
        } else
        {
            return s.toString();
        }
_L2:
        s = new StringBuffer("");
          goto _L5
        s1;
        s = null;
_L7:
        s1.printStackTrace();
          goto _L3
_L4:
        s.replace(i, s1.length() + i, s2);
        i++;
          goto _L6
        s1;
          goto _L7
    }

    static String xmlDecode(String s)
    {
        if (s != null)
        {
            return chkAndReplace(chkAndReplace(chkAndReplace(chkAndReplace(s, "&amp;", "&"), "&quot;", "\""), "&gt;", ">"), "&lt;", "<");
        } else
        {
            return null;
        }
    }

    static String xmlEncode(String s)
    {
        if (s != null)
        {
            return chkAndReplace(chkAndReplace(chkAndReplace(chkAndReplace(s, "&", "&amp;"), "\"", "&quot;"), "<", "&lt;"), ">", "&gt;");
        } else
        {
            return null;
        }
    }

    public void characters(char ac[], int i, int j)
    {
        ac = (new String(ac)).substring(i, i + j);
        ((AdMarvelXMLElement)parsingStack.peek()).appendData(ac);
    }

    public void endElement(String s, String s1, String s2)
        throws SAXException
    {
        parsingStack.pop();
    }

    public AdMarvelXMLElement getParsedXMLData()
    {
        return parsedXMLData;
    }

    public void parseXMLString(String s)
        throws ParserConfigurationException, SAXException, IOException
    {
        parsingStack = new Stack();
        XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        xmlreader.setContentHandler(this);
        xmlreader.parse(new InputSource(new StringReader(s)));
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
    {
        s = new LinkedHashMap();
        if (attributes == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = attributes.getLength();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        attributes = new AdMarvelXMLElement(s1, s);
        if (parsingStack.empty())
        {
            parsedXMLData = attributes;
        } else
        {
            AdMarvelXMLElement admarvelxmlelement = (AdMarvelXMLElement)parsingStack.peek();
            s2 = (ArrayList)admarvelxmlelement.getChildren().get(s1);
            s = s2;
            if (s2 == null)
            {
                s = new ArrayList();
                admarvelxmlelement.getChildren().put(s1, s);
            }
            s.add(attributes);
        }
        parsingStack.push(attributes);
        return;
_L3:
        s.put(attributes.getLocalName(i), attributes.getValue(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
