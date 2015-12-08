// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.b.c;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.transport.TransportFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public abstract class b
{

    private URL a;
    private int b;
    private TransportFactory c;
    private com.microsoft.onlineid.sts.c d;

    public b()
    {
    }

    protected static Document a(String s, String s1)
    {
        DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
        documentbuilderfactory.setNamespaceAware(true);
        try
        {
            s = documentbuilderfactory.newDocumentBuilder().getDOMImplementation().createDocument(s, s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.microsoft.onlineid.internal.e.a(false);
            throw new RuntimeException("Invalid parser configuration.", s);
        }
        return s;
    }

    public abstract Document a();

    public final void a(int i)
    {
        b = i;
    }

    final void a(TransportFactory transportfactory)
    {
        c = transportfactory;
    }

    public final void a(com.microsoft.onlineid.sts.c c1)
    {
        d = c1;
    }

    public final void a(URL url)
    {
        a = url;
    }

    public abstract com.microsoft.onlineid.sts.n.b b();

    public final URL c()
    {
        return a;
    }

    protected final com.microsoft.onlineid.sts.c d()
    {
        return d;
    }

    public final com.microsoft.onlineid.sts.b.b e()
        throws c, com.microsoft.onlineid.sts.a.c
    {
        com.microsoft.onlineid.internal.transport.b b1;
        com.microsoft.onlineid.a.c c1;
        com.microsoft.onlineid.sts.b.b b2;
        Object obj2;
        b2 = f();
        b1 = c.createTransport();
        b1.a(a);
        obj2 = b1.d();
        c1 = com.microsoft.onlineid.a.a.a().b("STS requests", getClass().getSimpleName(), "(none)");
        c1.a();
        long l;
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        com.microsoft.onlineid.internal.a.f.a();
        transformer.transform(new DOMSource(a()), new StreamResult(((OutputStream) (obj2))));
        ((OutputStream) (obj2)).close();
        obj2 = b1.a();
        l = b1.c();
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        d.a(l);
        com.microsoft.onlineid.a.a.a().a(d.b());
        b2.a(((InputStream) (obj2)));
        c1.b();
        ((InputStream) (obj2)).close();
        b1.e();
        return b2;
        Object obj1;
        obj1;
        com.microsoft.onlineid.internal.c.d.c("Unable to parse stream.", ((Throwable) (obj1)));
        throw new c("Unable to parse stream.", ((Throwable) (obj1)));
        obj1;
        c1.b();
        ((InputStream) (obj2)).close();
        throw obj1;
        Object obj;
        obj;
        com.microsoft.onlineid.internal.c.d.c("Unable to configure Transformer", ((Throwable) (obj)));
        throw new RuntimeException("Unable to configure Transformer", ((Throwable) (obj)));
        obj;
        b1.e();
        throw obj;
        obj;
        com.microsoft.onlineid.internal.c.d.c("Problem occurred transforming XML document", ((Throwable) (obj)));
        throw new RuntimeException("Problem occurred transforming XML document", ((Throwable) (obj)));
        obj;
        com.microsoft.onlineid.internal.c.d.c("Unable to close stream", ((Throwable) (obj)));
        throw new c("Unable to close stream", ((Throwable) (obj)));
    }

    protected abstract com.microsoft.onlineid.sts.b.b f();
}
