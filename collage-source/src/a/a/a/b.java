// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;

public class b
    implements a.a.c.b
{

    private HttpUriRequest a;
    private HttpEntity b;

    public b(HttpUriRequest httpurirequest)
    {
        a = httpurirequest;
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            b = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
        }
    }

    public String a()
    {
        return a.getRequestLine().getMethod();
    }

    public String a(String s)
    {
        s = a.getFirstHeader(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getValue();
        }
    }

    public void a(String s, String s1)
    {
        a.setHeader(s, s1);
    }

    public String b()
    {
        return a.getURI().toString();
    }

    public String c()
    {
        Header header;
        if (b != null)
        {
            if ((header = b.getContentType()) != null)
            {
                return header.getValue();
            }
        }
        return null;
    }

    public InputStream d()
        throws IOException
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.getContent();
        }
    }
}
