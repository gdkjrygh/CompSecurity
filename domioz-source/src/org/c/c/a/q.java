// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.c.c.f;
import org.c.c.i;
import org.c.d.g;

// Referenced classes of package org.c.c.a:
//            a, s, i

final class q extends a
{

    private final HttpURLConnection a;

    q(HttpURLConnection httpurlconnection)
    {
        a = httpurlconnection;
    }

    protected final org.c.c.a.i a(f f1, byte abyte0[])
    {
        for (f1 = f1.entrySet().iterator(); f1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)f1.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s2 = (String)((Iterator) (obj)).next();
                a.addRequestProperty(s1, s2);
            }
        }

        if (a.getDoOutput())
        {
            a.setFixedLengthStreamingMode(abyte0.length);
        }
        a.connect();
        if (a.getDoOutput())
        {
            g.copy(abyte0, a.getOutputStream());
        }
        return new s(a);
    }

    public final i getMethod()
    {
        return i.valueOf(a.getRequestMethod());
    }

    public final URI getURI()
    {
        URI uri;
        try
        {
            uri = a.getURL().toURI();
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("Could not get HttpURLConnection URI: ")).append(urisyntaxexception.getMessage()).toString(), urisyntaxexception);
        }
        return uri;
    }
}
