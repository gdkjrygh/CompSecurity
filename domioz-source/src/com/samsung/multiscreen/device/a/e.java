// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.net.a.a.a;
import com.samsung.multiscreen.net.a.a.b;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class e
    implements Runnable
{

    private static final Logger a;
    private URI b;
    private com.samsung.multiscreen.net.a c;
    private String d;

    public e(URI uri, String s, com.samsung.multiscreen.net.a a1)
    {
        b = uri;
        d = s;
        c = a1;
    }

    private static String a(String s, String s1, String s2)
    {
        int i = 0;
        Object obj;
        Node node;
        try
        {
            DocumentBuilder documentbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputsource = new InputSource();
            inputsource.setCharacterStream(new StringReader(s2));
            s2 = documentbuilder.parse(inputsource).getElementsByTagName("sec:Capabilities");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.info((new StringBuilder("GetDialDeviceDescriptor -- Exception parsing descriptor: ")).append(s.getLocalizedMessage()).toString());
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.info((new StringBuilder("GetDialDeviceDescriptor -- Exception reading descriptor: ")).append(s.getLocalizedMessage()).toString());
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.info((new StringBuilder("GetDialDeviceDescriptor -- Exception constructing parser: ")).append(s.getLocalizedMessage()).toString());
            return "";
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        if (s2.getLength() <= 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        s2 = s2.item(0).getChildNodes();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        if (s2.getLength() <= 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
_L1:
        if (i >= s2.getLength())
        {
            break MISSING_BLOCK_LABEL_312;
        }
        obj = s2.item(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        if (!((Node) (obj)).getNodeName().equalsIgnoreCase("sec:Capability") || !((Node) (obj)).hasAttributes())
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = ((Node) (obj)).getAttributes();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        node = ((NamedNodeMap) (obj)).getNamedItem("name");
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        if (!node.getNodeValue().equalsIgnoreCase(s1))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        s1 = "";
        s2 = "";
        node = ((NamedNodeMap) (obj)).getNamedItem("location");
        obj = ((NamedNodeMap) (obj)).getNamedItem("port");
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        s1 = node.getNodeValue();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        s2 = ((Node) (obj)).getNodeValue();
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append(s);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        if (!s2.isEmpty())
        {
            ((StringBuilder) (obj)).append(":").append(s2);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        if (!s1.isEmpty())
        {
            ((StringBuilder) (obj)).append(s1);
        }
        s = ((StringBuilder) (obj)).toString();
        a.info((new StringBuilder("Built url: ")).append(s).toString());
        return s;
        i++;
          goto _L1
        return "";
    }

    public void run()
    {
        Object obj = new a();
        Object obj1;
        obj1 = b.toURL();
        Map map = com.samsung.multiscreen.net.a.a.a.a(((java.net.URL) (obj1)));
        ((a) (obj)).a(2000);
        obj1 = ((a) (obj)).a(((java.net.URL) (obj1)), map);
        if (obj1 == null)
        {
            try
            {
                c.a(new Exception(((a) (obj)).a()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                c.a(((Exception) (obj)));
            }
            return;
        }
        if (((b) (obj1)).a != 200) goto _L2; else goto _L1
_L1:
        obj = (List)((b) (obj1)).b.get("Application-URL");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((List) (obj)).size() <= 0) goto _L4; else goto _L5
_L5:
        obj = (String)((List) (obj)).get(0);
_L7:
        obj1 = new String(((b) (obj1)).d, "UTF-8");
        a.info((new StringBuilder("Got XML descriptor: ")).append(((String) (obj1))).toString());
        a.info((new StringBuilder("Application-URL is ")).append(((String) (obj))).toString());
        obj1 = a((new StringBuilder()).append(b.getScheme()).append("://").append(b.getHost()).toString(), d, ((String) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (((String) (obj)).isEmpty() || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (!((String) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_277;
        }
        c.a(new Exception("Non-matching device"));
        return;
        obj;
        c.a(((Exception) (obj)));
        return;
        obj1 = URI.create(((String) (obj1)));
        obj = URI.create(((String) (obj)));
        if (obj1 == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        c.a(new com.samsung.multiscreen.device.a.a.b(((URI) (obj1)), ((URI) (obj))));
        return;
        c.a(new Exception("Non-matching device"));
        return;
_L2:
        c.a(new Exception("Non-matching device"));
        return;
_L4:
        obj = "";
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/e.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
