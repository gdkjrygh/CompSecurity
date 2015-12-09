// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.amazonaws.regions:
//            a, c

public class d
{

    private static final String a = "Region";
    private static final String b = "Name";
    private static final String c = "Domain";
    private static final String d = "Endpoint";
    private static final String e = "ServiceName";
    private static final String f = "Http";
    private static final String g = "Https";
    private static final String h = "Hostname";

    public d()
    {
    }

    private static a a(Element element, boolean flag)
    {
        a a1 = new a(a("Name", element), a("Domain", element));
        element = element.getElementsByTagName("Endpoint");
        for (int i = 0; i < element.getLength(); i++)
        {
            a(a1, (Element)element.item(i), flag);
        }

        return a1;
    }

    public static c a(InputStream inputstream)
        throws IOException
    {
        return new c(b(inputstream, false));
    }

    private static String a(String s, Element element)
    {
        s = element.getElementsByTagName(s).item(0);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getChildNodes().item(0).getNodeValue();
        }
    }

    private static void a(a a1, Element element, boolean flag)
    {
        String s = a("ServiceName", element);
        String s1 = a("Hostname", element);
        String s2 = a("Http", element);
        element = a("Https", element);
        if (flag && !a(s1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Invalid service endpoint (").append(s1).append(") is detected.").toString());
        } else
        {
            a1.c().put(s, s1);
            a1.d().put(s, Boolean.valueOf("true".equals(s2)));
            a1.e().put(s, Boolean.valueOf("true".equals(element)));
            return;
        }
    }

    private static boolean a(String s)
    {
        return s.endsWith(".amazonaws.com");
    }

    private static List b(InputStream inputstream, boolean flag)
        throws IOException
    {
        Object obj = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputstream);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        inputstream = ((Document) (obj)).getElementsByTagName("Region");
        obj = new ArrayList();
        for (int i = 0; i < inputstream.getLength(); i++)
        {
            Node node = inputstream.item(i);
            if (node.getNodeType() == 1)
            {
                ((List) (obj)).add(a((Element)node, flag));
            }
        }

        break MISSING_BLOCK_LABEL_139;
        obj;
        throw obj;
        obj;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw obj;
        obj;
        throw new IOException((new StringBuilder()).append("Unable to parse region metadata file: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        return ((List) (obj));
    }

    public List a(InputStream inputstream, boolean flag)
        throws IOException
    {
        return b(inputstream, flag);
    }

    public List b(InputStream inputstream)
        throws IOException
    {
        return b(inputstream, false);
    }
}
