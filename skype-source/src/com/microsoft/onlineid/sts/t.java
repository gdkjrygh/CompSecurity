// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.util.Base64;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.request.f;
import com.microsoft.onlineid.sts.request.g;
import java.io.CharArrayWriter;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// Referenced classes of package com.microsoft.onlineid.sts:
//            e, o

public final class t
{

    private final List a = new ArrayList();
    private byte b[];
    private final MessageDigest c = e.a();

    public t()
    {
        b = null;
    }

    public static String a(byte abyte0[], byte abyte1[], String s)
    {
        return b(abyte0, abyte1, s.replace("<SignedInfo>", "<SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\">"));
    }

    private static String b(Element element)
    {
        element = new DOMSource(element);
        StreamResult streamresult = new StreamResult(new CharArrayWriter());
        Transformer transformer = c();
        transformer.setOutputProperty("method", "html");
        transformer.setOutputProperty("indent", "no");
        try
        {
            transformer.transform(element, streamresult);
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            throw new RuntimeException(element);
        }
        return streamresult.getWriter().toString();
    }

    private static String b(byte abyte0[], byte abyte1[], String s)
    {
        return Base64.encodeToString(e.a(new SecretKeySpec((new com.microsoft.onlineid.sts.o(abyte0)).a(o.a.b, abyte1), "HmacSHA256")).doFinal(s.getBytes(o.a)), 2);
    }

    private byte[] b()
    {
        if (b == null)
        {
            b = new byte[32];
            (new SecureRandom()).nextBytes(b);
        }
        return b;
    }

    private static Transformer c()
    {
        Transformer transformer;
        try
        {
            transformer = TransformerFactory.newInstance().newTransformer();
        }
        catch (TransformerConfigurationException transformerconfigurationexception)
        {
            throw new RuntimeException(transformerconfigurationexception);
        }
        catch (TransformerFactoryConfigurationError transformerfactoryconfigurationerror)
        {
            throw new RuntimeException(transformerfactoryconfigurationerror);
        }
        return transformer;
    }

    public final String a()
    {
        return Base64.encodeToString(b(), 2);
    }

    public final String a(String s)
    {
        return Base64.encodeToString(c.digest(s.getBytes(o.a)), 2);
    }

    public final void a(f f1)
    {
        Element element = f1.h_();
        Document document = element.getOwnerDocument();
        byte abyte0[] = f1.i_();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"></CanonicalizationMethod><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#hmac-sha256\"></SignatureMethod>");
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) 
        {
            Element element1 = (Element)iterator.next();
            String s = a(b(element1));
            StringBuilder stringbuilder1 = stringbuilder.append("<Reference URI=\"#");
            if (element1.getNodeName().equals("wsu:Timestamp"))
            {
                f1 = "wsu:Id";
            } else
            {
                f1 = "Id";
            }
            stringbuilder1.append(element1.getAttribute(f1)).append("\"><Transforms><Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"></Transform></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"></DigestMethod><DigestValue>").append(s).append("</DigestValue></Reference>");
        }
        stringbuilder.append("</SignedInfo>");
        f1 = stringbuilder.toString();
        f1 = (new StringBuilder("<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">")).append(f1).append("<SignatureValue>").append(b(abyte0, b(), f1)).append("</SignatureValue><KeyInfo><wsse:SecurityTokenReference><wsse:Reference URI=\"#SignKey\"/></wsse:SecurityTokenReference></KeyInfo></Signature>").toString();
        try
        {
            f1 = g.a(f1);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new RuntimeException(f1);
        }
        element.appendChild(document.importNode(f1, true));
    }

    public final void a(Element element)
    {
        a.add(element);
    }
}
