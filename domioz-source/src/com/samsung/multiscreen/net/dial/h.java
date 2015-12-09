// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.dial;

import com.samsung.multiscreen.a.d;
import com.samsung.multiscreen.a.e;
import com.samsung.multiscreen.net.a.a.b;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
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

// Referenced classes of package com.samsung.multiscreen.net.dial:
//            a, g

public class h
{

    public static final Logger a;
    private DocumentBuilder b;
    private InputSource c;

    public h()
    {
    }

    private a a(String s)
    {
        a a1;
        boolean flag;
label0:
        {
            flag = false;
            Document document;
            if (b == null || c == null)
            {
                try
                {
                    b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    c = new InputSource();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new g("client initialization failed");
                }
            }
            a1 = new a();
            c.setCharacterStream(new StringReader(s));
            document = b.parse(c);
            a1.a(document.getElementsByTagName("name").item(0).getTextContent());
            a1.b(document.getElementsByTagName("state").item(0).getTextContent());
            s = document.getElementsByTagName("options");
            if (s != null && s.getLength() > 0 && s.item(0).hasAttributes())
            {
                s = s.item(0).getAttributes();
                for (int i = 0; i < s.getLength(); i++)
                {
                    Object obj1 = s.item(i);
                    String s1 = ((Node) (obj1)).getNodeName();
                    obj1 = ((Node) (obj1)).getNodeValue();
                    if (s1.equalsIgnoreCase("allowstop"))
                    {
                        a1.a(((String) (obj1)).equalsIgnoreCase("true"));
                    }
                    a1.a(s1, ((String) (obj1)));
                }

            }
            NodeList nodelist = document.getElementsByTagName("atom:link");
            if (nodelist != null)
            {
                s = nodelist;
                if (nodelist.getLength() != 0)
                {
                    break label0;
                }
            }
            s = document.getElementsByTagName("link");
        }
        if (s != null && s.getLength() > 0 && s.item(0) != null && s.item(0).hasAttributes())
        {
            s = s.item(0).getAttributes();
            int j = ((flag) ? 1 : 0);
            while (j < s.getLength()) 
            {
                Object obj = s.item(j);
                String s2 = ((Node) (obj)).getNodeName();
                obj = ((Node) (obj)).getNodeValue();
                if (s2.equalsIgnoreCase("rel"))
                {
                    a1.c(((String) (obj)));
                } else
                if (s2.equalsIgnoreCase("href"))
                {
                    a1.d(((String) (obj)));
                }
                a1.a(s2, ((String) (obj)));
                j++;
            }
        }
        return a1;
    }

    public static void a(b b1, d d1)
    {
        if (b1.a >= 200 && b1.a < 300)
        {
            try
            {
                a.info((new StringBuilder("launchApplication() response:\nHEADERS: ")).append(b1.b).toString());
                d1.onResult(Boolean.TRUE);
                a.info("launchApplication() result: true");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                d1.onError(e.a(b1));
            }
            return;
        }
        if (b1.a == 503)
        {
            d1.onError(new e(b1.a, "Service unavailable"));
            return;
        }
        if (b1.a == 404)
        {
            d1.onError(new e(b1.a, "Not found"));
            return;
        }
        if (b1.a == 413)
        {
            d1.onError(new e(b1.a, "Request entity too large"));
            return;
        }
        if (b1.a == 411)
        {
            d1.onError(new e(b1.a, "Length required"));
            return;
        }
        String s;
        try
        {
            s = new String(b1.d, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = "error";
        }
        d1.onError(new e(b1.a, s));
    }

    public static void b(b b1, d d1)
    {
        a.info((new StringBuilder("stopApplication() response: ")).append(b1.a).toString());
        if (b1.a == 200)
        {
            d1.onResult(Boolean.TRUE);
            return;
        }
        if (b1.a == 501)
        {
            d1.onError(new e(b1.a, "Not implemented"));
            return;
        }
        if (b1.a == 404)
        {
            d1.onError(new e(b1.a, "Not found"));
            return;
        }
        String s;
        try
        {
            s = new String(b1.d, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = "";
        }
        d1.onError(new e(b1.a, s));
    }

    public final void c(b b1, d d1)
    {
        if (b1.a == 200)
        {
            try
            {
                b1 = a(new String(b1.d, "UTF-8"));
                d1.onResult(b1);
                a.info((new StringBuilder("getApplication() result:\n")).append(b1).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                d1.onError(new e(b1.getLocalizedMessage()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (b b1)
            {
                d1.onError(new e(b1.getLocalizedMessage()));
            }
            return;
        }
        if (b1.a == 503)
        {
            d1.onError(new e(b1.a, "Service unavailable"));
            return;
        }
        if (b1.a == 404)
        {
            d1.onError(new e(b1.a, "Not found"));
            return;
        }
        if (b1.a == 413)
        {
            d1.onError(new e(b1.a, "Request entity too large"));
            return;
        }
        if (b1.a == 411)
        {
            d1.onError(new e(b1.a, "Length required"));
            return;
        }
        String s;
        try
        {
            s = new String(b1.d, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = "";
        }
        d1.onError(new e(b1.a, s));
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/net/dial/h.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
