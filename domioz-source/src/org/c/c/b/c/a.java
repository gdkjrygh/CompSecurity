// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.c;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

public abstract class a extends org.c.c.b.a
{

    private final TransformerFactory a = TransformerFactory.newInstance();

    protected a()
    {
        super(new n[] {
            n.APPLICATION_XML, n.TEXT_XML, new n("application", "*+xml")
        });
    }

    protected abstract Object a(Class class1, Source source);

    protected abstract void a(Object obj, Result result);

    protected final void a(Source source, Result result)
    {
        a.newTransformer().transform(source, result);
    }

    public final Object readInternal(Class class1, g g1)
    {
        g1.getHeaders();
        return a(class1, new StreamSource(g1.getBody()));
    }

    protected final void writeInternal(Object obj, j j1)
    {
        j1.getHeaders();
        a(obj, new StreamResult(j1.getBody()));
    }
}
