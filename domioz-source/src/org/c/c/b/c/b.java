// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b.c;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.c.a.c;
import org.c.c.b.a;
import org.c.c.b.h;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public final class b extends a
{

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private Serializer a;

    public b()
    {
        this(((Serializer) (new Persister())));
    }

    public b(Serializer serializer)
    {
        super(new n[] {
            n.APPLICATION_XML, n.TEXT_XML, n.APPLICATION_WILDCARD_XML
        });
        setSerializer(serializer);
    }

    private static Charset a(f f1)
    {
        if (f1 != null && f1.getContentType() != null && f1.getContentType().getCharSet() != null)
        {
            return f1.getContentType().getCharSet();
        } else
        {
            return DEFAULT_CHARSET;
        }
    }

    public final boolean canRead(Class class1, n n1)
    {
        return canRead(n1);
    }

    public final boolean canWrite(Class class1, n n1)
    {
        return class1.isAnnotationPresent(org/simpleframework/xml/Root) && canWrite(n1);
    }

    protected final Object readInternal(Class class1, g g1)
    {
        g1 = new InputStreamReader(g1.getBody(), a(g1.getHeaders()));
        try
        {
            g1 = ((g) (a.read(class1, g1)));
            if (!class1.isInstance(g1))
            {
                throw new c(g1, class1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new org.c.c.b.g((new StringBuilder("Could not read [")).append(class1).append("]").toString(), g1);
        }
        return g1;
    }

    public final void setSerializer(Serializer serializer)
    {
        org.c.d.a.notNull(serializer, "'serializer' must not be null");
        a = serializer;
    }

    protected final boolean supports(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    protected final void writeInternal(Object obj, j j1)
    {
        j1 = new OutputStreamWriter(j1.getBody(), a(j1.getHeaders()));
        try
        {
            a.write(obj, j1);
            j1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new h((new StringBuilder("Could not write [")).append(obj).append("]").toString(), j1);
        }
    }

}
