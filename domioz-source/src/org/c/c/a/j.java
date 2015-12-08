// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.protocol.HttpContext;
import org.c.c.f;
import org.c.c.i;

// Referenced classes of package org.c.c.a:
//            a, m, i

final class j extends a
{

    private final HttpClient a;
    private final HttpUriRequest b;
    private final HttpContext c = null;

    public j(HttpClient httpclient, HttpUriRequest httpurirequest)
    {
        a = httpclient;
        b = httpurirequest;
    }

    public final org.c.c.a.i a(f f1, byte abyte0[])
    {
        f1 = f1.entrySet().iterator();
        do
        {
            if (!f1.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)f1.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            if (!s.equalsIgnoreCase("Content-Length") && !s.equalsIgnoreCase("Transfer-Encoding"))
            {
                obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    String s1 = (String)((Iterator) (obj)).next();
                    b.addHeader(s, s1);
                }
            }
        } while (true);
        if (b instanceof HttpEntityEnclosingRequest)
        {
            ((HttpEntityEnclosingRequest)b).setEntity(new ByteArrayEntity(abyte0));
        }
        return new m(a.execute(b, c));
    }

    public final i getMethod()
    {
        return i.valueOf(b.getMethod());
    }

    public final URI getURI()
    {
        return b.getURI();
    }
}
