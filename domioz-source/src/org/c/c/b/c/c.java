// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.c;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.c.c.b.e;
import org.c.c.b.g;
import org.c.c.b.h;
import org.c.c.n;
import org.xml.sax.InputSource;

// Referenced classes of package org.c.c.b.c:
//            a, d

public final class c extends a
{

    public c()
    {
    }

    private ByteArrayInputStream a(Source source)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(source, ((Result) (new StreamResult(bytearrayoutputstream))));
        return new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
    }

    private Long b(Source source)
    {
        if (!(source instanceof DOMSource))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        long l;
        d d1 = new d((byte)0);
        a(source, new StreamResult(d1));
        l = d.a(d1);
        return Long.valueOf(l);
        source;
        return null;
    }

    private Source b(Class class1, Source source)
    {
label0:
        {
            SAXSource saxsource;
            try
            {
                if (javax/xml/transform/dom/DOMSource.equals(class1))
                {
                    DOMResult domresult = new DOMResult();
                    a(source, domresult);
                    return new DOMSource(domresult.getNode());
                }
                if (!javax/xml/transform/sax/SAXSource.equals(class1))
                {
                    break label0;
                }
                saxsource = new SAXSource(new InputSource(a(source)));
            }
            catch (TransformerException transformerexception)
            {
                throw new g((new StringBuilder("Could not transform from [")).append(source).append("] to [").append(class1).append("]").toString(), transformerexception);
            }
            return saxsource;
        }
        if (javax/xml/transform/stream/StreamSource.equals(class1) || javax/xml/transform/Source.equals(class1))
        {
            return new StreamSource(a(source));
        } else
        {
            throw new e((new StringBuilder("Could not read class [")).append(class1).append("]. Only DOMSource, SAXSource, and StreamSource are supported.").toString());
        }
    }

    protected final Object a(Class class1, Source source)
    {
        return b(class1, source);
    }

    protected final void a(Object obj, Result result)
    {
        obj = (Source)obj;
        try
        {
            a(((Source) (obj)), result);
            return;
        }
        catch (TransformerException transformerexception)
        {
            throw new h((new StringBuilder("Could not transform [")).append(obj).append("] to [").append(result).append("]").toString(), transformerexception);
        }
    }

    protected final Long getContentLength(Object obj, n n)
    {
        return b((Source)obj);
    }

    public final boolean supports(Class class1)
    {
        return javax/xml/transform/dom/DOMSource.equals(class1) || javax/xml/transform/sax/SAXSource.equals(class1) || javax/xml/transform/stream/StreamSource.equals(class1) || javax/xml/transform/Source.equals(class1);
    }
}
