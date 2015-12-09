// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import org.c.c.f;
import org.c.c.g;
import org.c.c.n;

// Referenced classes of package org.c.c.b:
//            a

public final class j extends a
{

    private final Charset a;
    private final List b;
    private boolean c;

    public j()
    {
        this(Charset.forName("ISO-8859-1"));
    }

    public j(Charset charset)
    {
        this(charset, ((List) (new ArrayList(Charset.availableCharsets().values()))));
    }

    public j(Charset charset, List list)
    {
        super(new n[] {
            new n("text", "plain", charset), n.ALL
        });
        c = true;
        a = charset;
        b = list;
    }

    private Long a(String s, n n1)
    {
        n1 = a(n1);
        long l;
        try
        {
            l = s.getBytes(n1.displayName()).length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InternalError(s.getMessage());
        }
        return Long.valueOf(l);
    }

    private Charset a(n n1)
    {
        if (n1 != null && n1.getCharSet() != null)
        {
            return n1.getCharSet();
        } else
        {
            return getDefaultCharset();
        }
    }

    protected final Long getContentLength(Object obj, n n1)
    {
        return a((String)obj, n1);
    }

    public final Charset getDefaultCharset()
    {
        return a;
    }

    protected final Object readInternal(Class class1, g g1)
    {
        class1 = a(g1.getHeaders().getContentType());
        return org.c.d.g.copyToString(new InputStreamReader(g1.getBody(), class1));
    }

    public final void setWriteAcceptCharset(boolean flag)
    {
        c = flag;
    }

    public final boolean supports(Class class1)
    {
        return java/lang/String.equals(class1);
    }

    protected final void writeInternal(Object obj, org.c.c.j j1)
    {
        obj = (String)obj;
        if (c)
        {
            j1.getHeaders().setAcceptCharset(b);
        }
        Charset charset = a(j1.getHeaders().getContentType());
        org.c.d.g.copy(((String) (obj)), new OutputStreamWriter(j1.getBody(), charset));
    }
}
